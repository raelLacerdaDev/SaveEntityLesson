package com.raellacerda.entitiessave.dto


data class PersonDepartmentDto(
    val id: Long = 0L,
    val name: String,
    val salary: Double,
    val department: DepartmentDto
)
