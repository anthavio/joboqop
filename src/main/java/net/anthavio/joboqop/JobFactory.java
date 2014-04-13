package net.anthavio.joboqop;

/**
 * 
 * @author vanek
 *
 */
public interface JobFactory {

	/**
	 * 
	 */
	public JobToDo create(JobQueue queue, JobRecord record);

	public static class DefaultJobFactory implements JobFactory {
		
		//private 

		@Override
		public JobToDo create(JobQueue queue, JobRecord record) {
			String jobClassName = queue.getJobClass();
			Class<?> jobClass;
			try {
				jobClass = Class.forName(jobClassName);
			} catch (ClassNotFoundException cnfx) {
				cnfx.printStackTrace();
			}
			return (JobToDo) jobClass.newInstance();
		}

	}
}
