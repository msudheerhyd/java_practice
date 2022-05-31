package com.practice.youtubeSession13;

public class CompareStudentMarks {
	
	public static void main(String[] args) {
		Student helen = new Student("Helen");
		helen.addMarks("English", 63);
		helen.addMarks("Maths", 98);
		helen.addMarks("History", 79);
		Student leslie = new Student("Leslie");
		leslie.addMarks("English", 89);
		leslie.addMarks("Maths", 82);
		leslie.addMarks("History", 91);
		if (helen.compareTo(leslie) > 0) {
			System.out.println(helen.getName() + 
					" gets a higher total mark");
		}
		else if (helen.compareTo(leslie) < 0) {
			System.out.println(leslie.getName() + 
					" gets a higher total mark");
		}
		else {
			System.out.println("Both students get the same total mark");
		}
	}
}
