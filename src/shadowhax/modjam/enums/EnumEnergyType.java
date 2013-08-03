package shadowhax.modjam.enums;

public enum EnumEnergyType {
	
	IGNIS("ignis"),
	LUX("lux"),
	NATURA("natura"),
	ZEPHYR("zephyr"),
	ROS("ros"),
	ORBITUS("orbitus"),
    SPECTRA("spectra");

	public String energyName;

	private EnumEnergyType(String energyName) {
		
		this.energyName = energyName;
	}
}
