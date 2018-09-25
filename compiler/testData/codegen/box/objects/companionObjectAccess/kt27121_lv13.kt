// LANGUAGE_VERSION: 1.3
// IGNORE_BACKEND: JS, JS_IR, JVM_IR

interface A {
    fun test() = ok()

    private companion object {
        fun ok() = "OK"
    }
}

class C : A

fun box() = C().test()
