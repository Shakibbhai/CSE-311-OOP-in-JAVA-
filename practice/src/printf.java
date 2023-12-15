
public class printf {
	public static void main(String []args) {
		int s=23;
		double a=23434.0;
		char p='a';
		boolean e=true;
		String b="shaka vai";
		
		System.out.printf("%d\n",s);
		System.out.printf("%f\n",a);
		System.out.printf("%c\n",p);
		System.out.printf("%b\n",e);
		System.out.printf("%s\n",b);
		
		System.out.printf("hello u are %d years old\n",19);
		System.out.printf("hello u are %10d years old\n",19);//10 ghor khaoa
		System.out.printf("hello u are %+d years old\n",19);
		System.out.printf("hello u are %,d years old",190000);
	}
}
