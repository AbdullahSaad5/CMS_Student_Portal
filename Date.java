package CMS_Student_Portal;

import java.io.Serializable;

public class Date implements Serializable {
	private int day;
	private int month;
	private int year;

	public Date() {
	}

	public Date(Date obj) {
		this.day = obj.day;
		this.month = obj.month;
		this.year = obj.year;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static boolean verifyDate(Date obj) {
		int day = obj.getDay();
		int month = obj.getMonth();
		int year = obj.getYear();
		int[] months30 = { 4, 6, 9, 11 };
		if (day > 31 || day < 1) {
			return false;
		}
		if (month > 12 || month < 1) {
			return false;
		}
		if (year > 2020 || year < 1900) {
			return false;
		}
		if (day == 31) {
			for (int i = 0; i < months30.length; i++) {

				if (month == months30[i]) {
					return false;
				}
			}
		}
		if (day > 29 && month == 2) {
			return false;
		}
		if (day == 29 && !checkLeapYear(year)) {
			return false;
		}
		return true;
	}

	private static boolean checkLeapYear(int number) {
		if (number % 400 == 0)
			return true;

		if (number % 100 == 0)
			return false;

		if (number % 4 == 0)
			return true;

		return false;
	}
	
	public static boolean laterIsGreater(Date obj1, Date obj2) {
		if(obj1.getDay() <= obj2.getDay() && obj1.getMonth() <= obj2.getMonth() && obj1.getYear() <= obj2.getYear()) {
			return true;
		}
		else if(obj1.getMonth() <= obj2.getMonth() && obj1.getYear() <= obj2.getYear()) {
			return true;
		}
		else if(obj1.getYear() <= obj2.getYear()){
			return true;
		}
		else {
			return false;
		}
	}

}
