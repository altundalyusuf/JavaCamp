package oopIntroHw;

public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses("Java Yazýlým Geliþtirme Kampý", "2 ay sürecek Java yazýlým geliþtirme kampý",
				"Engin Demiroð");
		Courses course2 = new Courses("C# Yazýlým Geliþtirici Kampý", "2 ay sürecek C# yazýlým geliþtirme kampý",
				"Engin Demiroð");
		Courses[] courses = { course1, course2 };
		for (Courses cour : courses) {
			System.out.println(cour.name);
		}

		CourseManager manager = new CourseManager();
		manager.category(course2);
		manager.instructor(course1);

	}

}
