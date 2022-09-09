package com.example.telecom.paris.services.processor;

import com.example.telecom.paris.models.Promotion;

public class Processor {
    public static void main(String[] args) {

        Promotion promotion = new Promotion();

        promotion.add("paul", "karl");
        promotion.add("gilles", "edison");
        promotion.add("marc", "Thales");
        promotion.add("eric", "Thomas");
        promotion.add("amaury", "belloit");
        promotion.add("julien", "king");
        promotion.printToConsole();
    }
}