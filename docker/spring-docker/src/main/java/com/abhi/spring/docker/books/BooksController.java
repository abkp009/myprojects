package com.abhi.spring.docker.books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final BooksService booksService;

    public BooksController(final BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public List<Books> getBooks(){
        return booksService.getAll();
    }

}

@Service
class BooksService {

    private final BooksRepo booksRepo;

    public BooksService(BooksRepo booksRepo) {
        this.booksRepo = booksRepo;
    }
    public List<Books> getAll(){
        return booksRepo.findAll();
    }
}

@Repository
interface BooksRepo extends JpaRepository<Books, Integer> {
}
