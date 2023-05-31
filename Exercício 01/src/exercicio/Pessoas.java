package exercicio;

public class Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercicio.add(new Student(10001, "Andre Bastida"));
		studentsList.add(new Student(10002, "Victor Maia"));
		studentsList.add(new Student(10003, "Samuel Hernandes"));
		studentsList.add(new Student(10004, "Aguinaldo Timóteo"));
		studentsList.add(new Student(10005, "Gabriel Theodor"));
		
		//printStudent(studentsList.get(0));
		printAllStudents(studentsList);
	}
	
	public static void printStudent(Student student) {
		System.out.println(student.getInformation());
	}
	
	public static void printAllStudents(ArrayList<Student> students) {
		for (Student student : students) {
			System.out.println(student.getInformation());
		}
	}
	

}
