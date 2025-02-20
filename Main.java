import java.util.Scanner; // Importar la clase Scanner
public class Main {

  public static void main(String[] args) {
      System.out.println("Hello World!");
      num(new int[]{1, 2, 3}); // Ejemplo de cómo llamar a la función num
      str(new String[]{"texto"}, 10); // Ejemplo de cómo llamar a la función str
  }

  // Método que toma un arreglo de enteros
  public static void num(int[] args) {
      System.out.println(10);
  }

  // Método que toma un arreglo de Strings y un entero
  public static void str(String[] strArray, int num) {
      System.out.println("texto y " + num);
  }
}

