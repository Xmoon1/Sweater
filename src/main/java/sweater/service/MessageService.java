package sweater.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sweater.model.Message;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MessageService {
    private List<Message> messages = new ArrayList<>();
    {
        messages.add(new Message("Hello, Sweater!", "Simple text", "John Conor"));
    }
    public void saveMessage(Message message) {
        log.info("Saving new message: {}", message);
        messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }
}
