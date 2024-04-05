package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                =new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService service = context.getBean("ServiceField", BookService.class);
        List<BookDTO> books = service.selectAllBooks();
        for(BookDTO book : books) {
            System.out.println(book);
        }
    }
}
