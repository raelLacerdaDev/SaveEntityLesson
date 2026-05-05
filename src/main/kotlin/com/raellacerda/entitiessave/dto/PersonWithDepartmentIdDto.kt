package com.raellacerda.entitiessave.dto

data class PersonWithDepartmentIdDto(
    val id: Long = 0L,
    val name: String,
    val salary: Double,
    val departmentId: Long
)
