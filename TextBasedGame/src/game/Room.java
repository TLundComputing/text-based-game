package game;

import java.util.HashMap;

public class Room {

    private final String NAME;
    private final String DESCRIPTION;
    private final HashMap<String, Room> linkedRooms;
    private boolean isLocked;
    private String item;

    public Room(String name, String description, boolean isLocked){
        this.NAME = name;
        this.DESCRIPTION = description;
        this.isLocked = isLocked;
        this.item = "";
        this.linkedRooms = new HashMap<>();
    }

    public void describe(){
        System.out.println(NAME);
        System.out.println("#############");
        System.out.println(DESCRIPTION);
        System.out.println("You can travel:");
        linkedRooms.forEach((key, room) -> {
            if(key.equalsIgnoreCase("Stairs")){
                System.out.println("* via the stairs");
            } else {
                System.out.println("* " + key);
            }
        });
        System.out.println();
    }

    public String getItem(){
        String item = "";
        if(this.item.equals("")){
            System.out.println("No item in this room");
        } else {
            System.out.println("You gathered the item: " + item);
            item = this.item;
            this.item = "";
        }
        return item;
    }

    public void linkRoom(String direction, Room room){
        linkedRooms.put(direction, room);
    }

    public boolean checkLocked(){
        return isLocked;
    }

    public void useKey(){
        isLocked = false;
        System.out.println("The door has unlocked");
    }

}
