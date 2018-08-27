
/**
 * En esta clase se plantean los métodos para establecer los datos
 * de cada uno de los empleados del supermercado Santa Fe.
 * 
 * @author Bafen Ricardo Barragán 
 * @version 1.0 
 */
public class Empleado
{
    private String nombre;
    private String apellido;
    private String departamento; 
    private String cargo; 
    private double salario; 
    

    /**
     * Método constructor para la clase Empleado
     */
    public Empleado()
    {
        nombre = " "; 
        apellido = " ";
        departamento = " "; 
        cargo = " "; 
        salario = 0; 
    }

    /**
     * Método constructor para la clase Empleado, con parámetros.
     */
    public Empleado(String nom, String ape, String dep, String car, double sal)
    {
        nombre = nom; 
        apellido = ape;
        departamento = dep; 
        cargo = car; 
        salario = sal; 
    }
    
    /**
     * Método modificador para el Nombre del empleado
     */
    public void cambiarNombre(String nombre)
    {
        this.nombre = nombre; 
    }
    
    /**
     * Método analizador para el Nombre del empleado
     */
    public String obtenerNombre()
    {
        return nombre; 
    }
    
    /**
     * Método modificador para el Apellido del empleado
     */
    public void cambiarApellido(String apellido)
    {
        this.apellido = apellido; 
    }
    
    /**
     * Método analizador para el Apellido del empleado
     */
    public String obtenerApellido()
    {
        return apellido; 
    }
    
    /**
     * Método modificador para el Departamento del empleado
     */
    public void cambiarDepto(String departamento)
    {
        this.departamento = departamento; 
    }
        
    /**
     * Método analizador para el Departamento del empleado
     */
    public String obtenerDepto()
    {
        return departamento; 
    }
    
    /**
     * Método modificador para el Cargo del empleado
     */
    public void cambiarCargo(String cargo)
    {
        this.cargo = cargo; 
    }
    
    /**
     * Método analizador para el Cargo del empleado
     */
    public String obtenerCargo()
    {
        return cargo; 
    }
    
    /**
     * Método modificador para el Salario del empleado
     */
    public void cambiarPago(double salario)
    {
        this.salario = salario; 
    }
    
    /**
     * Método analizador para el Nombre del empleado
     */
    public double obtenerPago()
    {
        return salario; 
    }
}
