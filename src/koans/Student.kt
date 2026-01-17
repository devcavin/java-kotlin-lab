package koans

data class Student(val name: String, val grades: List<Int>)

// calculate the average grade
fun averageGrade(student: Student): Double? {
    return if (student.grades.isNotEmpty()) {
        student.grades.average()
    } else null
}

// students above the threshold
fun topStudents(students: List<Student>, threshold: Double): List<Student> {
    val listOfTopStudents = mutableListOf<Student>()
    students.forEach { student ->
        averageGrade(student)?.let {
            if (
                it >= threshold) {
                listOfTopStudents.add(student)
            }
        }
    }
    return listOfTopStudents
}

fun main() {
    val students = Student("John", listOf(1, 2, 3))
    val studentList = listOf(
        Student("John", listOf()),
        Student("John", listOf(74, 25, 86)),
        Student("John", listOf(7, 68, 99)),
        Student("John", listOf(11, 61, 12))
    )
    println(topStudents(studentList, 50.00))
    println(averageGrade(students))
}