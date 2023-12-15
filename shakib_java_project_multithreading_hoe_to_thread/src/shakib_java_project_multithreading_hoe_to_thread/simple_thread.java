package shakib_java_project_multithreading_hoe_to_thread;

public class simple_thread extends Thread{
	
	@Override
	
	public void run() {
		try {
		for(int i=0;i<5;i++) {
		System.out.println("imtiazzzzz");
		Thread.sleep(1000);//1000 millisecods
	}
	
	}catch(InterruptedException i) {
		
	}
	}

}
