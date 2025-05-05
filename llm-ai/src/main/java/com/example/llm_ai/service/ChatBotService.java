package com.example.llm_ai.service;

import dev.langchain4j.chain.ConversationalChain;
import dev.langchain4j.memory.ChatMemory;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatBotService {

    private final ConversationalChain chain;

    public ChatBotService() {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://localhost:11434/v1") // default Ollama API URL
                .apiKey("ollama") // placeholder for Ollama
                .modelName("llama3.2") // match your running model name
                .build();

        //Retain chat up to 30 messages
        ChatMemory memory = MessageWindowChatMemory.withMaxMessages(30);


        this.chain = ConversationalChain.builder().chatModel(model)
                .chatMemory(memory)
                .build();
    }

    public String chat(String userInput) {
        return chain.execute(userInput);
    }
}