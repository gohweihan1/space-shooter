package entities.settings;

public enum Preferences {

    INSTANCE("Player avatar preference", Spaceship.TYPE_A);

    private String name;
    private Spaceship spaceship;

    private Preferences(String name, Spaceship spaceship) {
        this.name = name;
        this.spaceship = spaceship;
    }
}
