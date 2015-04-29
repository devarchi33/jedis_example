package jedis_example.jedis_example;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

public class RedisListJava {

	public static void main(String[] args) {
		try {
			// Connecting to Redis server
			Jedis jedis = new Jedis("192.168.0.81");
			System.out.println("Connection successfully!!");
			// store data in redis list
			jedis.lpush("tutorial-list", "Redis");
			jedis.lpush("tutorial-list", "MongoDB");
			jedis.lpush("tutorial-list", "MySQL");
			// get the stored data and print it
			List<String> list = jedis.lrange("tutorial-list", 0, 5);
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Stored string in redis : " + list.get(i));
			}
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		}
	}
}