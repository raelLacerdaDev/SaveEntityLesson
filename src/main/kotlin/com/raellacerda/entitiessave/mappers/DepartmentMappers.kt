package com.raellacerda.entitiessave.mappers

import com.raellacerda.entitiessave.dto.DepartmentDto
import com.raellacerda.entitiessave.entities.Department

fun Department.toDto(): DepartmentDto = DepartmentDto(
    id = this.id,
    name = this.name,
)

fun DepartmentDto.toEntity(): Department = Department(
    id = this.id,
    name = this.name,
)