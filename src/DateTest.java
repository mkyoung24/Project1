import java.util.*;
class Date {
	int year;
	String month;
	int day;
	
	public void setDate(int y, String m, int d) {
		month = m;
		day = d;
		year = y;
	}
	public void printDate() {
		System.out.println(year + "³â" + month + " " + day + "ÀÏ");
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		year = y;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String m) {
		month = m;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int d) {
		day = d;
	}
	
}
public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		date.setDate(2009, "3¿ù", 2);
		date.printDate();
		date.setYear(2010);
		date.printDate();

	}

}
