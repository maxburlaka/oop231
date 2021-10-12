package oop

class Matrix() {

    fun matrix() {

        val a: Array<IntArray> = Array(3) {
            IntArray(4) { 0 }
        }
        val n = a.size
        val m = a[0].size

        println("Створена матриця:")
        for (i in 0 until n) {
            for (j in 0 until m) {
                a[i][j] = (Math.random() * 10)
                    .toInt()
                print(" ${a[i][j]}")
            }
            println()
        }

        println()
        println("Та ж сама матриця помножена на 2:")
        val b: Array<IntArray> = Array(3) {
            IntArray(4) { 0 }
        }
        val n1 = b.size
        val m1 = b[0].size

        for (i in 0 until n1) {
            for (j in 0 until m1) {
                b[i][j] = (Math.random() * 10)
                    .toInt() * 2
                print(" ${b[i][j]}")
            }
            println()
        }

        println()
        println("Сума матриць:")
            val c: Array<IntArray> = Array(3) {
                IntArray(4) { 0 }
            }
        val n2 = c.size
        val m2 = c[0].size

            for (i in 0 until n2) {
                for (j in 0 until m2) {
                    c[i][j] = a[i][j] + b[i][j]
                    print(" " + c[i][j])
                }
                println()
            }
        }
    }

fun main() {

    val m1 = Matrix()
    m1.matrix()
}