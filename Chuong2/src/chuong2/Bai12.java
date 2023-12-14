package chuong2;

import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem: ");
		double diem = sc.nextDouble();
		if(diem > 90 && diem < 100) {
			System.out.println("A");
		}
		else if(diem > 80 && diem <= 90) {
			System.out.println("B");
		}
		else if(diem >70 && diem <= 80) {
			System.out.println("C");
		}
		else if(diem > 50 && diem <= 70) {
			System.out.println("D");
		}
		else System.out.println("F");
	}

}
