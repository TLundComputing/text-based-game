package game;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<String> items;

    public Player(String name){
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void acquireItem(String item){
        items.add(item);
    }

    public void loseItem(String item){
        for(int x = 0; x < items.size(); x++){
            if(items.get(x).equalsIgnoreCase(item)){
                items.remove(x);
                break;
            }
        }
    }

    public void listItems(){
        System.out.println("You have the following items:");
        if(items.size() == 0){
            System.out.println("You have no items");
        } else {
            items.forEach(item -> {
                System.out.println("* " + item);
            });
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
