package com.tiy.practice;

public class SportsCar extends Car {

	/*public void accelerate() {
		if (this.carStatus.equals("not started")) {
			System.out.println("You can't accelerate because the car has not been started!");
		} else if ((this.currentSpeed + 10) > 85) {
			System.out.println("You cannot accelerate past 85mph!");
			this.currentSpeed = 85;
			System.out.println("Current speed: " + this.currentSpeed + "mph");
		} else {
			this.currentSpeed += 10;
			System.out.println("Current speed: " + this.currentSpeed + "mph");
		}
	} */

	public void accelerate() throws Exception {
		if (this.carStatus.equals("not started")) {
			throw new Exception("You must start the car before you can accelerate!");
		}
		if ((this.currentSpeed + 10) > 85) {
			this.currentSpeed = 85;
			System.out.println("Current speed: " + this.currentSpeed + " mph");
			throw new Exception("You cannot exceed 85 mph!");
		}
		this.currentSpeed += 10;
		System.out.println("Current speed: " + this.currentSpeed + " mph");
	}

	public void brake() throws Exception {
		if (this.currentSpeed == 0) {
			throw new Exception("You can't brake because the car is not moving.");
		}
		this.currentSpeed -= 5;
		System.out.println("Current speed: " + this.currentSpeed + " mph");
	}
	
}