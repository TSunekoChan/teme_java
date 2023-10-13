package isp.lab4.exercise1;

public class Customer {
    private String costumerID;
    private String name;
    private String phone;
   private Address adress;
    public void setCostumerID(String costumerID) {
        this.costumerID = costumerID;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public String getCostumerID() {
        return costumerID;
    }

    public String getPhone() {
        return phone;
    }


}
