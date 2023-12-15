package practice;

public class song {
	private String song;
	private String singer;
	private int view;
	
	 public song(String song,String singer,int view) {
		 this.song=song;
		 this.singer=singer;
		 this.view=view;
		 
	 }
	 public String getsong() {
		 return song;
	 }
	 public String getsinger() {
		 return singer;
	 }
	 public int getview() {
		 return view;
	 }
	 public String setsong(String song) {
		 this.song=song;
	 }
	 public String setsinger(String singer) {
		 this.singer=singer;
	 }
	 public int setview(int view) {
		 this.view=view;
	 }

}
