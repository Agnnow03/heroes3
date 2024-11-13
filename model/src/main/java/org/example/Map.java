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
    BiMap<Point, Entity> entities = HashBiMap.create();
    BiMap<Point, Hero> players = HashBiMap.create();

    public Map(List<Entity> e, List<Point> location){

    }

    public void addPlayer(Hero p){
        players.put(SPAWN_LOCATION,p);
    }
    public void setPlayerLocation(Hero player,Point p){
        players.put(p,player);
    }

    public void interact(Hero player,Point p) {
        //w metodzie:
        // obsluga sprawdzenia co jest na kliknietej lokalizacji,

        //dwie opcje:

        // czy gracz ma wystarczajaco staminy, zeby przeniesc sie do lokalizacji
        //potwierdzenie przez gracza

        //warunki itp
        //if(entities.containsKey(p))
        //pickUpEntity();
        //interakcja z przedmiotem
        //potwierdzenie przez gracza
    }


}
