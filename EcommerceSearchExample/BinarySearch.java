import java.util.Arrays;
import java.util.Comparator;
public class BinarySearch {
    public static Product search(Product[] products, String productName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = products[mid].getProductName().compareToIgnoreCase(productName);
            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}