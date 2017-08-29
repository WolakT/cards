package com.sda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-08-29.
 */

public class CardsDeckTest {

    @Test
    public void shouldHave52CardsInDeck(){
        CardsDeck deck = new CardsDeck();
        int expected = 52;
        Assert.assertEquals(expected, deck.getDeck().size());
    }
}