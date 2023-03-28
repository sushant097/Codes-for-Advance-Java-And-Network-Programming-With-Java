package swingDemo;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class RestaurantOrderingBilling extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTable table;
    
    JButton b; 
    JLabel l;
    public RestaurantOrderingBilling() {
        Object[] columnNames = {"Select", "Item Names", "Price"};
        Object[][] data = {
        		{false, "Burger", new Double(120.0)},	
        		{true, "Chowmin", new Double(180.0)},
        		{false, "Pizza", new Double(200.0)},
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        table = new JTable(model) {
            private static final long serialVersionUID = 1L;

            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    	return Boolean.class;
                    case 1:
                        return String.class;
                    default:
                    	return Double.class;    
                }
            }
        };

        // No need this
        
        // Add an ItemListener to the checkboxes in the table
//        TableColumnModel columnModel = table.getColumnModel();
//        TableColumn column = columnModel.getColumn(0);
//        column.setCellEditor(table.getDefaultEditor(Boolean.class));
//        column.setCellRenderer(table.getDefaultRenderer(Boolean.class));
//        JCheckBox checkBox = new JCheckBox();
//        checkBox.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent e) {
//                int row = table.getSelectedRow();
//                int column = table.getSelectedColumn();
//                Boolean selected = (Boolean) model.getValueAt(row, column);
//                System.out.println("Checkbox in row " + row + " is " + (selected ? "not selected" : "selected") +" Price: "+data[row][2]);
//            }
//        });
//        column.setCellEditor(new DefaultCellEditor(checkBox));
        
        l = new JLabel("");
        // define the order button
        b = new JButton("Order Items");
        
        b.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			 // Find the total price	
        	        double totalPrice = 0.0;
        	        int numRows = model.getRowCount();
        	        for (int i = 0; i < numRows; i++) {
        	            Boolean selected = (Boolean) model.getValueAt(i, 0);
        	            if (selected) {
        	                Double price = (Double) model.getValueAt(i, 2);
        	                totalPrice += price;
        	            }
        	        }
        	        System.out.println("Total Price: " + totalPrice);
        	        l.setText("Total Price: "+totalPrice);
        		}
        		
    });
       
        
        table.setShowGrid(false);
        
        add(table);
        add(b);
        add(l);

        setLayout(new FlowLayout());
        setResizable(false);
        setVisible(true);
        setSize(400, 400);
    }

    public static void main(String args[]) {
        new RestaurantOrderingBilling();
    }
}


