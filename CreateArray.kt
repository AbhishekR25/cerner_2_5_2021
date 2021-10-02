//cerner_2^5_2020
fun main(args: Array<String>) {
    println("Create Array")
    // declare an array 
    val array = arrayOf(1, 2, 3, 4, 5) 
    for (iterator in 0..array.size - 1) 
    { 
        print(" "+array[iterator]) 
    } 
    println() 
    // declaring an array using arrayOf<Int> 
    val array_new = arrayOf<Int>(10, 20, 30, 40, 50) 
    for (iterator in 0..array_new.size - 1) 
    { 
        print(" "+array_new[iterator]) 
    } 
}