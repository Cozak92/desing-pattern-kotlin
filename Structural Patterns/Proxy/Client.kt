import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

fun main() {
//    val gameServiceProxy1 = GameServiceProxy()
//    gameServiceProxy1.startGame()

    // 프록시 객체에 여러가지 일을 반복적으로 작업해야 한다면 동적 프록시 객체를 만드는것이 좋다.

    val gameServiceProxy2 = Proxy.newProxyInstance(
        GameService::class.java.classLoader, // 클래스 로더
        arrayOf(GameService::class.java), // 인터페이스
        InvocationHandler { proxy, method, args ->
            println("시작 준비")
            // method.invoke(DefaultGameService(), args)
            println("method : ${method.name}, args : ${args?.joinToString()}")
            method.invoke(DefaultGameService(), *args)
            println("시작 완료")
        }// proxy( 자기 자신 ), method( 실행된 함수 정보 ), args( 함수 실행에 사용된 인자들 )
        ) as GameService
    gameServiceProxy2.startGame("신승혁")

}
