import kotlin.test.assertEquals

class KotlinSingleton {
    // 선언은 간단하게
    object Singleton {}

    // 사용할때는 별도의 생성자 호출 없이
    val singleton = Singleton
}

class Cake(val flavor: String) {
    fun printCake() {
        println(flavor)
    }
    companion object {
        fun strawberry(): Cake {
            return Cake("딸기")
        }

        fun cheese(): Cake {
            return Cake("치즈")
        }

        fun choco(): Cake {
            return Cake("초코")
        }
    }
}

fun main(args: Array<String>) {
    val factory: Cake.Companion = Cake.Companion  // 익명의 companion object를 가리킴
    factory.strawberry().printCake()
    val factory2: Cake.Companion = Cake    // Cake는 companion object, Cake()는 instance!
    factory2.cheese().printCake()
    val factory3: Cake.Companion = Cake
    println(factory3.choco())
    println(factory2.cheese())
    println(factory.strawberry())
    factory3.choco().printCake()
}