package Assignment_1_All;

import java.util.Scanner;

//Q8 palindrome checker

public class PalindromeChecker {
	public static void palindrome(int number) {
		int temp=number;
		int rem;
		int check =0;
		while(number!=0) {
			rem=number %10;
			check=(check*10)+rem;
			number =number /10;
		}
		if(temp==check) System.out.println("palindrome number and number is "+temp);
		else System.out.println(" !!not!! palindrome number and number is "+temp);
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number you want to check ");
		int num=s.nextInt();
		palindrome(num);
	}
	
	
}
