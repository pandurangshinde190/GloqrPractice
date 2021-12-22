package com.spring.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(updatable = false, nullable = false)
	Long id;

	@Column
	String title;

	@Column
	String description;

	@Column
	@Enumerated(EnumType.STRING)
	TodoStatus todoStatus;

	@CreationTimestamp
	@Column(updatable = false)
	Timestamp dateCreated;

	@UpdateTimestamp
	Timestamp lastModified;

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(Long id, String title, String description, TodoStatus todoStatus, Timestamp dateCreated,
			Timestamp lastModified) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.todoStatus = todoStatus;
		this.dateCreated = dateCreated;
		this.lastModified = lastModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TodoStatus getTodoStatus() {
		return todoStatus;
	}

	public void setTodoStatus(TodoStatus todoStatus) {
		this.todoStatus = todoStatus;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getLastModified() {
		return lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", todoStatus=" + todoStatus
				+ ", dateCreated=" + dateCreated + ", lastModified=" + lastModified + "]";
	}


}
