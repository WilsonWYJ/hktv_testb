@RestController
@RequestMapping("/shipping")
public class ShippingController {
    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @PostMapping("/fee")
    public ResponseEntity<ShippingFeeResponse> calculateShippingFee(@RequestBody List<Parcel> parcels) {
        // Delegate the calculation to the service
        double totalFee = shippingService.calculateShippingFee(parcels);

        ShippingFeeResponse response = new ShippingFeeResponse(totalFee);

        return ResponseEntity.ok(response);
    }
}