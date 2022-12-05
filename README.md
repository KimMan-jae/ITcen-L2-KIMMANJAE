# ITcen-L2-KIMMANJAE
요구사항 수정
![image](https://user-images.githubusercontent.com/47963629/203260833-a6d65b8c-5044-48ee-bc9e-703c5b16874d.png)
도메인 모델링
![image](https://user-images.githubusercontent.com/47963629/203260924-5c8a6b37-e452-4e0e-8f54-09e1ebfcffa8.png)

1. Saga(Pub/Sub)
Saga Pattern : 분산 트랜잭션 시나리오에서 마이크로 서비스 간의 데이터 일관성을 관리하는 방법
saga는 각 서비스를 업데이트하고 메시지 또는 이벤트를 게시하여 다음 트랜잭션 단계를 트리거하는 일련의 트랜잭션
Pub/Sub
![pubsub3](https://user-images.githubusercontent.com/47963629/205582859-3cf64a8e-5396-49c8-9fcc-8ba25ed53f39.png)
2. CQRS
Command and Query Responsibility Segregation(명령과 조회의 책임 분리)
Read model, 초록색스티커
3. Compensation / Correlation
![ComCor1](https://user-images.githubusercontent.com/47963629/205582988-9e5f82a2-0d3a-4a82-9798-b897b6064c25.png)
