package com.example.tuan5_ketnoicsdl.repository;
import com.example.tuan5_ketnoicsdl.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

}
