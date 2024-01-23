public class Shirt {
    public int shirtID = 6;
    public String description = "Нормальна сорочка";
    public String color = "blue";
    public double price = 14.0;
    public int quantityInStock = 78;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color: " + color);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}