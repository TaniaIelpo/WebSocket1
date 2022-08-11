package co.develhope.WebSocket1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Tania Ielpo
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MessageDTO {

    /**
     * MessageDTO that has 2 properties:
     *  String type
     *  String message
     */


    private String type;
    private String message;
}