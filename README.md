# Data Structure implementations from Scratch

### What is a Data Structure?
In computer science, a data structure is a data organization, management, and storage format that enables efficient access and modification.[1](https://en.wikipedia.org/wiki/Data_structure)


### Big O Notation
Before we dive into implementing Data Structures we should be familiar with BigO notations which is used to measure the runtime complexity of an algorithm. 
It is really important to understand the BigO concepts for the coding interviews. Make sure you familiarize yourself by calculating BigO runtime for various code examples. 
<b>Definition:</b> BigO represents the runtime complexity of an algorithm. Big O notation defines how time scales with respect to the input variables. 

For example: `O(log n)` <br>
    Where `O` represents the growth rate and `log n` is the math function where `n` is the input.
    

Keep in mind the following rules while determining the runtime for an algorithm:

- Drop any constant in BigO. eg. ``O(2n) = O(n)``
- Add different steps
```kotlin
fun addNumbers(list: List<Int>) //O(n)
fun multiplyNumbers(list: List<Int>) //O(n)

// Total: O(n+n) = O(2n) = O(n) // always drop constant.
``` 
- consider different inputs as different variables. In the below example the function has a nested loop.
```kotlin
fun findCommon(list1, list2) {
    for (i in list1) {
        for(j in list2) {
            if (i == j) {
                commons.add(i)
            }
        }
    }
}
//Runtime: O(n*m) where n is the number of items in list1 and m is the number of items in list2. 
//Note that it can not be described as O(n2) because number of items in different list could be different. 
```
- only consider dominant terms in the runtime calculation. Eg. O(n<sup>3</sup> + n<sup>2</sup>) becomes O(n<sup>3</sup>)
   


















