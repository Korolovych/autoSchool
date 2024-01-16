import com.welcome.Hello;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Hello helloInstance = new Hello();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        helloInstance.setupName(name);
        helloInstance.welcome();
        System.out.println("Hello, world!");
        helloInstance.byeBay();
        scanner.close();
    }
}