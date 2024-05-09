Class: Card
Purpose: Represents a playing card with a rank and suit.
Fields:
suits: Static array holding the names of suits ("Hearts", "Diamonds", "Clubs", "Spades").
ranks: Static array holding the names of ranks from "Ace" to "King".
Methods:
Constructor(int rank, String suit): Initializes a card with a specific rank and suit.
getRank(): Returns the rank of the card.
getSuit(): Returns the suit of the card.
toString(): Returns a string representation of the card (e.g., "Ace of Spades").
compareTo(Card other): Compares this card with another based on rank and, if necessary, suit.
equals(Object obj): Checks if this card is equal to another based on rank and suit.
Class: Deck
Purpose: Manages a deck of playing cards with functionalities to manipulate and interact with the deck.
Fields:
Deck: A Vector holding the cards in the deck.
Methods:
Constructor(): Initializes the deck to hold up to 52 cards.
createDeck(): Fills the deck with a standard set of 52 playing cards.
displayMenu(): Displays an interactive menu to the user for various deck operations.
printDeck(): Prints all cards currently in the deck.
shuffleDeck(): Shuffles the cards in the deck.
drawCard(): Draws and removes the top card from the deck.
emptyDeck(): Clears all cards from the deck.
printCard(): Prints a card from the deck based on a user-specified index.
compareCard(): Compares two cards from the deck based on user-specified indices.
sameCard(): Checks if two cards at specified indices are the same.
findCard(): Searches for a card in the deck by rank and suit specified by the user.
dealHand(): Deals a hand of five cards from the deck.
Class: Main
Purpose: The entry point of the program that sets up the card deck and starts the interactive menu.
Method:
main(String[] args):
Purpose: Initializes the Deck object, creates the deck of cards, and displays the operational menu.
Description: This method serves as the starting point for managing the deck of cards through an interactive text-based menu.

