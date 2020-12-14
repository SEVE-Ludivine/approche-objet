package birds;

public class Penguin extends Bird implements ICanSwim {
	
	public Penguin( String name ) {
		super( name );
	}
	
	@Override
	public void describe() {
		System.out.println( "i am a penguin named: " + name );
	}
	
	@Override
	public void swim() {
		System.out.println( "i swim like a penguin" );
	}
}
