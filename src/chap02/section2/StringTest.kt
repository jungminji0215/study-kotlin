package chap02.section2

fun main(){
    // val : 선언시에만 초기화 가능!
    // 중간에 값을 변경할 수 없음
    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")
}