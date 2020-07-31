package clumsywizard.happynum

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HappyNumbersTests {

    @Test
    fun `returns true if is happy number`() {
        assertThat(isAHappyNumber(10L)).isTrue()
    }

    @Test
    fun `returns false if is not happy number`() {
        assertThat(isAHappyNumber(89)).isFalse()
    }

    @Test
    fun `finds all distinct happy numbers in a range`() {
        assertThat(countDistinctHappyNumbers(1000000)).isEqualTo(711)
    }
}
