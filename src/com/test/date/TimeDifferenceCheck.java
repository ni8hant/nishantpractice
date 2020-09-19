package com.test.date;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeDifferenceCheck {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(TimeUnit.MINUTES.toMillis(3));
		long milis = (date.getTime() - TimeUnit.MINUTES.toMillis(3));
		System.out.println(milis);
		Date dateTime = new Date(milis);
		System.out.println(dateTime);
	}
}
