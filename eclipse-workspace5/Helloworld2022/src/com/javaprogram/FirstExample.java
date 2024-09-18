package com.javaprogram;

public class FirstExample {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hallo Silviani Nurlita Putri");
		
		String test1 = "Hallo guys";
		System.out.println(test1);
		
		String test2 = "Hello guys2";
		System.out.println(test2);
		
		int a = 6;
		int b = 2;
		int c = 5;
		System.out.println(a + b + c );
		
		
		String test1Baru = test1;
		String test2Baru = test1 + test2 + test1Baru;
		System.out.println(test2Baru);
		
		//cek akhir file
		String url = "https://www.google.com/files/doc.pdf";
		
		//expected get TRUE
		System.out.println(url.endsWith("pdf"));
		
		//expected get FALSE
		System.out.println(url.endsWith("doc"));
		
		String word = "Jack the Ripper is";
		String word2 = "jack the ripper is here";
		//this is false because upper cases and lower cases id different
		System.out.println(word.equals(word2));
		//this will return true because its ignore upper case and lover case
		System.out.println(word.equalsIgnoreCase(word2));
		
		//this will delete only number
		String regex = "Silviani Nurlita Putri";
		System.out.println(regex.replaceAll("[0-9]", ""));
		//this well delete only lover case
		System.out.println(regex.replaceAll("[a-z]", ""));
		
		System.out.println(regex.replaceAll("[A-Z]", ""));
		
		
		
}
}
