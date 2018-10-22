package grocerysystem;

import java.text.DecimalFormat;
import java.util.UUID;
import grocerysystem.products.Product;
import java.util.ArrayList;

public class ProductDatabase {

    private ArrayList<Product> productlist;
    
    public ArrayList<Product> getProductList(){
        return this.productlist;
    }

    public ProductDatabase() {
        productlist = new ArrayList<>();
    }

    public void addProduct(Product p) {
        productlist.add(p);
    }

    public void removeProduct(Product p) {
        for (Product product : productlist) {
            if (p.equals(product)) {
                productlist.remove(product);
            }
        }
    }

    public String printInventory() {
        //Use StringBuild to create a combined string from multiple strings.
        StringBuilder sb = new StringBuilder();
        //Append adds String to the end of the combined string.
        sb.append("Lagerbeholdning:\n");

        for (Product p : productlist) {
            sb.append("Name: ").append(p.getName()).append("\t")
                    .append("Price: ").append(p.getPrice()).append("\t")
                    .append("Serial: ").append(p.getSerial()).append("\n");
        }
        //Call toString on the StringBuilder object, to get the String representation.
        return sb.toString();
    }

    public String getTotalPrice() {
        double result = 0;
        //Loop through all products. Accumulate prices.
        for (Product product : productlist) {
            result += product.getPrice();
        }
        //Use DecimalFormat class to get a currency representation of the double in local currency.
        return DecimalFormat.getCurrencyInstance().format(result);
    }
}
