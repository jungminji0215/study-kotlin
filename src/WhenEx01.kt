// if가 참과 거짓만을 비교할 수 있는 반면
// When은 하나의 변수를 여러개의 값과 비교할수 있다

fun main(){
    doWhen(1)
}

// Any는 어떤 자료형이든 상관없이 호환된다.
// 코틀린의 최상위 자료형이다.
fun doWhen(a: Any){
    when(a){
        1 -> println("1입니다.")
        is Int -> println("정수입니다.")
    }
}