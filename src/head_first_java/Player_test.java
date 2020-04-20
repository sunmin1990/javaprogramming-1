package head_first_java;

class TapeDeck{
	boolean canRecord = false; //洹몃깷 珥덇린�긽�깭媛� false�씤寃� 肉�.
	
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
