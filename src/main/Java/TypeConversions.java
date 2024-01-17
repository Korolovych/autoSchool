import java.util.Random;
public class TypeConversions {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        printTask1();
        System.out.println("Task 2: ");
        printTask2();
        System.out.println("Task 3: ");
        printTask3();
        System.out.println("Task 4: ");
        printTask4();
    }

    private static void printTask1() {
        Random random = new Random();
        int q = random.nextInt(100) + 1;
        int w = random.nextInt(20) + 1;
        System.out.println("q:" + q);
        System.out.println("w:" + w);
        int result = q / w;
        int remainder = q % w;
        System.out.println("results:" + result);
        System.out.println("remainder:" + remainder);
    }

    private static void printTask2() {
        Random random = new Random();
        int n = random.nextInt(99);
        System.out.println("n: " + n);
        int digit1 = n % 10;
        int digit2 = n / 10;
        int sum = digit1 + digit2;
        System.out.println("Sum " + n + ": " + sum);
    }

    private static void printTask3() {
        Random random = new Random();
        double n = random.nextDouble() * 9 + 10;
        System.out.println("n random:" + n);
        long roundNumber = Math.round(n);
        System.out.println("Rounded n: " + roundNumber);
        float c = random.nextFloat() * 9 +10;
        System.out.println("c: " + c);
        long cRoundNumber = Math.round(c);
        System.out.println("Rounded c: " + cRoundNumber);
        System.out.println("Wrapper classes");
        double m = random.nextDouble() * 9 + 10;
        System.out.println("m random: " + m);
        Double wrappedNumber = m;
        long mRoundNumber = Math.round(wrappedNumber);
        System.out.println("Rounded m: " + mRoundNumber);

    }
    private static void printTask4() {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(9);
        int c = random.nextInt(8);

        System.out.println("r a: " + a);
        System.out.println("r b: " + b);
        System.out.println("r c: " + c);

        Integer newA = a + b;
        Integer newB = c - a;
        Integer newC = a+b+c;

        System.out.println("a: " + newA);
        System.out.println("b: " + newB);
        System.out.println("c: " + newC);

    }
}