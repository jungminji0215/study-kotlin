fun TypeChange() {
    var a: Int = 1
    // 명시적 형변환 - 개발자가 직접 
    // 암시적 형변환은 코틀린이 지원하지 않음
    var b: Long = a.toLong()
}