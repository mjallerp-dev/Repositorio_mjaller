import os
import psycopg2
from dotenv import load_dotenv

load_dotenv(os.path.join(os.path.dirname(__file__), '..', '.env'))

def crear_tabla_enterprise():

    try:
        conn = psycopg2.connect(
            host=os.getenv('DB_HOST'),
            database=os.getenv('DB_NAME'),
            user=os.getenv('DB_USER'),
            password=os.getenv('DB_PASS'),
            port=os.getenv('DB_PORT')
        )
        
        cursor = conn.cursor()

        sql_query = """
        CREATE TABLE IF NOT EXISTS enterprise (
            id SERIAL PRIMARY KEY,
            nit VARCHAR(20) UNIQUE NOT NULL,
            razon_social VARCHAR(100) NOT NULL,
            rol VARCHAR(50) NOT NULL,
            correo VARCHAR(50) UNIQUE NOT NULL,
            password TEXT NOT NULL,
            estado VARCHAR(50) DEFAULT 'Pendiente de Validación',
            fecha_registro TIMESTAMP WITH TIME ZONE DEFAULT (CURRENT_TIMESTAMP AT TIME ZONE 'UTC' AT TIME ZONE 'America/Bogota')
        );
        """
        cursor.execute(sql_query)
        conn.commit()
        
        print("La tabla enterprise ha sido creada exitosamente.")

        cursor.close()
        conn.close()

    except Exception as error:
        print(f"Error al conectar o crear la tabla: {error}.")

if __name__ == "__main__":
    crear_tabla_enterprise()