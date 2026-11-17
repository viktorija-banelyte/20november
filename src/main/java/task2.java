
import java.util.Scanner;
import java.time.LocalDate;

long daysbetween(int years_from, int months_from, int days_from,
                                   int years_to, int months_to, int days_to) {

        LocalDate date1 = LocalDate.of(years_from, months_from, days_from);
        LocalDate date2 = LocalDate.of(years_to, months_to, days_to);

        return Math.abs(date1.toEpochDay() - date2.toEpochDay());
    }

void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (year month day): ");
        int years_from = sc.nextInt();
        int months_from = sc.nextInt();
        int days_from = sc.nextInt();

        System.out.print("Enter second date (year month day): ");
        int years_to = sc.nextInt();
        int months_to = sc.nextInt();
        int days_to = sc.nextInt();

        long result = daysbetween(years_from, months_from, days_from,
                years_to, months_to, days_to);

        System.out.println("Days between dates: " + result);

        sc.close();
    }

