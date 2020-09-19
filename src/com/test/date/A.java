package com.test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class A {

	public static void main(String[] args) {

		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		final SimpleDateFormat sdf1 = new SimpleDateFormat("dd");

		for (int i = 0; i <= 3; i++) {
			Date d = new Date();

			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) - i);

			String date = sdf.format(cal.getTime());
			String[] dateInString = date.split("-");
			String year = dateInString[0];
			String month = dateInString[1];

			System.out.println(year + "  " + month);

			// transaction amount;
			// no. of active days;
			// transaction count;

			// no. of total days

			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			d = cal.getTime();
			String a = sdf1.format(d);
			System.out.println(a);

		}

	}
}