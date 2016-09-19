
package pattern.sale.system.pkg2;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.event.*;

public class PatternSaleSystem2 {
    
    public enum Size {
            Small, Medium, Large
        }
    
    public static void main(String[] args) {
        ItemDatasets items = new ItemDatasets();
        
        OptionalItems jacket = new Jacket(12.00, "Jacket", 5);
        OptionalItems skirt = new Skirt(15.00, "Skirt", 10);
        OptionalItems plushToy = new PlushToy(14.43, "Plush Toy", 15);
        OptionalItems bag = new Bag(29.99, "Bag", 30);
        Patterns pants = new Pants(8.00, "Pants", 4);
        Patterns dress = new Dress(15.00, "Dress", 20);
        Patterns overalls = new Overalls(20.00, "Overalls", 22);
        Patterns curtain = new Curtain(21.00, "Curtain", 30);
        Patterns shirt = new Shirt(9.00, "Shirt", 9);

        final JTextArea textArea = new JTextArea(20, 40);
        final JComboBox combo = new JComboBox();
        final JComboBox combo_size = new JComboBox();
        final JTextField count = new JTextField("",5);
        final JLabel label_item = new JLabel("Item: ");
        final JLabel label_size = new JLabel("Size: ");
        final JLabel label = new JLabel("Unit: ");
        JButton addButton = new JButton("Add Item(s)");
        JButton outButton = new JButton("Checkout");
        JButton clearButton = new JButton("Clear shopping list");
        
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                int mul = 0;
                if (Integer.toString(mul) == "")
                    count.setText("1");
                if (count.getText().isEmpty() || !count.getText().matches("[-+]?\\d*\\.?\\d+")){
                    count.setText("1");
                }
                mul = Integer.parseInt(count.getText());
                String r = "";
                if (combo_size.getSelectedItem().toString() == Size.Small.toString()){
                    if (combo.getSelectedItem().toString() == "Jacket"){
                        int selectedOption = JOptionPane.showConfirmDialog(null, "Do you want to add Lining?","Choose",JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            jacket.setOption(Boolean.TRUE);
                            items.itemTotal(jacket.getPrice() * 1.2 * mul *1.05);
                        }else{
                            jacket.setOption(Boolean.FALSE);
                            items.itemTotal(jacket.getPrice() * 1.2 * mul);
                        }
                        r += "Large x "+ Integer.toString(mul) +"\n"+jacket.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Shirt"){
                        items.itemTotal(shirt.getPrice() * 1.2 * mul);
                        r += "Small x " +Integer.toString(mul) +"\n" + shirt.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Skirt"){
                        int selectedOption = JOptionPane.showConfirmDialog(null, "Do you want to add Lining?","Choose",JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            skirt.setOption(Boolean.TRUE);
                            items.itemTotal(skirt.getPrice() * 1.2 * mul *1.05);
                        }else{
                            skirt.setOption(Boolean.FALSE);
                            items.itemTotal(skirt.getPrice() * 1.2 * mul);
                        }
                        r += "Large x "+ Integer.toString(mul) +"\n"+skirt.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Pants"){
                        items.itemTotal(pants.getPrice() * 1.2 * mul);
                        r += "Small x " + Integer.toString(mul) + "\n" + pants.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Dress"){
                        items.itemTotal(dress.getPrice() * 1.2 * mul);
                        r += "Small x " + Integer.toString(mul) + "\n" + dress.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Overalls"){
                        items.itemTotal(overalls.getPrice() * 1.2 * mul);
                        r += "Small x " + Integer.toString(mul) + "\n" + overalls.printDetails(mul);
                    }
                }
                else if (combo_size.getSelectedItem().toString() == Size.Medium.toString()){
                    if (combo.getSelectedItem().toString() == "Jacket"){
                        int selectedOption = JOptionPane.showConfirmDialog(null, "Do you want to add Lining?","Choose",JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            jacket.setOption(Boolean.TRUE);
                            items.itemTotal(jacket.getPrice() * 1.5 * mul *1.05);
                        }else{
                            jacket.setOption(Boolean.FALSE);
                            items.itemTotal(jacket.getPrice() * 1.5 * mul);
                        }
                        r += "Large x "+ Integer.toString(mul) +"\n"+jacket.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Shirt"){
                        items.itemTotal(shirt.getPrice() * 1.5 * mul);
                        r += "Medium x "+ Integer.toString(mul) +"\n"+shirt.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Skirt"){
                        int selectedOption = JOptionPane.showConfirmDialog(null, "Do you want to add Lining?","Choose",JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            skirt.setOption(Boolean.TRUE);
                            items.itemTotal(skirt.getPrice() * 1.5 * mul *1.05);
                        }else{
                            skirt.setOption(Boolean.FALSE);
                            items.itemTotal(skirt.getPrice() * 1.5 * mul);
                        }
                        r += "Large x "+ Integer.toString(mul) +"\n"+skirt.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Pants"){
                        items.itemTotal(pants.getPrice() * 1.5 * mul);
                        r += "Medium x "+ Integer.toString(mul) +"\n"+pants.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Dress"){
                        items.itemTotal(dress.getPrice() * 1.5 * mul);
                        r += "Medium x "+ Integer.toString(mul) +"\n"+dress.printDetails(mul);
                    }
                    else if (combo.getSelectedItem().toString() == "Overalls"){
                        items.itemTotal(overalls.getPrice() * 1.5 * mul);
                        r += "Medium x "+ Integer.toString(mul) +"\n"+overalls.printDetails(mul);
                    }
                }
                else if (combo_size.getSelectedItem().toString() == Size.Large.toString()){
                    if (combo.getSelectedItem().toString() == "Jacket"){
                        int selectedOption = JOptionPane.showConfirmDialog(null, "Do you want to add Lining?","Choose",JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            jacket.setOption(Boolean.TRUE);
                            items.itemTotal(jacket.getPrice() * 1.9 * mul *1.05);
                        }else{
                            jacket.setOption(Boolean.FALSE);
                            items.itemTotal(jacket.getPrice() * 1.9 * mul);
                        }
                        r += "Large x "+ Integer.toString(mul) +"\n"+jacket.printDetails(mul);
                    }
                    else if(combo.getSelectedItem().toString() == "Shirt"){
                        items.itemTotal(shirt.getPrice() * 1.9 * mul);
                        r += "Large x "+ Integer.toString(mul) +"\n"+shirt.printDetails(mul);
                    }
                    else if(combo.getSelectedItem().toString() == "Skirt"){
                        int selectedOption = JOptionPane.showConfirmDialog(null, "Do you want to add Lining?","Choose",JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            skirt.setOption(Boolean.TRUE);
                            items.itemTotal(skirt.getPrice() * 1.9 * mul *1.05);
                        }else{
                            skirt.setOption(Boolean.FALSE);
                            items.itemTotal(skirt.getPrice() * 1.9 * mul);
                        }
                        r += "Large x "+ Integer.toString(mul) +"\n"+skirt.printDetails(mul);
                    }
                    else if(combo.getSelectedItem().toString() == "Pants"){
                        items.itemTotal(pants.getPrice() * 1.9* mul);
                        r += "Large x "+ Integer.toString(mul) +"\n" + pants.printDetails(mul);
                    }
                    else if(combo.getSelectedItem().toString() == "Dress"){
                        items.itemTotal(dress.getPrice() * 1.9* mul);
                        r += "Large x "+ Integer.toString(mul) +"\n" + dress.printDetails(mul);
                    }
                    else if(combo.getSelectedItem().toString() == "Overalls"){
                        items.itemTotal(overalls.getPrice() * 1.9* mul);
                        r += "Large x "+ Integer.toString(mul) +"\n" + overalls.printDetails(mul);
                    }
                }
                
                if (combo.getSelectedItem().toString() == "Bag")
                {
                    int selectedOption = JOptionPane.showConfirmDialog(null, "Do you want to add Zipper?","Choose",JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            bag.setOption(Boolean.TRUE);
                            items.itemTotal(bag.getPrice() * mul *1.05);
                        }else{
                            bag.setOption(Boolean.FALSE);
                            items.itemTotal(bag.getPrice() * mul);
                        }
                        r += "Non-Clothing Item x "+ Integer.toString(mul) +"\n"+bag.printDetails(mul);
                }
                else if (combo.getSelectedItem().toString() == "Curtain")
                {
                    items.itemTotal(curtain.getPrice() * mul);
                    r += "Non-Clothing Item x " + Integer.toString(mul) + "\n" + curtain.printDetails(mul);
                }
                else if (combo.getSelectedItem().toString() == "Plush Toy")
                {
                    int selectedOption = JOptionPane.showConfirmDialog(null, "Do you want to add Plastic Eye?","Choose",JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            plushToy.setOption(Boolean.TRUE);
                            items.itemTotal(plushToy.getPrice() * mul *1.05);
                        }else{
                            plushToy.setOption(Boolean.FALSE);
                            items.itemTotal(plushToy.getPrice() * mul);
                        }
                        r += "Non-Clothing Item x "+ Integer.toString(mul) +"\n"+plushToy.printDetails(mul);
                }
                
                textArea.setText(r);
                items.addItem(r);
            }
        });
        
        outButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event)
            {
                String r = "";
                String listofitem = "L I S T  O F  I T E M S \n--------------\n\n";
                String totaltext = "--------------\n\nTOTAL: ";
                r += listofitem;
                ArrayList arr = new ArrayList();
                arr = items.getAllItem();
                System.out.println("From main: " + arr);
                Iterator itr =  arr.iterator();
                
                while (itr.hasNext()){
                    Object element = itr.next();
                    r += element + "\n";
                }
                DecimalFormat dispForm = new DecimalFormat("#.##");
                
                totaltext += dispForm.format(items.returnTotal());
                r += totaltext;
                System.out.println(r);
                textArea.setText(r);
            }
        });
        
        clearButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent event){
               items.clearItemList();
               textArea.setText("Cleared Shopping List.");
           } 
        });
        
        combo.addItem(jacket.getDescription());
        combo.addItem(shirt.getDescription());
        combo.addItem(skirt.getDescription());
        combo.addItem(pants.getDescription());
        combo.addItem(dress.getDescription());
        combo.addItem(overalls.getDescription());
        combo.addItem(bag.getDescription());
        combo.addItem(plushToy.getDescription());
        combo.addItem(curtain.getDescription());
        
        combo_size.addItem(Size.Small);
        combo_size.addItem(Size.Medium);
        combo_size.addItem(Size.Large);
        
        JPanel panel = new JPanel();
        panel.add(label_item);
        panel.add(combo);
        panel.add(label_size);
        panel.add(combo_size);
        panel.add(label);
        panel.add(count);
        panel.add(addButton);
        panel.add(outButton);
        panel.add(clearButton);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.repaint();
    }
}
