import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine(); // Membaca baris teks dari input pengguna

        int age;
        while (true){
            try {
                System.out.print("Masukkan umur Anda: ");
                age = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Umur tidak valid. Silakan coba lagi.");
                scanner.next();
            }
        }

        boolean isMarried;
        while (true) {
            try {
                System.out.print("Apakah Anda sudah menikah? (true/false): ");
                isMarried = scanner.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("Status tidak valid. Silakan coba lagi.");
                scanner.next();
            }
        }

        System.out.println("Hallo "+name);
        System.out.println("Usia mu "+age+" tahun");
        System.out.print("Dan kamu ");
        if (isMarried){
            System.out.print("sudah ");
        } else {
            System.out.print("belum ");
        }
        System.out.print("menikah");
    }
}