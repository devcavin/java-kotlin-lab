package koans

private const val REQUIRED_TOTAL_SCORE = 500

data class Course(
    val courseName: String,
    val completedModuleScores: List<Int>,
    val requiredModules: Int
)

enum class CourseStatus {
    INCOMPLETE,
    ELIGIBLE,
    NOT_ELIGIBLE
}

class CourseRecord(private val course: Course) {

    fun status(): CourseStatus {
        if (course.completedModuleScores.size < course.requiredModules) {
            return CourseStatus.INCOMPLETE
        }

        val totalScore = course.completedModuleScores.sum()

        return if (totalScore >= REQUIRED_TOTAL_SCORE) {
            CourseStatus.ELIGIBLE
        } else {
            CourseStatus.NOT_ELIGIBLE
        }
    }
}

fun eligibleCourses(courses: List<Course>): List<Course> {
    return courses.filter {
        CourseRecord(it).status() == CourseStatus.ELIGIBLE
    }
}