package Spring_homework;

public class Taxi {
    int taxiNum;     //택시번호
    int fuel;        //주유량
    int speed;       //현재속도
    String destination; //목적지
    int basicDist;   //기본거리     예) 3
    int desDist;     //목적지까지 거리 예) 10
    int basicmoney;  //기본요금    예)기본거리 1,2,3일 때 기본요금 3
    int distmoney;   //거리당요금  예)목적지까지 거리(10)-기본거리(3) = 7
                              // 1거리당 1요금 7요금을 추가해야함
    int totalmoney;  //최종요금 // 기본요금+거리당요금
    boolean taxiCondition = true;  //일반:true, 운행 중(승객탑승):false
    boolean taxiOn = true;        //운행 시작: true, 운행 시작 전: false

    //클래스의 생성자 생성
    public Taxi(int taxiNum, int fuel, int speed, int basicDist, int basicmoney) {
        this.taxiNum = taxiNum;
        this.fuel = fuel;
        this.speed = speed;
        this.basicDist = basicDist;
        this.basicmoney = basicmoney;
    }

    //운행 시작 메서드
    public void taxiRun() {
        this.taxiOn = false;
        if(fuel>=10){
            this.taxiOn=true;
            System.out.println("택시 운행 가능한 상태입니다");
        } else System.out.println("연료를 채워주세요");
    }

    //승객 탑승 메서드
    public void take(boolean taxiCondition) {
        if(taxiCondition==true){
            System.out.println("승객이 탑승을 했습니다");
            this.taxiCondition=false;
        } else {
            System.out.println("택시에 탑승 불가입니다.");
        }
    }

    //속도 변경 메서드
    public void change_speed(int i){
        this.speed +=i;
        System.out.println("택시의 속도는 "+speed);
    }

    //거리당 요금 추가
    public void distance(int desDist) {
        if(basicDist<desDist){
            this.distmoney = desDist-basicDist; //목적지 거리에서 기본거리 뺸거
            this.totalmoney = basicmoney+distmoney*2; //기본요금 + 거리당요금 (추가된 1거리당 2배)
        }
    }

    //요금 결제 메서드
    public void totalMoney() {
        System.out.println("최종요금은 "+totalmoney+" 입니다.");
    }
}
