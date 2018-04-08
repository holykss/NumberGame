import java.util.*

object 재희게임 {
    var 누적점수 = 0

    @JvmStatic
    fun main(args: Array<String>) {

        do {
            val 획득점수 = startJayGame()
            누적점수 = 누적점수 + 획득점수

            println("### 방금 획득한 점수는 $획득점수 ")
            println("### 누적 점수는 $누적점수 ")

        } while (true)

    }

    private fun startJayGame(): Int {
        println("### 재희의 게임을 시작합니다.")

        val 어디부터 = 0
        val 어디까지 = 100
        var 남은횟수 = 20
        val 한개당점수 = 100 / 남은횟수

        val 컴퓨터숫자 = 어디부터 + Random().nextInt(어디까지 + 1)
        println("치트>> 내가 생각한 숫자는 $컴퓨터숫자 입니다..")

        do {
            print("컴퓨터>> 내가 생각한 숫자를 맞쳐 주세요.")
            val 입력값 = getUserInput()
            if (입력값 == 컴퓨터숫자) {
                println("컴퓨터>> 축하합니다. 게임에서 이겼습니다. 내가 생각한 숫자는 [$컴퓨터숫자] 입니다.")
                break
            }
            if (입력값 > 컴퓨터숫자) {
                println("컴퓨터>> 그것보다 작습니다.")
            }
            if (입력값 < 컴퓨터숫자) {
                println("컴퓨터>> 그것보다 큽니다.")
            }
        } while (--남은횟수 > 0)

        val 최종점수 = 남은횟수 * 한개당점수
        println("### 점수는 ${최종점수} 점 입니다.")

        println("### 게임 오버")

        return 최종점수
    }

    private fun getUserInput(): Int {
        try {
            return Scanner(System.`in`).nextLine().toInt()
        } catch (e: Throwable) {
            return getUserInput()
        }
    }
}