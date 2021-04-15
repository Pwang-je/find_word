package com.test.find_word.repository;

import com.test.find_word.model.WordModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordDao {

    List<WordModel> getWord();

}
