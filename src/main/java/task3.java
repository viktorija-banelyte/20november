
import java.util.Scanner;


int sum(int x) {
        if (x == 0) {
            return 0;
        }

        return x % 10 + sum(x / 10);
    }

void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Iveskite skaiciu: ");
        int x = sc.nextInt();

        System.out.println("Skaitmenu suma: " + sum(x));

        sc.close();
    }

