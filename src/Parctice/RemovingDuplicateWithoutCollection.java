package Parctice;

public class RemovingDuplicateWithoutCollection {
public static void main(String[] args) {
	int [] numWithDulicate= {1,2,1,2,3,4,1,5,6,2,3,3,3,3,6,6,6,8,8,8,8,0,0,9,9,9};
	int [] unique= new int [numWithDulicate.length-1];
	int index=0;
	boolean flag=false;
	for(int n:numWithDulicate) {
		for(int m:unique) {
			if(n==m) {
				flag=true;
			}
		}
		if(flag==false) {
			unique[index]=n;
			index++;
		}
		flag=false;
		       
	}
	for(int elem:unique) {
		System.out.println(elem);
	}
	System.out.println("Th");
}
}
