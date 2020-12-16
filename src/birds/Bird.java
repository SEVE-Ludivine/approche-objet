package birds;

public abstract class Bird {

	protected String name;

	public Bird( String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void describe();

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder( "Bird{" );
		sb.append( "name='" ).append( name ).append( '\'' );
		sb.append( '}' );
		return sb.toString();
	}
}