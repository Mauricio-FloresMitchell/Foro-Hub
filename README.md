# Foro Hub

Foro Hub es una API REST diseñada para gestionar un foro de discusión. Los usuarios pueden crear, responder, actualizar y eliminar tópicos, fomentando la interacción dentro de una comunidad. La API incluye autenticación y autorización mediante JWT para garantizar la seguridad de las operaciones.

---

## **Características principales**

1. **Gestión de Tópicos**
    - Crear, listar, actualizar y eliminar tópicos.
    - Filtrar respuestas por tópico específico.

2. **Autenticación y Seguridad**
    - Uso de JWT (JSON Web Tokens) para proteger los endpoints.
    - Solo los usuarios autenticados pueden realizar operaciones sensibles como crear o eliminar tópicos.

3. **Gestión de Usuarios**
    - Registro de nuevos usuarios.
    - Obtención de detalles específicos de un usuario.

4. **Base de Datos Relacional**
    - Conexión con PostgreSQL para almacenar datos de usuarios, tópicos y respuestas.

---

## **Requisitos previos**

- **Java 17** o superior.
- **Spring Boot 3.0** o superior.
- **PostgreSQL 14** o superior.
- Herramienta para pruebas de API (Insomnia, Postman, etc.).

---

## **Instalación y configuración**

### **1. Clona este repositorio**
```bash
git clone https://github.com/tu-usuario/foro-hub.git
cd foro-hub

export DATABASE_URL=jdbc:postgresql://<host>:<puerto>/<nombre_db>
export DATABASE_USERNAME=<tu_usuario>
export DATABASE_PASSWORD=<tu_contraseña>
export JWT_SECRET=<clave_secreta>

./mvnw spring-boot:run
mvn spring-boot:run

Endpoints
Usuarios
Método	Endpoint	Descripción	Autenticación
POST	/usuarios	Registrar un nuevo usuario	No
GET	/usuarios/{id}	Obtener información de un usuario	Sí
Tópicos
Método	Endpoint	Descripción	Autenticación
GET	/topicos	Listar todos los tópicos	No
POST	/topicos	Crear un nuevo tópico	Sí
DELETE	/topicos/{id}	Eliminar un tópico por su ID	Sí
Respuestas
Método	Endpoint	Descripción	Autenticación
POST	/respuestas	Crear una respuesta	Sí
GET	/respuestas/topico/{topicoId}	Listar respuestas de un tópico específico	No
Estructura del Proyecto
bash
Copiar
Editar
src/
├── main/
│   ├── java/com/foro/hub/
│   │   ├── controller/       # Controladores REST
│   │   ├── service/          # Lógica de negocio
│   │   ├── repository/       # Acceso a la base de datos
│   │   └── model/            # Entidades y modelos
│   └── resources/
│       ├── application.properties  # Configuración
Pruebas
Prueba en Insomnia/Postman

Importa los endpoints disponibles en el README.
Configura el token JWT en las solicitudes protegidas.
Prueba automatizada

Ejecuta los tests:
bash
Copiar
Editar
./mvnw test
Tecnologías utilizadas
Spring Boot 3: Para construir la API REST.
PostgreSQL: Como base de datos relacional.
JWT: Para autenticación y autorización.
Maven: Gestión de dependencias y compilación.
