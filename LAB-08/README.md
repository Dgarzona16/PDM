## Cuál es la principal ventaja de utilizar Recycler View?
- Permite mostrar contenido de forma dinamica haciendo uso del scroll en un mismo fragmento o actividad

## Menciona los componentes de RecyclerView y la función que tiene cada uno de ellos
- RecyclerView: Es el contenedor principal que muestra la lista o cuadrícula de elementos y se encarga de la gestión de la disposición y el desplazamiento de los elementos visibles.

- LayoutManager: Es responsable de la disposición y colocación de los elementos dentro del RecyclerView. Controla si los elementos se mostrarán en una lista vertical, una lista horizontal o una cuadrícula, y también maneja el desplazamiento y la reciclaje de vistas.

- Adapter: El adaptador es el componente clave que conecta los datos con el RecyclerView. Proporciona los datos que se deben mostrar y crea las vistas correspondientes para cada elemento de datos. Además, el adaptador maneja la actualización de los datos y notifica al RecyclerView cuando se producen cambios.

- ViewHolder: Cada elemento en el RecyclerView se representa mediante un ViewHolder. El ViewHolder contiene una referencia a la vista que representa un elemento individual y se utiliza para acceder y actualizar eficientemente los componentes visuales de la vista.

- ItemDecoration: Es una clase opcional que permite agregar decoraciones personalizadas a los elementos en el RecyclerView. Las decoraciones pueden ser márgenes, divisores, espaciado adicional, etc.

- ItemAnimator: Es responsable de las animaciones que ocurren cuando se insertan, eliminan o cambian los elementos en el RecyclerView. Proporciona una forma fácil de personalizar las animaciones para que se adapten a las necesidades específicas de la aplicación.      