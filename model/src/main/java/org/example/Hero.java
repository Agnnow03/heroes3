package org.example;

import lombok.Value;

import java.util.List;

@Value
public class Hero {
    private final List<Creature> creatures;
    private final Equipment heroEquiment = new Equipment();
}
