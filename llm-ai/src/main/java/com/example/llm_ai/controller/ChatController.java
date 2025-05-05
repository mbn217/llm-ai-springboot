package com.example.llm_ai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.llm_ai.service.ChatBotService;

@Controller
public class ChatController {

    @Autowired
    private ChatBotService chatBotService;

    @PostMapping("/chat")
    @ResponseBody
    public String chat(@RequestBody String input) {
        return chatBotService.chat(input);
    }

    @GetMapping("/chat-ui")
    public String chatPage() {
        return "chat"; // returns chat.html
    }

}
