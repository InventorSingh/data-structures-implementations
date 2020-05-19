package preet.ds

import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

class BasicStack<T> : Stack<T> {
    // private since we only want to expose apis
    private var stackPointer = 0
    //Make if private since we wouldn't want it to be accessible outside of this class.
    private val items = ArrayList<T>()

    /**
     * Runtime Complexity O(1)
     */
    override fun push(t: T) {
        items.add(stackPointer++, t)
    }

    /**
     * Runtime Complexity O(1)
     */
    override fun pop(): T {
        stackPointer--
        if (stackPointer < 0) {
            stackPointer = 0
            throw IllegalStateException("Stack is empty!")
        }
        return items[stackPointer]
    }

    /**
     * Complexity is O(n) since we would loop through the whole array if the item is found at last index or not found at all.
     */
    override fun contains(t: T) : Boolean {
        var found = false
        for (item in items){
            if (item == t)
                found = true
        }
        return found
    }

    override fun extract(t: T) : T {
        while (stackPointer == 0) {
            val item = this.pop()
            if(item == t)
                return item
        }
        throw IllegalArgumentException("Given item not found in the stack!!")
    }

    override fun isEmpty(): Boolean {
        return stackPointer <= 0
    }

    override fun size(): Int {
        return stackPointer
    }
}