package ch04.Sample;

import ch04.Sample.framework.*;

import ch04.Sample.idcard.*;

public class Main {
    public static void main(String[] args) {
      //(1) IDCard ��������
      //IDCard id1 = new IDCard("�輭��");
      //id1.use();

      //(2) IDCard�� ������ ���ؼ� ����
    	Factory f1=new IDCardFactory();
    	f1.create("�ֽ���"); //�ź��� ���� �� ����� ��.
    	//�׻� ���� ���ϰ� ������ ���ؼ� �ϴ� ����ȭ.
    	//���� ��ü�� ������ �ʰ� ������ ���ؼ� �����.
    	//Ŭ���̾�Ʈ���忡���� ������. �������׸� ��Ź�ϸ� �˾Ƽ� ���ش�.
    	
    	Product id1=f1.create("�ֽ���"); //�ź��� ���� �� ����� ��
    	id1.use();
    	
    	f1.create("��1");
    	f1.create("��2");
    	f1.create("��3");
    	f1.create("��4");
    	f1.create("��5");
    	
    	
    	System.out.println(((IDCardFactory)f1).getOwners() );
      
      
    }
}
