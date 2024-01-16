public class q3 {
    public static void main(String[] args) {
        String productName = "Product A";
        int productLength = 210; // Length of the product in mm
        int productWidth = 35; // Width of the product in mm
        int productHeight = 35; // Height of the product in mm

        int boxLength = 320; // Length of the carton box in mm
        int boxWidth = 260; // Width of the carton box in mm
        int boxHeight = 200; // Height of the carton box in mm

        int maxQuantity = calculateMaxQuantity(productLength, productWidth, productHeight, boxLength, boxWidth, boxHeight);

        System.out.println("Product: " + productName);
        System.out.println("Maximum quantity in a carton box: " + maxQuantity);
    }

    public static int calculateMaxQuantity(int productLength, int productWidth, int productHeight, int boxLength, int boxWidth, int boxHeight) {
        int boxVolume = boxLength * boxWidth * boxHeight;
        int productVolume = productLength * productWidth * productHeight;

        int maxQuantity = (int) (boxVolume / productVolume);
        return maxQuantity;
    }
}
