package cihan.kurs.odev8.annotations;

public class FamilyMember {
	@FamilyBudget(userRole="SENIOR",budget=100)
	public void seniorMember(int budget , int moneySpend) {
		System.out.println("Senior Member");
	    System.out.println("Spend: "+moneySpend);
	    System.out.println("Budget Left: "+(budget -moneySpend));
	    
	}
	@FamilyBudget(userRole="JUNIOR",budget=50)
	public void  juniorUser(int budget,int moneySpend) {
		System.out.println("Junior Member");
	    System.out.println("Spend: "+moneySpend);
	    System.out.println("Budget Left: "+(budget -moneySpend));

	}
	

}
