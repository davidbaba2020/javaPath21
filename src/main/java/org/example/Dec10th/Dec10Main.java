package org.example.Dec10th;

public class Dec10Main {

    public static void main(String[] args) {
        Animal a1 = new Animal();

        String catSound = a1.renderSoundOutside("Meow");


        System.out.println(catSound);

        AnimalService a = new AnimalService() {
            @Override
            public String sound2(String soundMade) {
                return null;
            }
        };


    }
}
