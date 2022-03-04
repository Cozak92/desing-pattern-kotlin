//class GameServiceProxy: GameService {
////    private lateinit var gameService: GameService
//
//    // 원조 객체가 바뀌지 않는다면 다음과 같이 구현 가능
//    private val gameService: GameService by lazy {
//        DefaultGameService()
//    }
//
//    override fun startGame() {
//        println("프록시 호출 시작")
//        // if(!::gameService.isInitialized) gameService = DefaultGameService() // 게임 서비스는 계속 바뀔 수 있음
//
//        // 인증처리나 리턴 값이 있다면 클라이언트를 위한 값으로 조립 가능
//
//        gameService.startGame()
//        println("객체 호출 완료")
//    }
//}