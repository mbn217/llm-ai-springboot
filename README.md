

```markdown
# Spring Boot LLaMA Chatbot

A web-based chatbot application that integrates with LLaMA model through Ollama, built using Spring Boot and LangChain4j.

## Prerequisites

- Java 17 or higher
- Maven
- Ollama with LLaMA model installed and running
- Spring Boot 3.x

## Setup

1. Make sure Ollama is running with LLaMA model:
```bash
ollama run llama3.2
```

2. Clone the repository
3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

## Features

- Real-time chat interface using HTML/JavaScript
- Integration with LLaMA model via Ollama
- Message history retention (up to 30 messages)
- Bootstrap-styled responsive UI

## Usage

1. Access the chat interface at: `http://localhost:8080/chat-ui`
2. Type your message in the input field
3. Click "Send" or press Enter to chat with the bot

## Project Structure

- `ChatBotService.java`: Handles LLaMA model integration using LangChain4j
- `ChatController.java`: REST endpoints for chat functionality
- `chat.html`: Web interface for the chatbot

## API Endpoints

- `GET /chat-ui`: Renders the chat interface
- `POST /chat`: Sends messages to the chatbot

## Configuration

The LLaMA model is configured to use:
- Ollama API URL: `http://localhost:11434/v1`
- Model name: `llama3.2`
- Message history: 30 messages

## Dependencies

- Spring Boot
- LangChain4j
- Thymeleaf
- Bootstrap 5.3
```
