fun main(){
    var one : IntArray = intArrayOf(10,20,30)
    for(i in one.indices){
        println(one[i])
    }

    for(value in one){ //value안에 one을 차례대로 넣기
        println(value)
    }

    var two : Array<String> = arrayOf("하나", "둘", "셋")
    for(i in 0..2 step 1){ // for(int i=0; i<=2; i++)
        println(two[i])
    }

    var k : Int = 0
    while (k < two.size) {
        println(two[k])
        k++
    }

}