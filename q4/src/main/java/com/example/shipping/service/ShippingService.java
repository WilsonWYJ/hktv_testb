@Service
public class ShippingService {
    public double calculateShippingFee(List<Parcel> parcels) {
        double totalFee = 0.0;

        for (Parcel parcel : parcels) {
            double volume = parcel.getLength() * parcel.getWidth() * parcel.getHeight();
            double weight = Math.max(parcel.getWeight(), volume / 5000);

            // Determine the rate based on weight and temperature condition
            double rate = getRate(weight, parcel.getTemperatureCondition());

            totalFee += rate * parcel.getQuantity();
        }

        return totalFee;
    }

    private double getRate(double weight, String temperatureCondition) {
        // Implement logic to fetch the rate from the rate card based on weight and temperature condition
        // You can use a database or an external service to store and retrieve the rate card data
        // For simplicity, you can use a hardcoded rate card in this example
        if (weight <= 5) {
            if (temperatureCondition.equalsIgnoreCase("ambient")) {
                return 10.0;
            } else if (temperatureCondition.equalsIgnoreCase("chill")) {
                return 20.0;
            }
        } else {
            if (temperatureCondition.equalsIgnoreCase("ambient")) {
                return 15.0;
            } else if (temperatureCondition.equalsIgnoreCase("chill")) {
                return 30.0;
            }
        }
        return 0.0; // Return 0.0 or handle error for invalid weight or temperature condition
    }
}