package chuong2;

public class Bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 100 ; i <= 999 ; i++) {
			int a =i/100;
			int b =(i%100)/10;
			int c =(i%100)%10;
			if (i==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))
				System.out.println(i);
		}
		
	}
}
