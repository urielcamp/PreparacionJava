package HashMapExam;

public class CrudAlumno implements ICrudAlumno{
    @SuppressWarnings("unchecked")
    java.util.HashMap<Integer, Alumno> alumnos = new java.util.HashMap();

    @Override
    public void agregar(Alumno a) {
        // aca deben colocar código
        alumnos.put(a.getId(), a);
        
        
    }

    @Override
    public void modificar(Alumno a) {
        if (alumnos.containsKey(a.getId())) {
            // aca deben colocar codigo
            alumnos.put(a.getId(), a);
            
            
        } else {
            System.out.println("No se pudo modificar al producto");
        }

    }

    @Override
    public void eliminar(Alumno a) {
        if (alumnos.containsKey(a.getId())) {
            // aca deben colocar codigo
            alumnos.remove(a.getId());
            
        } else {
            System.out.println("No se pudo eliminar al producto");
        }
    }

    @Override
    public void listar() {
        // aca se deve colocar el codigo
        for(Integer key: alumnos.keySet()){
            System.out.println("Clave " + key + " Alumno " + alumnos.get(key));
        }
    }
}
