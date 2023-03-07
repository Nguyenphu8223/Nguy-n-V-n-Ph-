package bai1;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen");
		int a = sn.nextInt();
		if(a%2==0)
			System.out.println("La so chan");
		else 
			System.out.println("La so le");
	}

}
