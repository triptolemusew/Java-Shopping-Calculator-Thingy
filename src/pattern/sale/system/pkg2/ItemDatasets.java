
package pattern.sale.system.pkg2;
import java.util.*;
import javax.swing.event.*;

public class ItemDatasets {

    ArrayList array = new ArrayList();
    private double total;
    public void addItem(String item){
        array.add(item);
        System.out.println(array);
    }
    
    public ArrayList getAllItem(){
        return array;
    }
    
    public void itemTotal(double total){
        this.total += total;
    }
    
    public double returnTotal(){
        return total;
    }
    
    public void clearItemList(){
        array.removeAll(array);
        total = 0;
    }
    
}
