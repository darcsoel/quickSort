import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MainKtTest {
    @Test
    fun test1() {
        val list: List<Int> = intArrayOf(6, 4, 3, 1, 7, 8, 9, 2, 5).toList()
        assertEquals(sort(list), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9).toList())
    }

    @Test
    fun test2() {
        val list: List<Int> = intArrayOf(9, 4, 2, 5, 7, 8, 6, 3, 1).toList()
        assertEquals(sort(list), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9).toList())
    }
}