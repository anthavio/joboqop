package net.anthavio.joboqop;

import java.util.List;

/**
 * 
 * @author vanek
 *
 */
public interface JobRepository {

	public JobQueue createQueue(String name, Class<? extends JobToDo> jobClass);

	public JobQueue getQueue(String name);

	public List<JobQueue> getQueues();

	public void removeQueue(String name);

	public JobRecord addJob(JobQueue queue, String dataId);

	public JobRecord addJob(JobQueue queue, long dataId);

	public List<JobRecord> getJobs(String queueName);

}
