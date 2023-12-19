package org.example.Dec10th;

@FunctionalInterface
public interface AnimalService {
    String sound2(String soundMade);
    default String sound3(String soundMade) {
     return s(soundMade);
    }

    static void d() {

    }

    private String s (String s) {
        return s;
    }

}
