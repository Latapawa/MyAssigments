package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		
		int firstNum=0;
		int secondNum=1;
		int sum=0;
		System.out.println("Fibbinocci seris");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			sum=firstNum + secondNum;
			firstNum=secondNum;
			secondNum =sum;
			System.out.println(sum);
		}
		
	}

}
