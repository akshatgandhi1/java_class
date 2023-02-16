package task5;

import java.util.Comparator;

public class player1 implements Comparator<player>{

	@Override
	public int compare(player p1, player p2) {
		// TODO Auto-generated method stub
		return p1.getSkill().compareTo(p2.getSkill());
	}



}
