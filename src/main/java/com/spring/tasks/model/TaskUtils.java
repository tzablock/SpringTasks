package com.spring.tasks.model;


import com.spring.tasks.model.entity.Task;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class TaskUtils {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void persistTask(Task task){
        entityManager.persist(task);
    }

    @Transactional
    public Task getTaskById(Long id){
        return entityManager.find(Task.class,id);
    }

}
