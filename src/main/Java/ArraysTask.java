import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.list;
import static sun.swing.MenuItemLayoutHelper.max;

public class ArraysTask {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 1: Maximal among an array of 20 numbers ");
        printTask1();
        System.out.println("Task 2: Array of lines in reverse order [8/10] ");
        printTask2();
        System.out.println("Task 3: Two arrays; string length; index ");
        printTask3();
        System.out.println("Task 4: Array of numbers (from keyboard) in reverse order ");
        printTask4();
        System.out.println("Array + ArrayList");
        printTask5();
    }

    private static void printTask1() {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println("Max number: " + maxNumber);
    }

    private static int[] initializeArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        System.out.println("Type 20 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int max(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    private static void printTask2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        System.out.println("Type in 8 strings: ");
        for (int i = 0; i < 8; i++) {
            list[i] = reader.readLine();
        }
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
    private static void printTask3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = new String[10];
        int[] numberArray = new int[10];
        System.out.println("Type in 10 strings: ");
        for (int i = 0; i < 10; i++) {
            stringArray[i] = reader.readLine();
        }
            for (int i = 0; i<10; i++){
                numberArray [i] = stringArray[i].length();
                System.out.println("Array of numbers: "+numberArray[i]);
            }
        }
    private static void printTask4() throws IOException {
        System.out.println("Type in 10 numbers: ");
        Reader r = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(r);

            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                String s = reader.readLine();
                list.add(s);
            }
            for (int i = 0; i < list.size(); i++) {
                int j = list.size() - i - 1;
                System.out.println(list.get(j));
            }
    }
    private static void printTask5() throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int [] bigArray = new int[20];
    System.out.println("Input 20 numbers: ");
    for (int i = 0; i<20; i++) {
        bigArray[i] = Integer.parseInt(reader.readLine());;
    }
    ArrayList<Integer> smallList1 = new ArrayList<>();
    ArrayList<Integer> smallList2 = new ArrayList<>();
    for (int i = 0; i<10; i++) {
        smallList1.add(bigArray[i]);
        smallList2.add(bigArray[i+10]);
    }
    System.out.println("Second small ArrayList: "+ smallList2);
    }
}
