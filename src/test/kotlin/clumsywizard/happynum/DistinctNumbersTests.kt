package clumsywizard.happynum

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DistinctNumbersTests {
    @Test
    fun `number is distinct if number is first iteration of digits`() {
        assertThat(isFirstIteration(1234)).isTrue()
        assertThat(isFirstIteration(0)).isTrue()
        assertThat(isFirstIteration(123)).isTrue()
        assertThat(isFirstIteration(1230)).isFalse()
        assertThat(isFirstIteration(1324)).isFalse()
    }
}
