package com.cards.framework.util;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

	private ArrayList<Card> deck, discardDeck;
	
	//Creates a standard 52 card deck
	public Deck() {
		deck = Card.getStandardDeck();
		discardDeck = new ArrayList<Card>();
	}

	//Create a custom deck
	public Deck(Card[] deck){
		this();
		this.deck = new ArrayList<Card>(Arrays.asList(deck));
	}
	
	public void shuffle() {
		//TODO add the shuffline capability
	}

	public Card drawCard() {
		if (deck.size() > 0)
			return deck.remove(0);
		else 
			return null;
	}
	
	public void discardCard(Card card){
		//add the card to the discard pile.
	}

}