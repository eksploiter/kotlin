// 반복문 - For

fun main(args: Array<String>) {

    // [+] Range Class - 반복문에 앞서 범위클래스부터
    // IntRange, LongRange, CharRange
    val numRange : IntRange = 1..5 // 1부터 5까지

    println(numRange.contains(3)) // 범위 안에 3이 들어있는가? 있으면 true, 없으면 false
    println(numRange.contains(10))

    println("----------")

    val charRange : CharRange = 'a'..'e'

    println(charRange.contains('z'))
    println(charRange.contains('a'))

    println("==========")

    // 1. For

//    for (i in 1..5) {
//        println(i)
//    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    // 2. While
}