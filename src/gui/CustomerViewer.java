package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import customer.CustomerInput;
import manager.CustomerManager;

public class CustomerViewer extends JPanel{
	
	WindowFrame frame;
	
	CustomerManager customerManager;

	public CustomerViewer(WindowFrame frame, CustomerManager customerManager) {
		this.frame = frame;
		this.customerManager = customerManager;
		
		System.out.println("***" + customerManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Contact Info");
		model.addColumn("Book");
		model.addColumn("Loan Period");
		
		for (int i=0; i<customerManager.size(); i++) {
			Vector row = new Vector();
			CustomerInput si = customerManager.get(i);
			row.add(si.getId());
			row.add(si.getName());
			row.add(si.getPhone());
			row.add(si.getBook());
			row.add(si.getPeriod());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
