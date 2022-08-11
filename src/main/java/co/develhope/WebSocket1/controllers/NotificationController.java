package co.develhope.WebSocket1.controllers;


import co.develhope.WebSocket1.entities.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Tania Ielpo
 */

@Controller
public class NotificationController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    /**
     * exposes the endpoint for sending the message on broadcast-message that:
     * accepts a payload of MessageDTO
     * @param messageDTO
     * @return a Response Entity
     */

    @PostMapping("/broadcast-messages")
    public ResponseEntity<String> sendNotificationToClient(@RequestBody MessageDTO messageDTO){
        simpMessagingTemplate.convertAndSend("/topic/broadcast", messageDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
