fun main(){
    //방이 4개인 일차형 배열을 생성 후 0으로 초기화
    //var 배열명 = Array<데이터 형식>(개수, {초깃값})
    var one = Array<Int> (4,{0})
    one [0] = 10
    one [3] = 20

    println(one[0])
    println(one[1])
    println(one[2])
    println(one[3])

    //2차원 배열
    var two = Array<IntArray> (3, {IntArray(4)})
    two[0][0]=100
    two[2][3]=200

    println(two[0][0])
    println(two[2][3])
}