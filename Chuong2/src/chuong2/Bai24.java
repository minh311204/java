package chuong2;

import java.util.Scanner;

public class Bai24 {
	public static void timkiem(int n , int Diemsinhvien[]) {
		Scanner sn=new Scanner(System.in);
		int Diemcantim = sn.nextInt();
		boolean timthay=false ;
		int Sinhvien=0;
		for  (int i=0;i<n;i++) {
			if (Diemsinhvien[i]==Diemcantim) {
				timthay=true ;
				Sinhvien=i;
				System.out.print("Sinh viên đó là sinh viên thứ " +(Sinhvien + 1));
			}
		}
		if(!timthay)
			System.out.print("Không tìm thấy sinh viên đó ");
		sn.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int n = sn.nextInt();
		int Diemsinhvien[]=new int[n];
		for(int i = 0 ; i < n ; i++) {
			do {
			System.out.print("Sinh viên thứ " + (i+1)+ " có điểm là :");
			Diemsinhvien[i]=sn.nextInt();}
			while(Diemsinhvien[i]<=0||Diemsinhvien[i]>=100);
			
			}
		timkiem(n,Diemsinhvien);
		sn.close();
	}

}
