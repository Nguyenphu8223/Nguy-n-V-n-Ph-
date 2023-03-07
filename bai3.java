package bai1;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ten:");
		String ten = sc.nextLine();
		System.out.println("Nhap nam sinh");
		int a = sc.nextInt();
		int b = 2023-a;
		if(b<16)
			System.out.println("Ban "+ten+" la tuoi vi thanh nien");
		if(b>=16 && b<18)
			System.out.println("Ban "+ten+" o do tuoi truong thanh");
		if(b>18)
			System.out.println("Ban "+ten+" la cho");
	}

}
