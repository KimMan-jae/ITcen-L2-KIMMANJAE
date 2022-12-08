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
public class OrderStatusViewHandler {


    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPlacedOrder_then_CREATE_1 (@Payload PlacedOrder placedOrder) {
        try {

            if (!placedOrder.validate()) return;

            // view 객체 생성
            OrderStatus orderStatus = new OrderStatus();
            // view 객체에 이벤트의 Value 를 set 함
            orderStatus.setId(placedOrder.getId());
            orderStatus.setMessage(추가됨);
            // view 레파지 토리에 save
            orderStatusRepository.save(orderStatus);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenCanceledOrder_then_UPDATE_1(@Payload CanceledOrder canceledOrder) {
        try {
            if (!canceledOrder.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(canceledOrder.getId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(취소됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCompletedPayment_then_UPDATE_2(@Payload CompletedPayment completedPayment) {
        try {
            if (!completedPayment.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(completedPayment.getOrderId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(결제됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenRefundedPayment_then_UPDATE_3(@Payload RefundedPayment refundedPayment) {
        try {
            if (!refundedPayment.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(refundedPayment.getOrderId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(환불됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenAcceptedOrder_then_UPDATE_4(@Payload AcceptedOrder acceptedOrder) {
        try {
            if (!acceptedOrder.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(acceptedOrder.getOrderId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(수락됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenRefusedOrder_then_UPDATE_5(@Payload RefusedOrder refusedOrder) {
        try {
            if (!refusedOrder.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(refusedOrder.getOrderId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(거절됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenStartedCooking_then_UPDATE_6(@Payload StartedCooking startedCooking) {
        try {
            if (!startedCooking.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(startedCooking.getOrderId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(요리시작됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenEndedCooking_then_UPDATE_7(@Payload EndedCooking endedCooking) {
        try {
            if (!endedCooking.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(endedCooking.getOrderId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(요리완료됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCatchedFood_then_UPDATE_8(@Payload CatchedFood catchedFood) {
        try {
            if (!catchedFood.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(catchedFood.getOrderId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(배송시작됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenDelivered_then_UPDATE_9(@Payload Delivered delivered) {
        try {
            if (!delivered.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(delivered.getOrderId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setMessage(배송완료됨);    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

