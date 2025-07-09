// Yêu cầu:
// Tạo 1 form nhập thông tin người dùng gồm:
// Họ tên
// Email
// Giới tính (Nam / Nữ)
// Quốc tịch (dropdown: Việt Nam, Nhật Bản, Mỹ, Pháp)
// Khi bấm “Gửi”, dữ liệu được bind vào object User
// In ra toàn bộ thông tin người dùng ở trang kết quả

package com.example.demo_form_binding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo_form_binding.model.User;

@Controller
public class UserController {

    @GetMapping("/register")
    public String showFormRegister(Model model) {
        model.addAttribute("user", new User());
        return "form-register-page";
    }

    @PostMapping("/register")
    public String submitFormRegister(@ModelAttribute User user, Model model) {
        model.addAttribute("u", user);
        return "info-page";
    }
}
