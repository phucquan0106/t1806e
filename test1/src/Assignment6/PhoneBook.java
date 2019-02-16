package Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PhoneBook extends Phone {
    private ArrayList<Contact> PhoneList;

    public PhoneBook(ArrayList<Contact> phoneList) {
        PhoneList = phoneList;
    }

    public ArrayList<Contact> getPhoneList() {
        return PhoneList;
    }

    public void setPhoneList(ArrayList<Contact> phoneList) {
        PhoneList = phoneList;
    }

    public void printPhoneList(ArrayList<Contact> arrContact){
        System.out.println("PhoneList: ");
        for(int i = 0;i <arrContact.size();i++){
            System.out.println("Name: "+arrContact.get(i).getName() + " -- Phone: "+ arrContact.get(i).getPhone());
        }
    }

    @Override
    void insertPhone(String name, String phone) {
        int temp = 0;
        for (int i = 0;i <this.PhoneList.size();i++){
            if(this.PhoneList.get(i).getName().equalsIgnoreCase(name)){
                this.PhoneList.get(i).setPhone(this.PhoneList.get(i).getPhone()+":"+phone);
                temp++;
                break;
            }
        }
        if(temp == 0){
            Contact c = new Contact(name,phone);
            this.PhoneList.add(c);
        }
        printPhoneList(this.PhoneList);
    }

    @Override
    void removePhone(String name) {
        int temp = 0;
        for (int i = 0;i <this.PhoneList.size();i++){
            if(this.PhoneList.get(i).getName().equalsIgnoreCase(name)){
                this.PhoneList.remove(i);
                temp++;
                break;
            }
        }
        if(temp == 0){
            System.out.println("Name does not exist!");
        }
        printPhoneList(this.PhoneList);
    }

    @Override
    void updatePhone(String name, String newphone) {
        int temp = 0;
        for (int i = 0;i <this.PhoneList.size();i++){
            if(this.PhoneList.get(i).getName().equalsIgnoreCase(name)){
                this.PhoneList.get(i).setPhone(newphone);
                temp++;
                break;
            }
        }
        if(temp == 0){
            System.out.println("Name does not exist!");
        }
        printPhoneList(this.PhoneList);
    }

    @Override
    void searchPhone(String name) {
        int temp = 0;
        for (int i = 0;i <this.PhoneList.size();i++){
            if(this.PhoneList.get(i).getName().equalsIgnoreCase(name)){
                System.out.println("Name: "+ name + "--Phone: "+ this.PhoneList.get(i).getPhone());
                temp++;
                break;
            }
        }
        if(temp == 0){
            System.out.println("Name does not exist!");
        }
    }

    @Override
    void sort() {
        System.out.println("PhoneList before sorting: ");
        printPhoneList(this.PhoneList);
        Collections.sort(this.PhoneList, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("PhoneList After sorting: ");
        printPhoneList(this.PhoneList);
    }
}
