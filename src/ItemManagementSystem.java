public class ItemManagementSystem {
    public static void main(String[] args) {

        Item book = new Book("The Great Gatsby", "Joshua RUSUMBA", "9780743273565");
        Item laptop = new Electronic("Laptop", "hp", "intel core i7 vPro 8th Gen", true);
        Item chair = new Fourniture("Chair", "Wood", 200);
        Item phone = new Electronic("Phone", "Apple", "iPhone 14", false);

        Item[] items = {book, laptop, chair, phone};

        for (Item item : items) {
            item.showDetails();
            item.performAction();
            System.out.println();
        }
    }
}