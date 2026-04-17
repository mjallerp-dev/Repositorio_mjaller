/**
 * Sistema de Registro de Empresas para Gestión de Residuos
 * Historias de Usuario cubiertas:
 * - HU_01: Registro de Empresas
 * - HU_02: Selección de Roles 
 * - HU_03: Gestión de Documentos Legales
 */

document.addEventListener('DOMContentLoaded', () => {
    const formRegistro = document.getElementById('form-registro');
    
    if (formRegistro) {
        formRegistro.addEventListener('submit', async (e) => {
            e.preventDefault();
            
            const mensajeDiv = document.getElementById('mensaje-respuesta');
            const formData = new FormData();
            

            const archivoInput = document.getElementById('documento_legal');
            const archivo = archivoInput.files[0];

            if (!archivo) {
                mensajeDiv.innerHTML = `<div class="alert alert-warning">⚠️ La documentación legal es obligatoria para el registro.</div>`;
                return;
            }

            const nombreArchivo = archivo.name.toLowerCase();
            if (!(nombreArchivo.endsWith('.pdf') || nombreArchivo.endsWith('.docx'))) {
                mensajeDiv.innerHTML = `<div class="alert alert-danger">❌ Formato no válido. Solo se aceptan .pdf o .docx</div>`;
                return;
            }

            if (archivo.size > 5 * 1024 * 1024) {
                mensajeDiv.innerHTML = `<div class="alert alert-danger"> El archivo excede el límite de 5MB.</div>`;
                return;
            }

            const nit = document.getElementById('nit').value;
            const razonSocial = document.getElementById('razon_social').value;
            const correo = document.getElementById('correo').value;
            const password = document.getElementById('password').value;
            const rol = document.getElementById('rol').value;

            formData.append('documento_legal', archivo);
            formData.append('nit', nit);
            formData.append('razon_social', razonSocial);
            formData.append('correo', correo);
            formData.append('password', password);
            formData.append('rol', rol);

            try {
                mensajeDiv.innerHTML = `<div class="alert alert-info">Procesando registro y cargando documentos...</div>`;
                
                const respuesta = await fetch('http://127.0.0.1:5000/registrar_empresa', {
                    method: 'POST',
                    body: formData
                });

                const resultado = await respuesta.json();

                if (respuesta.ok) {
                    mensajeDiv.innerHTML = `
                        <div class="alert alert-success">
                             <strong>¡Registro Exitoso!</strong><br>
                            La empresa ${razonSocial} ha sido registrada con el rol de ${rol}.
                        </div>`;
                    formRegistro.reset();
                } else {
                    mensajeDiv.innerHTML = `<div class="alert alert-danger"> Error: ${resultado.error}</div>`;
                }

            } catch (error) {
                console.error("Error en la comunicación con el servidor:", error);
                mensajeDiv.innerHTML = `<div class="alert alert-danger"> Error crítico: No se pudo conectar con el backend.</div>`;
            }
        });
    }
});