package com.nsimat.lil.sbet.landon.roomwebapp.async;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nsimat.lil.sbet.landon.roomwebapp.models.Room;
import com.nsimat.lil.sbet.landon.roomwebapp.services.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RoomCleanerListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoomCleanerListener.class);

    private final ObjectMapper mapper;
    private final RoomService roomService;

    public RoomCleanerListener(ObjectMapper mapper, RoomService roomService) {
        this.mapper = mapper;
        this.roomService = roomService;
    }

    public void receiveMessage(String message){
        try{
            AsyncPayload payload = mapper.readValue(message, AsyncPayload.class);
            if("ROOM".equals(payload.getModel())){
                Room room = roomService.getById(payload.getId());
                LOGGER.info("ROOM {}:{} needs to be cleaned", room.getNumber(), room.getName());
            }else{
                LOGGER.info("unknown model type");
            }
        }catch (JsonProcessingException exception){
            exception.printStackTrace();
        }
    }
}
