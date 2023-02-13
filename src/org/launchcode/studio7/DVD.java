package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc {

    private ArrayList<String> leadActors;
    public DVD(String title, String author, String discType, String productionCo, String[] actorArray) {
        super(title, author, discType, productionCo);
        for (int i = 0; i < actorArray.length; i++) {
            leadActors.add(actorArray[i]);
        }
    }

    @Override
    public String toString() {
        return "DVD{" +
                "leadActors=" + leadActors +
                '}';
    }
}
