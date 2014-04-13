package net.anthavio.joboqop;

import java.io.Closeable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author vanek
 *
 */
public class Joboqop implements Closeable {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public JobQueue createQueue(String queueName, Class<? extends JobToDo> jobClass) {
		return new JobQueue(queueName, jobClass.getName());
	}

	public JobRecord addJob(JobQueue queue, String externalId) {
		return new JobRecord();
	}

	public void start() {

	}

	/**
	 * identical to close()
	 */
	public void stop() {
		close();
	}

	@Override
	public void close() {

	}
}
