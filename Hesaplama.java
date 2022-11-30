package tr.edu.medipol.yova;

public class Hesaplama {

	public static void main(String[] args) {
		Hesaplama h = new Hesaplama();
		
		long toplamaSonucu= h.toplama(42,28);
		System.out.println(toplamaSonucu);
		
		int cikarmaSonucu = h.cikarma(42, 14);
		System.out.println(cikarmaSonucu);
		
		int carpmaSonucu = h.carpma(12, 26);
		System.out.println(carpmaSonucu);
		
		int bolmeSonucu = h.bolme(10, 2);
		System.out.println(bolmeSonucu);

	}
	
	long toplama(int sayi1,int sayi2) {
		return(long) sayi1+sayi2;
	}
	int cikarma(int sayi1,int sayi2) {
	    int sonuc = sayi1-sayi2;
		return sonuc;	
	}
	int carpma(int sayi1,int sayi2) {
		int sonuc = sayi1*sayi2;
		return sonuc;
	}
	int bolme(int sayi1,int sayi2) {
		int sonuc = sayi1/sayi2;
		return sonuc;
	}
}
