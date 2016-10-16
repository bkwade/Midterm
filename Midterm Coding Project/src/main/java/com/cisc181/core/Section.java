package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Section extends Course {
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}
	
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	
	public int getRoomID() {
		return RoomID;
	}
	
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	
	public Section(UUID courseID, String courseName, int gradePoints, eMajor major, UUID semesterID, UUID sectionID, int roomID) {
		super(courseID, courseName, gradePoints, major);
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
 	}

}
