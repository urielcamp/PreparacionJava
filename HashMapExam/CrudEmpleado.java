package HashMapExam;

public class CrudEmpleado implements ICrudEmpleado{
    @SuppressWarnings("unchecked")
    java.util.HashMap<Integer, Empleado> empleados = new java.util.HashMap();

    @Override
    public void agregar(Empleado e) {
        
        // aca deben colocar código
        empleados.put(e.getId(),e);
        
    }

    @Override
    public void modificar(Empleado e) {
        if (empleados.containsKey(e.getId())) {
            // aca deben colocar codigo
            empleados.put(e.getId(), e);
            
            
        } else {
            System.out.println("No se pudo modificar al producto");
        }

    }

    @Override
    public void eliminar(Empleado e) {
        if (empleados.containsKey(e.getId())) {
            // aca deben colocar codigo
            empleados.remove(e.getId());
            
        } else {
            System.out.println("No se pudo eliminar al producto");
        }
    }

    @Override
    public void listar() {
        // aca se deve colocar el codigo
        for(Integer key: empleados.keySet()){
            System.out.println("Clave " + key + " Empleado " + empleados.get(key));
        }
    }
}
