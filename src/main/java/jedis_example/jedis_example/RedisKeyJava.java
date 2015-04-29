package jedis_example.jedis_example;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisKeyJava {
	public static void main(String[] args) {
		// Connecting to Redis server on 192.168.0.81
		Jedis jedis = new Jedis("192.168.0.81");
		System.out.println("Connection to server sucessfully");
		// store data in redis list
		// Get the stored data and print it
		Set<String> set = jedis.keys("*");

		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println("Set of stored keys:: " + i.next());
		}
	}
}