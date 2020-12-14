package birds;

public interface ICanFly {
	
	default void land() {
		System.out.println("Pleaz seat");
	}
	void fly();
}
