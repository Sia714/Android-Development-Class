fun main(){
    val a=10
    val b=20
    val res="Sum of $a and $b is ${a+b}"
    print(res)
}
// Sum of 10 and 20 is 30

fun main(){
    val letter:Char
    letter='A'
    print("$letter")
    print('\n')
    print('\$')
    print('\\')
    
}
// A
// $\
fun main(){
    val name:String="""  Sayjan
 Sayjan
 Sayjan
 Sayjan
 Sayjan""";  
    print(name)
}
//  Sayjan
//  Sayjan
//  Sayjan
//  Sayjan
//  Sayjan

fun main(){
    val name:String="""Sayjan
 	Sayjan
 		Sayjan
 			Sayjan
 				Sayjan""";  
    print(name)
}
// Sayjan
//  	Sayjan
//  		Sayjan
//  			Sayjan
//  				Sayjan

fun main(){
    val name:String="""	Sayjan
 Sayjan		Sayjan
 	Sayjan
 				""";  
    print(name)
}
// 	Sayjan
// Sayjan		Sayjan
//  	Sayjan
 				
