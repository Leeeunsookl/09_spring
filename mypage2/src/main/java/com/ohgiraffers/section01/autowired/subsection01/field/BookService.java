package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ServiceField")        // @Service가 붙은 클래스는 스프링이 빈(bean)으로 자동 등록
public class BookService {

    @Autowired
    private BookDAO bookDAO;
    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }

}
