
public class methodoverloadin {
	public static void main(String []args) {
		double s=add(5.0,6.0);
		System.out.println(s);
		
	}
	static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	static int add(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	static double add(double a, double b) {
		double sum=a*b;
		return sum;
	}
	static double add(double a, double b,doble c) {
		double sum=a*b*c;
		return sum;
	}

}
