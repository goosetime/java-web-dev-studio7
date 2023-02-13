package org.launchcode.studio7;

public class CD extends BaseDisc {
    private String genre;

    public CD(String title, String author, String discType, String productionCo, String genre) {
        super(title, author, discType, productionCo);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "CD{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
