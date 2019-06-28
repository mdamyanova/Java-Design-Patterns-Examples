package com.design_patterns.j2ee.business_delegate_pattern;

public class Client {
    private BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        this.businessDelegate.doTask();
    }
}