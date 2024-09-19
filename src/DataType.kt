// 자료형
// Data Type

fun main(args: Array<String>) {
    // Byte
    var mByte : Byte = 100
    // 잘 안쓴다.

    // Short
    var mShort : Short = 1000

    // Int
    var mInt : Int = 100000
    // 회색 처리되는 이유는 자료형을 써주지 않아도 알고있다는 뜻이다.
    // 왜냐? 기본형은 Int 이기 때문이다.

    // Long
    var mLong : Long = 100000000L

    // Float
    var mFloat : Float = 1.53f

    // Double
    var mDouble : Double = 1.2654576

    // Characters
    var mChar : Char = 'c' // 글자 하나만
    // 그리고 작은 따옴표를 감지한 순간 character 로 감지한다.
    // String 도 마찬가지

    // String
    var mString : String = "Hello Word!"
    // Char 는 '작은 따옴표', String 은 "큰 따옴표"

    // Booleans
    var mFalse : Boolean = false
    var mTrue : Boolean = true
    // 참, 거짓

    // Arrays
    var mArray : Array<String> = arrayOf("Kotlin", "Is", "Fun") // 0, 1, 2
    println(mArray[0])
    println(mArray.get(1)) // 둘 다 같은거다.
    println(mArray.size)
}