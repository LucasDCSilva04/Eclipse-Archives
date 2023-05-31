package factory;

public class Computer extends Equipments {

	private String model;
	
	public Computer(int idEquipments) {
		super(idEquipments);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getFullDescription(){
		return super.getFullDescription() + " - " + getModel();
	}
}
