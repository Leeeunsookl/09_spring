package com.ohgiraffers.section01.autowired.common;

import org.springframework.stereotype.Repository;

import java.util.*;

import static java.time.chrono.JapaneseEra.values;

@Repository("BookDAO")
public class BookDAOImpi implements BookDAO{

    private final Map<Integer,BookDTO>bookList;
    public BookDAOImpi() {
        bookList=new HashMap<>();
        bookList.put(1,new BookDTO(1,123456,"혼공자","조평훈","한빛출판사",new Date()));
        bookList.put(2,new BookDTO(2,654321,"공혼자","평훈조","두빛출판사",new Date()));
    }
    public List<BookDTO>selectBookList(){
        return new ArrayList<>(bookList.values());
    }
    public BookDTO selectOneBook(int sequence){
        return bookList.get(sequence);
    }

}
