package com.whitewolf.mybills.model;

public class Payment {
    private int payment_payee_id;
    private String payment_description;
    private int payment_method;
    private int payment_frequency;
    private String payment_due_date;
    private float payment_due_amount;
    private int payment_duration;

    public Payment(int payment_payee_id, String payment_description, int payment_method,
                   int payment_frequency, String payment_due_date, float payment_due_amount,
                   int payment_duration) {
        this.payment_payee_id = payment_payee_id;
        this.payment_description = payment_description;
        this.payment_method = payment_method;
        this.payment_frequency = payment_frequency;
        this.payment_due_date = payment_due_date;
        this.payment_due_amount = payment_due_amount;
        this.payment_duration = payment_duration;
    }

    public int getPayment_payee_id() {
        return payment_payee_id;
    }

    public void setPayment_payee_id(int payment_payee_id) {
        this.payment_payee_id = payment_payee_id;
    }

    public String getPayment_description() {
        return payment_description;
    }

    public void setPayment_description(String payment_description) {
        this.payment_description = payment_description;
    }

    public int getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(int payment_method) {
        this.payment_method = payment_method;
    }

    public int getPayment_frequency() {
        return payment_frequency;
    }

    public void setPayment_frequency(int payment_frequency) {
        this.payment_frequency = payment_frequency;
    }

    public String getPayment_due_date() {
        return payment_due_date;
    }

    public void setPayment_due_date(String payment_due_date) {
        this.payment_due_date = payment_due_date;
    }

    public float getPayment_due_amount() {
        return payment_due_amount;
    }

    public void setPayment_due_amount(float payment_due_amount) {
        this.payment_due_amount = payment_due_amount;
    }

    public int getPayment_duration() {
        return payment_duration;
    }

    public void setPayment_duration(int payment_duration) {
        this.payment_duration = payment_duration;
    }
}
