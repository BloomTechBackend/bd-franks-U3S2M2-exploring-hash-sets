package com.amazon.ata.hashingset.partsmanager;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class PartManager {
    // instantiate a HashSet of DeviceParts to keep track of what parts we are currently using
    //       (more about HashSet tomorrow)
    // Since HashSet implement the Set interface, we can define a reference to the interface
    //       and assign it a HashSet object
    private Set<DevicePart> deviceParts = new HashSet<>();  // Elements in a HashSet must have a unique Hash Code

    public void addDevicePart(DevicePart devicePart) {
        // Use the HashSet .add() to add the part passed to use to the deviceParts hashSet
        //     .add automagically calls the hashCode() method to determine the Hash Code
        //     .add sometimes also calls the equals() method when there is a Hash Code collision
        boolean isAdded = deviceParts.add(devicePart);
    }


    public void printDeviceParts() {
        for (DevicePart devicePart: deviceParts) {
            System.out.println(devicePart);
        }
    }
}
