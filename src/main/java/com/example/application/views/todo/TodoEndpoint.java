package com.example.application.views.todo;

import java.util.List;
import com.example.application.db.Todo;
import com.example.application.db.TodoRepo;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.fusion.Endpoint;
import com.vaadin.fusion.Nonnull;

@Endpoint
@AnonymousAllowed
public class TodoEndpoint {

  private TodoRepo repo;

  public TodoEndpoint(TodoRepo repo) {
    this.repo = repo;
  }

  @Nonnull
  public List<@Nonnull Todo> getTodos() {
    return repo.findAll();
  }

  public Todo save(Todo todo) {
    return repo.save(todo);
  }
}
