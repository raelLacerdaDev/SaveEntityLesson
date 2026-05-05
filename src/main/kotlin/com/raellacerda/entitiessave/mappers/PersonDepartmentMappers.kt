package com.raellacerda.entitiessave.mappers

import com.raellacerda.entitiessave.dto.PersonDepartmentDto
import com.raellacerda.entitiessave.entities.Person

fun Person.toPersonDepartmentDto(): PersonDepartmentDto = PersonDepartmentDto(
    id = this.id,
    name = this.name,
    salary = this.salary,
    department = this.department.toDto(),
)

fun PersonDepartmentDto.toEntity(): Person = Person(
    name = this.name,
    salary = this.salary,
    department = this.department.toEntity(),
)