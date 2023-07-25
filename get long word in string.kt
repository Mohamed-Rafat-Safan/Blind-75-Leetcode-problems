/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import kotlinx.coroutines.*
fun main() {
      val str :String = "ahmed is an android developer"
    
    if (str.isNullOrBlank())
        println("empty string")
    else
        println(getLongestWord(str))
	
}

fun getLongestWord(str: String?) = str?.split(" ")?.maxByOrNull { it.length } ?: "null"
