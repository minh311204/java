package chuong2;

import java.util.Scanner;

public class Bai15 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double Dongia = sn.nextDouble();
		int songay = sn.nextInt();
		sn.close();
		if(songay==1)
		System.out.println("Tiền phòng:"+(Dongia*songay)) ;
		else if (songay>=2 && songay<=4)
		System.out.println("Tiền phòng :" + (Dongia*songay-Dongia*songay*20/100));
		else if (songay>=5 && songay<=10)
		System.out.println("Tiền phòng :" +(Dongia*songay-Dongia*songay*40/100));
		else 
		System.out.println("Tiền phòng: " +(Dongia*songay-Dongia*songay*60/100));
	}
}
