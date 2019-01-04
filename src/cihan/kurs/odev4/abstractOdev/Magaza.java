package cihan.kurs.odev4.abstractOdev;

public class Magaza {

	public static void main(String[] args) {
		//Calisan calisanlar[] = new Calisan[7];
		//calisanlar[0] = new Hizmetli("Ahmet", "Ateş");
		
		Calisan[] calisanlar = {new Mudur("Atilla","Arslan","N"), //0
								new Tezgahtar("Cihan", "Arslan","N"),   //1
								new IdariPersonel("Bilge", "Arslan","N"), //2
								new Kasiyer("Edanur","Arslan","N"), //3
								new Hizmetli("Ahmet", "Ateş","N"), //4
								
								new Tezgahtar("Canan", "Sipahi","B"), //5
								new IdariPersonel("Ayça", "Sipahi","B"), //6
								new Kasiyer("Ezgi" ,"Sipahi","B"), //7
								new Hizmetli("Ali", "Kaya","B"), //8
								};
		 calisanlar[0].kesintiHesapla();	  //kesinti 200 Calisandan geldi			
		// ((Mudur)calisanlar[0]).kesintiHesapla();  //kesinti 1000 Mudurden geldi
	     System.out.println("kesintiler:" +Calisan.kesintiler);
		 ((Mudur)calisanlar[0]).setToplamSatis(37000);
		 ((Tezgahtar)calisanlar[1]).setSatis(15000);
		 ((Hizmetli)calisanlar[4]).setMesaiSaati(40);
		
		 ((Tezgahtar)calisanlar[5]).setSatis(15000);
		 ((Hizmetli)calisanlar[8]).setMesaiSaati(40);
		 
		 System.out.println("PerSonel Maaş Listesi :");
		
		 for (int i = 0; i < calisanlar.length; ++i) {
			System.out.println(calisanlar[i].getBilgi());
		}
	}

}
