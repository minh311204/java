package chuong2;

import java.util.Scanner;

public class Bai16 {

	public static void main(String[] args) {
			Scanner sn = new Scanner(System.in);
			int giaithua=1;
			int n=sn.nextInt();
			sn.close();
			for(int i = 1 ; i <= n ;i ++)
				giaithua = giaithua *i;
			System.out.println(giaithua);
	}
}
