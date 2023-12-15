package practice;

public class evenodd {
	public static void main(String[]args) {
		getfunction(21);
		getdivisors(16);
	
		
	}
	static void getfunction(int x) {
		//int sum=x%2;
		if(x%2==0) {
			System.out.println("even");
		
		}else {
			System.out.println("odd");
			
		}
		//return sum;
	}
	static void getdivisors(int x) {
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				System.out.println(i);
			}
		}
	}
	

}
