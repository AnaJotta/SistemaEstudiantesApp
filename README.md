# 👨‍🎓 SistemaEstudiantesApp

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


---

## ✅ Flujo de la aplicación
La aplicación se conecta a MySQL usando los datos de config.properties.<br>

Crea, lee, actualiza y elimina registros de estudiantes.<br>

Los cambios se guardan directamente en la base de datos estudiantes_db.<br>

---

## 👏 Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar la aplicación, por favor sigue estos pasos:
- Realiza un fork de este repositorio.
- Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
- Realiza tus cambios y haz commit de ellos (git commit -am 'Añadir nueva característica').
- Sube tus cambios a tu fork (git push origin feature/nueva-caracteristica).
- Abre un pull request describiendo tus cambios.





