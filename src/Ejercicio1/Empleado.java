package Ejercicio1;

public class Empleado
{
    private final int id;
    private String nombre;
    private int edad;
    private static int contEmpleados = 1000;
    
    public static int getNextEmpleado()
    {
        return contEmpleados + 1;
    }
    
    public Empleado()
    {
        contEmpleados++;
        id = contEmpleados;
        nombre = "Sin nombre";
        edad = 99;
    }
    
    public Empleado(String _nombre, int _edad)
    {
        contEmpleados++;
        id = contEmpleados;
        nombre = _nombre;
        edad = _edad;  
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    
}
