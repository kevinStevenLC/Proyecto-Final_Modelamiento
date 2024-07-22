# Proyecto Final Modelamiento


### Tareas:


### *Base de datos*

### 1-Diseno y creacion de la Base de Datos (ya esta hecho en la nube todo)
Realizar Diagrama ER
Normalizar 3fr
Crear la base de datos (MySQL) en la nube 
Generar las respectivas tablas
Probar consultas, orderby, Join, select (solo probar)

### *CRUD *

Crear una clase De tipo Connection para la conexión a la base de datos.


### 2-Crear Metodos (agregar, eliminar, modificar)
Conectarse a la base de datos y crear métodos de:
Agregar Productos (no agregar id, es autoincrementable la columna de id),
Eliminar Productos por ID,
Modificar Información de productos(no modificar id);
Mostrar el resultado por consola para cada método con screenshot.

### 3-Crear Metodos (consultar y ordenar por Categorias)
Conectarse a la base de datos y crear métodos de:
Consultar(Por id, usar Join para unir los campos de la tabla Producto y Categoría en una sola tabla y mostrar por consola el resultado).
Ordenar productos(metodos).
Mostrar el resultado por consola para cada método con screenshot.


### *Diseño y implementación del CRUD*

### 4- Creacion de la interfaz
Crear la ventana principal, agregando el titulo, los botones y la función para que al presionar cada botón se abra una ventana.
Hacer un controlador para cada ventana por método(solo crear el diseño no implementar funciones del CRUD)

	width - height
	- ventana principal: 650 - 550
	- Todas las ventanas secundarias: 450 - 350




### 5- Implementacion de Metodos en la interfaz
Implementar las funciones del CRUD para realizar la función requerida, hacer un switch(para el método consultar) con  orderBy (para el orden ascendente y descendente), usar select y Join para mostrar en la tabla de Productos el producto y su Categoria (ID, Descripcion, Categoria, Precio) y usar scroll para la tabla.



## Estructura del proyecto

	proyecto_final/

	│
	├── App.java
	│
	├── model/
	│   ├── Producto.java
	│   ├── DbConexion.java
	│   └── crud/
	│       ├── addP.java
	│       ├── deleteP.java
	│       ├── modifyP.java
	│       └── consultationP.java
	│
	├── controller/
	│   ├── PanelController.java	
	│   ├── ControllerAddP.java
	│   ├── ControllerDeleteP.java
	│   ├── ControllerModifyP.java
	│   └── ControllerConsultationP.java
	│
	└── view/
	    └── fxml/
	        └── pagePanel.fxml			
	        └── ventana_principal.fxml
	        └── ventana_addP.fxml
	        └── ventana_deleteP.fxml
	        └── ventana_modifyP.fxml
	        └── ventana_consultationP.fxml



### Disenño
![Programa](/src/main/resources/project/view/img/diseno_programa.png)