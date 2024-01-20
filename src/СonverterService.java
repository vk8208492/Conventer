public class СonverterService {

    private final double KM_IN_MILE = 1.852;

    public double convertKmToMiles(double km) {
        return km / KM_IN_MILE;

    }
}

