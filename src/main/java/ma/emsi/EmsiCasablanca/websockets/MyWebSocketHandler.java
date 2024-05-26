package ma.emsi.EmsiCasablanca.websockets;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Handle incoming text message
        String payload = message.getPayload();
        // Process the message and broadcast to appropriate channels
    }
}

