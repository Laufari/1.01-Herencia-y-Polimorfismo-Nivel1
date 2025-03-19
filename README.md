# 1.01. Herencia y Polimorfismo Nivel1

## 📄 Descripción - Enunciado del ejercicio

Este proyecto consiste en la implementación de un sistema de gestión para un grupo de música, donde existen diferentes tipos de instrumentos musicales.
Los instrumentos pueden ser de viento, cuerda o percusión, 
y todos comparten ciertos atributos y comportamientos, como el nombre y precio del instrumento, y un método `tocar()` que se implementa de manera diferente para cada tipo de instrumento.

Se hace uso de herencia y polimorfismo para gestionar estos instrumentos.
Se tiene una clase base abstracta `Instrumento` con un método abstracto `tocar()`,
y clases hijas `Viento`, `Cuerda`, y `Percusion` que implementan el método `tocar()` según el tipo de instrumento.

## 💻 Tecnologías Utilizadas

- **Java** 
- **IntelliJ IDEA**
- **Git**

## 📋 Requisitos

- **JDK** 
- **IntelliJ IDEA** 
- **Git** 

## 🛠️ Instalación

1. Clona este repositorio a tu máquina local:
2. 
   git clone https://github.com/tu-usuario/1.01.-Herencia-y-Polimorfismo-Nivel1.git
  Abre el proyecto en tu IDE (por ejemplo, IntelliJ IDEA).
  Asegúrate de que el JDK esté correctamente configurado en tu IDE.
  Si no tienes un proyecto Java configurado aún, crea uno nuevo en el IDE y luego agrega el código del repositorio.

▶️ Ejecución
Una vez el proyecto esté cargado en tu IDE, navega hasta el archivo Main.java (o cualquier archivo que contenga el método main).

Ejecuta el programa. Los instrumentos serán creados automáticamente con los parámetros definidos en el código y se llamará al método tocar() para cada instrumento.

java Main

Deberías ver en la consola una salida similar a:

Copiar
Editar
Está sonando un instrumento de viento
Está sonando un instrumento de cuerda
Está sonando un instrumento de percusión

🤝 Contribuciones
¡Las contribuciones son bienvenidas! Si deseas mejorar o modificar este proyecto, por favor sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama:
git checkout -b feature/NuevaFuncionalidad
Realiza tus cambios.
Commitea tus cambios:
git commit -m 'Añadir Nueva Funcionalidad'
Sube tus cambios a tu repositorio de fork:
git push origin feature/NuevaFuncionalidad
Abre un Pull Request para que tus cambios sean revisados y potencialmente fusionados.
