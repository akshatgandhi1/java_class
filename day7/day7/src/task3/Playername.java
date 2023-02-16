package task3;


public class Playername implements Comparable<Playername>{
String name;
	
	public Playername()
	{
		
	}
	
	public Playername(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Playername o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return ("{name:" + name+"}") ;
	}
	

}
