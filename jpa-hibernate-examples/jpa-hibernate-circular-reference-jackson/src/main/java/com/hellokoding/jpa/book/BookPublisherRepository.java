package com.hellokoding.jpa.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPublisherRepository extends JpaRepository<BookPublisher, Integer> {
}
