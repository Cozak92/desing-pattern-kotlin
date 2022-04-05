package Adapter

class WebAdapter(private val fancyRequester: NetflixWebRequester) : WebRequester {

    override fun requestHandler() {
        fancyRequester.fancyRequestHandler()
    }
}