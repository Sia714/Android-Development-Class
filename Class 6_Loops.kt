fun main(){
//     FOR LOOP
    
    for(i in 1..5){            // RANGE INCLUSIVE
        println("Number: $i")
    }
    
    println("")
    
    for(i in 1 until 5){       //UPPER END EXCLUDED
        println("Number: $i")
    }
    
    println("")
    
    for(item in 5 downTo 1){   //REVERSE LOOP
        println("Number: $item")
    }
    
    println("")
    
    for(item in 5 downTo 1 step 2){  //REVERSE WITH STEP SIZE
        println("Number: $item")
    }
    
    println("")
    
    val fruits= listOf("Apple","Banana","Cherry")   //ITERATING A LIST
    for(fruit in fruits){
        println("Fruit: $fruit")
    }
    
    println("")
    
    for(index in fruits.indices){   //ITERATING INDICES OF LIST
        println("Fruit at index $index is ${fruits[index]}")
    }
    
    
//     WHILE LOOP
    
	var i=5
    while(i>0){
        println("Value: $i")
        i--
    }
    
    var j=1
    while(j<6){
        println("Value: $j")
        j++
    }
    
    
//     DO WHILE LOOP

	var j=5
    do{
        println("Value: $j")
        j--
    }
    while(j>0)
    
    println("")
    
    var i=1
    do{
        println("Value: $i")
        i++
    }
    while(i<6)
}
