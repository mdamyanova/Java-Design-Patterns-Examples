package com.design_patterns.behavioral.command_pattern;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        OvenReceiver ovenReceiver = new OvenReceiver();
        AirconditionReceiver airconditionReceiver = new AirconditionReceiver();
        List<HomeElectronics> homeElectronics = new ArrayList<>();
        homeElectronics.add(ovenReceiver);
        homeElectronics.add(airconditionReceiver);
        OffCommand offHomeElectronics = new OffCommand(homeElectronics);
        ButtonInvoker offHomeElectronicsButton = new ButtonInvoker(offHomeElectronics);
        offHomeElectronicsButton.click();
    }
}