package org.example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Map {

    public final static int WIDTH = 20;
    public final static int HEIGHT = 20;

    public final static Point SPAWN_LOCATION = new Point(0,0);

    BiMap<Entity, Point> entities = HashBiMap.create();
    BiMap<Hero, Point> players = HashBiMap.create();

    public Map(List<Entity> e, List<Point> location){
        for (int i = 0; i < e.size(); i++) {
            entities.put(e.get(i),location.get(i));
        }
    }

    public void addPlayer(Hero player){
        players.put(player,SPAWN_LOCATION);
    }
    public void setPlayerLocation(Hero player,Point p){
        players.put(player,p);
    }

    public void interact(Hero player,Point p) {
        //w metodzie:
        // obsluga sprawdzenia co jest na kliknietej lokalizacji,

        //dwie opcje:

        // czy gracz ma wystarczajaco staminy, zeby przeniesc sie do lokalizacji
        //potwierdzenie przez gracza
        setPlayerLocation(player,p);
        //ITP
        //warunki itp
        //if(entities.containsKey(p))
        //pickUpEntity();
        //interakcja z przedmiotem
        //potwierdzenie przez gracza
    }


}
