import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int area = a * b * h;

        double totalLitres = area * 0.001;

        double result = totalLitres - (totalLitres * percentage / 100);

        System.out.printf("%.3f", result);
    }
}