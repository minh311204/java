package chuong2;

import java.util.Scanner;

public class Bai22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		float tong = 0;
		float a[]=new float[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.print("a["+i+"]=");
			a[i]=sn.nextFloat();
	}
		for(int i = 0 ; i < n ; i++) {
			tong = tong + a[i] ;
		}
		System.out.print(tong);
		sn.close();
	}

}
