import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¿Cual es tu edad?");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        System.out.println("Tu edad es " + edad);
    }
}
