package lan.test.demo.kotlinvalidation

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class TestController {
    @PostMapping("post")
    fun post(@Valid @RequestBody request: TestRequest): TestResponse {
        return TestResponse(
                id = request.id,
                optionalId = request.optionalId,
                name = request.name,
                optionalName = request.optionalName,
                value =  request.value,
                optionalValue = request.optionalValue,
                nested = toResponse(request.nested)!!,
                optionalNested = toResponse(request.optionalNested)
        )
    }

    fun toResponse(nested: NestedRequest?) =
            nested?.let {
                NestedResponse(
                        nestedId = nested.nestedId,
                        nestedOptionalId = nested.nestedOptionalId,
                        nestedName = nested.nestedName,
                        optionalNestedName = nested.optionalNestedName
                )
            }
}