class NamedCow extends Cow
{
	private String name;
	public NamedCow(String t, String s, String n){
		super(t,s);
		name = n;
	}
	public String getName(){return name;}
}