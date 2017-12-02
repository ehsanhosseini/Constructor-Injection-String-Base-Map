package StringMap;

import java.util.Map;

public class Question {

	private int id;
	private String name;
	private Map<String,String> answer;
	
	public Question(int id, String name, Map<String, String> answer) {
		this.id=id;
		this.name=name;
		this.answer=answer;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println("Answers Are:: ");
	
	for(Map.Entry<String,String> obj:answer.entrySet()) {
		System.out.println(obj.getKey()+" "+obj.getValue());
	}
}
}