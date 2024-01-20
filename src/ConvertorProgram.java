import java.util.Random;

public class ConvertorProgram {

    public static void main(String[] args) {
        Random random = new Random();
        СonverterService service = new СonverterService();
        double km = random.nextInt(100_000);
        double mileInKm = service.convertKmToMiles(km);
        System.out.println("Miles in km: " + mileInKm + " km= " + km);
        double mile = random.nextInt(100_000);
        double kmInMile = service.convertMileToKm(mile);
        System.out.println("Km in mile: "+ kmInMile + " mile= " + mile);

    }
}
