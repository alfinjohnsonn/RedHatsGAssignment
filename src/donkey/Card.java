/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donkey;

/**
 *
 * @author alfin
 */
public class Card 
{
    private String suit;
    private int value;
    private boolean played;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
        this.played = false;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }
}
