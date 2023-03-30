fun main(){
    var var1 : Int = 10
    var var2 : Float = 10.1f
    var var3 : Double = 10.2
    var var4 : Char = '안'
    var var5 : String = "안드로이드"

    println(var1)
    println(var2)
    println(var3)
    println(var4)
    println(var5)

    //var은 변수타입, val은 상수타입이다

    var myVar : Int = 100
    myVar = 200 //정상

    val myVal : Int = 100
    //myVal = 200 ---오류

    var a : Int = "100".toInt() //String을 int로 형변환
    var b : Double = "100.123".toDouble() //Stirng을 Double로 형변환

    //코틀린은 기본적으로 변수에 null값을 넣지 못함. 변수를 선언할 때 데이터 형식 뒤에 ?를 붙어야 null 대입 가능
    //var notNull : Int = null  ---- 애러 발생
    var okNull : Int? = null

    //변수가 null값이 절대 아니라고 표시해야 하는 경우는 !!로 나타냄
    var ary = ArrayList<Int> (1) //1개짜리 배열 리스트 추가
    ary!!.add(100) //100이라는 값을 추가

}