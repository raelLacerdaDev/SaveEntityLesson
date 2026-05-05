package com.raellacerda.entitiessave.mappers


import com.raellacerda.entitiessave.dto.PersonDepartmentDto
import com.raellacerda.entitiessave.dto.PersonDto
import com.raellacerda.entitiessave.dto.PersonWithDepartmentIdDto
import com.raellacerda.entitiessave.entities.Person

fun Person.toDto(): PersonDto = PersonDto(
    id = this.id,
    name = this.name,
    salary = this.salary,
)

fun Person.toPersonDepartmentDto(): PersonDepartmentDto = PersonDepartmentDto(
    id = this.id,
    name = this.name,
    salary = this.salary,
    department = this.department.toDto(),
)

fun PersonDepartmentDto.toEntity(): Person = Person(
    id = this.id,
    name = this.name,
    salary = this.salary,
    department = this.department.toEntity(),
)

fun Person.toPersonWithDepartmentIdDto() = PersonWithDepartmentIdDto(
    name = this.name,
    salary = this.salary,
    departmentId = this.department.id
)

