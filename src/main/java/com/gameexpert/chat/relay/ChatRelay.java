package com.gameexpert.chat.relay;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.gameexpert.chat.service.LocalChatSender;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ChatRelay implements MessageListener {
    public static final String CHANNEL = "webcraft:chat";

    private final StringRedisTemplate redisTemplate;
    private final ObjectMapper objectMapper;
    private final LocalChatSender localChatSender;

    public void publish(Long worldId, Object message) {
        // TODO Lv 20: worldId와 message를 JSON으로 묶어 채팅 채널에 발행합니다.
        String jsonMessage = objectMapper.writeValueAsString(Map.of("worldId", worldId, "message", message));
        redisTemplate.convertAndSend(CHANNEL, jsonMessage);
    }

    @Override
    public void onMessage(Message serializedMessage, byte[] pattern) {
        // TODO Lv 20: JSON에서 worldId와 message를 읽어 localChatSender.send()로 전달합니다.
        String jsonMessage = new String(serializedMessage.getBody(), StandardCharsets.UTF_8);

        JsonNode jsonNode = objectMapper.readTree(jsonMessage);
        Long worldId = jsonNode.get("worldId").asLong();
        Object message = jsonNode.get("message");

        localChatSender.send(worldId, message);
    }
}
