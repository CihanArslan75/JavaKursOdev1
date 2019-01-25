package cihan.kurs.odev7.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player>  {

  @Override	
  public int compare(Player a, Player b) {
	
	  if(b.score==a.score)
		  return a.name.compareTo(b.name);
	  else
		  return b.score-a.score;
  }
}
