import java.util.Date
import java.text.SimpleDateFormat

object ThreadSafeFormatter {

  def format(date: Date): String = {
    val formatter = new SimpleDateFormat("yyyy年MM月dd日E曜日HH時mm分")
    formatter.format(date)
  }

}
