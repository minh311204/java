package chuong2;

import java.util.Scanner;

public class Bai20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double doC = sn.nextDouble();
		double doF= doC*1.8+32;
		System.out.print(doC + " độ C tương ứng với " + doF + " độ F ");
		sn.close();
	}
}
