package lan.test.demo.kotlinvalidation

import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class PostController {
    @PutMapping("post")
    fun post(@Valid @RequestBody request: TestRequest): TestResponse {
        return toResponse(request)
    }
}