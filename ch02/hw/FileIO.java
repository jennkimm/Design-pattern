package ch02.hw;

import java.io.*;


// Main(client)�� �ʿ���ϴ� �޼ҵ�
public abstract class FileIO {
    public void readFromFile(String filename) throws IOException{};
    public void writeToFile(String filename) throws IOException{};
    public void setValue(String key, String value) {};
    public String getValue(String key) {
		return "";};
}
