package com.test.find_word.repository;

import com.test.find_word.model.WordModel;

import java.util.List;

public interface WordDao {

    List<WordModel> getWord();

}
