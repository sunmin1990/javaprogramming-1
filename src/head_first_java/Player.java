package head_first_java;

public class Player {
	int number=0; // Player μ΄κΈ°? λ³??
	
	public void guess() {
		number = (int) (Math.random()*10);
		// ?? ??± λ©μ? 
	}
}
