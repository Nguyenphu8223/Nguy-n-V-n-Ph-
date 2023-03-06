package bai1;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args)
	{
		int a;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("nhap so tu 1 den 12: ");
			a=sc.nextInt();
		}

		if (a>=1 & a<=12)
			System.out.println("thang "+a);
		else
			System.out.println("nhap sai");
	}
}