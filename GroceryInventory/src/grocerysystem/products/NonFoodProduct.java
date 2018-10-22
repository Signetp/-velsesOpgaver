package grocerysystem.products;

import java.util.List;
import java.util.Arrays;

public class NonFoodProduct extends Product
{
    private String[] materials;
    
    public NonFoodProduct(String name, double price, String[] materials)
    {
        super(name, price);
        this.materials = materials;
    }
    
    @Override
    public String toString()
    {
        return this.getName() +" Materiale liste: " +  Arrays.toString(materials);
    }
}
