package com.mydiet.mydiet.controller;

import com.mydiet.mydiet.domain.dto.NutritionProgramInput;
import com.mydiet.mydiet.domain.entity.NutritionProgram;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/nutrition-programs")
public class NutritionProgramController {

    @GetMapping(path = "/{programNumber}")
    public NutritionProgram getNutritionProgram(@PathVariable Integer programNumber) {

        return null;
    }

    // update for admin only (ROLE CHECK)
    // get for users  (without authorization)

    // todo: download N programs, list of numbers for programs not to send
    //

    @PostMapping
    public Integer createNutritionProgram(@RequestBody NutritionProgramInput nutritionProgramInput) {

        return null;
    }

}
