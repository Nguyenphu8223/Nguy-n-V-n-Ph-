package bai1;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args)
	{
		//tinh tong, hieu, tich, thuong, phan du....
		int a,b;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("nhap so a: ");
			a= sc.nextInt();
			System.out.println("nhap so b: ");
			b= sc.nextInt();
		}
		int c=a+b;
		System.out.println("tong la "+a+" + "+b+" = "+c);
		int d=a-b;
		System.out.println("tong la "+a+" - "+b+" = "+d);
		int e=a*b;
		System.out.println("tong la "+a+" * "+b+" = "+e);
		float f=a/b;
		System.out.println("tong la "+a+" / "+b+" = "+f);
		float g=a%b;
		System.out.println("tong la "+a+" % "+b+" = "+g);
		//dung toan tu da hoc so sanh....
		System.out.println("so sanh bang 2 so " +a+ " va " +b+ " la "+(a == b));
		System.out.println("so khac 2 so " +a+ " va " +b+ " la "+(a != b));
		System.out.println("so lon hon 2 so " +a+ " va " +b+ " la "+(a > b));
		System.out.println("so lon hon bang 2 so " +a+ " va " +b+ " la "+(a >= b));
		System.out.println("so nho hon 2 so " +a+ " va " +b+ " la "+(a < b));
		System.out.println("so nho hon bang 2 so " +a+ " va " +b+ " la "+(a <= b));
	}
}