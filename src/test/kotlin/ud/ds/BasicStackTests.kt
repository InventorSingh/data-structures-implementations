package ud.ds


import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import preet.ds.BasicStack

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BasicStackTests {

    @BeforeAll
    fun setup() {

    }

    @Test
    fun `constructor should create BasicStack`() {
        val stack = BasicStack<String>()
        assertNotNull(stack)
    }

    @Test
    fun `push should add and pop should remove item from stack` () {
        val stack = BasicStack<String>()
        stack.push("first")
        assertEquals("first", stack.pop())
        assertTrue(stack.isEmpty())
    }

    @Test
    fun `stack size should be correct`() {
        val stack = BasicStack<String>()
        stack.push("one")
        stack.push("two")
        assertEquals(2, stack.size())
    }
}
