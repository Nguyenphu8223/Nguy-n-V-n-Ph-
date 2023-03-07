package bai1;

import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so  thu nhat: ");
		int a=sc.nextInt();
		System.out.println("nhap so thu hai: ");
		int b=sc.nextInt();
		System.out.println("tong 2 so la: "+(a+b));
		System.out.println("hieu 2 so la: "+(a-b));
		System.out.println("tich 2 so la: "+(a*b));
		System.out.println("thuong 2 so la: "+(a/b));
		System.out.println("chia lay du la: "+(a%b));
		if(a>b)
			System.out.println("a lon hon b");
		else 
			System.out.println("a nho hon b");
		if(a==b)
			System.out.println("a bang b");
		else
			System.out.println("a khac b");
	}

}