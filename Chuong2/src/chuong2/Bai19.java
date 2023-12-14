package chuong2;

import java.util.Scanner;

public class Bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sn = new Scanner(System.in);
			int sogio= sn.nextInt();
			int sophut=sn.nextInt();
			int sogiay=sn.nextInt();
			sn.close();
			int tonggiay= sogio*3600 + sophut*60+sogiay;
			System.out.print(tonggiay);
		}
}
