package lab2;
import java.util.*;
public class Execise2 {
	
	public void sortStrings(String arr[])
	{
		Arrays.sort(arr);
		for(String i:arr)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		System.out.println("Enter array of Strings");
		String str[]=new String[n+1];
		
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		Execise2 obj=new Execise2();
		obj.sortStrings(str);

	}

}
