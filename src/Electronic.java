public class Electronic {

    private String brand;
    private String model;
    private boolean isPoweredOn;

    public Electronic(String name, String brand, String model, boolean isPoweredOn) {
        super(name);
        this.brand = brand;
        this.model = model;
        this.isPoweredOn = isPoweredOn;
    }

    @Override
    public void performAction() {
        if (isPoweredOn) {
            System.out.println("Performing action: Running diagnostics...");
            System.out.println("Action Result: Diagnostics completed. No issues found in " + brand + " " + model + ".");
        } else {
            System.out.println("Performing action: Powering on...");
            isPoweredOn = true;
            System.out.println("Action Result: The " + model + " is now powered on.");
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Type: Electronic");
        super.showDetails(); // Calls the common showDetails from Item
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power Status: " + (isPoweredOn ? "On" : "Off"));
    }
}
