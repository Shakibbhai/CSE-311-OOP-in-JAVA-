package shakib_java_project_multithreading_hoe_to_thread;

public class main {
	public static void main(String args[])throws InterruptedException {
		
		simple_thread a=new simple_thread();
		a.start();
			for(int i=0;i<5;i++) {
			System.out.println("Rahullllll");
			Thread.sleep(1000);
		}
			
		}
	}


