
class DefaultGameService: GameService {
    override fun startGame(name: String) {
        println("${name}님 게임을 시작하도록 하겠습니다.")
    }
}