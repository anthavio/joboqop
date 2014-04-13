package net.anthavio.joboqop;

/**
 * 
 * @author vanek
 *
 */
public interface JobToDo {

	public void execute(String queueName, Long id);
}
