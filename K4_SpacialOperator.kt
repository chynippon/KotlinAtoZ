fun main() {

    println("Increment Operator")

    var i = 10
    i = i + 1 // i++ are same; it will increase 1
    println(i) //should print 11

    var j =1// it will increase number 1
    j++
    println(j) // should print 2

    println("Decrement Operator")

    var a = 20
    a = a -1   //a-- are same; it will decrease 1
    println(a) // should print 19

    var b =5   // it will decrease number 1
    b--
    println(b) // should print 4

    println("Post increment")

    var x = 10
    println(x++) // it did not increase the value now; it will and now just get the command; should print 10
    println(x) // now its did increase the value; should print 11

    var y = 10
    println(++y) // now it will add the number fist than print; should print 11
    println(y) // you will see no change in number; should print 11

    println("Post decrement")

    var w = 10
    println(w--) // it did not decrease the value now; it will and now just get the command; should print 10
    println(w) // now its did decrease the value; should print 9

    var z = 10
    println(--z) // now it will subtract the number fist than print; should print 9
    println(z) // you will see no change in number; should print 9

}

