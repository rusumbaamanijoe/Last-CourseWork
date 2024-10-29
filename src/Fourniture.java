public class Fourniture extends Item{

    private String material;
    private int weightCapacity;

    public Fourniture(String name, String material, int weightCapacity) {
        super(name);
        this.material = material;
        this.weightCapacity = weightCapacity;
    }

    @Override
    public void performAction() {
        System.out.println("Performing action: Checking stability...");
        System.out.println("Action Result: The " + material + " furniture can hold up to " + weightCapacity + "kg.");
    }

    @Override
    public void showDetails() {
        System.out.println("Type: Furniture");
        super.showDetails();
        System.out.println("Material: " + material);
        System.out.println("Weight Capacity: " + weightCapacity + "kg");
    }
}
