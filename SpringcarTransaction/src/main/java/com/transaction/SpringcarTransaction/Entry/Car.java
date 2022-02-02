package com.transaction.SpringcarTransaction.Entry;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Car {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long CarNumber;
		private String CarName;
		private String color;
		private String Model;
		private int Age;
		public Long getCarNumber() {
			return CarNumber;
		}
		public void setCarNumber(Long carNumber) {
			CarNumber = carNumber;
		}
		public String getCarName() {
			return CarName;
		}
		public void setCarName(String carName) {
			CarName = carName;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getModel() {
			return Model;
		}
		public void setModel(String model) {
			Model = model;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public Car(Long carNumber, String carName, String color, String model, int age) {
			super();
			CarNumber = carNumber;
			CarName = carName;
			this.color = color;
			Model = model;
			Age = age;
		}
		@Override
		public String toString() {
			return "Car [CarNumber=" + CarNumber + ", CarName=" + CarName + ", color=" + color + ", Model=" + Model
					+ ", Age=" + Age + "]";
		}
}
