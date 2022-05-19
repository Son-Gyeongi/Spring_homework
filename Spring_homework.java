package Spring_homework;

public class Spring_homework {
    public static void main(String[] args) {

        //버스 객체 선언, 생성
        Bus bus100 = new Bus(100,10 ,30,3,30,50);
        Bus bus200 = new Bus(200, 14,80,1,9, 40);
        Bus bus300 = new Bus(300, 20,20,1,9, 40);

        //버스 상태 변경 메서드 호출
        bus100.busState(12,false);  //운행을 종료합니다. 차고지행
        bus200.busState(8,true);    //주유가 필요합니다 / 운행을 종료합니다. 차고지행

        //운행 메서드
        bus100.busRun(20);
        bus100.busEnd();              //운행을 종료합니다 .차고지행

        bus200.busRun(3);        //주유량을 확인해 주세요
        bus200.busEnd();             //운행을 종료합니다 .차고지행

        //승객 탑승 메서드
        bus100.take(3,true);     //3 요금 받았습니다 / 현재 버스 승객 수는 11
        bus200.take(4, false);     //4 요금 받았습니다 / 현재 버스 승객 수는 15
        bus300.take(5, true);     //최대 승객 수 일 때 - 현재 버스 승객 수는 20

        //속도 변경 메서드
        bus100.change_speed(-5);     //현재 속도는 45
        bus200.change_speed(15);     //주유량을 확인해주세요. / 현재 속도는 55



        //택시 객체 선언, 생성
        Taxi taxi1 = new Taxi(1,17, 50,3, 3);
        Taxi taxi2 = new Taxi(2,7, 30,5, 5);

        //운행 시작 메서드
        taxi1.taxiRun();    //택시 운행 가능한 상태입니다
        taxi2.taxiRun();    //연료를 채워주세요

        //승객 탑승 메서드
        taxi1.take(true);     //승객이 탑승을 했습니다
        taxi2.take(false);     //택시에 탑승 불가입니다.

        //속도 변경 메서드
        taxi1.change_speed(-25);     //택시의 속도는 25
        taxi2.change_speed(30);      //택시의 속도는 60

        //거리당 요금 추가
        taxi1.distance(13);
        taxi2.distance(9);

        //요금 결제 메서드
        taxi1.totalMoney();     //최종요금은 23 입니다.
        taxi2.totalMoney();     //최종요금은 13 입니다.
    }
}
