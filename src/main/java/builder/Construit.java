package builder;

public class Construit {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .setWalls("Brick Walls")
                .setRoof("Metal Roof")
                .setWindows("Double-pane Windows")
                .setDoors("Wooden Doors")
                .build();

        System.out.println(house);
    }
}