package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapTest {

    @Test
    void shouldPickUpArtefact(){
        Artefact a1 = new Artefact();
        Point a1Location = new Point(2,2);
        Map map = new Map(List.of(a1),List.of(a1Location));
        Hero player = new Hero(emptyList());
        map.addPlayer(player);
        map.setPlayerLocation(player,new Point(2,2));
        // zainicjalizowanie mapy, ustawienie lokalizacji bohatera 2,2, artefaktu na 2,2

        map.interact(player,new Point(2,2)); // tutaj ruch gracza
                            //gracz klika na pole na ktorym sie znajduje,
                            //a na nim jest artefakt
                            //przez co podniesie artefakt

        assertTrue(player.getArtefacts().containsKey(a1));
        assertFalse(map.getEntities().containsKey(a1));
    }

}
