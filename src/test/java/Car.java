public class Car {
	// car atributes

	/*primitives*/
	private int qtyWheels;
	private int qtyLights;
	private int doors;
	private boolean turnOn;

	/*non primitives*/
	private String prefixDomain;
	private String brand;
	private String fullDomain;
	private final String  CHASIS_NUM = "ASDF123456QWER";

	//constructor

	public Car(
		int qtyWheels,
		int qtyLights,
		int doors,
		String prefixDomain,
		boolean turnOn,
		String brand,
		String fullDomain) {
		this.qtyWheels = qtyWheels;
		this.qtyLights = qtyLights;
		this.doors = doors;
		this.prefixDomain = prefixDomain;
		this.turnOn = turnOn;
		this.brand = brand;
		this.fullDomain = fullDomain;
	}

	//getters and setters
	public void setQtyWheels(int qtyWheels) {
		this.qtyWheels = qtyWheels;
	}

	public void setQtyLights(int qtyLights) {
		this.qtyLights = qtyLights;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setPrefixDomain(String prefixDomain) {
		this.prefixDomain = prefixDomain;
	}

	public void setTurnOn(boolean turnOn) {
		this.turnOn = turnOn;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setFullDomain(String fullDomain) {
		this.fullDomain = fullDomain;
	}

	public int getQtyWheels() {
		return qtyWheels;
	}

	public int getQtyLights() {
		return qtyLights;
	}

	public int getDoors() {
		return doors;
	}

	public String getPrefixDomain() {
		return prefixDomain;
	}

	public boolean isTurnOn() {
		return turnOn;
	}

	public String getBrand() {
		return brand;
	}

	public String getFullDomain() {
		return fullDomain;
	}

	public String getCHASIS_NUM() {
		return CHASIS_NUM;
	}
}
