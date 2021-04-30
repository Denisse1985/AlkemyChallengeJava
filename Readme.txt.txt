
Nota: herramientas utilizadas:
		Spring Tools
		Java 11
		Maven
		Boostrap
		Thymeleaf
******************************************************************************************
Pasos de Intalacion

1.- Crear base de datos usando el script de la ruta "Data Base/dataBase.sql"
2.- Configurar acceso a la base de datos en el archivo "aplication.properties" del proyecto
3.- Iniciar proyecto Spring boot
4.- Escribir "http://localhost:8080" para acceder a la aplicacion
5.- Usuarios
	-administrador: 
		username: admin
		password:123
	-estudiante:
		username (dni):123
		password:123

******************************************************************************************
Explicacion 

El acceso a la aplicacion es controlado con un perfilamiento de roles
definido en la tabla User_Type donde se indica ROLE_ADMIN, ROLE_STUDENT

Como administrador:
-Puede gestionar materias y profesores

Como estudiante:
-Puede listar materias disponibles donde puede vizualizar la descripcion
de la materia y y su informacion.
-Puede inscribir una materia. 
 
******************************************************************************************
Bonus:
-Aparecen las materias en orden alfabetico. 
-Trate de mostrar los cupos por materia pero lo deje incompleto.
