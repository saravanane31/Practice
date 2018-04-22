package com.saravanan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		if(a>1){
			System.out.println("a > 0");
		}else
		for(int i=0;i<=3;i++){
			System.out.println(i);
		}
		Test test = new Test();
		//test.dbConnection();
		Long lmId = 9825L;
		String startDate = "2017-06-28";
		String endDate = "2017-06-29";
		Date endDate1=new Date();
		test.getQuestionDetails(lmId,startDate,endDate1);
	}
	
	
	//@SuppressWarnings("unused")
	public Test(){
		
	};
	
	public List<QuestionDetails> getQuestionDetails(Long lmId, String startDate, Date endDate){
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
	      final String DB_URL="jdbc:mysql://localhost/eaas_s4";

	      //  Database credentials
	      final String USER = "root";
	      final String PASS = "";
	      Connection conn = null ;
	      Statement stmt= null;
	      ResultSet rs = null;
	      Statement stmt1 = null;
	      ResultSet rs1 = null;
	      List<QuestionDetails> questionDetails = new ArrayList<QuestionDetails>();
	      try{
	          // Register JDBC driver
	          Class.forName("com.mysql.jdbc.Driver");

	          // Open a connection
	          conn= DriverManager.getConnection(DB_URL, USER, PASS);

	          // Execute SQL query
	          stmt = conn.createStatement();
	          stmt1 = conn.createStatement();
	          String sql;
	          sql = "select title from ep_learning_module where id="+lmId;
	          rs = stmt.executeQuery(sql);
	          String title="";
	          while(rs.next()){
	        	  title = rs.getString("title");
	          }
	          sql = "SELECT id FROM eaas_s4.ep_lm_exam_units where learning_module_id="+lmId;
	          rs = stmt.executeQuery(sql);
	          	System.out.println("DBConnection----");
	          // Extract data from result set
	          	List<Long> lmUnitId = new ArrayList<Long>();
	          	List<Long> objectiveId = new ArrayList<Long>();
	          	List<Long> questionId = new ArrayList<Long>();
	          	//Map<String,Integer> map = new HashMap<String, Integer>();
	          	
	          while(rs.next()){
	             //Retrieve by column name
	            lmUnitId.add(rs.getLong("id"));
	          }
	          
	          if(lmUnitId!=null && lmUnitId.size()>0){
	        	  for(Long id:lmUnitId){
	        		  System.out.println("lmUnitId---"+id);
	        		  sql="select id from ep_unit_objective where lmExamUnitId="+id;
	        		  rs = stmt.executeQuery(sql);
	        		  
	        		  while(rs.next()){
	        			  objectiveId.add(rs.getLong("id"));
	        		  }
	        		  
	        		  
	        	  }
	          }
	          if(objectiveId!=null && objectiveId.size()>0){
    			  for(Long objId:objectiveId){
    				  System.out.println("ObjectiveId---"+objId);
    				  sql = "select questionId from ep_objective_question_x where objectiveId="+objId;
    				  rs = stmt.executeQuery(sql);
    				  while(rs.next()){
    					 // if(questionId.size()<5){
    					  questionId.add(rs.getLong("questionId"));
    					 // }
    				  }
    			  }
    		  }
	          
	          if(questionId!=null && questionId.size()>0){
	        	  System.out.println("questionId Size ----"+questionId.size());
	        	  for(Long qusId:questionId){
	        		  System.out.println("questionId---"+qusId);
	        		  int wronglyAnswered =0;
	        		  int notAnswered = 0;
	        		  String question=null;
	        		  String answerValue=null;
	        		  List<String> answerValueType1 = new ArrayList<String>();
	        		  int typeId=0;
	        		  sql = "select question,type_ from ep_questions where id="+qusId;
	        		  rs = stmt.executeQuery(sql);
	        		  while(rs.next()){
	        			  question = rs.getString("question");
	        			  typeId = rs.getInt("type_");
	        		  }
	        		  if(question!=null){
	        			  
	        			  sql="select qstnAnsId from ep_questions_answers_x where questionId="+qusId+" and correctAnsFlag=1";
	        			  rs=stmt.executeQuery(sql);
	        			  if(typeId==2 || typeId==3){
		        			  while(rs.next()){
		        				  answerValue=String.valueOf(rs.getLong("qstnAnsId"));
		        			  }
	        			  }else if(typeId==1 || typeId==4){
	        				  while(rs.next()){
	        					  answerValueType1.add(String.valueOf(rs.getLong("qstnAnsId")));
		        			  }
	        			  }
	        			 
	        		  sql = "select atmtQAId from ep_exam_history where atmtQAId like '%"+qusId+"%'";
	        		  if(startDate!=null && !startDate.isEmpty()){
	        			  sql = sql.concat(" and completionDateTime>='"+startDate+"'");
	        		  }
	        		  if(endDate !=null){
	        			  sql = sql.concat(" and completionDateTime<='"+endDate+"'");
	        		  }
	        		  System.out.println(sql);
	        		  rs = stmt.executeQuery(sql);
	        		  while(rs.next()){
	        			  String atmtQAId = rs.getString("atmtQAId");
	        			  String array[] = atmtQAId.split("\\|");
	        				for(int i=0; i<array.length;i++){
	        					if(array[i].contains(String.valueOf(qusId))){
	        						String answer[] = array[i].split("-");
	        						if(answer.length>1){
	        							if(typeId==2 || typeId==3){
		        							if(!answer[1].contains(answerValue)){
		        								if(answer[1].endsWith(",")){
		        									answer[1] = answer[1].substring(0, answer[1].length()-1);
		        								}
		        								
		        								sql="select * from ep_questions_answers_x where qstnAnsId="+answer[1];
		        								rs1 = stmt1.executeQuery(sql);
		        								while(rs1.next()){
		        									if(!rs1.getBoolean("correctAnsFlag")){
		        										wronglyAnswered++;
		        									}
		        								}
		        								
		        								
		        							}
	        							}else if(typeId==1 || typeId==4){
	        								System.out.println("correct Answer--"+answer[1]);
	        								String type1AnswerArray[] = answer[1].split(",");
	        								List<String> type1AnswerList = Arrays.asList(type1AnswerArray);
	        								for(String answered:answerValueType1){
	        									System.out.println("Answered--"+answered);
	        								}
	        								if(!type1AnswerList.containsAll(answerValueType1)){
	        									if(answer[1].endsWith(",")){
		        									answer[1] = answer[1].substring(0, answer[1].length()-1);
		        								}
	        									sql = "select * from ep_questions_answers_x where qstnAnsId in ("+answer[1]+")";
	        									System.out
														.println(sql);
	        									rs1 = stmt1.executeQuery(sql);
	        									boolean flag = true;
	        									while(rs1.next()){
	        										if(!rs1.getBoolean("correctAnsFlag")){
	        											flag = false;
	        											break;
	        										}
	        									}
	        									if(!flag){
	        										wronglyAnswered++;
	        									}
	        								}
	        							}
	        						}else{
	        							notAnswered++;
	        						}
	        					}
	        				}
	        		  }
	        		  
	        		  questionDetails.add(new QuestionDetails(title,qusId, question, notAnswered, wronglyAnswered));
	        		  
	        		  }
	        		  
	        		  
	        		  
	        	  }
	          
	          }
	          
	          
	          
	          if(questionDetails!=null && questionDetails.size()>0){
	        	  for(QuestionDetails questionDetail : questionDetails){
	        		  System.out.println(questionDetail.getExamName()+"=="+questionDetail.getQuestionId()+"==="+questionDetail.getQuestion()+"===="+questionDetail.getCount()+"==="+questionDetail.getWronglyAnsweredCount());
	        	  }
	          }
	          // Clean-up environment
	         
	         // return questionDetails;
	       }catch(SQLException se){
	          //Handle errors for JDBC
	          se.printStackTrace();
	       }catch(Exception e){
	          //Handle errors for Class.forName
	          e.printStackTrace();
	       }finally{
	    	   
	    	   if(rs1!=null){
	    		   try {
					rs1.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	   }
	    	   if(stmt1!=null){
	    		   try {
					stmt1.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	   }
	    	   
	    	   if(rs!=null){
	    		   try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	   }
	    	   
	    	  if(stmt!=null){
	    		  try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	  }
	    	   
	    	   if(conn!=null){
	    			   try {
	    			   conn.close();
	    		   } catch (SQLException e) {
	   				// TODO Auto-generated catch block
	   				e.printStackTrace();
	   			}
	    		}
			
	       }
		return questionDetails;
	}

}
