package fr.cbon.app.aliments;

import java.util.ArrayList;

public class BaseAliments {
    protected ArrayList<Aliment> listBaseAliment = new ArrayList<>();

    public ArrayList<Aliment> getListBaseAliment() {
        return this.listBaseAliment;
    }

    public BaseAliments() {
        Aliment a1 = new Aliment("A");
        Aliment a2 = new Aliment("B");
        Aliment a3 = new Aliment("C");
        Aliment a4 = new Aliment("D");
        listBaseAliment.add(a1);
        listBaseAliment.add(a2);
        listBaseAliment.add(a3);
        listBaseAliment.add(a4);
    }
}
