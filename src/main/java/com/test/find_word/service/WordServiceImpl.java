package com.test.find_word.service;

import com.test.find_word.model.WordModel;
import com.test.find_word.repository.WordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordDao dao;

    @Override
    public List<WordModel> printWord() {
        List<WordModel> word = dao.getWord();
        return word;
    }
}
