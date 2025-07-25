package HashMapExam;

public class CrudProductos implements ICrudProductos{
    @SuppressWarnings("unchecked")
    java.util.HashMap<Integer, Producto> productos = new java.util.HashMap();

    @Override
    public void agregar(Producto p) {
        
        // aca deben colocar código
        productos.put(p.getId(), p);
        
    }

    @Override
    public void modificar(Producto p) {
        if (productos.containsKey(p.getId())) {
            // aca deben colocar codigo
            productos.put(p.getId(), p);
            
            
        } else {
            System.out.println("No se pudo modificar al producto");
        }

    }

    @Override
    public void eliminar(Producto p) {
        if (productos.containsKey(p.getId())) {
            // aca deben colocar codigo
            productos.remove(p.getId());
            
        } else {
            System.out.println("No se pudo eliminar al producto");
        }
    }

    @Override
    public void listar() {
        // aca se deve colocar el codigo
        for(Integer key: productos.keySet()){
            System.out.println("Clave " + key + " Producto: " + productos.get(key));
        }
    }
}

