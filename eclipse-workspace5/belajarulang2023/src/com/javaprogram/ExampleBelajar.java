package com.javaprogram;import java.text.Format;

public class ExampleBelajar {

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("Silviani Nurlita Putri");
		
		
		String kata = "silviani nurlita putri  ";
		System.out.println(kata);
		
//		int a = 6;
//		int b = 3;
//		System.out.println(a+b);
		
		String kata2 = "hallo";
		String kataGabungan = kata + kata2;
		System.out.println(kataGabungan);
		
		String url = "https//google.com/doc.pdf";
//		expected true
		System.out.println(url.endsWith("pdf"));
//		expected false 
		System.out.println(url.endsWith("exe"));
		
		String word = "Silvia";
		String word2 = "Silvia";
		
		System.out.println(word.equals(word2));
		
		
		String test1 = "kesana";
		String test2 = "kita coba %s besok";
		
		System.out.println(String.format(test2, test1));
//		System.out.println(String.format(test2, test1));
		
		int satu = 10;
		int dua = 1000;
		int tiga = 3000;
		
		System.out.println(satu+dua*tiga);
		
		
		String username = "user name";
		String lahir = "lahir";
		System.out.println(String.format(username, lahir));
		
		
		String path = "//input[@placeholder='Masukkan email']";
		System.out.println(String.format(test2, path));
		
		
	}

}
