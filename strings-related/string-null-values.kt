
fun main(args: Array<String>) {
	var str: String? = "kotlin" // ? means it can be null
	str = null
	println("The string is $str") // The string is null

	println("The string is $(str?.length))
}
