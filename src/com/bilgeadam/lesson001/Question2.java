package com.bilgeadam.lesson001;
/*
 * iki tane string değişkenimiz olsun isim ve 
 * soy ismi bu değişkenlerde tutalım daha sonra bir yaş
 * değişkenimiz olsun yaşımızı da bu değişkende tutalım 
 * sizden bunun sonucunda soyle bir çıktı istiyorum
 * 
 * 
 * 
 */

	public class Question2 {
	
	
	public static void main(String[] args) {
	
		String isim= "Mustafa";
		String SoyIsim= "Öztürk";
		int yas= 35;
		String sonuc=(isim+SoyIsim)+yas;
		System.out.println((isim+SoyIsim)+yas);
		System.out.println(sonuc);
		// \n ifadesi 1 alt satıra kaydırma için kullanılır
		
		
	}

}
