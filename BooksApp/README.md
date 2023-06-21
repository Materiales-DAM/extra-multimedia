# FilmsApp

## Main Activity (3 puntos)

Modifica la actividad principal para añadir un RecyclerView de libros (Book):
- Define un layout para cada libro:
  - Se deben mostrar todos los campos del libro
  - Añade un botón con el texto "Eliminar"
- Modificar BookAdapter de forma que acepte una lista de libros (List<Book>)
- Modifica MainActivity para que el RecyclerView use el BookAdapter:
  - Carga los datos que hay en MainActivity
  - Haz que los libros aparezcan en filas de dos columna
  - Debajo del RecyclerView pon un botón "Añadir"

## AddBookActivity (3 puntos)

Crea una actividad que permita meter los datos de un libro:
  - Utiliza ConstraintLayout
  - Coloca los EditText alinéados
  - En la parte inferior de la pantalla, pon dos botones uno al lado del otro:
    - Aceptar
    - Cancelar