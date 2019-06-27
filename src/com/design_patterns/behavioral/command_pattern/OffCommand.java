package com.design_patterns.behavioral.command_pattern;

import java.util.List;

public class OffCommand implements Command {
    private List<HomeElectronics> homeElectronics;

    public OffCommand(List<HomeElectronics> homeElectronics) {
        this.homeElectronics = homeElectronics;
    }

    @Override
    public void execute() {
        for (HomeElectronics homeElectronicsEntity : homeElectronics) {
            homeElectronicsEntity.off();
        }
    }
}