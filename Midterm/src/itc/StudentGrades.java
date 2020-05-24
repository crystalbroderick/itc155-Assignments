package itc;

import java.util.Scanner;
import java.util.HashMap;

public class StudentGrades {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String studentName;
		double studentGrade;

		HashMap<String, Double> studentGrades = new HashMap<String, Double>();
		// Students's grades (pre-entered)
		studentGrades.put("Harry Rawlins", 84.3);
		studentGrades.put("Stephanie Kong", 91.0);
		studentGrades.put("Shailen Tennyson", 78.6);
		studentGrades.put("Quincy Wraight", 65.4);
		studentGrades.put("Janine Antinori", 98.2);

		// System.out.println(studentGrades);

		System.out.println("Name:");
		studentName = scnr.nextLine();

		// Read in new grade for a student
		System.out.println("New grade:");
		studentGrade = scnr.nextDouble();

		for (String str : studentGrades.keySet()) {

			if (str.contains(studentName)) {

				// output initial grade
				System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));

				// replace with new grade in HashMap,
				studentGrades.put(studentName, studentGrade);

				// output new grade
				System.out.println(studentName + "'s new grade: " + studentGrade);

				// output new HashMap
				System.out.println(studentGrades);

			}

		}

	}
}