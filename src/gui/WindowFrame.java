 package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.CustomerManager;

public class WindowFrame extends JFrame {
	
	CustomerManager customerManager;
	
	MenuSelection menuselection;
	CustomerAdder customeradder;
	CustomerViewer customerviewer;
	
	public WindowFrame(CustomerManager customerManager) {
		this.customerManager = customerManager;
		this.menuselection = new MenuSelection(this);
		this.customeradder = new CustomerAdder(this);
		this.customerviewer = new CustomerViewer(this, this.customerManager);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public CustomerAdder getCustomeradder() {
		return customeradder;
	}

	public void setCustomeradder(CustomerAdder customeradder) {
		this.customeradder = customeradder;
	}

	public CustomerViewer getCustomerviewer() {
		return customerviewer;
	}

	public void setCustomerviewer(CustomerViewer customerviewer) {
		this.customerviewer = customerviewer;
	}

}
