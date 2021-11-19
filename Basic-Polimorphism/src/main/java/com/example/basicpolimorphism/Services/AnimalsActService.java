package com.example.basicpolimorphism.Services;


import com.example.basicpolimorphism.model.Bird;
import com.example.basicpolimorphism.model.Fish;
import com.example.basicpolimorphism.model.Mammal;
import com.example.basicpolimorphism.model.Reptile;
import org.springframework.stereotype.Service;

@Service
public class AnimalsActService {

    public void mammalsAct() {
        Mammal m = new Mammal();
        m.setColorFur("Brown");
        m.setAge(15);
        m.setWeight(123.45f);
        m.move();
        m.eat();
        m.sound();
    }

    public void birdAct() {
        Bird b = new Bird();
        b.setFeatherColor("Blue");
        b.setAge(1);
        b.setWeight(2.4f);
        b.move();
        b.createHome();
        b.eat();
        b.sound();
    }

    public void fishAct() {
        Fish f = new Fish();
        f.setScaleColor("Red");
        f.setAge(2);
        f.setWeight(4.2f);
        f.move();
        f.eat();
        f.sound();
        f.bubbles();

    }

    public void reptileAct() {
        Reptile r = new Reptile();
        r.setScaleColor("gray");
        r.setAge(230);
        r.setWeight(923.09f);
        r.move();
        r.eat();
        r.sound();
    }
}
