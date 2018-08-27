import java.util.*; 

/**
 * Clase principal del Suepermercado Santa Fe.
 * 
 * @author Bafen Ricardo Barragán Sánchez 
 * @version 1.0
 */
public class SantaFe
{
    static Scanner teclado = new Scanner (System.in); 
    static int opcion = 0;
    static ArrayList <Empleado> datos = new ArrayList<Empleado> ();
       
    
    /**
     * Método para ejecutar el programa 
     */
    public static void main(String [] args)
    {
        String nombre = "Juan"; 
        String apellido = "Sánchez";
        String departamento = "Gerencia"; 
        String cargo = "Administrador"; 
        double salario = 15000000;
        datos.add(new Empleado(nombre, apellido, departamento, cargo, salario));
        
        Empleado sandra = new Empleado(); 
        sandra.cambiarNombre("Sandra"); 
        sandra.cambiarApellido("Martinez");
        sandra.cambiarDepto("Gerencia"); 
        sandra.cambiarCargo("Coordinadora"); 
        sandra.cambiarPago(12000000);
        datos.add(sandra); 
        
        Empleado martin = new Empleado(); 
        martin.cambiarNombre("Martín"); 
        martin.cambiarApellido("Barrera");
        martin.cambiarDepto("Ventas"); 
        martin.cambiarCargo("Jefe"); 
        martin.cambiarPago(10500000);
        datos.add(martin); 
        
        Empleado fabiola = new Empleado(); 
        fabiola.cambiarNombre("Fabiola"); 
        fabiola.cambiarApellido("Mercado");
        fabiola.cambiarDepto("Contabilidad"); 
        fabiola.cambiarCargo("Asistente"); 
        fabiola.cambiarPago(7000000);
        datos.add(fabiola); 
        
        Empleado jesus = new Empleado(); 
        jesus.cambiarNombre("Jesus"); 
        jesus.cambiarApellido("Suárez");
        jesus.cambiarDepto("Mercadeo"); 
        jesus.cambiarCargo("Jefe"); 
        jesus.cambiarPago(10750000);
        datos.add(jesus); 
        
        System.out.println("<<SISTEMA DE NÓMINA SUPERMERCADO SANTA FE>>"); 
        System.out.println();
        System.out.println();
      
        do{
          System.out.println("Presione 1 para ver la lista de empleados.");
          System.out.println("Presione 2 para añadir un nuevo empleado a la lista.");
          System.out.println("Presione 3 para buscar un empleado de la lista por NOMBRE.");
          System.out.println("Presione 4 para buscar un empleado de la lista por APELLIDO.");
          System.out.println("Presione 5 para buscar un empleado de la lista por DEPARTAMENTO."); 
          System.out.println("Presione 6 para buscar un empleado de la lista por CARGO.");
          System.out.println("Presione 7 para eliminar un empleado de la lista."); 
          System.out.println("Presione 9 para salir de la lista de empleados.");
          opcion = teclado.nextInt(); 
          System.out.println(); 
          
          switch (opcion)
          {
              case 1: 
              for (int i = 0; i < datos.size(); i ++)
              {
                  System.out.printf("- %s %s      %s      %s      %.0f\n", datos.get(i).obtenerNombre(), datos.get(i).obtenerApellido(),
                  datos.get(i).obtenerDepto(), datos.get(i).obtenerCargo(), datos.get(i).obtenerPago());
              }
              System.out.println();
              break; 
              
              case 2: 
              
              System.out.print("Ingrese el nombre del nuevo empleado: "); 
              String nom = teclado.next(); 
              System.out.print("Ingrese el apellido del nuevo empleado: "); 
              String apel = teclado.next(); 
              System.out.print("Ingrese el departamento al que pertenece el nuevo empleado: "); 
              String dpto = teclado.next(); 
              System.out.print("Ingrese el cargo del nuevo empleado: "); 
              String carg = teclado.next();
              System.out.print("Ingrese el salario del nuevo empleado: "); 
              double sala = teclado.nextDouble();               
              datos.add(new Empleado(nom, apel, dpto, carg, sala)); 
              
              System.out.println("\nSu nómina ha quedado así:\n");
              
              for (int i = 0; i < datos.size(); i ++)
              {
                  System.out.printf("- %s %s      %s      %s      %.0f\n", datos.get(i).obtenerNombre(), datos.get(i).obtenerApellido(),
                  datos.get(i).obtenerDepto(), datos.get(i).obtenerCargo(), datos.get(i).obtenerPago());
              }
              System.out.println();
              break;
              
              case 3: 
              System.out.print("Ingrese el NOMBRE del empleado que desea buscar, SIN APELLIDO. "); 
              String n = teclado.next(); 
              
              for (int i = 0; i < datos.size(); i++)
              {
                if (datos.get(i).obtenerNombre().equals(n))
                {
                  System.out.println(); 
                  System.out.printf("- %s %s      %s      %s      %.0f\n", datos.get(i).obtenerNombre(), datos.get(i).obtenerApellido(),
                  datos.get(i).obtenerDepto(), datos.get(i).obtenerCargo(), datos.get(i).obtenerPago());
                }
              }
              System.out.println(); 
              break;
              
              case 4: 
              System.out.print("Ingrese ÚNICAMENTE EL APELLIDO del empleado que desea busca. "); 
              String a = teclado.next(); 
              
              for (int i = 0; i < datos.size(); i++)
              {
                if (datos.get(i).obtenerApellido().equals(a))
                {
                  System.out.println(); 
                  System.out.printf("- %s %s      %s      %s      %.0f\n", datos.get(i).obtenerNombre(), datos.get(i).obtenerApellido(),
                  datos.get(i).obtenerDepto(), datos.get(i).obtenerCargo(), datos.get(i).obtenerPago());
                }
              }
              System.out.println(); 
              break;
              
              case 5: 
              System.out.print("Ingrese ÚNICAMENTE EL DEPARTAMENTO del empleado que desea buscar. "); 
              String d = teclado.next(); 
              
              for (int i = 0; i < datos.size(); i++)
              {
                if (datos.get(i).obtenerDepto().equals(d))
                {
                  System.out.println(); 
                  System.out.printf("- %s %s      %s      %s      %.0f\n", datos.get(i).obtenerNombre(), datos.get(i).obtenerApellido(),
                  datos.get(i).obtenerDepto(), datos.get(i).obtenerCargo(), datos.get(i).obtenerPago());
                }
              }
              System.out.println(); 
              break;
              
              case 6: 
              System.out.print("Ingrese ÚNICAMENTE EL CARGO del empleado que desea buscar. "); 
              String c = teclado.next(); 
              
              for (int i = 0; i < datos.size(); i++)
              {
                if (datos.get(i).obtenerCargo().equals(c))
                {
                  System.out.println(); 
                  System.out.printf("- %s %s      %s      %s      %.0f\n", datos.get(i).obtenerNombre(), datos.get(i).obtenerApellido(),
                  datos.get(i).obtenerDepto(), datos.get(i).obtenerCargo(), datos.get(i).obtenerPago());
                }
              }
              System.out.println(); 
              break;
              
              case 7: 
              System.out.print("Ingrese ÚNICAMENTE EL NOMBRE del empleado que desea buscar. "); 
              String b = teclado.next(); 
              
              for (int i = 0; i < datos.size(); i++)
              {
                if (datos.get(i).obtenerNombre().equals(b))
                {
                 datos.remove(i); 
                 }
              }
              
              System.out.println("\nSu nómina ha quedado así:\n");
              
              for (int i = 0; i < datos.size(); i ++)
              {
                  System.out.printf("- %s %s      %s      %s      %.0f\n", datos.get(i).obtenerNombre(), datos.get(i).obtenerApellido(),
                  datos.get(i).obtenerDepto(), datos.get(i).obtenerCargo(), datos.get(i).obtenerPago());
              }
              System.out.println();
              break;
              
              case 9: 
              System.out.println("--- ¡Gracias por utilizar el sistema de nómina del Supermercado Santa Fe! ---");
          }
        }while (opcion != 9); 
      
    }
}
