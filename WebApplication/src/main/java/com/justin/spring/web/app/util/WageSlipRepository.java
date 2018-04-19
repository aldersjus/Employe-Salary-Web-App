package com.justin.spring.web.app.util;

import org.springframework.data.repository.CrudRepository;

/**
 * Used for CRUD operations by Spring on the database.
 * @author Justin Alderson
 *
 */
public interface WageSlipRepository extends CrudRepository<WageSlip, Long> {

}
