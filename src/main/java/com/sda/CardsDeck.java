package com.sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-08-29.
 */
public class CardsDeck {
    private List<Card>  deck;

    public CardsDeck(){
        deck = new ArrayList<>();
        List<Suit> suits = new ArrayList<>();
        suits = Arrays.asList(Suit.SPADES, Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS);
        List<String> rank = new ArrayList<>();
        rank = Arrays.asList( "two", "three", "four", "five",
                "six", "seven", "eight" ,"nine", "ten", "jack", "queen", "king", "ace");


        for (Suit suit: suits  ) {
            for (String r: rank  ) {
                deck.add(new Card(suit,r));
            }
        }
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }



}
