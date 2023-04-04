fun main(){
    //인덱스의 값
    var one = Array<Int> (4,{0})
    one[0] = 10
    one[3] = 20
    for(i in one.indices)
        println(one[i])

    var two = Array<IntArray>  (3,{IntArray(4,{2})})
    //row의 index : 0~2
    //col의 index : 0~3
    //초기화는 2로 하라
    two[1][2]=100
    two[2][3]=200

    for(i in two.indices)
        for(j in two[i].indices)
            println(two[i][j])
}