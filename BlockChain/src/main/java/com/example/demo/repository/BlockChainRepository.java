package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Block;

@Repository
public interface BlockChainRepository extends JpaRepository<Block, Long>{

	 
}
