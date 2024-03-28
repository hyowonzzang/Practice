package com.javaex.oop.tv;

// 채널 범위 1~255
// 볼륨 범위 0~100

public class TV {
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_CHANNEL = 255;
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;
	// 필드
	private int volume;
	private int channel;
	private boolean power;

	public TV() {
		this ( 7,20,false);
		//내부 다른 생성자 호출

	}

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public boolean isPower() {
		return power;
	}

	public int getVolume() {
		return volume;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel = channel;
		}
	}

	public void channel(boolean up) {
		if (up) {
			if (this.channel < MAX_CHANNEL) {// 쵀대 채널에 도달하지 않음
				this.channel++;
			} else {
				if (this.channel > MIN_CHANNEL) {// 최소 채널에 도달하지 않음
					this.channel--;
				}
			}
		}
	}

	public void volume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if (up) {
			if (volume < MAX_VOLUME) {// 쵀대 볼륨에 도달하지 않음
				this.volume++;
			} else {
				if (volume > MIN_VOLUME) {// 최소 볼륨에 도달하지 않음
					this.volume--;
				}
			}
		}
	}

	public void status() {
		if (power) { // TV가 켜져있을때만 정보를 보여주자
			System.out.println("전원: 켜짐");
			System.out.println("현재 채널: " + channel);
			System.out.println("현재 음량: " + volume);
			System.out.println();
		}
		else {
			System.out.println("전원 꺼지이임");
			System.out.println();
		}
	}
}
