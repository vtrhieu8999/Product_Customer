package Model;

import java.util.*;

public class Manager<T extends OveralInterface<T>> {
    public List<T> myList = new ArrayList<>();

    public T findbyId(long id){
        for(T account : myList){
            if(account.getId()==id) return account;
        }
        return null;
    }
    public List<T> findbyName(String name){
        List<T> list= new ArrayList<>();
        for(T account : myList){
            if(account.getName().equals(name)) {
                list.add(0, account);
            }
        }
        return list;
    }
    public List<T> findAll(){
        return this.myList;
    }
    public void delete(long id){
        for(T account: myList){
            if(account.getId()==id) myList.remove(account);
        }
    }
}


