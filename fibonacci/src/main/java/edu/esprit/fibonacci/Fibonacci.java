package edu.esprit.fibonacci;

public class Fibonacci {
	
	public long fibo(long n){
		//Comment
		if(n <= 1)
			return n;
		
		return fibo(n-1) + fibo(n-2);
	}

}
