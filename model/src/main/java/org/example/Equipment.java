package org.example;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

public class Equipment {
    List<Artefact> artefacts;

    public Equipment(){
        artefacts = emptyList();
    }

    void addArtefact(Artefact a){
        artefacts.add(a);
    }

}
