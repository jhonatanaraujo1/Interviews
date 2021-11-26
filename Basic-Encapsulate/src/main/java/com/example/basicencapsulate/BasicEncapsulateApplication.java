package com.example.basicencapsulate;

import com.example.basicencapsulate.model.ControlRemote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicEncapsulateApplication {

    public static void main(String[] args) {
        ControlRemote c= new ControlRemote();
        c.turnOn();
        c.upVolume();
        c.downVolume();
        c.downVolume();
        c.onMute();
        c.ofMute();
        c.play();
        c.pause();
        c.openMenu();
        c.closeMenu();
        c.turnOff();
    }

}
