package lan.test.demo.kotlinvalidation

data class TestResponse(
        val id: Int,
        val optionalId: Int?,
        val name: String,
        val optionalName: String?,
        val value: Double,
        val optionalValue: Double?,
        val nested: NestedResponse,
        val optionalNested: NestedResponse?
)

data class NestedResponse(
        val nestedId: Long,
        val nestedOptionalId: Long?,
        val nestedName: String,
        val optionalNestedName: String?

)

