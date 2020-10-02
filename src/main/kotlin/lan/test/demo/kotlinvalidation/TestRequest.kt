package lan.test.demo.kotlinvalidation

data class TestRequest(
        val id: Int,
        val optionalId: Int?,
        val name: String,
        val optionalName: String?,
        val value: Double,
        val optionalValue: Double?,
        val nested: NestedRequest,
        val optionalNested: NestedRequest?
)

data class NestedRequest(
        val nestedId: Long,
        val nestedOptionalId: Long?,
        val nestedName: String,
        val optionalNestedName: String?

)

