package com.sda;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by RENT on 2017-08-29.
 */
public class GameMenagerTest {


    private CardsDeck deck;

    @Before
    public void setUp(){
        deck = new CardsDeck();
    }

    @Test
    public void shouldShuffleTheDeckOfCards(){
        GameMenager gameMenager = new GameMenager();
        List<List<Card>> shuffledDeck = new ArrayList<>();

        int counter=0;
//        Assert.fail();
        for (int i = 0; i < shuffledDeck.size(); i++) {
                shuffledDeck.add(deck.getDeck());
              shuffledDeck = gameMenager.shuffle(shuffledDeck);

            if(Objects.equals(deck.getDeck().get(i),shuffledDeck.get(i))){
                counter ++;
            }
        }

        Assert.assertTrue(counter<5);
//        Assert.assertEquals(shuffledDeck.get(1), deck.getDeck().get(1));
//        Assert.assertFalse(deck.getDeck(),shuffledDeck());

    }

    @Test
    public void shouldDivideCardsEqually(){
        GameMenager manager= new GameMenager();

        Assert.assertEquals(manager.getP1Cards().size(),manager.getP2Cards().size());
    }

}