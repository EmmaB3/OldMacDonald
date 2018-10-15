class NamedCow extends Cow
{
	private String sound, type, name;
	public NamedCow(String t, String s, String n){
		type = t;
		sound = s;
		name = n;
	}
	public String getName(){return name;}
}