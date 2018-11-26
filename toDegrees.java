import java.util.Scanner;

public class toDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", Math.toDegrees(rad));
    }
}