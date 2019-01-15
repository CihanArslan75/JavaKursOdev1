package cihan.kurs.odev6.reflection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class Runner {
	//Reflection java da sınıf, method, attribute gibi bilgilere erişmeyi ve bunlar üzerinde işlem yapmayı 
	//saglayan bir kütüphanedir. Reflection ile dinamik olarak nesnenin özelliklerine erişebilirsiniz.
	//Reflection ile benzer şekilde fieldları, annotationları, super classları, interfaceleri vs.. alabiliriz.
	//Bunlar haricinde java da yine dinamik olarak nesneler oluşturulabiliyor.
	//Eğer Class.forName(“OrnekSinif”).newInstance(); dersek bize OrnekSinif tipinde bir nesne oluşturacaktır.
	//Reflection(Yansıma), Java Sanal Makinesinde(Java Virtual Machine, JVM) çalışan uygulamaların, 
	//çalışma zamanındaki(runtime) davranışlarını inceleme ve bu davranışlara yön verme imkanı sağlayan bir 
	//özelliktir. java.lang.reflect API' sinde tanımlanan
	
	//Bir nesnenin sınıfını belirleriz
	//Sınıfın sahaları, metodları, yapıcıları, üst sınıfları ve değişkenleri hakkında bilgiler alabiliriz
	//Bir arayüze ait olan sabit ve metod tanımlamalarını tespit ederiz
	//Çalışma zamanına kadar ismi bilinmeyen bir sınıf örneği yaratabiliriz (Bir bakıma çalışma zamanında yeni sınıflar yaratabilirsiniz)
	//Çalışma zamanına kadar ismi bilinmese de sahaların değerini ayarlar ve alabiliriz.
	//Aynen çalışma zamanına kadar bilinmeyen metodları çalıştırabiliriz.
	//Çalışma zamanına kadar bileşenleri ve boyutu bilinmeyen diziler yaratabilir, daha sonra bu dizinin bileşenlerini değiştirebiliriz.
	
	public static void main(String[] args) {
		
	Class orneksinif =OrnekSinif.class;
	Method[] methods=orneksinif.getDeclaredMethods();
	for(int i=0;i<methods.length;i++ ) {
		System.out.println(methods[i]);
	}
	System.out.println("**********************************************************");
	Constructor[] cons=orneksinif.getConstructors();
		for(int i=0;i<cons.length;i++ ) {
			System.out.println(cons[i]);
		}

	
	}
}
