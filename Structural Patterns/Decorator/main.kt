package Decorator

interface CoffeeMachine {
    fun makeSmallCoffee()
    fun makeLargeCoffee()
}

class NormalCoffeeMachine : CoffeeMachine {
    override fun makeSmallCoffee() = println("Normal: Making small coffee")

    override fun makeLargeCoffee() = println("Normal: Making large coffee")
}

// 데코레이터
class EnhancedCoffeeMachine(val coffeeMachine: CoffeeMachine) : CoffeeMachine by coffeeMachine {

    // 재정의하는 행위
    override fun makeLargeCoffee() {
        println("Enhanced: Making large coffee")
        coffeeMachine.makeLargeCoffee()
    }

    // 확장된 행위
    fun makeCoffeeWithMilk() {
        println("Enhanced: Making coffee with milk")
        coffeeMachine.makeSmallCoffee()
        println("Enhanced: Adding milk")
    }
}

fun main(){
    val normalMachine = NormalCoffeeMachine()
    val enhancedMachine = EnhancedCoffeeMachine(normalMachine)

// 재정의하지 않은 행위
    enhancedMachine.makeSmallCoffee()
// 재정의한 행위
    enhancedMachine.makeLargeCoffee()
// 확장한 행위
    enhancedMachine.makeCoffeeWithMilk()
}