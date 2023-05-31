package exercicio;

public class PessoasNoMain {

	// Characteristics - attributes
	private int codStudent;
	private String name;
	
	// constructor method
	public Student(int codStudent, String name) {
		this.codStudent = codStudent;
		this.name = name;
	}
	
	// behaviors - methods
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getInformation() {
		return codStudent + " - " + name;
	}
}
