package ex_15_accessModifier.Police;

public class cop {
    public int gun ;
    String iCard;

    public cop(int bullet){
        this.gun = bullet;
    }

    void canIShoot(){
        System.out.println("Yes you can!");
    }
}
