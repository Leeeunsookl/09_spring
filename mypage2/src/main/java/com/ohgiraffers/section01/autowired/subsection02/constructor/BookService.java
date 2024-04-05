package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;
    @Autowired
    public BookService(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }
    public BookDTO searchOneBookBySequence(int sequence){
        return bookDAO.selectOneBook(sequence);
    }

}
