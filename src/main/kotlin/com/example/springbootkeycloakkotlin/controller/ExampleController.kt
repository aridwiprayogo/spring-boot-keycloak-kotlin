package com.example.springbootkeycloakkotlin.controller

import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ExampleController {

    @GetMapping("/example")
    @PreAuthorize("hasAnyRole('USER')")
    fun getUserInfo(): ResponseEntity<String> =
        ResponseEntity.ok("User info")

    @GetMapping("/example/admin")
    @PreAuthorize("hasAnyRole('ADMIN')")
    fun getAdminInfo(): ResponseEntity<String> =
        ResponseEntity.ok("Admin info")

    @GetMapping("/public/example")
    fun getPublicInfo(): ResponseEntity<String> =
        ResponseEntity.ok("Public info")
}