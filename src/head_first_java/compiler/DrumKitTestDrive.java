package head_first_java.compiler;

class DrumKit{
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare() {
		System.out.println("bang");
	}
	void playTopHat() {
		System.out.println("ding");
	}
}

public class DrumKitTestDrive {
	public static void main(String[]args) {
		DrumKit d = new DrumKit();
		
		d.snare=false;
		if(d.snare==true) {
			d.playSnare();
		}
	}
}
