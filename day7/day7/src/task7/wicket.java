package task7;

public class wicket {
	String playername;
	blower blowername=new blower();
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public blower getBlowername() {
		return blowername;
	}
	public void setBlowername(blower blowername) {
		this.blowername = blowername;
	}
	public wicket(String playername, blower blowername) {
		super();
		this.playername = playername;
		this.blowername = blowername;
	}
	public wicket() {
		super();
		// TODO Auto-generated constructor stub
	}
}
