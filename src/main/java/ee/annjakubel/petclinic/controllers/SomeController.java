package ee.annjakubel.petclinic.controllers;

import ee.annjakubel.petclinic.services.MyService;

public class SomeController {

    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
