
fun main(args: Array<String>) {
	var a = 8
	var b = 7
	var max = a
	if (a < b) max = b	// method 1

	max = if (a < b) b else a	// method 2

	max = if (a < b) {	// method 3
		println("Taking b")
		b
	} else {
		println("Taking a")
		a
	}
	println("Largest value is:$max")
}
