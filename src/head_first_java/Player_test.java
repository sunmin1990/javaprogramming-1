package Being_Compiler;

class TapeDeck{
	boolean canRecord = false; //그냥 초기상태가 false인것 뿐.
	
	void playTape() {
		System.out.println("tape playing");
	}
	void recordTape() {
		System.out.println("tape recording");
	}
}

class Player_test {
	public static void main(String[]args) {
		TapeDeck t = new TapeDeck();
		t.canRecord = true;
		t.playTape();
		
		if(t.canRecord==true) {
			t.recordTape();
		}
	
	}
}
