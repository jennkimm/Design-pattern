package ch02.Sample;

public class PrintBannerAdapter2 implements Print {
	Banner banner;
	
	public PrintBannerAdapter2(String string) {
		this.banner=new Banner(string); //Banner °´Ã¼ »ý¼ºÇÔ
	}
	
	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		banner.showWithAster();
	}

}
