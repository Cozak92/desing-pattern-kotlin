package Adapter

class WebClient(private val webRequester:WebRequester) {

    fun doWork(){
        webRequester.requestHandler()
    }
}