import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¿Cual es tu nombre?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.next();
        System.out.println("Encantando de conocerte " + nombre);
    }
}
