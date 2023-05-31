package factory;

public class TurningMachine extends Equipments {
	
	private String potency;
	
	public TurningMachine(int idEquipments) { 
	super(idEquipments);
	}

	public String getPotency() {
		return potency;
	}

	public void setPotency(String potency) {
		this.potency = potency;
	}
	
	public String getFullDescription(){
		return super.getFullDescription() + " - " + getPotency();
	}
}