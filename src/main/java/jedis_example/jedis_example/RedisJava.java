package jedis_example.jedis_example;

import redis.clients.jedis.Jedis;

public class RedisJava {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.0.81");
		System.out.println("Connection to server successfully!!");
		System.out.println("Server is running : " + jedis.ping());
	}
}
