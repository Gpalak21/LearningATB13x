package ex_15_accessModifier.Criminal;

import ex_15_accessModifier.Police.cop;

public class Theif {
    public static void main(String[] args) {
        cop theif = new cop(100);
        theif.gun = 100;
       // theif.canIShoot();
    }
}
