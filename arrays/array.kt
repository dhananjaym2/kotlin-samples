
fun main(args: Array<String>) {
	var arr = arrayOf(10,20,30)
	var i:Int = 0;
	println("element $i in array is ${arr[i}}")

	for (i in arr)
		println("in for loop i is ${i}")

	for (i in arr.indices)
		println("value at index ${i} is ${arr[i]}")
}
