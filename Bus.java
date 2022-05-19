package Spring_homework;

public class Bus {
    int maxPassenger;  //최대 승객수
    int nowPassenger;  //현재 승객수
    int money;       //요금
    int busNumber;  //버스 번호 - 객체 생성 시 번호 고유값(클래스 변수)
    int fuel;     //주유량
    int speed;    //현재 속도
    boolean busCondition = true;  //운행:true, 차고지 행:false

    //busNumber, speed를 매개변수로 하는 Bus클래스 생성자 생성
    public Bus(int busNumber, int nowPassenger, int maxPassenger, int money, int fuel, int speed){
        this.busNumber=busNumber;
        this.nowPassenger=nowPassenger;
        this.maxPassenger=maxPassenger;
        this.money=money;
        this.fuel=fuel;
        this.speed=speed;
    }

    //승객 탑승 메서드
    public void take(int money, boolean busCondition){ //void 반환하는 건 없다.
        if(this.busCondition && nowPassenger<maxPassenger) {
            this.money += money;
            this.nowPassenger++;
            System.out.println(money+" 요금 받았습니다");
        }
        System.out.println("현재 버스 승객 수는 "+nowPassenger);
        //손님이 bus를 탔을 때 매개변수 money만큼 멤버 변수 money를
        //증가시키면서 passengerCount도 1증가하는 take메서드를 작성
    }

    //버스 상태 변경 메서드
    public void busState(int fuel, boolean busCondition) {
        if(fuel<this.fuel || !busCondition){
            if(fuel<10){
                System.out.println("주유가 필요합니다");
                System.out.println("운행을 종료합니다. 차고지행");
                this.busCondition = false;
            } else {
                System.out.println("운행을 종료합니다. 차고지행");
                this.busCondition = false;
            }
        }
    }

    //운행 메서드
    public void busRun(int fuel) {
        this.busCondition =true;
        if(fuel<10){
            System.out.println("주유량을 확인해 주세요");
        }
    }
    public void busEnd() {
        this.busCondition =false;
        System.out.println("운행을 종료합니다 .차고지행");
        //차고지행?? 어디로 보내는거지 그냥 말로서 간단하게 나타내려고 한거 같다
    }


    //속도 변경 메서드
    public void change_speed(int i){
        if(fuel<10){
            this.busCondition=false;
            System.out.println("주유량을 확인해주세요.");
        }
        this.speed +=i;

        System.out.println("버스 속도는 "+speed);
    }
}

