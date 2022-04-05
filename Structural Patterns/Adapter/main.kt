package Adapter



fun main(){
    // old code
    WebClient(GoogleWebRequester()).doWork()
    // new Code
    // 새로운 리퀘스터가 추가되어도 클라이언트 코드에 영향을 주지 않음.
    WebClient(WebAdapter(NetflixWebRequester())).doWork()
}