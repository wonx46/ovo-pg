package com.skul.backend.tes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TesDate {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		System.out.println(formater.format(cal.getTime()));

	}

}
