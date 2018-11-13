fun main(args: Array<String>) {
	var x = 4
	var case1 = 7..9

	when(x) {
		1 -> println("ONE")
		2, 3 -> println("TWO or THREE")
		in 4..6 -> println("in the range of 4 to 6")
		in case1 -> println("case1 in the range 7 to 9")
		else -> {	println("else statement replacing default")
			}
	}
}
