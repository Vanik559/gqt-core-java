package core.gqt.corejava.patterns;

import java.util.Scanner;

public class Patern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count:");
		int n = sc.nextInt();
		int a = n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
					
					
			System.out.print(a +" *	");
			a--;
		
			}
			System.out.println();
	}

}}
