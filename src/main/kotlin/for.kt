fun main(){
    //for (변수 in 시작..끝 step 증가량)
    for(i in 0..10 step 1){
        println(" $i ")
    }

    var arr = intArrayOf(1,2,3)
    //for(변수 in 배열명.indices)
    for(i in arr.indices){
        println(arr[i])
    }

    println()
    var leng =5
    for(i in 1..leng)
        print("$i / ")

    println()
    for (i in 1 until leng)  //until을 사용하면 맨 마지막 값은 포함하지 않는다
        print("$i |")
}