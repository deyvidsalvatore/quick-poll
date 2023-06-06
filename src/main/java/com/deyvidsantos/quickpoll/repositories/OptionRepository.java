package com.deyvidsantos.quickpoll.repositories;

import org.springframework.data.repository.CrudRepository;

import com.deyvidsantos.quickpoll.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long>{
    
}
