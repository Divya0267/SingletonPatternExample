public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shirt", "Clothing"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Watch", "Accessories")
        };
        Product linearResult = LinearSearch.search(products, "Watch");
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Not Found"));
        Product binaryResult = BinarySearch.search(products, "Watch");
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Not Found"));
    }
}