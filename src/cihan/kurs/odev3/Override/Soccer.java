package cihan.kurs.odev3.Override;

public class Soccer extends Sports{
	
	@Override
	String getName() {
		return "Soccer Class";
	}
	
	  @Override
	    void getNumberOfTeamMembers(){
	        System.out.println( "Each team has 11 players in " + getName() );
	    }
	
}
