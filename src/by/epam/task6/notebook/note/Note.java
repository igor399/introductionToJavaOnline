package by.epam.task6.notebook.note;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Note {
	/**
	 * Contains the topic of the note
	 */
	private String topic;
	/**
	 * Contains date of creation
	 */
	private Date creationDate;
	/**
	 * Contains email
	 */
	private String email;
	/**
	 * Contains message
	 */
	private String msg;

	/**
	 * Creates new Note
	 *
	 * @param topic
	 * @param creationDate
	 * @param email
	 * @param message
	 */
	public Note(String topic, Date creationDate, String email, String message) {
		this.topic = topic;
		this.creationDate = creationDate;
		this.email = email;
		this.msg = message;
	}

	/**
	 * Returns topic of the note
	 *
	 * @return
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * Sets topic of the note
	 *
	 * @param topic
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * Returns date of creation
	 *
	 * @return
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets date of creation
	 *
	 * @param creationDate
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Returns an email
	 *
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets email for note
	 *
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns message of the note
	 *
	 * @return
	 */
	public String getMessage() {
		return msg;
	}

	/**
	 * Sets message for the note
	 *
	 * @param msg
	 */
	public void setMessage(String msg) {
		this.msg = msg;
	}

	/**
	 * Represents note as a string
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return topic + "|" + email + "|" + msg + "|" + dateFormat.format(creationDate);
	}
}
