package com.saravanan;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



import java.util.Set;

import redis.clients.jedis.Jedis;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String url = "http://est.cisco.com/eaas_cmis_proxy/$EST$/exams/cct_overview.pdf";
		String[] keys = url.split("\\$EST\\$/");
		for(String key:keys){
			System.out.println("==="+key);
		}
		System.out.println(keys.length);*/
		/*
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(1505125840798L);
		System.out.println(cal.getTime());*/
		Jedis jedis = new Jedis("10.126.100.101",6379); 
		jedis.connect();
	      System.out.println("Connection to server sucessfully"); 
	      //check whether server is running or not 
	      System.out.println("Server is running: "+jedis.ping());
	      
	      System.out.println(jedis.dbSize());
	      
	      Set<String> keys=jedis.keys("*");
	      System.out.println(keys.size());
	      java.util.Iterator<String> it = keys.iterator();
	        while(it.hasNext()) {
	            String s = it.next();
	            System.out.println(s + " : " + jedis.get(s));
	        }
	      
	      //RedisStore redisStore = new RedisStore(redisURL, port);
	}
	Iterator<QuestionDetails> iterator;
	public void open(Object appContext, Map<String, Object> dataSetParmValues){
		/*List<QuestionDetails> questionDetails = new Test().getQuestionDetails();
		iterator = questionDetails.iterator();*/
	};
	
	public Object next(){
		if(iterator.hasNext())
			return iterator.next();
		return null;
	}
	
	public void close(){
		iterator = null;
	}

}
