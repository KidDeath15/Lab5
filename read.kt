import java.io.File

fun main() {

    val fileName = "C:\\Users\\eduar\\Desktop\\CSE408\\untitled\\src\\read.txt"

    val lines: List<String> = File(fileName).readLines()

    lines.forEach { line -> println(line) }
}