package preet.ds

interface Stack<T> {
    fun push(t: T)
    fun pop(): T
    fun contains(t: T): Boolean
    fun extract(t: T): T
    fun isEmpty(): Boolean
    fun size(): Int
}
