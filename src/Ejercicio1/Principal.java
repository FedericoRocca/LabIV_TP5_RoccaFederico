package Ejercicio1;

public class Principal
{
    
    public static void main(String[] args)
    {
        Empleado[] empleados = new Empleado[5];
        empleados[0] = new Empleado();
        empleados[1] = new Empleado("Juan Chota", 25);
        empleados[2] = new Empleado("Pablo Pica", 65);
        empleados[3] = new Empleado("Faso Chiquito", 11);
        empleados[4] = new Empleado("Lapu Tona", 3);
        for (Empleado empleado : empleados)
        {
            System.out.println(empleado.toString());
        }
        System.out.println("Pr�ximo ID de empleado: " + Empleado.getNextEmpleado());
    }
    
}
