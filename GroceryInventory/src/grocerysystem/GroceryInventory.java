package grocerysystem;

import grocerysystem.products.FoodProduct;
import grocerysystem.products.NonFoodProduct;
import grocerysystem.products.Product;
import java.awt.AWTEventMulticaster;
import java.util.Calendar;

public class GroceryInventory
{
    public static void main(String[] args)
    {
        ProductDatabase inventory = new ProductDatabase();
        Product p1 = new Product ("Milk", 6.95);
        Product p2 = new Product("Cream", 12.95);
        Product p3 = new Product ("Milk", 6.95);
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(new Product("Honey", 17.50));
        inventory.addProduct(new Product("Corn", 8.95));
        inventory.addProduct(new Product("Salad", 3.25));
        inventory.addProduct(new Product("Liquorice", 25.95));
        
       
        
        System.out.println("Total price: " + inventory.getTotalPrice() + "\n");
        System.out.println(inventory.printInventory());
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        
        Calendar expireDate = Calendar.getInstance();
        expireDate.set(2018, 11, 20);
        FoodProduct fp1 = new FoodProduct("Milk", 7, expireDate, 1);
        FoodProduct fp2 = new FoodProduct("Meat", 30, expireDate, 5);
        FoodProduct fp3 = new FoodProduct("cookies", 2, expireDate, 20);
        
        System.out.println(fp1.toString());
        
        NonFoodProduct Nfp1 = new NonFoodProduct("Chair", 100, new String[] {"wood"});
        NonFoodProduct Nfp2 = new NonFoodProduct("Shoes", 200, new String[] {"leather, metal"});
        NonFoodProduct Nfp3 = new NonFoodProduct("Glasses", 1000, new String[] {"glass, metal"});
        
        ProductDatabase pd = new ProductDatabase();
        pd.addProduct(fp1);
        pd.addProduct(fp2);
        pd.addProduct(fp3);
        pd.addProduct(Nfp1);
        pd.addProduct(Nfp2);
        pd.addProduct(Nfp3);
        
        for (Product p : pd.getProductList()){
            System.out.println(p.toString());
            
        }
        
    }    
}
