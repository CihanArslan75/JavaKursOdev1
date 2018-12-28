package cihan.kurs.odev3.Soyagaci;

public class Runner {

	public static void main(String[] args) {
		
		Insan insan = new Insan();
		
		insan.setAdi("CİHAN ARSLAN");
		insan.setDogumYeri("ELBİSTAN");
		insan.setDogumTarihi("26/06/1974");
		String kendiAdi =insan.getAdi();
		String kendiDogumYeri=insan.getDogumYeri();
		String kendidogumTarihi=insan.getDogumTarihi();
		
		insan.anne =new Insan();
		insan.anne.setAdi("MEDİNE ARSLAN");
		insan.anne.setDogumYeri("AFŞİN");
		insan.anne.setDogumTarihi("10/02/1952");
		
		String anneAdi=insan.anne.getAdi();
		String anneDogumYeri=insan.anne.getDogumYeri();
		String anneDogumTarihi=insan.anne.getDogumTarihi();
		
		insan.baba=new Insan();
		insan.baba.setAdi("TEYFİK ARSLAN");
		insan.baba.setDogumYeri("AFŞİN");
		insan.baba.setDogumTarihi("28/02/1950");
		
		String babaAdi=insan.baba.getAdi();
		String babaDogumYeri=insan.baba.getDogumYeri();
		String babaDogumTarihi=insan.baba.getDogumTarihi();
		
		insan.anne.anne=new Insan();
		insan.anne.anne.setAdi("DÖNDÜ ŞAHİN");
		insan.anne.anne.setDogumYeri("AFŞİN");
		insan.anne.anne.setDogumTarihi("01/07/1932");
		
		String anneAnneAdi=insan.anne.anne.getAdi();
		String anneAnneDogumYeri=insan.anne.anne.getDogumYeri();
		String anneAnneDogumTarihi=insan.anne.anne.getDogumTarihi();
		
		insan.anne.baba=new Insan();
		insan.anne.baba.setAdi("AHMET ŞAHİN");
		insan.anne.baba.setDogumYeri("ELBİSTAN");
		insan.anne.baba.setDogumTarihi("15/07/1936");
		
		String anneBabaAdi=insan.anne.baba.getAdi();
		String anneBabaDogumYeri=insan.anne.baba.getDogumYeri();
		String anneBabaDogumTarihi=insan.anne.baba.getDogumTarihi();
		
		
		insan.baba.anne=new Insan();
		insan.baba.anne.setAdi("PAKİZE ARSLAN");
		insan.baba.anne.setDogumYeri("ELBİSTAN");
		insan.baba.anne.setDogumTarihi("12/08/1930");
		
		String babaAnneAdi=insan.baba.anne.getAdi();
		String babaAnneDogumYeri=insan.baba.anne.getDogumYeri();
		String babaAnneDogumTarihi=insan.baba.anne.getDogumTarihi();
		
		insan.baba.baba=new Insan();
		insan.baba.baba.setAdi("DURMUŞ ALİ ARSLAN");
		insan.baba.baba.setDogumYeri("AFŞİN");
		insan.baba.baba.setDogumTarihi("01/07/1930");
		
		String babaBabaAdi=insan.baba.baba.getAdi();
		String babaBabaDogumYeri=insan.baba.baba.getDogumYeri();
		String babaBabaDogumTarihi=insan.baba.baba.getDogumTarihi();
		
	
		insan.anne.anne.anne = new Insan();
		insan.anne.anne.anne.setAdi("FATMA ARSLAN");
		insan.anne.anne.baba = new Insan();
		insan.anne.anne.baba.setAdi("ALİ ARSLAN");
		String anneAnneAnneAnneAdi=insan.anne.anne.anne.getAdi();
		String anneAnneAnneBabaAdi=insan.anne.anne.baba.getAdi();
		
		insan.anne.baba.anne = new Insan();
		insan.anne.baba.anne.setAdi("ŞEHRİBAN ŞAHİN");
		insan.anne.baba.baba = new Insan();
		insan.anne.baba.baba.setAdi("ALİ ŞAHİN");
		String anneAnneBabaAnneAdi=insan.anne.baba.anne.getAdi();
		String anneAnneBabaBabaAdi=insan.anne.baba.baba.getAdi();
		
		insan.baba.anne.anne = new Insan();
		insan.baba.anne.anne.setAdi("ŞEHRİBAN ŞAHİN");
		insan.baba.anne.baba = new Insan();
		insan.baba.anne.baba.setAdi("ALİ ŞAHİN");
		String babaAnneAnneAnneAdi=insan.baba.anne.anne.getAdi();
		String babaAnneAnneBabaAdi=insan.baba.anne.baba.getAdi();
		
		insan.baba.baba.anne = new Insan();
		insan.baba.baba.anne.setAdi("FATMA ARSLAN");
		insan.baba.baba.baba = new Insan();
		insan.baba.baba.baba.setAdi("ALİ ARSLAN");
		String babaAnneBabaAnneAdi=insan.baba.baba.anne.getAdi();
		String babaAnneBabaBabaAdi=insan.baba.baba.baba.getAdi();
		
	
		
		System.out.println("                                           "+kendiAdi + " " +kendiDogumYeri +" " + kendidogumTarihi);
		System.out.print("                "+anneAdi + " " +anneDogumYeri +" " + anneDogumTarihi +'\t');
		System.out.println("                                              "+babaAdi + " " +babaDogumYeri +" " + babaDogumTarihi);
		System.out.print(anneAnneAdi + " " +anneAnneDogumYeri +" " + anneAnneDogumTarihi +'\t');
		System.out.print(anneBabaAdi + " " +anneBabaDogumYeri +" " + anneBabaDogumTarihi +'\t');
		System.out.print('\t'+babaAnneAdi + " " +babaAnneDogumYeri +" " + babaAnneDogumTarihi +'\t');
		System.out.println('\t'+babaBabaAdi + " " +babaBabaDogumYeri +" " + babaBabaDogumTarihi +'\t');
		System.out.print(anneAnneAnneAnneAdi + "      " +anneAnneAnneBabaAdi +'\t');
		System.out.print(anneAnneBabaAnneAdi + "        " +anneAnneBabaBabaAdi +'\t');
		System.out.print('\t'+babaAnneAnneAnneAdi + "      " +"    "+babaAnneAnneBabaAdi +'\t');
		System.out.print('\t'+babaAnneBabaAnneAdi + "        " +"    "+babaAnneBabaBabaAdi +'\t');
		
				
		
	}
}
