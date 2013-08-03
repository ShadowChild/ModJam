package shadowhax.crystalluscraft.enums;

public enum EnumEnergyType {
	
	IGNIS("ignis"),
	LUX("lux"),
	NATURA("natura"),
	ZEPHYR("zephyr"),
	ROS("ros"),
	OBITUS("obitus"),
    SPECTRA("spectra"),

    NONE("none");

	public String energyName;

	private EnumEnergyType(String energyName) {
		
		this.energyName = energyName;
	}
}
