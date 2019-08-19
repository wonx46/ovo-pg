package com.skul.backend.util;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class GeneratorId {

	public static String generateId() {
		Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault()) ;
		String result = String.valueOf(cal.getTimeInMillis());
		return result.substring(0,10);
	}
}
