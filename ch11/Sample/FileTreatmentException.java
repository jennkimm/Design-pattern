package ch11.Sample;

//예외처리를 하려면 예외클래스를 만들어라 방법은 2가지
//1) RuntimeException을 상속받거나,
//2) Exception을 상속받으면 됨
public class FileTreatmentException extends Exception{
//public class FileTreatmentException extends RuntimeException {
	//인자 있는애와 없는애
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) {
    	//부모생성자 호출
        super(msg);
    }
}
