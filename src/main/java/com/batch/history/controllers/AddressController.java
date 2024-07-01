package com.batch.history.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.batch.history.models.Address;


@Controller
public class AddressController {

    @RequestMapping(value = "/addresses", method=RequestMethod.GET)
    public ResponseEntity<Address> getAddresses() {
        return null;
    }
    

}
