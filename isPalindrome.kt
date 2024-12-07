
fun isPalindrome(str: String): Boolean {
    val cleanedStr = str.replace(Regex("[^a-zA-Z0-9]"), "").toLowerCase()
    return cleanedStr == cleanedStr.reversed()
}
fun main() {
    val testStrings = arrayOf(
        "A man",
        "Hello, world!",
        "Madam",
        "Racecar",
        "No lemon, no melon!"
    )

    for (testString in testStrings) {
        println("Is \"$testString\" a palindrome? ${isPalindrome(testString)}")
    }
}


