package com.design_patterns.j2ee.business_delegate_pattern;

public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        this.businessService = this.lookUpService.getBusinessService(this.serviceType);
        this.businessService.doProcessing();
    }
}