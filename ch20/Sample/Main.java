package ch20.Sample;
public class Main {
	// 명령행 인자로 들어온 문자열을 실인자로 해서, 
	// BigString( ) 객체를 생성한다.
    public static void main(String[] args) {
    	//명령행 인자 검사
    	String s="1212123";
    	BigChar[] bigChars=new BigChar[s.length()];
    	
    	// 메모리 낭비다. flyweight 패턴을 이용해서 낭비를 줄이자. 
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
