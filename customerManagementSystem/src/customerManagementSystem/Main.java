package customerManagementSystem;

import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args){
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Dilara","Bedir","11111111111",1997));

	}

}
