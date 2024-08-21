fun main() {
    var a=40
    print(a)
    var try=20
    print(20)
}



fun main(args:Array<String>) {
    var a=40
    print(a)
    var `try`=20
    print(`try`)
}



fun main(args:Array<String>) {
    var a=40
    a=50
    val `try`=20
    `try`=21
}


fun main(args:Array<String>) {
    var a=40// intitialised but not defined
    var b:Int// defined but not initialised
    print(a)    
}


class Person{
    var kotlin="hello"
    fun main(args:Array<String>) {
        print(kotlin)
	}
}  
//Exception in thread "main" java.lang.IllegalArgumentException: No main method found in project
at com.compiler.server.compiler.components.KotlinCompiler.run$lambda$3 (KotlinCompiler.kt:67) at com.compiler.server.compiler.components.KotlinCompiler.execute$lambda$15 (KotlinCompiler.kt:148) at com.compiler.server.compiler.components.CliUtilsKt.usingTempDirectory (CliUtils.kt:120)


class Person{
    var kotlin="hello"
    fun displayInfo() {
        print(kotlin)
	}
}  
fun main(){
    val Per=Person()
    Per.displayInfo()
}
