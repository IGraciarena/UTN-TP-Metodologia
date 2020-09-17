package NumberTwo.Models;

import NumberTwo.Observer.IObserver;

import java.util.Date;

public class Client implements IObserver {
    private String name;
    private String surname;
    private String cellphone;
    private String email;
    private Boolean isMail;
    private Boolean isPhone;

    public Client(String name, String surname, String cellphone, String email) {
        this.name = name;
        this.surname = surname;
        this.cellphone = cellphone;
        this.email = email;
        this.isMail = false;
        this.isPhone = false;
    }

    public Client() {
    }

    public Boolean getMail() {
        return isMail;
    }

    public void setIsMail(Boolean mail) {
        isMail = mail;
    }

    public Boolean getPhone() {
        return isPhone;
    }

    public void setIsPhone(Boolean phone) {
        isPhone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updatePhone(String name, Float price) {
        System.out.println("\n The Client: " + this.name + " has been notified by Phone "
                + "\n The Product price of: " + name + " has changed to: " + price);
    }

    public void updateEmail(String name, Float price) {
        java.util.Date now = new Date();
        System.out.println("\n The Client: " + this.name + " has been notified by Email "
                + "\n The Product price of: " + name + " has changed to: " + price
                + "\n Message recived at: " + now.toString());
    }
}
