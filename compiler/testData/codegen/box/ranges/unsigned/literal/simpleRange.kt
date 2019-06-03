// KJS_WITH_FULL_RUNTIME
// TODO: muted automatically, investigate should it be ran for JVM_IR or not
// IGNORE_BACKEND: JVM_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<UInt>()
    for (i in 3u..5u) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for 3u..5u: $list1"
    }

    val list2 = ArrayList<UInt>()
    for (i in 3.toUByte()..5.toUByte()) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for 3.toUByte()..5.toUByte(): $list2"
    }

    val list3 = ArrayList<UInt>()
    for (i in 3.toUShort()..5.toUShort()) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for 3.toUShort()..5.toUShort(): $list3"
    }

    val list4 = ArrayList<ULong>()
    for (i in 3uL..5uL) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<ULong>(3u, 4u, 5u)) {
        return "Wrong elements for 3uL..5uL: $list4"
    }

    return "OK"
}