package com.design.patterns.structural.composite;

import com.design.patterns.structural.composite.card.Discover;
import com.design.patterns.structural.composite.card.MasterCard;
import com.design.patterns.structural.composite.card.Rupay;
import com.design.patterns.structural.composite.card.Visa;

public class Application {
    public static void main(String[] args) {
        var rupay = new Rupay();
        var discover = new Discover();
        var visa = new Visa();
        var masterCard = new MasterCard();

        var cardHolder = new CardHolder(rupay, discover);

        cardHolder.showCardDetails();   // Show Rupay and Discover

        var creditCardHolder = new CardHolder(visa, masterCard);
        cardHolder.addCard(creditCardHolder);
        cardHolder.showCardDetails();   // Show Rupay, Discover, Visa and MasterCard

        cardHolder.removeCard(discover);
        cardHolder.showCardDetails();   // Show Rupay, Visa and MasterCard
    }
}
