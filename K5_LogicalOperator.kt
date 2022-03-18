fun main() {
    val above70 = true
    val knowsPrograming = false

    //  && And operator
    var callForInterview = above70 && knowsPrograming
    println(callForInterview)  // will print false, if all condition is not full filed.

    // || OR operator
    callForInterview = above70 || knowsPrograming

    println(callForInterview)


    // Short Circuit
    var i = 10
    var j = 11
    var result = i == 10 || j++ == 11 // it will miss j, because of OR operators function.
    // Change i == 11 in the condition you will see short circuit.
    println(i) // 10
    println(j)  // 11


}
