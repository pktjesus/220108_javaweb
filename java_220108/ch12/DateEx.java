package ch12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);	// ex) Sun Feb 13 13:43:25 KST 2022
		
		//SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(now));	// ex) 2022-02-13 13:43:25 ¿œ ø¿»ƒ
		
//		Calendar cal = Calendar.getInstance();
//		Date d = new Date(cal.getTimeInMillis());
	}

}
