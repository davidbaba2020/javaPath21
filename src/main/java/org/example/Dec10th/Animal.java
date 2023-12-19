package org.example.Dec10th;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Animal implements AnimalService{
    private String name;
    private int noOfEyes;



    public String renderSoundOutside(String animalSound) {
       return sound(animalSound);
   }
    private String sound (String sound) {
        return sound;
    }

    @Override
    public String sound2(String soundMade) {
        return sound(soundMade);
    }

    @Override
    public String sound3(String soundMade) {
        return AnimalService.super.sound3(soundMade);
    }
}
