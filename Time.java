package CMS_Student_Portal;

import java.io.Serializable;

public class Time implements Serializable {
	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
	}

	public Time(Time obj) {
		this.hours = obj.hours;
		this.minutes = obj.minutes;
		this.seconds = obj.seconds;
	}

	public Time(int day, int month, int year) {
		this.hours = day;
		this.minutes = month;
		this.seconds = year;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int day) {
		this.hours = day;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int month) {
		this.minutes = month;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int year) {
		this.seconds = year;
	}

	public static boolean verifyTime(Time obj) {
		int hours = obj.getHours();
		int minutes = obj.getMinutes();
		int seconds = obj.getSeconds();
		if (hours > 23 || hours < 0) {
			return false;
		}
		if (minutes > 60 || minutes < 0) {
			return false;
		}
		if (seconds > 60 || seconds < 0) {
			return false;
		}
		return true;
	}

	public static boolean laterIsGreater(Time obj1, Time obj2) {
		if (obj1.getHours() <= obj2.getHours() && obj1.getMinutes() <= obj2.getMinutes()
				&& obj1.getSeconds() <= obj2.getSeconds()) {
			return true;
		} else if (obj1.getMinutes() < obj2.getMinutes() && obj1.getHours() <= obj2.getHours()) {
			return true;
		} else if (obj1.getHours() < obj2.getHours()) {
			return true;
		}
		return false;
	}

}
