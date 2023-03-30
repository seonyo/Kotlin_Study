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

}