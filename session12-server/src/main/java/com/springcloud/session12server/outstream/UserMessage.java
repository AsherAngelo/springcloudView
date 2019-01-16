package com.springcloud.session12server.outstream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserMessage {

    @Output("userMessageOut")
    MessageChannel output();
}
