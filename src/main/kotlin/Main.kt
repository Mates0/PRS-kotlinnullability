import java.lang.Math.ceil
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val list = mutableListOf<Int?>()
    var sum = 0
    var temp = 0
    while (true) {
        val input = sc.nextLine()
        if (input == "END")
            break
        list.add(input?.toIntOrNull())
    }

    for (i in list.indices)
        if (list[i] == null) {
            for (j in (i + 2)..i - 2)
                if (j != -1 && j != i) temp += list[j]!!
            list[i] = ceil(temp.toDouble() / 4).toInt()
        } else sum += list[i]!!

    println(ceil(sum.toDouble() / list.size))
}