package cihan.kurs.odev4.interface1;

public class MyCalculator implements  AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		int toplam=0;
		for(int i=1; i<=n ; i++) {
			if(n%i==0) toplam=toplam+i;
		}
		return toplam;
	}

}
