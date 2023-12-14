package chuong2;

import java.util.Scanner;

public class Bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số điện: ");
		int a = sc.nextInt();
		int tiendien;
		if(a > 0 && a <= 50) {
			tiendien = a * 1484;
		}
		else if(a > 51 && a <= 100) {
			tiendien = 50 * 1484 + (a - 50)*1533;
		}
		else if(a > 101 && a <= 200) {
			tiendien = 50 * 1484 + 50 * 1533 + (a - 100)*1786;
		}
		else tiendien = 50 * 1484 + 50 * 1533 + 100 * 1786 + (a - 200)*2242;
		System.out.println("Tiền điện là: " + tiendien);
	}

}
