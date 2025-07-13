package Tasks.Task_07July;

import java.sql.SQLOutput;

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Playable p1 = new Guitar();
        Playable p2 = new Piano();
        p1.play();
        p2.play();
    }
}

interface Playable{
    void play();
}

class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println(" Playing guitar ");
    }
}

class Piano implements Playable{

    @Override
    public void play() {
        System.out.println(" Playing piano. ");
    }
}

