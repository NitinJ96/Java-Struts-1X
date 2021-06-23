package com.example.jdbc.JDBC.Tempalate;

public class ChatBotPojo {
	private long DAT006_USG_HIST_K;
	private byte[] DAT006_CHAT_HIST_O;
	private String DAT006_STR_RSPND_X;

	public ChatBotPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChatBotPojo(long dAT006_USG_HIST_K, byte[] dAT006_CHAT_HIST_O, String dAT006_STR_RSPND_X) {
		super();
		DAT006_USG_HIST_K = dAT006_USG_HIST_K;
		DAT006_CHAT_HIST_O = dAT006_CHAT_HIST_O;
		DAT006_STR_RSPND_X = dAT006_STR_RSPND_X;
	}

	public long getDAT006_USG_HIST_K() {
		return DAT006_USG_HIST_K;
	}

	public void setDAT006_USG_HIST_K(long dAT006_USG_HIST_K) {
		DAT006_USG_HIST_K = dAT006_USG_HIST_K;
	}

	public byte[] getDAT006_CHAT_HIST_O() {
		return DAT006_CHAT_HIST_O;
	}

	public void setDAT006_CHAT_HIST_O(byte[] dAT006_CHAT_HIST_O) {
		DAT006_CHAT_HIST_O = dAT006_CHAT_HIST_O;
	}

	public String getDAT006_STR_RSPND_X() {
		return DAT006_STR_RSPND_X;
	}

	public void setDAT006_STR_RSPND_X(String dAT006_STR_RSPND_X) {
		DAT006_STR_RSPND_X = dAT006_STR_RSPND_X;
	}

}
