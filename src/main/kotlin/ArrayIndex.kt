fun main(){
    //인덱스의 값
    var one = Array<Int> (4,{0})
    one[0] = 10
    one[3] = 20
    for(i in one.indices)  //indices는 index의 복수형. 반복문이 처음 시작되면 i는 0이 되고 그 다음은 1... 쭉 이렇게 됨
        println(one[i])

    var two = Array<IntArray>  (3,{IntArray(4,{2})})
    //row의 index : 0~2
    //col의 index : 0~3
    //초기화는 2로 하라
    two[1][2]=100
    two[2][3]=200

    for((i,row) in two.withIndex())  {  //two.withIndex는 행에 대한 것. 한 행에 대한 정보를 반환받을 수 있다. i는 index 번호와 row는 객체참조값
        for((j, col) in row.withIndex()) { //j는 열의 처음 시작 번호, col은 j열에 해당하는 값
            print("($i. $j) = $col\t")  //$는 변수 안에 있는 값을 출력하는 것
        }
        println()
    }

    var three : IntArray = intArrayOf(1,2,3)  //three라는 배열에 값을 1,2,3을 차례대로 초기화시킴


}