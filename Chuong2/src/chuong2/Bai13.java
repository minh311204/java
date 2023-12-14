package chuong2;

import java.util.Scanner;

public class Bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int giaban = sc.nextInt();
		double phantram = sc.nextDouble();
		int giabansaukhigiam = giaban - (giaban * phantram);
		System.out.println("Gia ban sau khi giam gia la: "+ giabansaukhigiam);
	}

}
