package lesson16.task1;

public enum Gender {

    MALE("Maskulin"),
    FEMALE("Feminin");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
