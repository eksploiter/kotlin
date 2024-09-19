// 함수

fun main(args: Array<String>) {
    printStudentInfo("minsoo", 26)
    printStudentInfo("jihee", 25)
    printStudentInfo("eren", 20)

    println(addNum(100, 1000))
}

fun printStudentInfo(name : String, age : Int) : Unit { // <- Unit 같은 경우, 생략이 가능하다.
    println("Student Name : " + name)
    // 문자열 탬플릿을 이용하면 밑에 있는 노란 줄을 없앨 수 있다.
    println("Student Age : " + age)
    println("Welcome!")
}

fun addNum(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}
