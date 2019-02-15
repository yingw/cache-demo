package cn.yinguowei.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Yin Guo Wei 2019/1/27
 */
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    @PutMapping("/users")
    public User update(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }

}
