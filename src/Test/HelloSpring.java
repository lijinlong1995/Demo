package Test;

public class HelloSpring {

	private  String who = null;
	private  String  what = null;
	 
	public  void  print() {
		System.out.println("Hello,"+this.getwhat()+"!");
	}
	
	public String getwho() {
		return who;
	}
	
	public  void setwho(String who) {
		this.who = who;
	}
	
	public String getwhat() {
		return what;
	}
	
	public  void setwhat(String what) {
		this.what = what;
	}
	
}
