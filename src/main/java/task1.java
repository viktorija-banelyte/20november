import java.util.Scanner;

public static int rectangleArea(int a, int b) {
            return a * b;
        }

public static double rectangleArea(double a, double b) {
            return a * b;
        }
void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Iveskite pirma krastine: ");
    double a = scanner.nextDouble();
    System.out.print("Iveskite antra krastine: ");
    double b = scanner.nextDouble();

    if (a == (int) a && b == (int) b) {
        int area = rectangleArea((int) a, (int) b);
        System.out.println("Staciakampio plotas: " + area);
            }
    else {
        double area = rectangleArea(a, b);
        System.out.println("Staciakampio plotas: " + area);
    }
    scanner.close();
}
