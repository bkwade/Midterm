package com.cisc181.core;

import com.cisc181.eNums.*;

import exceptions.PersonException;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@Test
	public void test() throws PersonException {
		Student Phil = new Student("Phil", "Chuck", "Larry", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.BUSINESS, null, "111-111-1111", null);
		Student Alex = new Student("Alex", "Steve", "Charlie", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.CHEM, null, "111-111-1111", null);
		Student Bill = new Student("Bill", "Harry", "Brent", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.COMPSI, null, "1111111111", null);
		Student George = new Student("George", "Chuck", "Larry", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.BUSINESS, null, "111-111-1111", null);
		Student Chuck = new Student("Chuck", "Teresa", "Larry", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.PHYSICS, null, "111-111-1111", null);
		Student Teresa = new Student("Teresa", "Chuck", "Larry", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.BUSINESS, null, "111-111-1111", null);
		Student Spencer = new Student("Spencer", "Chuck", "Larry", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.CHEM, null, "111-111-1111", null);
		Student Larry = new Student("Larry", "Chuck", "Larry", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.CHEM, null, "111-111-1111", null);
		Student Kyle = new Student("Kyle", "Chuck", "Larry", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.CHEM, null, "111-111-1111", null);
		Student Ferris = new Student("Ferris", "Chuck", "Larry", new GregorianCalendar(1996, 12, 25).getTime(), eMajor.PHYSICS, null, "111-111-1111", null);
		
		ArrayList<Student> people = new ArrayList<Student>();
		people.add(Phil);
		people.add(Alex);
		people.add(Bill);
		people.add(George);
		people.add(Chuck);
		people.add(Teresa);
		people.add(Spencer);
		people.add(Larry);
		people.add(Kyle);
		people.add(Ferris);
		
		Semester Fall = new Semester(UUID.randomUUID(), new GregorianCalendar(2016, 8, 30).getTime(), new GregorianCalendar(2016, 12, 17).getTime());
		Semester Spring = new Semester(UUID.randomUUID(), new GregorianCalendar(2017, 2, 6).getTime(), new GregorianCalendar(2017, 5, 30).getTime());
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(Fall);
		semesters.add(Spring);
		
		Course Physics = new Course(UUID.randomUUID(), "PHYS208", 0, eMajor.PHYSICS);
		Course CompSi = new Course(UUID.randomUUID(), "CISC181", 0, eMajor.COMPSI);
		Course Chem = new Course(UUID.randomUUID(), "CHEM104", 0, eMajor.CHEM);
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(Physics);
		courses.add(CompSi);
		courses.add(Chem);
		
		Section Physics1 = new Section(Physics.getCourseID(), Physics.getCourseName(), 0, eMajor.PHYSICS, Fall.getSemesterID(), UUID.randomUUID(), 210);
		Section Physics2 = new Section(Physics.getCourseID(), Physics.getCourseName(), 0, eMajor.PHYSICS, Fall.getSemesterID(), UUID.randomUUID(), 211);
		Section CompSi1 = new Section(CompSi.getCourseID(), CompSi.getCourseName(), 0, eMajor.COMPSI, Fall.getSemesterID(), UUID.randomUUID(), 110);
		Section CompSi2 = new Section(CompSi.getCourseID(), CompSi.getCourseName(), 0, eMajor.COMPSI, Fall.getSemesterID(), UUID.randomUUID(), 111);
		Section Chem1 = new Section(Chem.getCourseID(), Chem.getCourseName(), 0, eMajor.CHEM, Fall.getSemesterID(), UUID.randomUUID(), 315);
		Section Chem2 = new Section(Chem.getCourseID(), Chem.getCourseName(), 0, eMajor.CHEM, Fall.getSemesterID(), UUID.randomUUID(), 317);
		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(Physics1);
		sections.add(Physics2);
		sections.add(CompSi1);
		sections.add(CompSi2);
		sections.add(Chem1);
		sections.add(Chem2);
		
		ArrayList<Student> phys1 = new ArrayList<Student>();
		phys1.add(Phil);
		phys1.add(Bill);
		ArrayList<Student> phys2 = new ArrayList<Student>();
		phys1.add(George);
		phys1.add(Chuck);
		ArrayList<Student> cs1 = new ArrayList<Student>();
		phys1.add(Teresa);
		phys1.add(Spencer);
		ArrayList<Student> cs2 = new ArrayList<Student>();
		phys1.add(Larry);
		phys1.add(Kyle);
		ArrayList<Student> chem1 = new ArrayList<Student>();
		phys1.add(Ferris);
		ArrayList<Student> chem2 = new ArrayList<Student>();
		phys1.add(Alex);
		
		people.get(0).setMajor(eMajor.NURSING);
		assertEquals(people.get(0).getMajor(), eMajor.NURSING);
	}
}