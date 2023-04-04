fun main(){
    var arrList = ArrayList<Int>(3)
    arrList.add(10)
    arrList.add(20)
    arrList.add(30)
    arrList.add(40)
    arrList.add(50)

    var sum = 0

    for(num in arrList){ // num : arrList와 같은 것. num안에 arrList를 차례대로 넣어 줌
        sum+=num
    }
    print(sum)
}