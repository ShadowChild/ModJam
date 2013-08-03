package shadowhax.modjam.energy;

import shadowhax.modjam.enums.EnumEnergyType;

public class EnergyTranferHandler {

    public static double getTranferRateFor(EnumEnergyType mainType, EnumEnergyType transferType) {

        switch(mainType) {

            case LUX: {

                switch(transferType) {

                    case LUX: {

                        return 1;
                    }

                    case ROS: {

                        return 0.65;
                    }

                    case ZEPHYR: {

                        return 0.65;
                    }

                    case IGNIS: {

                        return 0.30;
                    }

                    case NATURA: {

                        return 0.30;
                    }

                    case ORBITUS: {

                        return 0;
                    }
                }
            }

            case ROS: {

                switch(transferType) {

                    case ROS: {

                        return 1;
                    }

                    case LUX: {

                        return 0.65;
                    }

                    case NATURA: {

                        return 0.65;
                    }

                    case ORBITUS: {

                        return 0.30;
                    }

                    case ZEPHYR: {

                        return 0.30;
                    }

                    case IGNIS: {

                        return 0;
                    }
                }
            }
        }

        return 1;
    }
}
