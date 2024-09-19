// 스트링 템플릿
// String template

fun main(args: Array<String>) {
    /**
     * String Template
     */

    val price = 1000;
    val tax = 100

    val originalPrice = "The original price is $price"
    // 값을 표현하고 싶으면 $표시 후에 변수명을 입력해준다.
    val taxPrice = "The tax price is ${price + tax}"
    // 값 뿐만 아니라 계산이 필요하면 중괄호를 열고 그 속에 계산을 하면 된다.

    println(originalPrice)
    println(taxPrice)
}