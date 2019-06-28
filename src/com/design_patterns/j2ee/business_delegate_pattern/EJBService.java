package com.design_patterns.j2ee.business_delegate_pattern;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by Enterprise JavaBeans Service.");
    }
}