package ch20.Sample;
public class Main {
	// ����� ���ڷ� ���� ���ڿ��� �����ڷ� �ؼ�, 
	// BigString( ) ��ü�� �����Ѵ�.
    public static void main(String[] args) {
    	//����� ���� �˻�
    	String s="1212123";
    	BigChar[] bigChars=new BigChar[s.length()];
    	
    	// �޸� �����. flyweight ������ �̿��ؼ� ���� ������. 
    	/*for(int i=0;i<s.length();i++) {
    		bigChars[i]=new BigChar(s.charAt(i));
    		bigChars[i].print();
    	}*/
    	
    	BigCharFactory f=BigCharFactory.getInstance();
    	BigChar bc1=f.getBigChar('1');
    	bc1.print();
    	
    	BigString bs = new BigString("1212123");
    	bs.print();
    	
    	/*
    	BigChar bc1=new BigChar('1'); //big1.txt
    	BigChar bc2=new BigChar('2'); //big1.txt
    	BigChar bc3=new BigChar('1'); //big1.txt
    	BigChar bc4=new BigChar('2'); //big1.txt
    	BigChar bc5=new BigChar('1'); //big1.txt
    	BigChar bc6=new BigChar('2'); //big1.txt
    	BigChar bc7=new BigChar('3'); //big1.txt
    	
    	bc1.print();
    	bc2.print();
    	bc3.print();
    	bc4.print();
    	bc5.print();
    	bc6.print();
    	bc7.print();
    */
    	//"12122123"
    	/*
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
        */
    }
}
