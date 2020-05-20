package ud.ds

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import preet.ds.BasicStack

@SpringBootApplication
class DsApplication

fun main(args: Array<String>) {

    val stack = BasicStack<String>()

    println("Push 'one', 'two' in the Stack")
    stack.push("one")
    stack.push("two")

    println("Stack Size: ${stack.size()}")
    println("Stack isEmpty: ${stack.isEmpty()}")
    println("Pop item from the Stack: ${stack.pop()}")




}
