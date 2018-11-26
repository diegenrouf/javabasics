import java.util.Scanner;

public class birthdayAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double filledPercentage = Double.parseDouble(scanner.nextLine());

        double aquariumVolume = length * width * height;

        aquariumVolume = aquariumVolume * 0.001;
        filledPercentage = filledPercentage * 0.01;

        double litersNeeded = aquariumVolume * (1 - filledPercentage);

        System.out.printf("%.3f", litersNeeded);
    }
}