fun main(){
    var count : Int = 85
    if (count >= 90) {
        println("if문 : 합격 (장학생)")
    }
    else if(count > 60){
        println("if문: 합격")
    }
    else {
        println("if문: 불합격")
    }

    //when은 switch문 같은 것
    var jumsu1 : Int = (count / 10) * 10
    when (jumsu1){
        100 -> println("when문: 합격(장학생)")
        90 -> println("when문: 합격(장학생)")
        80,70,60-> println("when: 합격")
        else -> println("when문: 불합격")
    }

    var jumsu2 : Int = count
    when (jumsu2){
        in 90..100 -> println("when문: 합격(장학생)")
        in 60..100 -> println("when문: 합격")
        else -> println ("when문: 불합격")
    }
}