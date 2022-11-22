package itcen.l.kimmanjae.infra;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MenuViewHandler {


    @Autowired
    private MenuRepository menuRepository;




}

