import java.util.*

object Game {

    @JvmStatic
    fun main(args: Array<String>) {

        println("## 숫자 맞추기 게임을 시작합니다.")

        val answer = Random().nextInt(10)

        val scanner = Scanner(System.`in`)


        var count = 10

        do {
            var num = scanner.nextLine().toInt()

            println("## 입력한 숫자는 $num")

            if (num == answer) {
                println(">> 정답입니다.")
                break
            }
            if (num < answer) {
                println(">> 그것보다 큽니다.")
            }
            if (num > answer) {
                println(">> 그것보다 작습니다.")
            }

            count = count - 1
        } while(count > 0)

        println("## 점수는 ${count * 10}.")

        println("## 게임을 종료합니다.")

    }
}