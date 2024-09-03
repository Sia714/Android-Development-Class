class Person{
    var name: String
    var age:Int
    constructor(x: String, y:Int){
        this.name=x
        this.age=y
    }
    constructor(x: String){
        this.name=x
        this.age=0
    }
    constructor(){
        this.name="Rahul"
        this.age=32
    }
    fun intro(){
        println("My name is $name and age is $age")
    }
}

fun main(){
    val a=Person("Riya",22)
    a.intro()
    val b=Person()
    b.intro()
    val c=Person("Heena")
    c.intro()
}
//My name is Riya and age is 22
//My name is Rahul and age is 32
//My name is Heena and age is 0


class Person(var name:String,var age:Int){
    constructor(x: String): this(){
        this.name=x
        this.age=0
    }
    
    constructor():this("Rahul",50)
    
    fun intro(){
        println("My name is $name and age is $age")
    }
}

fun main(){
    var a=Person("Riya",22)
    a.intro()
    var b=Person()
    b.intro()
    var c=Person("Heena")
    c.intro()
}
//My name is Riya and age is 22
//My name is Rahul and age is 50
//My name is Heena and age is 0


open class Rectangle(val a:Double, val b:Double){
    fun area():Double{
        return a*b
    }
    open fun display(){
        println("Area of rectangle with dimensions $a * $b is ${area()}")
    }
}
class Square(side: Double): Rectangle(side,side){
    override fun display(){
         println("Area of square with dimensions $a is ${area()}")
    
    }
}
fun main(){
    val myrect=Rectangle(4.0,5.0)
    myrect.display()
    val mysqu=Square(3.0)
    mysqu.display()
}
//Area of rectangle with dimensions 4.0 * 5.0 is 20.0
//Area of square with dimensions 3.0 is 9.0
