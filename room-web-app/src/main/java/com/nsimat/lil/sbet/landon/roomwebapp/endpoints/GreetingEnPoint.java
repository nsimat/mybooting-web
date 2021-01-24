package com.nsimat.lil.sbet.landon.roomwebapp.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "greeting")
public class GreetingEnPoint {

    @ReadOperation
    public String getGreeting(){
        return "Hello from Actuator!";
    }
}
