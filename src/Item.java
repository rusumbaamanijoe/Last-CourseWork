public abstract class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract void performAction();

    public void showDetails() {
        System.out.println("Item Name: " + name);
    }
}