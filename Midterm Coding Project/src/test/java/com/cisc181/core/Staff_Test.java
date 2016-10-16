package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.core.Staff;
import exceptions.PersonException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Staff_Test {
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void test() throws PersonException {
		Staff Logan = new Staff("A", "B", "C", new GregorianCalendar(1996, 12, 25).getTime(), "201 Veterans Drive", "111-111-1111", "c", "c", 1, 20000, null, null);
		Staff Curtis = new Staff(null, null, null, new GregorianCalendar(1896, 12, 25).getTime(), null, "111-111-1111", null, null, 0, 30000, null, null);
		Staff Justin = new Staff(null, null, null, new GregorianCalendar(1996, 12, 25).getTime(), null, "111-111-1111", null, null, 0, 40000, null, null);
		Staff Lee = new Staff(null, null, null, new GregorianCalendar(1996, 12, 25).getTime(), null, "11-111-1111", null, null, 0, 50000, null, null);
		Staff Brent = new Staff(null, null, null, new GregorianCalendar(1996, 12, 25).getTime(), null, "111-111-1111", null, null, 0, 60000, null, null);
		
		ArrayList<Staff> people = new ArrayList<Staff>();
		people.add(Logan);
		people.add(Curtis);
		people.add(Justin);
		people.add(Lee);
		people.add(Brent);
		
		assertEquals((people.get(0).getSalary() + people.get(1).getSalary() + people.get(2).getSalary() + people.get(3).getSalary() + people.get(4).getSalary()) / 5, 40000, 0.01);
		
		Staff staff = new Staff(null, null, null, new GregorianCalendar(1896, 12, 25).getTime(), null, "11-111-1111", null, null, 0, 50000, null, null);
		
		final String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		boolean test = false;
		
		Pattern pattern = Pattern.compile(regex);
		String number = staff.getPhone();
		Matcher matcher = pattern.matcher(number);
		
		if (!matcher.matches()) {
			test = true;
		}
		
		assertEquals(test, true);
		test = false;
		
		Calendar now = Calendar.getInstance();
		now.add(Calendar.YEAR, -100);
		
		if(staff.getDOB().before(now.getTime())) {
			test = true;
		}
		
		assertEquals(test, true);
	}


}
