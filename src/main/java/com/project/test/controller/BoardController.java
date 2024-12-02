package com.project.test.controller;


import com.project.test.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
@Slf4j
public class BoardController {

    private final BoardService boardService;


    @GetMapping("/register")
    public void register() {}

    @GetMapping("/list")
    public void list(){}

    @GetMapping("/detail")
    public void detail(){}
}
