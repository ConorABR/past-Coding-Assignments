/*
 * Assignment 08: Student.java
 *
 * Student name: Conor O'Neill
 * Student number: 2924031
 *
 */
import java.util.*;
class Student implements Comparable<Student>{
	private String studentId;
	private String surname;
	private String firstName;

	Student(String id, String ln, String fn){
		studentId = id; surname = ln; firstName = fn;
	}

	public String studentId(){
		return studentId;
	}
	public String surname(){
		return surname;
	}

	public String firstName(){
		return firstName;
	}

	public boolean equals(Object ob){
		if(!(ob instanceof Student))
			return false;
		Student s = (Student)ob;
		return studentId.equals(s.studentId);
	}

	public int hashCode(){
		return studentId.hashCode();
	}

	public String toString(){
		return studentId+": "+surname+", "+firstName;
	}

	public int compareTo(Student m){
		if (this.studentId().compareToIgnoreCase(m.studentId()) < 0) {
			return 1;
		} else if (this.studentId().compareToIgnoreCase(m.studentId()) > 0) {
			return -1;
		} else {
			return 0;
		}
	}

	public static Comparator<Student> surnameCompare(Student n){
		Student[] studentList = new Student[10];
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].surname().compareToIgnoreCase(n.surname()) < 0){
				n = studentList[i];
			}
		}
		return null;
	}
}
