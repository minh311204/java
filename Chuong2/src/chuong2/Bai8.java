package chuong2;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			if(i % 2 == 0) {
				sum+=i;
			}
		}
		System.out.println("Tong cac so chan tu 1 den 100 la: " + sum);
	}
}
