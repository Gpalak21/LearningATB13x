package ex_15_accessModifier;

import org.w3c.dom.ls.LSOutput;

public class Lab044_oops_AM {
}

class Father{
    private int gold=10;
    int car = 1;
    public int bhk3 = 1;
}

class son extends Father{
    void weCanUse(){
        System.out.println(car);
        System.out.println(bhk3);
    }
}
