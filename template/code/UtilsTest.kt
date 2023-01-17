package ${PROJ_GROUP}

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UtilsTest {
    @Test fun testGetMessage() {
        assertEquals("Hello World", MessageUtils.getMessage())
    }
}
