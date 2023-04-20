package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class DeckOfCardsTest {
    @Test
    fun test() {
//        ["i", "drink", "water"]	["want", "to"]	["i", "want", "to", "drink", "water"]	"Yes"
//        ["i", "water", "drink"]	["want", "to"]	["i", "want", "to", "drink", "water"]	"No"
        val deckOfCards = DeckOfCards()
        assertThat(deckOfCards.solution(
            arrayOf("i", "drink", "water"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water"))
        ).isEqualTo("Yes")
        assertThat(deckOfCards.solution(
            arrayOf("i", "water", "drink"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water"))
        ).isEqualTo("No")
    }
}