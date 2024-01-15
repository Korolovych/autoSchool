import java.util.Scanner;
public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        printHelloName();
    }

public static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = scanner.nextLine();
        System.out.print(STR."Hello,\{name}!");
    }
}