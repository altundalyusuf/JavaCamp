package oopIntroHw;

public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses("Java Yaz�l�m Geli�tirme Kamp�", "2 ay s�recek Java yaz�l�m geli�tirme kamp�",
				"Engin Demiro�");
		Courses course2 = new Courses("C# Yaz�l�m Geli�tirici Kamp�", "2 ay s�recek C# yaz�l�m geli�tirme kamp�",
				"Engin Demiro�");
		Courses[] courses = { course1, course2 };
		for (Courses cour : courses) {
			System.out.println(cour.name);
		}

		CourseManager manager = new CourseManager();
		manager.category(course2);
		manager.instructor(course1);

	}

}
