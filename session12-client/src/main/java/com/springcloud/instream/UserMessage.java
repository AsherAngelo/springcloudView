package com.springcloud.instream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface UserMessage {

    @Input("userMessagein")
    SubscribableChannel input();
}
