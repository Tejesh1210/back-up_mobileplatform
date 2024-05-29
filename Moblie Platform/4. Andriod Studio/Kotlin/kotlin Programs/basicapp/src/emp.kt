data class emp(val name: String, val salary: Double, val role:String)

//fun getEmp(name: String, salary: Double, role: String): emp {
//    return emp(name, salary, role)
//}

fun main() {
    val a= mutableListOf(
    emp("Tejesh", 10.0, "Trainee"),
    emp("Arush", 11.0, "Developer"),
    emp("Ananya", 100.0, "Tester")
    )

//    val (name, salary, role) = getEmp("Tejesh", 10.0, "Trainee");
//    println("$name, $salary, $role")

//    Add operation
    val newEmp=emp("suresh",15.9,"cricketer");
    a.add(newEmp);

//    println("all employees");
//    a.forEach{println("${it.name},${it.salary},${it.role}")}

//    delete operation

    val empdelete=a.find { it.name=="Arush" }
    empdelete?.let {a.remove(it)}

//    println("all employees");
//    a.forEach{println("${it.name},${it.salary},${it.role}")}

    val newElement=emp("Sakhi",12.0,"doctor")
    val index=a.size/2
    a.add(index,newElement)

    println("all employees");
    a.forEach{println("${it.name},${it.salary},${it.role}")}
}