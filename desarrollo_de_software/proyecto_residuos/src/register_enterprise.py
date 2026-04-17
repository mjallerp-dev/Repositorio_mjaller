import os
import psycopg2
import bcrypt
from dotenv import load_dotenv

load_dotenv()

def registrar_empresa():
    print("Registro de Nueva Empresa")
    
    nit = input("NIT: ")
    razon_social = input("Razón Social: ")
    correo = input("Correo electrónico: ")
    password = input("Contraseña: ")
    
    print("\nRoles disponibles: [Productora, Transportista, Receptora de Residuos, Entidad Ambiental]")

    rol = input("Seleccione el tipo de empresa: ")

    #Usamos la librería bcrypt para el cifrado de contraseña
    salt = bcrypt.gensalt()
    password_hash = bcrypt.hashpw(password.encode('utf-8'), salt).decode('utf-8')

    conn = None
    try:
        conn = psycopg2.connect(
            host=os.getenv('DB_HOST'),
            database=os.getenv('DB_NAME'),
            user=os.getenv('DB_USER'),
            password=os.getenv('DB_PASS'),
            port=os.getenv('DB_PORT')
        )
        cur = conn.cursor()

        query = """
        INSERT INTO enterprise (nit, razon_social, correo, password, rol)
        VALUES (%s, %s, %s, %s, %s);
        """
        cur.execute(query, (nit, razon_social, correo, password_hash, rol))
        
        conn.commit()
        print(f"\nEmpresa '{razon_social}' registrada exitosamente.")
        print("Estado: Pendiente de Validación")

    except psycopg2.IntegrityError:
        print("\nError: El NIT o el Correo ya están registrados")
        if conn: conn.rollback()
    except Exception as e:
        print(f"\n Error inesperado: {e}")
    finally:
        if conn:
            cur.close()
            conn.close()

if __name__ == "__main__":
    registrar_empresa()