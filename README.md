# ITcen-L2-KIMMANJAE
![image](https://user-images.githubusercontent.com/487999/79708354-29074a80-82fa-11ea-80df-0db3962fb453.png)

# 예제 - 음식배달

본 예제는 MSA/DDD/Event Storming/EDA 를 포괄하는 분석/설계/구현/운영 전단계를 커버하도록 구성한 예제입니다.
이는 클라우드 네이티브 애플리케이션의 개발에 요구되는 체크포인트들을 통과하기 위한 예시 답안을 포함합니다.

# 서비스 시나리오

기능적 요구사항
1. 고객이 메뉴를 선택하여 주문한다.
2. 고객이 선택한 메뉴는 결제함에 저장된다. *(고객이 선택한 메뉴에 대해 결제한다.)
3. 주문이 되면 주문 내역이 입점상점주인에게 주문정보가 전달된다.
4. 상점주는 주문을 수락하거나 거절할 수 있다.
5. 상점주는 요리시작때와 완료 시점에 시스템에 상태를 입력한다.
6. 고객은 아직 요리가 시작되지 않은 주문은 취소할 수 있다.
7. 요리가 시작되면 *(요리가 완료되면) 고객의 지역 인근의 라이더들에 의해 배송건 조회가 가능하다.
8. 라이더가 해당 주문을 배송(pick)할지 선택한다. *(라이더가 해당 요리를 pick 한후,)
   배송 하기로 한 주문에 대해 요리 catch 한 후, catch했다고 앱을 통해 통보한다. *(pick했다고 앱을 통해 통보한다.)
9. 고객이 주문상태가 바뀔 때 마다 주문상태를 알 수 있도록 한다. 
10. 라이더가 배송이 완료되면 *(고객이 요리를 배달 받으면) 배송확인 버튼을 탭하여 완료된다.

추가사항 1 
요리가 완료되면 쿠폰을 발급한다. 발급한 쿠폰은 같은 해당 매장에서 결제시 사용 가능하다.

추가사항 2 
고객, 매장, 라이더의 모든 이벤트에 대한 정보를 수집하여, ESG 경영팀에서 사용하는 분석툴에 제공한다.

![전체](https://user-images.githubusercontent.com/47963629/206594496-193a4491-f5f9-4bb7-bfda-865ccbd8c28d.png)

# 체크포인트
1. Saga (Pub / Sub)
2. CQRS
3. Compensation / Correlation
4. Request / Response
5. Circuit Breaker
6. Gateway / Ingress

# Saga (Pub / Sub)
- 고객이 발급받은 쿠폰을 사용(UsedCoupon)하면 해당하는 메뉴에 적용된다.
![PUBSUB1](https://user-images.githubusercontent.com/47963629/206594529-2c937c9f-b717-4c31-9f4a-6f15bfdca837.png)

![PUBSUB2](https://user-images.githubusercontent.com/47963629/206594565-756aa32f-1924-4b66-984b-5b3f0dad9b33.png)

# CQRS
- 고객이 주문상태가 바뀔 때(PlacedOrder, CanceledOrder, CompletePayment, etc...) 마다 주문상태를 알 수 있도록 한다.
![CQRS1](https://user-images.githubusercontent.com/47963629/206594592-61408177-84e2-4eba-be08-4e24aab7ca73.png)

![CQRS2](https://user-images.githubusercontent.com/47963629/206594595-8e9dd066-996f-469e-9064-46605d9c497d.png)

![CQRS3](https://user-images.githubusercontent.com/47963629/206594603-e8edd431-6358-4a97-8f45-1ab6169e08b2.png)

# Compensation / Correlation
- 상점주가 주문을 거절(RefuseOrder)하면 결제를 취소(CancelPayment)한다.
![COMCOR1](https://user-images.githubusercontent.com/47963629/206594635-f74adc74-1e1a-4cd1-bcc3-36b64be87d23.png)

![COMCOR2](https://user-images.githubusercontent.com/47963629/206594654-347dcd29-43c5-44a6-9fc7-f20014af3217.png)

# Request / Response
- 요리가 시작(StartedCooking)되면 주문을 취소(CancelOrder)할 수 없다.
![REQRES1](https://user-images.githubusercontent.com/47963629/206594699-36fccf36-8f2f-49e5-ad84-d208ebe1148b.png)

![REQRES2](https://user-images.githubusercontent.com/47963629/206599320-4c3affef-7462-41e6-9c12-3e8fd16bacab.png)

# Circuit Breaker
- 요리를 시작(StartCooking)할 때, 주문이 취소(CanceledOrder)되었는지 확인한다. 3초 이상 응답이 없는 경우, 취소 된 것으로 간주한다.
![CIRCUITBREAKER1](https://user-images.githubusercontent.com/47963629/206603916-71518226-8aef-4092-95e3-28cd5471836c.png)

![CIRCUITBREAKER2](https://user-images.githubusercontent.com/47963629/206603925-0badd066-7a4e-40eb-b476-28e0a758ecba.png)

# Gateway / Ingress
- API Gateway 를 통하여 진입점을 통일한다.
![GATEWAYINGRESS](https://user-images.githubusercontent.com/47963629/206594719-9d83b3e8-e067-4518-983b-6fd3fbd34f85.png)

