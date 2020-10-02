package lan.test.demo.kotlinvalidation

fun toResponse(request: TestRequest) =
        TestResponse(
                id = request.id,
                optionalId = request.optionalId,
                name = request.name,
                optionalName = request.optionalName,
                value = request.value,
                optionalValue = request.optionalValue,
                nested = toResponse(request.nested)!!,
                optionalNested = toResponse(request.optionalNested)
        )

fun toResponse(nested: NestedRequest?) =
        nested?.let {
            NestedResponse(
                    nestedId = nested.nestedId,
                    nestedOptionalId = nested.nestedOptionalId,
                    nestedName = nested.nestedName,
                    optionalNestedName = nested.optionalNestedName
            )
        }