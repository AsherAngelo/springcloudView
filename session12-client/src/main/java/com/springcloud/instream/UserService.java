package com.springcloud.instream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

@Service
public class UserService {

    @Autowired
    private UserMessage userMessage;

    @PostConstruct
    public void saveUserByRabbitMessage() throws JsonProcessingException {
        SubscribableChannel subscribableChannel = userMessage.input();
        subscribableChannel.subscribe(message -> {
            System.out.println("Subscribe by SubscribableChannel");
            // message body 是字节流 byte[]
            byte[] body = (byte[]) message.getPayload();
            saveUser(body);
        });
    }

    @StreamListener("userMessagein")
    public void onMessage(byte[] data) {
        System.out.println("Subscribe by @StreamListener");
        saveUser(data);
    }

    private void saveUser(byte[] data) {
        // message body 是字节流 byte[]
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
//        try {
//            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//            User user = (User) objectInputStream.readObject(); // 反序列化成 User 对象
//            System.out.println(user.toString());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        String str = new String(data);
        System.out.println(str);
    }

}
