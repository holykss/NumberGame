import java.util.*

object SampleGame0 {

    @JvmStatic
    fun main(args: Array<String>) {
        println("### 숫자 게임을 시작합니다 ###")

        println(">> 내가 생각한 숫자를 맞춰보세요.")

        val scanner = Scanner(System.`in`)

        val guess = Random().nextInt(10)

        var count:Int = 5

        do  {
            val input = scanner.nextLine().toInt()

            if (guess == input) {
                break
            }

            count = count - 1

            if (guess < input) {
                println(">> 그것보다 작아요.")
            }

            if (guess > input) {
                println(">> 그것보다 커요.")
            }

            println(">> 남은 횟수: $count")
        } while (count > 0)

        if (count > 0) {
            println(">> 짝짝짝! 정답을 맞췄습니다.")
            println(">> 점수는 ${count * 20} 점 입니다.")
        } else {
            println(">> 잉잉잉~ 정답을 찾지 못했어요..")
        }

        println("### 게임을 종료합니다 ###")
    }
}







//아래에 게임 화면이 나와요