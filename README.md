# 

## Model
www.msaez.io/#/61372486/storming/5fbf29a69f8a7a4fbac0359c13d6cf14
https://www.msaez.io/#/61372486/storming/ramen



![image](https://github.com/user-attachments/assets/4d5169a1-36ab-47a8-b7fc-85cd9e5c552a)



 도메인 주제 : 라면 판매하고 배달하는 업체. <br/>
 총 6개로 구분 : 라면주문/라면요리/라면배달/사용자/리뷰/푸시알림

 시나리오
 1. 고객이 라면을 주문한다
 2. 라면 요청 시, 바로 조리가 시작된다
 3. 조리 시작 후, 재고가 감소한다
 4. 조리완료 시, 배달을 출발한다
 5. 각 단계별로 고객에게 푸시알림을 발송한다
 6. 배달완료 시, 리뷰작성이 가능하다
 7. 고객은 주문을 취소할 수 있다
 8. 주문 취소 시, 배달도 취소된다
 9. 취소 시, 재고가 증가한다

 CheckPoints
1. 3개 이상의 이벤트 (오렌지색 스티커)를 도출했는가
2. 도메인에서 사용된 용어 (Ubiqutous Language)를 사용하였는가?
3. 과거분사형으로 도출되었는가

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- ramenorder
- ramencook
- delivery


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- ramenorder
```
```
- ramencook
```
```
- delivery
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

