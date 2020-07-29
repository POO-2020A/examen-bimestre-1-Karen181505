import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de columnas");
        int cols = Integer.valueOf(scan.nextLine());
        while( cols > 8){
            System.out.println("Ingrese un numero de columnas valido");
            cols = Integer.valueOf(scan.nextLine());
        }
        System.out.println("Ingrese el numero de filas");
        int rowl = Integer.valueOf(scan.nextLine());
         while(rowl > 20){
             System.out.println("Ingrese un numero de filas valido");
            rowl = Integer.valueOf(scan.nextLine());
         }
         UserInterface user = new UserInterface(rowl, cols);
         user.print();
        
    }
}
