import java.util.Scanner;

public class trapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = (sideA + sideB) * h / 2.0;

        System.out.println(area);
    }
}