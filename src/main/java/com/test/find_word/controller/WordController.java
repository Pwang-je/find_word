package com.test.find_word.controller;

import com.test.find_word.model.WordModel;
import com.test.find_word.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WordController {

    @Autowired
    WordService wordService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<WordModel> word = wordService.printWord();
        model.addAttribute("wordList", word);
        return "list";
    }

}
