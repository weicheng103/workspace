package ch02;

public class Client {
	public static void main(String[] args){
		Api api = Factory.createApi(1);
		api.operation("���b�ϥ�impl1, ²��u�t");
	}
}
