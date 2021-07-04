package dev.cna.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dev.cna.dao.model.AppUser;
import dev.cna.dao.repo.AppUserRepo;

@Controller
public class AppUserController {
  private final AppUserRepo userRepo;

  public AppUserController(AppUserRepo userRepo) {
    this.userRepo = userRepo;
  }

  @GetMapping("/index")
  public String showUserList(Model model) {
    model.addAttribute("users", userRepo.findAll());
    return "index";
  }

  @GetMapping("/signup")
  public String showSignupForm(Model model) {
    model.addAttribute("user", new AppUser());
    return "add-user";
  }

  @PostMapping("/adduser")
  public String addUser(@Valid AppUser user, BindingResult result, Model model) {
    if (result.hasErrors()) {
      return "add-user";
    }

    userRepo.save(user);
    return "redirect:/index";
  }

  @GetMapping("/edit/{id}")
  public String showUpdateForm(@PathVariable("id") Long id, Model model) {
    AppUser user =
        userRepo
            .findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid User Id: " + id));

    model.addAttribute("user", user);
    return "update-user";
  }

  @PostMapping("/update/{id}")
  public String updateUser(
      @PathVariable("id") Long id, @Valid AppUser user, BindingResult result, Model model) {
    if (result.hasErrors()) {
      user.setId(id);
      return "update-user";
    }

    userRepo.save(user);
    return "redirect:/index";
  }

  @GetMapping("/delete/{id}")
  public String deleteUser(@PathVariable("id") Long id, Model model) {
    AppUser user =
        userRepo
            .findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid User Id: " + id));
    userRepo.delete(user);
    return "redirect:/index";
  }
}
