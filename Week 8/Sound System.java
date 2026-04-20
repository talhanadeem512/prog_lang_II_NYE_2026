interface SoundMaker {
    void makeSound();
}

class Radio implements SoundMaker {
    public void makeSound() { System.out.println("Radio: playing music."); }
}

class Dog implements SoundMaker {
    public void makeSound() { System.out.println("Dog: barking."); }
}

public class Task2 {
    static void testSound(SoundMaker sm) {
        sm.makeSound();
    }

    public static void main(String[] args) {
        testSound(new Radio());
        testSound(new Dog());
    }
}
