package entities.settings;

public enum Spaceship {

    TYPE_A("src/resources/images/spaceship_A.png")
    ,TYPE_B("src/resources/images/spaceship_B.png")
    ,TYPE_C("src/resources/images/spaceship_C.png")
    , TYPE_D("src/resources/images/spaceship_D.png");

    private final String imagePath;

    Spaceship(String imagePath) {
        this.imagePath = imagePath;
    }
}
