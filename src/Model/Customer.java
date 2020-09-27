package Model;

public class Customer implements OveralInterface<Customer> {
    final private long id;
    final private String name;
    private String address;
@Override
    public long getId() {
        return id;
    }

@Override
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(long id, String name, String address){
        this.id= id;
        this.name= name;
        this.address= address;
    }
    public String toString(){
        return name +"-"+ id+"-" + address;
    }
}
