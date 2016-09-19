
package pattern.sale.system.pkg2;

public class Bag implements OptionalItems,Patterns{

    private double price;
    private String description;
    private double material;
    private Boolean yesno;
    
    public Bag(double price, String description, double material){
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
        if (yesno){
            String r = "";
            r += "Item Name: " + this.description + "\n";
            r += "Price: $" + this.price * mul * 1.05 + "\n";
            r += "Amount of Materials Needed: " + this.material * mul + " metre of clothes\n";
            r += "Zipper is added. Price will increased to 5%\n";
            return r;
        }else{
            String r = "";
            r += "Item Name: " + this.description + "\n";
            r += "Price: $" + this.price * mul + "\n";
            r += "Amount of Materials Needed: " + this.material * mul + " metre of clothes\n";
            return r; 
        }
    }

    @Override
    public void setOption(Boolean bool) {
        yesno = bool;
    }

}
