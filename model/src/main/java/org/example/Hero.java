package org.example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import lombok.Value;

import java.util.List;

@Value
public class Hero {
    private final List<Creature> creatures;
    BiMap<Artefact,Integer> artefacts = HashBiMap.create();
    //mapa do artefaktow na podstaci,
    //do artefaktow w sakwie - lista?

}
