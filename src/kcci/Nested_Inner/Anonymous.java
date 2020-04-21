package kcci.Nested_Inner;
interface Animal{
	void breath();
}
class Dog implements Animal{
	@Override 
	public void breath() {
		System.out.println("Dog Breath");
	}
}
public class Anonymous {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.breath();
		Animal a = new Animal() {
			public void breath() {
				System.out.println("NO");
				}
		};
		a.breath();	

	}
}