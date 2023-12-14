package chuong2;

import java.util.Scanner;

public class Bai23 {
	public static void max(int n , int Diemsinhvien[]) {
		int max = Diemsinhvien[0] ;
		int Sinhvien=0;
		for (int i=0 ; i < n ; i ++) {
			if ( max < Diemsinhvien[i]) {
				max = Diemsinhvien[i];
				Sinhvien=i;
			}
		}
		System.out.println("Điểm cao nhất :" + max );
		System.out.println("Sinh viên có điểm cao nhất là sinh viên thứ : " +   (Sinhvien+1));
	}
	public static void sapxep(int n,int Diemsinhvien[]) {
		for(int i = 0 ; i < n ; i++) {
			for(int j= i+1;j<n;j++) {
				if(Diemsinhvien[i]>Diemsinhvien[j]) {
				int temp = Diemsinhvien[i];
				Diemsinhvien[i]=Diemsinhvien[j];
				Diemsinhvien[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(Diemsinhvien[i] + " ");
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
		max(n,Diemsinhvien);
		sapxep(n,Diemsinhvien);
		sn.close();
	}

}
