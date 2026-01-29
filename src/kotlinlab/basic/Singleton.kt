package kotlinlab.basic

class Database private constructor() {
    companion object{
        private var instance: String? = null

        fun getInstance(): String {
            instance = if (instance == null) {
                String()
            } else {
                "Kotlin Database Instance"
            }
            return instance!!
        }
    }
}


fun main(){
    val db1 = Database.getInstance() // for the first call the instance value is set to null and return nothing
    val db2 = Database.getInstance() // for the second call the instance is initialized with the value specified in the else statement and the string is returned

    println("The value of db1 is $db1")
    println("The value of db2 is $db2")
}