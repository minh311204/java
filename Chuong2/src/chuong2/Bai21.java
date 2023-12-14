package chuong2;

import java.util.Scanner;

public class Bai21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int a[]=new int[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.print("a["+i+"]=");
			a[i]=sn.nextInt();
	}
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i]+" ");
		}
		sn.close();
	}

}
