package com.raellacerda.entitiessave.controllers

import com.raellacerda.entitiessave.dto.PersonDepartmentDto
import com.raellacerda.entitiessave.dto.PersonWithDepartmentIdDto
import com.raellacerda.entitiessave.services.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.support.ServletUriComponentsBuilder


@RestController
@RequestMapping("/people")
class PersonController(private val personService: PersonService) {

//    @PostMapping
//    fun insert(@RequestBody personDepartmentDto: PersonDepartmentDto) : ResponseEntity<PersonDepartmentDto> {
//        val response = personService.insertPersonWithDepartment(personDepartmentDto)
//        val uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.id).toUri()
//        return ResponseEntity.created(uri).body(response)
//    }

    @PostMapping
    fun insert(@RequestBody dto: PersonWithDepartmentIdDto): ResponseEntity<PersonWithDepartmentIdDto> {
        val response = personService.insertPersonWithDepartmentId(dto)

        val uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(response.id)
            .toUri()

        return ResponseEntity.created(uri).body(response)
    }
}