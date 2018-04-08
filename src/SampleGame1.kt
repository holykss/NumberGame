import java.util.*

object SampleGame1 {

    @JvmStatic
    fun main(args: Array<String>) {
        println("### 숫자 게임을 시작합니다.")
        println(">> 내가 생각한 숫자를 맞춰주세요.")

        val keyboard = Scanner(System.`in`)
        val number = Random().nextInt(10)
        var count = 5

        do {
            val input = keyboard.nextLine().toInt()

            if (number < input) {
                println(">> 그것보다 작아요.")
                count = count - 1
            }
            if (number > input) {
                println(">> 그것보다 커요.")
                count = count - 1
            }
            if (number == input) {
                println(">> 짝짝짝 정답입니다.")
                break
            }

            println(">> 남은 횟수는 $count 입니다.")

        } while (count > 0)

        println(">> 정답은 $number, 점수는 ${count*20}점 입니다.")

    }
}