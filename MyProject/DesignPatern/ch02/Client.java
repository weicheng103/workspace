package ch02;

public class Client {
	public static void main(String[] args){
		Api api = Factory.createApi(1);
		api.operation("正在使用impl1, 簡單工廠");
	}
}
