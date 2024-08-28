fun sum(a:Int=10, b:Int=20){//Default Arguments
    val c=a+b
    println(c)
}

fun main(){
    sum(20,50)
    sum()
	
}
//70
//30


fun sum(a:Int, b:Int){
    val c=a+b
    println(c)
}

fun main(){
    sum(20,50)
    sum()
	
}

// No value passed for parameter 'a'.
// No value passed for parameter 'b'.

fun main(args: Array<String>){
    val a=10
    val b=20
    val res=sum(a,b)
    println(res)
}

fun sum(a:Int, b:Int):Int{
    val c=a+b
    return c
}
//30

//convert temp from celcius to farenhite and vice versa

fun main(args: Array<String>){
    
    // val c=readLine()
    // val f=readLine()
    // val resc=rescInput?.toDoubleOrNull()
    // val resf=resfInput?.toDoubleOrNull()
  val c=10
  val f=20
   
    val res=ctf(c)
    println("$c°C equals $res°F\n")
    
    val res2=ftc(f)
    println("$f°F equals $res2°C")
}

fun ctf(c:Double):Double{
    var f=(c * 9/5)
    f+=32
    return f
}
fun ftc(f:Double):Double{
    var c=(f -32)
    c=c*5/9
    return c
}

fun fact(n:Int):Int{
    return if(n<=1)1 else n*fact(n-1)
}
fun main(){
    var y=5;
    println(fact(y))
}

fun fib(n:Int):Int{//do later
    return if(n==0)0 else if(n==1)1 else fib(n-1)+fib(n-2)
}
fun main(){
    var y=4;
    println(fib(y-1))
}


class Student{
    fun result(){
        println("Pending")
    }
}
fun main(){
    var s1=Student();
    s1.result();
}
