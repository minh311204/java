package chuong2;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Nhap so nguyen x : ");
		x = sc.nextInt();
		System.out.println("Nhap so nguyen y : ");
		y = sc.nextInt();
		int tong, hieu, tich, thuong;
		tong = x + y;
		hieu = x - y;
		tich = x * y;
		thuong = x / y;
		System.out.println("Tong:" + tong);
		System.out.println("Hieu:" + hieu);
		
		System.out.println("Tich:" + tich);
		System.out.println("Thuong:" + thuong);
	}

}
