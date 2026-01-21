package LEC_6_ARRAY;

import java.util.Scanner;

public class baitap1_Array {

    // nhap mang
    static void nhapMang(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
    }

    // hien thi tat ca ra man hinh
    static void inMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // dao nguoc mang
    static void daoMang(int[] a, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    }

    // in so chan
    static void inSoChan(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    // tong cac so chia het cho 3 va 5
    static int tongCacSo(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                tong += a[i];
            }
        }
        return tong;
    }

    // sap xep tang dan
    static void tangDan(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    // sap xep giam dan
    static void giamDan(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        nhapMang(a, n);

        System.out.print("Mang la: ");
        inMang(a, n);

        daoMang(a, n);
        System.out.print("Mang dao la: ");
        inMang(a, n);

        System.out.print("So chan la: ");
        inSoChan(a, n);

        System.out.println("Tong cac so chia het cho 3 va 5 la: " + tongCacSo(a, n));

        tangDan(a, n);
        System.out.print("Cac so tang dan: ");
        inMang(a, n);

        giamDan(a, n);
        System.out.print("Cac so giam dan: ");
        inMang(a, n);
    }
}
