package shadowhax.modjam.enums;

public enum EnumEnergyType {
	
	IGNIS(0, "ignis"),
	LUX(0, "lux"),
	NATURA(0, "natura"),
	ZEPHYR(0, "zephyr"),
	ROS(0, "ros"),
	ORBITUS(0, "orbitus");

	public int tranferRate;
	public String energyName;

	private EnumEnergyType(int transferRate, String energyName) {
		
		this.tranferRate = transferRate;
		this.energyName = energyName;
	}
}
