package student;

public class StudentTester {

	public static void main(String[] args) {
		Student st1 = new Student(1,"Juninho","44434456778");
		System.out.println(st1.toString());
		
		Student st2 = new Student(2,"Luquinha","44255546764");
		System.out.println(st2.toString());
		
		//mostra todos os atributos da classe
		st1.setName("Juninho");
		System.out.println(st1.toString());
	}
	
}