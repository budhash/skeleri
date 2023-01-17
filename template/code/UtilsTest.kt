package ${PROJ_GROUP}

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UtilsTest {
    @Test
    fun testGetMessage() {
        assertThat(Utils.getMessage()).isEqualTo("Hello World")
    }
}
