import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        pedir(args);
    
    }
    public static void pedir(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese un número: "); 
        int numero = scanner.nextInt();
        mostrar(numero,nombre);
    }
    public static void mostrar(int numero, String nombre) {
        System.out.println("Tu edad es:  " + numero + "te llamas:" + nombre);
    }
}
