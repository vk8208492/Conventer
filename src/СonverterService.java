public class СonverterService {

    private final double KM_IN_MILE = 1.852;

    public double convertKmToMiles(double km) {
        return km / KM_IN_MILE;
    }
    public double convertMileToKm(double mile){
        return mile*KM_IN_MILE;
    }

}

