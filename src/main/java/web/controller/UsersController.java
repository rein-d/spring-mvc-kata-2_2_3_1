package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.User;
import web.service.UsersService;


@Controller
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(value = "/users")
    public String listUsers(Model model) {
        model.addAttribute("users", usersService.getUsers());
        return "users";
    }

    @GetMapping(value = "/users/create_user")
    public String addUsers(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "create_user";
    }

    @PostMapping("/users")
    public String addUser(@ModelAttribute("user") User user) {
        usersService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", usersService.getUser(id));
        return "edit_user";
    }

    @PostMapping("/users/{id}")
    public String updateUser(@PathVariable Long id,
                                @ModelAttribute("user") User user,
                                Model model) {
        usersService.saveUser(id, user.getFirstName(), user.getLastName(), user.getEmail());
        return "redirect:/users";
    }

    @GetMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        usersService.deleteUser(id);
        return "redirect:/users";
    }
}