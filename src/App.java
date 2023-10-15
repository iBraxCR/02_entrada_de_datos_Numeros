import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    double numero; // El numero puede ser float o int ya que va a variar si es con decimaes que en este caso "float" lo haria con decimales, si son numeros enteros se usa "int" y si es mas decimales se usa "double"

    System.out.print("Digite su numero: ");
    numero = entrada.nextDouble();  //Si es float se usa "nextFloat" y si es int se usa "nextInt"

    System.out.print("El numero es: " + numero);
    }
}
gi