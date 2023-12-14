package chuong2;

import java.util.Scanner;

public class Bai18 {
	public static boolean check(int n ) {
		if(n<2)
			return false ;
		else {
		
			for (int i = 2 ; i <= Math.sqrt(n) ;i++)
				if(n%i==0)
					return false ;
			
		}
		return true ;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n =sn.nextInt();
		sn.close();
		if(check(n))
			System.out.println("là số nguyên tố ");
		else 
			System.out.println("Không là số nguyên tố ");
			

	}

}
