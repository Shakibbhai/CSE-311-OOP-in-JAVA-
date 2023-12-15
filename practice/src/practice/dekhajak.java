package practice;

public class dekhajak {
    public static void main(String[]args) {
    	System.out.println("starts:");
    	int rakhlm=getsum(10,20);
    	double rakhsi=getaddition(10.0,20.7);
    	System.out.println(rakhlm+"\n"+rakhsi);
    	getsum();
    }
    static int getsum(int x,int y) {
    int sum=x+y;
    return sum;
    }
    static double getaddition(double x,double y) {
    	double add=x-y;
    	return add;
    }
    static void getsum() {
    	System.out.println("calculator done");
    }
}
