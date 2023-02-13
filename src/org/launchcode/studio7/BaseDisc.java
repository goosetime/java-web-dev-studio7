package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseDisc {
    private String title;
    private String author;
    private String discType;
    private String productionCo;
    private ArrayList<File> files;

    public BaseDisc(String title, String author, String discType, String productionCo) {
        this.title = title;
        this.author = author;
        this.discType = discType;
        this.productionCo = productionCo;
    }

    @Override
    public String toString() {
        return "hey";
    }

    public int getSpaceUsed() {
        return 42;
    }

    public int getSpaceAvailable() {
        return 42;
    }

    public String getFormattedFiles() {
        return "yeah";
    }

}
