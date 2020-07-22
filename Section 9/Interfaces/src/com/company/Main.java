package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone = new DeskPhone(1234);
        timsPhone.powerOn();
        timsPhone.callPhone(1234);
        timsPhone.answer();

        timsPhone = new MobilePhone(234);
        timsPhone.powerOn();
        timsPhone.callPhone(234);
        timsPhone.answer();
    }
}
