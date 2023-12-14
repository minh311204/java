package chuong2;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh: ");
		double r = sc.nextDouble();
		double dt, cv;
		dt = Math.PI * r * r;
		cv = Math.PI * r * 2;
		System.out.println("Dien tich hinh tron la: "+dt);
		System.out.println("Chu vi hinh tron la: "+ cv);
	}

}
