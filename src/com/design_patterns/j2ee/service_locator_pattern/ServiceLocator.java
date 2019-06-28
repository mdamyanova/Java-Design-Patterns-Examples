package com.design_patterns.j2ee.service_locator_pattern;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String serviceName) {
        Service service = cache.getService(serviceName);

        if (service != null) {
            return service;
        }

        Context context = new Context();
        Service service1 = (Service)context.lookup(serviceName);
        cache.addService(service1);
        return service1;
    }
}