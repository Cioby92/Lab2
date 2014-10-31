package Packets.AbstractClasses;

import Packets.Interfaces.IAnimal;

/**
 * Created by Ciobotaru on 31.10.2014.
 */
public abstract class Mamifer implements IAnimal {
    String specie;
    int nrPicioare;

    public void getSpecie() {
        System.out.print(specie);

    }

    public void getNrPicioare() {
        System.out.print(nrPicioare);
    }

    public abstract void getnume();

    //ramane de implementat in clasa ce va mosteni aceasta clasa metoda setnume() din interfata IAnimal


}
