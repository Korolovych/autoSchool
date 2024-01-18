import java.util.Comparator;
import java.util.Scanner;

public class ReferenceTypes {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        printTask1();
        System.out.println("Task 2: ");
        printTask2();
        System.out.println("Task 3: ");
        printTask3();
    }
    private static void printTask1() {
        String text = "Budapest is the capital of Hungary.";
        String name = text.substring(0,text.length()-34);
        System.out.println("First symbol: " + name);
        String last = text.substring(34,text.length()-0);
        System.out.println("Last symbol: " + last);
        String middle = text.substring(16,text.length()-18);
        System.out.println("Middle symbol: " + middle);
        char firstSymbol = text.charAt(0);
        System.out.println("Char first symbol: " + firstSymbol);
        char lastSymbol = text.charAt(text.length()-1);
        System.out.println(STR."Char last symbol: \{lastSymbol}");
        char middleSymbol = text.charAt(text.length()/2-1);
        System.out.println("Char middle symbol: " + middleSymbol);
        int indexOfPoint = text.indexOf('.');
        System.out.println("index Of Point: " + indexOfPoint);
        String substringBeforePoint = text.substring(0, indexOfPoint + 1);
        System.out.println(substringBeforePoint);
        long spaceCount = text.chars().filter(ch -> ch == ' ').count();
        System.out.println("Space count: " + spaceCount);
    }
    private static void printTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your string here: ");
        String originalString = scanner.nextLine();
        System.out.println("Input substring to replacement: ");
        String substringToReplacement = scanner.nextLine();
        System.out.println(" Input new substring: ");
        String newSubstring = scanner.nextLine();
        String modifiedString = originalString.replaceFirst(substringToReplacement, newSubstring);
        System.out.println("Replaced string: " + modifiedString);
    }
    private static void printTask3() {
        String newString = "Today is the best day of my life!";
        String[] newStringParts = newString.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for (String word: newStringParts) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
            int wordLength = cleanedWord.length();
            if (wordLength > maxLength) {
                maxLength = wordLength;
                longestWord = cleanedWord;
            }
        }
            System.out.println("Longest word: " + longestWord);
        }

    }

