package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		//Given(A�a��daki ko�ullar alt�nda)
		Hesaplama h = new Hesaplama();
		int sayi1 = 42;
		int sayi2 = 28;
		
		//When(A�a��daki fonksiyon �a��r�ld���nda)
		long ger�ekle�en = h.toplama(sayi1,sayi2);
		
		//Then(A�a��daki sonu�lar�n olu�mas�n� beklerim)
		assertEquals(70, ger�ekle�en);
	}
	
	@Test
	public void testToplamaCokBuyukSayilar1() {
		//Given(A�a��daki ko�ullar alt�nda)
		int sayi1 = 1;
		int sayi2 = Integer.MAX_VALUE;
		Hesaplama h = new Hesaplama();
		
		//When(A�a��daki fonksiyon �a��r�ld���nda)
		long ger�ekle�en = h.toplama(sayi1,sayi2);
		
		//Then(A�a��daki sonu�lar�n olu�mas�n� beklerim)
		assertEquals(2147483648L, ger�ekle�en);
	}
    @Test
    public void testCikarma() {
    	int sayi1 = 42;
    	int sayi2 = 14;
    	Hesaplama h = new Hesaplama();
    	
    	int gerceklesen = h.cikarma(sayi1,sayi2);
    	
    	assertEquals(28,gerceklesen);
    }
    @Test
    public void testCarpma() {
    	int sayi1 = 12;
    	int sayi2 = 26;
    	Hesaplama h = new Hesaplama();
    	
    	int gerceklesen = h.carpma(sayi1,sayi2);
    	
    	assertEquals(312,gerceklesen);
    }
    @Test
    public void testBolme() {
    	int sayi1 = 10;
    	int sayi2 = 2;
    	Hesaplama h = new Hesaplama();
    	
    	int gerceklesen = h.bolme(sayi1,sayi2);
    	
    	assertEquals(5,gerceklesen);
    }

}
