package Adapter

class GoogleWebRequester: WebRequester {

    override fun requestHandler(){
        println("Old Web Requester is called")
    }
}