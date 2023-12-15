package all_Multithreading_no_multi_buffer;

public interface Buffer {
    public void set(int value) throws InterruptedException;
    public int get1() throws InterruptedException;
	public int get();
	public void set1(int count);
}

