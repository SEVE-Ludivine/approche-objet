package birds;

public class Duck extends Bird implements ICanFly, ICanSwim {
	
	public Duck( String name ) {
		super( name );
	}
	
	@Override
	public void describe() {
		System.out.println( "i am a duck named: " + name );
	}
	
	@Override
	public void fly() {
		System.out.println("i fly like a duck");
	}
	
	@Override
	public void land() {
		System.out.println("i land like a duck");
	}
	
	@Override
	public void swim() {
		System.out.println("i swim like donald");
	}
}
