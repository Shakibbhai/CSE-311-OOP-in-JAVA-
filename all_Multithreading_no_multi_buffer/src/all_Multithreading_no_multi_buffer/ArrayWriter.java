package all_Multithreading_no_multi_buffer;

public class ArrayWriter1 implements Runnable{
    private final SimpleArray sharedSimpleArray;
    private final int startValue;
    public ArrayWriter1(int value,SimpleArray array){
        startValue=value;
        sharedSimpleArray=array;
    }
    public void ArrayWriter(int value, SimpleArray sharedSimpleArray2) {
		// TODO Auto-generated constructor stub
	}
	public void run(){
        for(int i=startValue;i<startValue+3;i++){
            sharedSimpleArray.add(i);
        }
    }
}

