package com.sda;

import java.util.*;

/**
 * Created by RENT on 2017-08-29.
 */
public class GameMenager {
    private Stack p1Cards = new Stack<Card>();
    private Stack p2Cards = new Stack<Card>();
    private List<List<Card>> deck;


    public List<List<Card>> shuffle(List<List<Card>> decks){
        for (int i = 0; i < decks.size(); i++) {
            Collections.shuffle(decks.get(i));
        }
        return decks;
    }

    public void divideCards(){
        int counter =0;
        for (List<Card> list: deck      ) {
            for (Card card: list ) {
                if (counter %2 == 0)
                    p1Cards.push(card);
                else p2Cards.push(card);
                counter++;
            }
        }
    }

    public Stack getP1Cards() {
        return p1Cards;
    }

    public Stack getP2Cards() {
        return p2Cards;
    }
}
