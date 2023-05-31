package factory;

public class Equipments implements IEquipments{
	
	private int idEquipments;
	private String description;
	
	public Equipments(int idEquipments) {
		this.idEquipments = idEquipments;
	}

	@Override
	public String getFullDescription() {
		return idEquipments + " - " + description;
	}

	public int getIdEquipments() {
		return idEquipments;
	}

	public void setIdEquipments(int idEquipments) {
		this.idEquipments = idEquipments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}