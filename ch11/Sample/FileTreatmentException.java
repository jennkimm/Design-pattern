package ch11.Sample;

//����ó���� �Ϸ��� ����Ŭ������ ������ ����� 2����
//1) RuntimeException�� ��ӹްų�,
//2) Exception�� ��ӹ����� ��
public class FileTreatmentException extends Exception{
//public class FileTreatmentException extends RuntimeException {
	//���� �ִ¾ֿ� ���¾�
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) {
    	//�θ������ ȣ��
        super(msg);
    }
}
