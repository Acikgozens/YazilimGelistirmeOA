package tr.edu.medipol.yova;

import org.apache.commons.lang3.StringUtils;

public class BosluklarýTemizle {

	public static void main(String[] args) {
	String sonuc= StringUtils.deleteWhitespace("abb bb cc");
	System.out.println(sonuc);
	}

}
