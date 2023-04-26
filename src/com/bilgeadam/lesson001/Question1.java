package com.bilgeadam.lesson001;

public class Question1 {
	
	//primitive (ilkel)veri tipleri
	/*
	 * değişken isimlerini adlandırmada camel case kullanılır
	 * 
	 * ilk harf kucuk daha sonra gelen yeni
	 * kelime varsa onun ilk harfi buyuk olarak devam eder.
	 * 
	 * 
	 */
	
	
	
	int sayi=5;
	byte myByte=25;
	short myShort=5222;
	long myLong=1_000_000_000;
	double myDouble=125000000000000.52;
	char myChar='A'; //ctrl alt ve asagı yon tusu bu satırı alta kopyalar
	char myChar2=65;
	boolean myBloolean=true; //true yada false
	float myFloat= 128.65f;
	
	public static void main(String[] args) {
		
		//primitive (ilkel)veri tipleri
		/*
		 * değişken isimlerini adlandırmada camel case kullanılır
		 * 
		 * ilk harf kucuk daha sonra gelen yeni
		 * kelime varsa onun ilk harfi buyuk olarak devam eder.
		 * 
		 * 
		 */
		
		
		
		int sayi=69;
		byte myByte=25;
		short myShort=5222;
		long myLong=1_000_000_000;
		double myDouble=125.52;
		char myChar='A'; //ctrl alt ve asagı yon tusu bu satırı alta kopyalar
		char myChar2=65;
		boolean myBoolean=true; //true yada false
		float myFloat= 128.65f;
		//kısayol calıstırma ctrl f11
		System.out.println("int deger==>"+sayi);
		System.out.println("byte deger==>"+myByte);
		System.out.println("long deger==>"+myLong);
		System.out.println("double deger==>"+myDouble);
		System.out.println("char deger==>"+myChar);
		System.out.println("char deger==>"+myChar2);
		System.out.println("boolean deger==>"+myBoolean);
		System.out.println("float deger==>"+myFloat);
		System.out.println("int degerin char karsılıgı==>"+(char)sayi);
		System.out.println("iki char degerin toplanması==>"+(myChar+myChar2));
		
		//wrapper Class (sarmalayıcı Sınıflar)
		
		Integer myInteger=529;
		Integer myInteger2= null;
		int myInt= 0;
		myInteger2=myInt;
		System.out.println("INTEGER==>"+myInteger);
		System.out.println("INTEGER2==>"+myInteger2);
		System.out.println("int==>"+myInt);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toString(myInt));
		//int degerini string degerine cevirir
		
		
		System.out.println("Double Max==>"+Double.MAX_VALUE+"min=="+Double.MIN_VALUE);
		
		long number1=32767;
		long number2=100;
		byte number3= (byte) number2;
		byte number4= (byte) number1;
		
		System.out.println(number3);
		
		double number9=25.8;
				
		long result2= (long) (number9+number2);
		
		double result3= number9+number2;
		
		System.out.println(result2);
		System.out.println("---------");
		
	
		String isim="Mustafa";
		System.out.println(isim+number2);
		String a=isim+number2;
		System.out.println(a);
		String deger1=Integer.toString(number3);
		String deger2=Integer.toString(number3);
		
		
	}
	

}
