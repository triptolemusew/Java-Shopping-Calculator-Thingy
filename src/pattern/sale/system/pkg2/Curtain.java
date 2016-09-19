
package pattern.sale.system.pkg2;

public class Curtain implements Patterns{

    private double price;
    private String description;
    private double material;
    
    public Curtain(double price, String description, double material){
        this.price = price;
        this.description = description;
        this.material = material;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double amountMaterial() {
        return material;
    }

    @Override
    public String printDetails(int mul) {
        String r = "";
        r += "Item Name: " + this.description + "\n";
        r += "Price: $" + this.price * mul + "\n";
        r += "Amount of Materials Needed: " + this.material * mul + " metre of clothes\n";
        return r;
    }
    
}
