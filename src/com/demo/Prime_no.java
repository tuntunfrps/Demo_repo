package com.demo;

public class Prime_no {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=9;
		 boolean flag=true;
		 for(int i=2; i<n;i++)
		 {
			 if(n%i==0)
			 {
				 flag=false;
				 break;
			 }
		 }
		if(flag==true)
{
			System.out.println("Prime hai");
	}
		else {
			System.out.println("nahi hai");
		}
	}
	

}
