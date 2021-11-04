package com.rogue.cockroachdbupsert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.NoRepositoryBean;

import javax.transaction.Transactional;
import java.util.List;

@NoRepositoryBean
public interface ExtendedJpaRepository<T,ID> extends JpaRepository<T,ID> {
    @Transactional
    @Modifying
    T upsert(T entity);

    @Transactional
    @Modifying
    List<T> upsertAll(List<T> entities);
}
