package com.example.studyflashmap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FlashAttributesController {

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Form submitted successfully!");
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String showSuccess(Model model) {
        // Flash 속성은 자동으로 모델에 추가됩니다
        return "success";
    }
}