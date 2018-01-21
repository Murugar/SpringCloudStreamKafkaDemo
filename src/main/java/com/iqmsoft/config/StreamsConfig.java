package com.iqmsoft.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.iqmsoft.stream.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
