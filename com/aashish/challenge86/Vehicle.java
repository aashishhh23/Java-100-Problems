//Define a base class vehicle with a method service()and a subclass Car that overrides service()
//In Car's Service(), provide a specific implementation that calls super.service()
// as well, to show how overriding works.

package com.aashish.challenge86;

public class Vehicle {

    public void service(){
        System.out.println("Vehicle is getting serviced...");
    }
}
