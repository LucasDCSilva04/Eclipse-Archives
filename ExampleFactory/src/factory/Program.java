package factory;

public class Program {

	public static void main(String[] args) {
		
		TurningMachine cnc = new TurningMachine(1);
		cnc.setDescription("Enco");
		cnc.setPotency("1000w");
		System.out.println(cnc.getFullDescription());	
		
		Computer comp = new Computer(1);
		comp.setDescription("Dell");
		comp.setModel("Optiplex");
		System.out.println(comp.getFullDescription());
	}

}
