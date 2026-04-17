import os
from flask import Flask, request, jsonify
from flask_cors import CORS
from supabase import create_client
from dotenv import load_dotenv

load_dotenv(os.path.join(os.path.dirname(__file__), '..', '.env'))

app = Flask(__name__)
CORS(app)

SUPABASE_URL = os.getenv("SUPABASE_URL")
SUPABASE_KEY = os.getenv("SUPABASE_KEY")
supabase = create_client(SUPABASE_URL, SUPABASE_KEY)

formato_permitido = {'pdf', 'docx'}

def allowed_file(filename):
    return '.' in filename and \
           filename.rsplit('.', 1)[1].lower() in formato_permitido

@app.route('/registrar_empresa', methods=['POST'])
def registrar():
    try:
 
        nit = request.form.get('nit')
        razon_social = request.form.get('razon_social')
        correo = request.form.get('correo')
        password = request.form.get('password')
        rol = request.form.get('rol')

        archivo = request.files.get('documento_legal')

        if archivo and not allowed_file(archivo.filename):
            return jsonify({"error": "Formato de archivo no permitido. Use PDF o DOCX"}), 400

        if not archivo:
            return jsonify({"error": "Falta la documentacion legal"}), 400

        nombre_archivo = f"{nit}_{archivo.filename}"

        temp_path = f"./{nombre_archivo}"
        archivo.save(temp_path)

        with open(temp_path, 'rb') as f:
            supabase.storage.from_("documentos_legales").upload(nombre_archivo, f)
        
        url_publica = supabase.storage.from_("documentos_legales").get_public_url(nombre_archivo)

        os.remove(temp_path)

        datos_registro = {
            "nit": nit,
            "razon_social": razon_social,
            "correo": correo,
            "password": password,
            "rol": rol,
            "url_documento": url_publica
        }
        
        res = supabase.table("enterprise").insert(datos_registro).execute()

        return jsonify({"mensaje": "Solicitud de registro enviada exitosamente."}), 200

    except Exception as e:
        print(f"Error: {e}")
        return jsonify({"error": "Ocurrió un error en el servidor"}), 500

if __name__ == '__main__':
    app.run(debug=True, port=5000)