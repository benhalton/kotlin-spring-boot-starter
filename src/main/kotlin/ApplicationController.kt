import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping ("/api")
class ApplicationController {

    @RequestMapping ("/kermit")
    fun kermitSays(): KermitResponse {
        return KermitResponse("It's not easy being green")
    }
}

data class KermitResponse (val kermitSays: String = "Hello")