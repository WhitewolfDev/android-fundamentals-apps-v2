package com.whitewolf.mybills.model;

public class Payee {
    private String payee_name;
    private String payee_description;
    private int payee_type;
    private String payee_addressLine1;
    private String payee_addressLine2;
    private String payee_addressLine3;
    private String payee_city;
    private String payee_state;
    private String payee_zipcode;
    private String payee_main_phone;
    private String payee_main_fax;
    private String payee_main_tty;
    private String payee_main_webpage;
    private String payee_contact_name;
    private String payee_contact_phone;
    private String payee_contact_fax;
    private String payee_contact_email;
    private String payee_username;
    private String payee_password;

    public Payee(String payee_name, String payee_description, int payee_type, String payee_addressLine1,
                 String payee_addressLine2, String payee_addressLine3,
                 String payee_city, String payee_state, String payee_zipcode,
                 String payee_main_phone, String payee_main_fax, String payee_main_tty,
                 String payee_main_webpage, String payee_contact_name, String payee_contact_phone,
                 String payee_contact_fax, String payee_contact_email, String payee_username,
                 String payee_password) {
        this.payee_name = payee_name;
        this.payee_description = payee_description;
        this.payee_type = payee_type;
        this.payee_addressLine1 = payee_addressLine1;
        this.payee_addressLine2 = payee_addressLine2;
        this.payee_addressLine3 = payee_addressLine3;
        this.payee_city = payee_city;
        this.payee_state = payee_state;
        this.payee_zipcode = payee_zipcode;
        this.payee_main_phone = payee_main_phone;
        this.payee_main_fax = payee_main_fax;
        this.payee_main_tty = payee_main_tty;
        this.payee_main_webpage = payee_main_webpage;
        this.payee_contact_name = payee_contact_name;
        this.payee_contact_phone = payee_contact_phone;
        this.payee_contact_fax = payee_contact_fax;
        this.payee_contact_email = payee_contact_email;
        this.payee_username = payee_username;
        this.payee_password = payee_password;
    }

    public String getPayee_name() {
        return payee_name;
    }

    public void setPayee_name(String payee_name) {
        this.payee_name = payee_name;
    }

    public String getPayee_description() {
        return payee_description;
    }

    public void setPayee_description(String payee_description) {
        this.payee_description = payee_description;
    }

    public int getPayee_type() {
        return payee_type;
    }

    public void setPayee_type(int payee_type) {
        this.payee_type = payee_type;
    }

    public String getPayee_addressLine1() {
        return payee_addressLine1;
    }

    public void setPayee_addressLine1(String payee_addressLine1) {
        this.payee_addressLine1 = payee_addressLine1;
    }

    public String getPayee_addressLine2() {
        return payee_addressLine2;
    }

    public void setPayee_addressLine2(String payee_addressLine2) {
        this.payee_addressLine2 = payee_addressLine2;
    }

    public String getPayee_addressLine3() {
        return payee_addressLine3;
    }

    public void setPayee_addressLine3(String payee_addressLine3) {
        this.payee_addressLine3 = payee_addressLine3;
    }

    public String getPayee_city() {
        return payee_city;
    }

    public void setPayee_city(String payee_city) {
        this.payee_city = payee_city;
    }

    public String getPayee_state() {
        return payee_state;
    }

    public void setPayee_state(String payee_state) {
        this.payee_state = payee_state;
    }

    public String getPayee_zipcode() {
        return payee_zipcode;
    }

    public void setPayee_zipcode(String payee_zipcode) {
        this.payee_zipcode = payee_zipcode;
    }

    public String getPayee_main_phone() {
        return payee_main_phone;
    }

    public void setPayee_main_phone(String payee_main_phone) {
        this.payee_main_phone = payee_main_phone;
    }

    public String getPayee_main_fax() {
        return payee_main_fax;
    }

    public void setPayee_main_fax(String payee_main_fax) {
        this.payee_main_fax = payee_main_fax;
    }

    public String getPayee_main_tty() {
        return payee_main_tty;
    }

    public void setPayee_main_tty(String payee_main_tty) {
        this.payee_main_tty = payee_main_tty;
    }

    public String getPayee_main_webpage() {
        return payee_main_webpage;
    }

    public void setPayee_main_webpage(String payee_main_webpage) {
        this.payee_main_webpage = payee_main_webpage;
    }

    public String getPayee_contact_name() {
        return payee_contact_name;
    }

    public void setPayee_contact_name(String payee_contact_name) {
        this.payee_contact_name = payee_contact_name;
    }

    public String getPayee_contact_phone() {
        return payee_contact_phone;
    }

    public void setPayee_contact_phone(String payee_contact_phone) {
        this.payee_contact_phone = payee_contact_phone;
    }

    public String getPayee_contact_fax() {
        return payee_contact_fax;
    }

    public void setPayee_contact_fax(String payee_contact_fax) {
        this.payee_contact_fax = payee_contact_fax;
    }

    public String getPayee_contact_email() {
        return payee_contact_email;
    }

    public void setPayee_contact_email(String payee_contact_email) {
        this.payee_contact_email = payee_contact_email;
    }

    public String getPayee_username() {
        return payee_username;
    }

    public void setPayee_username(String payee_username) {
        this.payee_username = payee_username;
    }

    public String getPayee_password() {
        return payee_password;
    }

    public void setPayee_password(String payee_password) {
        this.payee_password = payee_password;
    }
}
