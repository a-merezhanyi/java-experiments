package software.jlogic.todolist;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodolistController {

    @RequestMapping("/tasks")
    public List<TodoTask> retrieveAllTasks() {
        return Arrays.asList(
                new TodoTask(1, "Learn AWS", "in28minutes"),
                new TodoTask(2, "Learn DevOps", "academy"),
                new TodoTask(4, "Learn Linux", "linux foundation"));
    }
}
