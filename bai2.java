package bai1;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args)
	{
		int a;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("nhap so nguyen a: ");
			a=sc.nextInt();
		} 
		if (a % 2==0)
			System.out.println("so vua nhap la so chan");
		else
			System.out.println("so vua nhap la so le");
	}
}