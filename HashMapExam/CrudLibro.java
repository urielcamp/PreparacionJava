package HashMapExam;

public class CrudLibro implements ICrudLibro{
    @SuppressWarnings("unchecked")
    java.util.HashMap<Integer, Libro> libros = new java.util.HashMap();

    @Override
    public void agregar(Libro l) {
        // aca deben colocar código
        libros.put(l.getId(), l);
        
        
    }

    @Override
    public void modificar(Libro l) {
        if (libros.containsKey(l.getId())) {
            // aca deben colocar codigo
            libros.put(l.getId(), l);
            
            
        } else {
            System.out.println("No se pudo modificar al producto");
        }

    }

    @Override
    public void eliminar(Libro l) {
        if (libros.containsKey(l.getId())) {
            // aca deben colocar codigo
            libros.remove(l.getId());
            
        } else {
            System.out.println("No se pudo eliminar al producto");
        }
    }

    @Override
    public void listar() {
        // aca se deve colocar el codigo
        for(Integer key: libros.keySet()){
            System.out.println("Clave " + key + " Libros " + libros.get(key));
        }

    }
}


