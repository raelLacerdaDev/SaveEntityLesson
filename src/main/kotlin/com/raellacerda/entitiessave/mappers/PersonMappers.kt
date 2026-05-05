package com.raellacerda.entitiessave.mappers

import com.raellacerda.entitiessave.dto.PersonDepartmentDto
import com.raellacerda.entitiessave.dto.PersonDto
import com.raellacerda.entitiessave.entities.Person

fun Person.toDto(): PersonDto = PersonDto(
    id = this.id,
    name = this.name,
    salary = this.salary,
)

