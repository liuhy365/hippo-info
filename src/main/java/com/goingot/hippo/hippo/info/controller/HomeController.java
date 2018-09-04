/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goingot.hippo.hippo.info.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Allen Liu <allen.liu@outlook.com>
 */
@RestController
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("")
    public String home() {
        return "hello";
    }
    
}
