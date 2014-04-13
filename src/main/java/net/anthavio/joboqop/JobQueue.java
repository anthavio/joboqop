package net.anthavio.joboqop;

/**
 * 
 * @author vanek
 *
 */
public class JobQueue {

	private Integer id;

	private String name;

	private String jobClass;

	public JobQueue(String name, String jobClass) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Null or empty name");
		}
		this.name = name;

		if (jobClass == null || jobClass.isEmpty()) {
			throw new IllegalArgumentException("Null or empty jobClass");
		}
		this.jobClass = jobClass;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getJobClass() {
		return jobClass;
	}

}
