/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var current = l1
    var n = ""
    while (current != null) {
        n += (current.`val` ).toString()
        current = current.next
    }
    val number =n.reversed().toBigDecimal()

    var current1 = l2
    var n1 = ""
    while (current1 != null) {
        n1 += (current1.`val` ).toString()
        current1 = current1.next
    }
    val number1 = n1.reversed().toBigDecimal()

    val sum = number1.add(number)
    val result = sum.toString().reversed()

    val dummy = ListNode(result.first().digitToInt())
    var a = dummy
    for (i in 1 until result.length){
        a.next = ListNode(result[i].digitToInt())
        a = a.next!!
    }
    return dummy
    
    }
}
