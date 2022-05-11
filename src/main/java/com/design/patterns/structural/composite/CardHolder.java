package com.design.patterns.structural.composite;

import com.design.patterns.structural.composite.card.Card;

import java.util.ArrayList;
import java.util.List;

public class CardHolder implements Card {
    private final List<Card> cards = new ArrayList<>();

    public CardHolder(Card... cards) {
        this.cards.addAll(List.of(cards));
    }

    public void addCard(Card newCard) {
        cards.add(newCard);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    @Override
    public void showCardDetails() {
        cards.forEach(Card::showCardDetails);
    }
}
