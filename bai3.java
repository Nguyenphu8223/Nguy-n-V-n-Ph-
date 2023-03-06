package bai1;

import java.util.Scanner;

public class bai3 
{
		public static void main(String[] args)
		{
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("nhap ten: ");
				String hoten = sc.nextLine();
				System.out.println("nhap tuoi: ");
				int tuoi = sc.nextInt();
				if(tuoi < 16)
					System.out.println("Ban " + hoten + " o do tuoi vi thanh nien");
				else 
					if(tuoi >=16 & tuoi <18)
					{
					System.out.println("Ban " + hoten + " o do tuoi truong thanh");
					}
				else 
					System.out.println("Ban " + hoten + " da gia");
			}
		}
}