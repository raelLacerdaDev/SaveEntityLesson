package com.raellacerda.entitiessave.repositories


import com.raellacerda.entitiessave.entities.Person
import org.springframework.data.jpa.repository.JpaRepository


interface PersonRepository : JpaRepository<Person, Long>