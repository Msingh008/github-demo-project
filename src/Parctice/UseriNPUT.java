package Parctice;

import java.util.Scanner;

public class UseriNPUT {
public static void main(String[] args) {
	int[] numbers= {1,7,6,32,43,43};
	int max =numbers[0];
	for(int n:numbers) {
		if(max>=n) {
			continue;
		}else
		{
			max=n;
		}
	}
	
	System.out.println("max numb is :"+max);
 
}
}
