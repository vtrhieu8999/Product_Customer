package Service;

import Model.Customer;
import Model.Manager;

import java.util.ArrayList;
import java.util.List;

public class CustomerService extends Manager<Customer> {
    public void update(long id, String address) {
        for(Customer account: myList){
            if(account.getId()==id) {
                myList.add(new Customer(id, account.getName(), address));
                delete(account.getId());
                return;
            }
            System.out.println("Khach hang ban tim khong co trong danh sach");
        }
    }
    public void add(long id, String name, String address){
        for(Customer account: myList){
            if(account.getId()==id){
                System.out.println("Khach hang ban muon them da co trong danh sach");
                return;
            }
        }
        myList.add(new Customer(id, name, address));
    }
    public List<Customer> findbyAddress(String address){
        List<Customer> list= new ArrayList<>();
        for(Customer account : myList){
            if(account.getAddress().equals(address)) {
                list.add(account);
            }
        }
        return list;
    }
}
