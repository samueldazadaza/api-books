"# api-books"

### Intrucciones para correr y utilizar la api en local:

se crea una base de datos en mysql llamada 👉 springboot

y se ejecuta en la raiz del proyecto la sigiente linea

mvnw.cmd spring-boot:run

### para utilizar la api books

para crear libro ejecuta en postman en POST a la url: http://localhost:8080/book
{
"nombre": "pulgarcito",
"email": "libro infantil",
"prioridad": 3
}

para modificar libro (agregas id a modificar) ejecuta en postman en POST a la url: http://localhost:8080/book
{
"id": 4,
"nombre": "pulgarcito",
"email": "libro infantil",
"prioridad": 3
}

para eliminar un libro, digita el id en la POSTMAN con el metodo DELETE, ejemplo: http://localhost:8080/book/1

para leer info de un libro, digita el id en la url, ejemplo: http://localhost:8080/book/1

los datos de los libros quedan en: http://localhost:8080/book
para ver un libro en especifico con el id: http://localhost:8080/book/2
