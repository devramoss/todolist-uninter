package br.com.emilly.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emilly.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
