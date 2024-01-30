package com.mockitocourse.qa.controller;

import com.mockitocourse.qa.vo.create.profile.request.CreateProfileRequest;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/profile")
public class CreateProfileController {

    @GetMapping("/create")
    public @ResponseBody ResponseEntity<CreateProfileRequest> createProfile(@Nullable @RequestParam boolean flag,
                                                                            @Valid @RequestBody CreateProfileRequest request) {
        return new ResponseEntity<>(request, HttpStatus.CREATED);
    }
}
