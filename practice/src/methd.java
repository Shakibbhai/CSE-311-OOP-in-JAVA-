
public class methd {
	public static void main(String []args) {
		String name="bro";
		int age=24;
		hello(name,age);
		int x,y;
		int z=addition(5,6);
		System.out.println(z);
	}
  static void hello(String name,int age) {
		System.out.println("hello "+name);
		System.out.println("u are "+age);
	}
  static int addition(int x,int y) {
	int sum=x+y;
	  return sum;
  }

}
