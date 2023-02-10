package week1.day1;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int n=17;
		boolean isPrime=false;
		for(int i=2;i<=n-1;i++) {
			if (n%i==0)
			{
			isPrime=true;
			
		}
			if(isPrime==false)
			{
			System.out.println("is prime"+ n);	
			}
			else
			{
				System.out.println("not prime");
			}
	}

}
}
