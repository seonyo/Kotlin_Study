fun main(){
    var myCar1 : Car = Car("빨강", 0)

    var myCar2 : Car = Car("파랑", 0)


    var myCar3 : Car = Car("초록", 0)


    myCar1.upSpeed(50)
    println("자동차1의 색상은 " + myCar1.color+ "이며, 속도는 "+ myCar1.speed +"km 입니다.");


    myCar2.upSpeed(20)
    println("자동차1의 색상은 " + myCar2.color+ "이며, 속도는 "+ myCar2.speed +"km 입니다.");

    myCar3.upSpeed(250)
    println("자동차1의 색상은 " + myCar3.color+ "이며, 속도는 "+ myCar3.speed +"km 입니다.");

}

class Car{
    var color : String =""
    var speed : Int = 0

    constructor(color: String, speed: Int) {
        this.color = color
        this.speed = speed
    }

    constructor(speed : Int) { //오버로딩
        this.speed=speed
    }

    constructor(){ //기본생성자

    }
    fun upSpeed (value : Int){  //메소드, int value와 같은 뜻 이렇게 쓰는 것. 매개변수는 자료형만 쓰는 것 var 생략
        if (speed+value >= 200)
            speed = 200
        else
            speed += value
    }

    fun downSpeed(value : Int){  //메소드
        if(speed - value <=0)
            speed = 0
        else
            speed -= value
    }

}