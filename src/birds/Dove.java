package birds;

public class Dove extends Bird implements ICanFly {
	public Dove( String name ) {
		super( name );
	}
	
	@Override
	public void describe() {
		System.out.println( "i am a dove named: " + name );
	}
	
	@Override
	public void fly() {
		System.out.println( "i fly like a dove" );
	}
	
	public void mDove() {
		System.out.println("My dove method");
	}
}
