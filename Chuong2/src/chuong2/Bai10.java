package chuong2;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		int x = sc.nextInt();
		System.out.println("Nhap chieu rong: ");
		int y= sc.nextInt();
		int dt, cv;
		dt = x * y;
		cv = (x + y) * 2;
		System.out.println("Dien tich HCN la: " + dt);
		System.out.println("Chu vi HCN la: " + cv);
	}	

}
