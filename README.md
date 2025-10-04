# 🛸 SistemaEstudiantesApp

**SistemaEstudiantesApp** es una aplicación de escritorio desarrollada en **Java** que permite gestionar estudiantes mediante una base de datos **MySQL**. La aplicación ofrece una interfaz sencilla y organizada para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los registros de estudiantes.

---

## 🛠 Tecnologías utilizadas

- **Java 17** – Lenguaje de programación principal.<br>
- **MySQL 8.0** – Sistema de gestión de bases de datos relacional.<br>
- **JDBC** – Conexión entre Java y MySQL.<br>
- **IntelliJ IDEA** – Entorno de desarrollo integrado (IDE).<br>
- **Maven** – Gestión de dependencias y compilación.<br>

---

## 📂 Estructura del proyecto

SistemaEstudiantesApp/<br>
├── src/ # Código fuente de la aplicación<br>
│ └── main/<br>
│ └── java/<br>
│ └── com/ana_jotta/<br>
│ ├── Conexion.java # Conexión a la base de datos<br>
│ └── Estudiante.java # Clase modelo de estudiantes<br>
├── database.sql # Script para crear la base de datos y tablas<br>
├── config.example.properties # Archivo de ejemplo con configuración<br>
├── .gitignore # Archivos y carpetas ignoradas por Git<br>
├── pom.xml # Archivo de Maven<br>
└── README.md # Este archivo<br>

sql
Copiar código

---

## ⚙️ Configuración de la base de datos

1. **Crear la base de datos y las tablas**<br>
   Ejecuta el script `database.sql` en MySQL Workbench o tu terminal MySQL:

```sql
CREATE DATABASE estudiantes_db;
USE estudiantes_db;

CREATE TABLE estudiantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    edad INT,
    carrera VARCHAR(100)
);

INSERT INTO estudiantes (nombre, edad, carrera) VALUES
('Juan Pérez', 20, 'Ingeniería'),
('Ana García', 22, 'Medicina');
Configurar las credenciales de conexión<br>

Copia config.example.properties y renómbralo a config.properties.<br>

Edita el archivo con tus credenciales locales:

properties
Copiar código
db.url=jdbc:mysql://localhost:3306/estudiantes_db
db.user=TU_USUARIO
db.password=TU_CONTRASEÑA
⚠️ Importante: Nunca subas config.properties a GitHub. Usa .gitignore para ignorarlo.

🛸 Ejecutar la aplicación
Abre la terminal en la carpeta del proyecto.<br>

Compila y ejecuta con Maven:

bash
Copiar código
mvn clean install
mvn exec:java
Si prefieres IntelliJ, abre el proyecto y ejecuta Conexion.java para probar la conexión.

✅ Flujo de la aplicación
La aplicación se conecta a MySQL usando los datos de config.properties.<br>

Crea, lee, actualiza y elimina registros de estudiantes.<br>

Los cambios se guardan directamente en la base de datos estudiantes_db.<br>

🤝 Contribuciones
¡Contribuciones bienvenidas!<br>
Para colaborar:

Haz un fork del repositorio.<br>

Crea una rama nueva:

bash
Copiar código
git checkout -b feature/nueva-funcionalidad
```<br>
Realiza tus cambios y haz commit:

bash
Copiar código
git commit -m "Añadir nueva funcionalidad"
```<br>
Envía tu rama a tu fork y abre un Pull Request.<br>

📜 Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.<br>

📌 Nota final
Este README está pensado para que cualquier usuario pueda:

Configurar la base de datos localmente.<br>

Ejecutar la aplicación Java sin problemas.<br>

Contribuir de forma segura sin exponer credenciales.<br>

yaml
Copiar código
