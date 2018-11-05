
fun main(arga Array<String>) {
	var i: Int
	for (i in 1..5) {
		println("Value of i is: $i")
	}

	for (i in 5 downTo 1) {
		println("using downTo, Value of i is: $i")
	}

	for (i in 5 downTo 1 step 2) {
		println("with step as 2, Value of i is: $i")
	}
}
