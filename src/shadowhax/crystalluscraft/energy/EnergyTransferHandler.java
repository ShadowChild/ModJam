package shadowhax.crystalluscraft.energy;

import shadowhax.crystalluscraft.enums.EnumEnergyType;

public class EnergyTransferHandler {

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

                    case OBITUS: {

                        return 0;
                    }

                    case SPECTRA: {

                        return 1;
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

                    case OBITUS: {

                        return 0.30;
                    }

                    case ZEPHYR: {

                        return 0.30;
                    }

                    case IGNIS: {

                        return 0;
                    }

                    case SPECTRA: {

                        return 1;
                    }
                }
            }

            case NATURA: {

                switch(transferType) {

                    case NATURA: {

                        return 1;
                    }

                    case ROS: {

                        return 0.65;
                    }

                    case OBITUS: {

                        return 0.65;
                    }

                    case LUX: {

                        return 0.30;
                    }

                    case IGNIS: {

                        return 0.30;
                    }

                    case ZEPHYR: {

                        return 0;
                    }

                    case SPECTRA: {

                        return 1;
                    }
                }
            }

            case OBITUS: {

                switch(transferType) {

                    case OBITUS: {

                        return 1;
                    }

                    case IGNIS: {

                        return 0.65;
                    }

                    case NATURA: {

                        return 0.65;
                    }

                    case ZEPHYR: {

                        return 0.30;
                    }

                    case ROS: {

                        return 0.30;
                    }

                    case LUX: {

                        return 0;
                    }

                    case SPECTRA: {

                        return 1;
                    }
                }
            }

            case IGNIS: {

                switch(transferType) {

                    case IGNIS: {

                        return 1;
                    }

                    case ZEPHYR: {

                        return 0.65;
                    }

                    case OBITUS: {

                        return 0.65;
                    }

                    case LUX: {

                        return 0.30;
                    }

                    case NATURA: {

                        return 0.30;
                    }

                    case ROS: {

                        return 0;
                    }

                    case SPECTRA: {

                        return 1;
                    }
                }
            }

            case ZEPHYR: {

                switch(transferType) {

                    case ZEPHYR: {

                        return 1;
                    }

                    case LUX: {

                        return 0.65;
                    }

                    case IGNIS: {

                        return 0.65;
                    }

                    case OBITUS: {

                        return 0.30;
                    }

                    case ROS: {

                        return 0.30;
                    }

                    case NATURA: {

                        return 0;
                    }

                    case SPECTRA: {

                        return 1;
                    }
                }
            }

            case SPECTRA: {

                return 1;
            }

            default: return 0;
        }
    }
}
