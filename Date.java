package CMS_Student_Portal;

import java.io.Serializable;

public class Date implements Serializable {
	private int day;
	private int month;
	private int year;

	public Date() {
	}

	public Date(Date obj) {
		if (verifyDate(obj.day, obj.month, obj.year)) {
			this.day = obj.day;
			this.month = obj.month;
			this.year = obj.year;
		} else {
			System.out.println("Invalid Date Format");
		}
	}

	public Date(int day, int month, int year) {
		if (verifyDate(day, month, year)) {
			this.day = day;
			this.month = month;
			this.year = year;
		} else {
			System.out.println("Invalid Date Format");
		}
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

	private boolean verifyDate(int day, int month, int year) {
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

	private boolean checkLeapYear(int number) {
		if (number % 400 == 0)
			return true;

		if (number % 100 == 0)
			return false;

		if (number % 4 == 0)
			return true;

		return false;
	}

}
