package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
	public class Employee {

		@Id
		@Column(name = "Id")
		private String id;

		@Column(name = "First_Name")
		private String fname;

		@Column(name = "Last_Name")
		private long lname;

		@Column(name = "Email")
		private String email;
		
		@Column(name = "Age")
		private String age;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(String id, String fname, long lname, String email, String age) {
			super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.age = age;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public long getLname() {
			return lname;
		}

		public void setLname(long lname) {
			this.lname = lname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}
		
		
}
