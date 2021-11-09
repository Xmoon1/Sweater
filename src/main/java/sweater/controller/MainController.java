package sweater.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sweater.model.Message;
import sweater.service.MessageService;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MessageService messageService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("messages", messageService.getMessages());
        return "main";
    }

    @PostMapping("/create")
    public String createMessage(Message message) {
        messageService.saveMessage(message);
        return "redirect:/";
    }
}
