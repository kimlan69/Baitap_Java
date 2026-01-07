package BAITAP;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhap Student ID: ");
        int iD = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap hometown: ");
        String homeTown = scanner.nextLine();

        System.out.print("Nhap GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Nhap Major: ");
        String mayJor = scanner.nextLine();

        System.out.print("Nhap Scholarship: ");
        boolean hocBong = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Nhap Date: ");
        String date = scanner.nextLine();

        System.out.println("Ho va ten: " + hoTen
                + "\nStudent ID: " + iD
                + "\nDia chi: " + homeTown
                + "\nGPA: " + gpa
                + "\nMayjor: " + mayJor
                + "\nHoc Bong: " + hocBong
                + "\nDate: " + date);
    }

}
