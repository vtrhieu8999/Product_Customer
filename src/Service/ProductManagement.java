package Service;

import Model.Manager;
import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement extends Manager<Product> {
    public void update(long id, long price){
        for(Product account: myList){
            if(account.getId()==id) {
                myList.add(new Product(id, account.getName(), account.getManufacturer(), price));
                delete(account.getId());
                return;
            }
            System.out.println("San pham ban tim khong co trong danh sach");
        }
    }
    public List<Product> findbyManufacture(String manu){

            List<Product> list= new ArrayList<>();
            for(Product account : myList){
                if(account.getManufacturer().equals(manu)) {
                    list.add(account);
                }
            }
            return list;

    }
    public List<Product> findbyPrice(long price){
        List<Product> list= new ArrayList<>();
        for(Product account : myList){
            if(account.getPrice()==price) {
                list.add(account);
            }
        }
        return list;
    }
}
