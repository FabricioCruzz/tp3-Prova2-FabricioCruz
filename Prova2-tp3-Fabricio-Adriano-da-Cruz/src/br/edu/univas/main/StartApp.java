package br.edu.univas.main;

import br.edu.univas.controller.CustomerController;

public class StartApp {
	
	public static void main(String[] args) {
		
		CustomerController customerController = new CustomerController();
		customerController.createCustomer();
		
	}

}
