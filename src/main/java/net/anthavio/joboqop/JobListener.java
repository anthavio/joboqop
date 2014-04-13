package net.anthavio.joboqop;

/**
 * 
 * @author vanek
 *
 */
public interface JobListener {

	public void onCreated();

	public void onStarted();

	public void onFinished();

	public void onFailed();
}
