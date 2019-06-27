package com.design_patterns.behavioral.command_pattern;

public class OnCommand implements Command {
    private HomeElectronics homeElectronics;

    public OnCommand(HomeElectronics homeElectronics) {
        this.homeElectronics = homeElectronics;
    }

    @Override
    public void execute() {
        homeElectronics.on();
    }
}