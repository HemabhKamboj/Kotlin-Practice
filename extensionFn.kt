fun main(args: Array<String>){

	var student  = Student()
    println("pass status: " + student.hasPassed(37))
    println("Scholarship status: " + student.isScholar(57))
    
    
     }

fun Student.isScholar(marks : Int): Boolean {
    return marks > 95
}

class Student {
    fun hasPassed(marks : Int): Boolean {
        return marks > 40
    }
}
               