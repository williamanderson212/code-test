package com.brightflag.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ExamRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

}
