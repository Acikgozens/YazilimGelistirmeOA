package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		//Given(Aþaðýdaki koþullar altýnda)
		Hesaplama h = new Hesaplama();
		int sayi1 = 42;
		int sayi2 = 28;
		
		//When(Aþaðýdaki fonksiyon çaðýrýldýðýnda)
		long gerçekleþen = h.toplama(sayi1,sayi2);
		
		//Then(Aþaðýdaki sonuçlarýn oluþmasýný beklerim)
		assertEquals(70, gerçekleþen);
	}
	
	@Test
	public void testToplamaCokBuyukSayilar1() {
		//Given(Aþaðýdaki koþullar altýnda)
		int sayi1 = 1;
		int sayi2 = Integer.MAX_VALUE;
		Hesaplama h = new Hesaplama();
		
		//When(Aþaðýdaki fonksiyon çaðýrýldýðýnda)
		long gerçekleþen = h.toplama(sayi1,sayi2);
		
		//Then(Aþaðýdaki sonuçlarýn oluþmasýný beklerim)
		assertEquals(2147483648L, gerçekleþen);
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
