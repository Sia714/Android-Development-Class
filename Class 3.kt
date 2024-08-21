fun main(){
    val numbers=arrayOf(1,2,3,4,5)
    val words: Array<String> = arrayOf("Kotlin","Java","OOPS")
    val squares=Array(5){ i -> i * i };//lamba function
    val fn=numbers[0];
    val sw=words[1];
    println("First Number: $fn");
    println("Second Word: $sw");
}

fun main(){
    var numbers=arrayOf(1,2,3,4,5)
    var words: Array<String> = arrayOf("Kotlin","Java","OOPS")
    val squares=Array(5){ i -> i * i };//lamba function
    val fn=numbers[0];
    val sw=words[1];
    println("First Number: $fn");
    println("Second Word: $sw");
    numbers[0]=10
    words[1]="Kotlin"
    println("Modified First Number: $numbers[0]");
    println("Modified Second Word: $words[1]");
}

fun main(){
    var numbers=arrayOf(1,2,3,4,5)
    var words: Array<String> = arrayOf("Kotlin","Java","OOPS")
    val squares=Array(5){ i -> i * i };//lamba function
    val fn=numbers[0];
    val sw=words[1];
    println("First Number: $fn");
    println("Second Word: $sw");
    for(num in numbers){
        println(num)
    }
}

fun main(){
    val numbers=arrayOf(arrayOf(1,2,3,4),arrayOf(5,6,7,8),arrayOf(9,10,11,12))
    for(num in numbers){
        for(n in num){
            print("$n ")
        }
        print("\n")
    }
}

fun main(){
    val x: Int=100
    val y: Long= x.toLong()
    println(y)
}
