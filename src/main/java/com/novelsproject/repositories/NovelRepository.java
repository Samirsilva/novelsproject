package com.novelsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novelsproject.domain.Novel;

@Repository
public interface NovelRepository extends JpaRepository<Novel, Integer> {

}
