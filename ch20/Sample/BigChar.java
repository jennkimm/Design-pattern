package ch20.Sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// ‘큰 문자’를 나타내는 클래스
// 파일로부터 큰 문자의 텍스트를 읽어 메모리 상에 로드하고, 
// print 메소드에서 그것을 표시한다.
// 큰 문자는 메모리를 많이 차지하므로, BigChar의 인스턴스를 공유하자.
public class BigChar {
	// 문자의 이름
	private char charname;

	// 큰 문자를 표현하는 문자열
	private String fontdata; //big1.txt의 내용을 가짐.

	// 인수로 제공된 문자의 ‘큰 문자’ 버전을 작성한다.
	public BigChar(char charname) {
		this.charname = charname;
		try {
			//버퍼: 파일 내용을 미리 여러줄 읽어들임
			BufferedReader reader = new BufferedReader(new FileReader("big"+ charname + ".txt")); //버퍼를 이용해서 파일을 읽겠다. 버퍼는 메모리 속도를 높여주기 위해서 
			String line;
			StringBuffer buf = new StringBuffer();
			// 파일로부터 한 라인씩 읽어서, “\n”과 함께 buf 에 추가한다.
			// 한줄 읽어서 line에 넣은다음에, 버퍼에 추가하는 식으로..
			// 버퍼가 계속 추가될 것임. 
			while ((line = reader.readLine()) != null) {
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontdata = buf.toString();  // 작성된 문자열을 fontdata에 저장함
		} catch (IOException e) {
			this.fontdata = charname + "?";
		}
	}

	// 큰 문자를 표시한다.
	public void print() {
		System.out.print(fontdata);
	}
}
