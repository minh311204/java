package chuong2;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			if(i % 2 == 1) {
				sum+=i;
			}
		}
		System.out.println("Tong cac so le tu 1 den 100 la: "+sum);
	}

}
