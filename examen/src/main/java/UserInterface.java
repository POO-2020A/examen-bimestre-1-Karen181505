
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private int cols;
    private int rowl;
    private Plane plane;
    private Scanner scan;
    

    public UserInterface(int rowl, int cols) {
        this.rowl = rowl;
        this.cols = cols;
        this.scan = new Scanner(System.in);
        this.plane = new Plane(rowl, cols);

    }

    public void print() {
        System.out.println(this.plane);
        
        while (true) {
            int opcion =0;
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Ingresar Pasajero");
            System.out.println("2. Consultar asiento");
            System.out.println("3. Consultar pasajero");
            opcion = Integer.valueOf(scan.nextLine());
            
            if (opcion == 1) {
                System.out.println("Ingresar un pasajero:");
                System.out.println("Ingrese el nombre del pasajero:");
                String nombre = scan.nextLine();
                System.out.println("Ingrese el apellido del pasajero:");
                String apellido = scan.nextLine();
                
                System.out.println("Ingrese la fila del asiento:");
                int fila = Integer.valueOf(scan.nextLine());
                System.out.println("Ingrese la  columna del asiento:");
                String colum = scan.nextLine();
                Passenger passenger = new Passenger(nombre, apellido);
                Seat seat = new Seat(fila, colum);
                System.out.println(seat);
                
            } else if (opcion == 2) {
                System.out.println("Ingrese la fila del asiento:");
                int fila = Integer.valueOf(scan.nextLine());
                System.out.println("Ingrese la  columna del asiento:");
                String colum = scan.nextLine();
                Seat seat = new Seat(fila, colum);
                
            } else if (opcion == 3) {
                System.out.println("Consulta de pasajero.");
                System.out.println("Ingrese el nombre y el apellido");
                String pasajero = scan.nextLine();
                

            }
        }
    }

}
