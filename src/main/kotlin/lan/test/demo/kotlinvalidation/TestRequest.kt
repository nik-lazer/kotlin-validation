package lan.test.demo.kotlinvalidation

import javax.validation.constraints.NotNull

data class TestRequest(
        @field:NotNull val id: Int,
        val optionalId: Int?,
        val name: String,
        val optionalName: String?,
        @field:NotNull val value: Double,
        val optionalValue: Double?,
        val nested: NestedRequest,
        val optionalNested: NestedRequest?
)

data class NestedRequest(
        @field:NotNull val nestedId: Long,
        val nestedOptionalId: Long?,
        val nestedName: String,
        val optionalNestedName: String?

)

