package pl.maniaq.checked;

public enum ConsoleColor {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    YELLOW("\u001B[33m");

    private String color;

    ConsoleColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
