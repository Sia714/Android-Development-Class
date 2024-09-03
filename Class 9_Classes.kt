interface Shape{
    fun area():Double
}
open class Rectangle(val a:Double, val b:Double):Shape{
    override fun area():Double{
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
