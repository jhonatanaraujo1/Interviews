package com.example.basicpolimorphism;

import com.example.basicpolimorphism.Services.AnimalsActService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicPolimorphismApplication {

    public static void main(String[] args) {
        AnimalsActService animalsActService = new AnimalsActService();
        animalsActService.mammalsAct();
        animalsActService.birdAct();
        animalsActService.fishAct();
        animalsActService.reptileAct();
    }
}
