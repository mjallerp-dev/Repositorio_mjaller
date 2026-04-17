import os
import psycopg2
import bcrypt
from dotenv import load_dotenv
from flask import Flask, request, jsonify
from flask_cors import CORS

load_dotenv()
app = Flask(__name__)
CORS(app)

def conexion_bd():
    return psycopg2.connect(
        host=os.getenv('DB_HOST'),
        database=os.getenv('DB_NAME'),
        user=os.getenv('DB_USER'),
        password=os.getenv('DB_PASS'),
        port=os.getenv('DB_PORT')
    )

@app.route('/registrar_empresa', methods=['POST'])
def registrar_empresa():
    data = request.get_json()

    nit = data.get('nit')
    razon_social = data.get('razon_social')
    correo = data.get('correo')
    password_hash = data.get('password')
    rol = data.get('rol')

    #Usamos la librería bcrypt para el cifrado de contraseña
    salt = bcrypt.gensalt()
    password_hash = bcrypt.hashpw(password_hash.encode('utf-8'), salt).decode('utf-8')

    conn = None
    try:
        conn = conexion_bd()
        cur = conn.cursor()

        query = """
        INSERT INTO enterprise (nit, razon_social, correo, password, rol)
        VALUES (%s, %s, %s, %s, %s);
        """
        cur.execute(query, (nit, razon_social, correo, password_hash, rol))
        
        conn.commit()
        return jsonify({"message": "Registro exitoso", "status": "success"}), 201

    except psycopg2.IntegrityError:
        return jsonify({"message": "El NIT o el Correo ya están registrados"}), 400
    except Exception as e:
        return jsonify({"message": str(e), "status": "error"}), 500
    finally:
        if conn:
            cur.close()
            conn.close()

if __name__ == "__main__":
    app.run(debug=True, port=5000)