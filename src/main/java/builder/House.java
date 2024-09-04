package builder;

public class House {
    private String walls;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    public House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.garage = builder.garage;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", roof=" + roof + ", windows=" + windows + 
               ", doors=" + doors + ", garage=" + garage + "]";
    }
}
