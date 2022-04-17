package _15_Exceptions;

import java.util.Scanner;

public class Task01 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int v = vizeNotunuGir();
        int f = finalNotunuGir();

        ortalama(v, f);

    }

    private static int finalNotunuGir() {
        int finalNotu = -1;
        System.out.println("Final notunu gir: ");
        do {
            try {
                finalNotu = scan.nextInt();
                if (finalNotu < 0 || finalNotu > 100) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                scan.nextLine();
                System.out.println("Final notu 0-100 arasinda olmalidir.");

            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Lutfen gecerli giris yapiniz.");

            }
        } while (finalNotu == -1);

        return finalNotu;
    }

    private static void ortalama(int v, int f) {
        System.out.println("vize " + v);
        System.out.println("final " + f);

        if (((v * 0.40) + (f * 0.60)) < 60) {
            System.out.println("Ortalaman " + ((v * 0.40) + (f * 0.60)) + "\nKaldin reis gecmis olsun :(");
        } else if (((v * 0.40) + (f * 0.60)) < 80) {
            System.out.println("Ortalaman " + ((v * 0.40) + (f * 0.60)) + "\nGectin ama daha iyi olabilirdi :)");
        } else {
            System.out.println("Ortalaman " + ((v * 0.40) + (f * 0.60)) + "\nSupersin :D");
        }
    }

    private static int vizeNotunuGir() {
        int vizeNotu = -1;

        while (vizeNotu == -1) {
            try {
                System.out.println("Vize notunu gir: ");
                vizeNotu = scan.nextInt();
                if (vizeNotu < 0 || vizeNotu > 100) {
                    throw new ArithmeticException();

                }
            } catch (ArithmeticException e) {
                scan.nextLine();
                System.out.println("Vize notu 0-100 arasinda olmalidir.");
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Lutfen gecerli giris yapiniz.");
            }
        }

        return vizeNotu;
    }
}
