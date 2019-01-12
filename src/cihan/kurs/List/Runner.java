package cihan.kurs.List;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
			List<Integer> liste1 = new ArrayList();
			List<Integer> liste2 = new ArrayList();
			int a;
			
			liste1.add(1);
			liste1.add(2);
			liste1.add(3);
			liste1.add(4);
			
		
			
			liste2.add(5);
			liste2.add(6);
			liste2.add(7);
			liste2.add(8);
			System.out.print("İlk Liste1 : "+liste1);
			System.out.println();
			System.out.print("İlk Liste2 : "+liste2);
	
			System.out.println();
			for(int i=0; i<liste1.size();i++){
				a=liste1.get(i);
				liste1.set(i, liste2.get(liste2.size()-i-1));
				liste2.set(liste2.size() -i -1,a);
			}

			System.out.print("Son Liste1 : "+liste1);
			System.out.println();
			System.out.print("Son Liste2 : "+liste2);
			
	}

}
