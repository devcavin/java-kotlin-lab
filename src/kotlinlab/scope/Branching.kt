package kotlinlab.scope

fun main() {
    val outer = 10
    @SuppressWarnings("VARIABLE_IS_ALWAYS_TRUE")
    if (outer > 0) {
        val inner = 10
        print(inner)
    } else {
        // beyond the if block
        print(outer)
        // @SuppressWarnings("VARIABLE_IS_OUT_OF_SCOPE_BOUND")
        // print(inner)  // Unresolved reference: inner
    }
// beyond the if-else expression
    print(outer)
    // @SuppressWarnings("VARIABLE_IS_OUT_OF_SCOPE_BOUND")
    // print(inner)  // Unresolved reference: inner
}