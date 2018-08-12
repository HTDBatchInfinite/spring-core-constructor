package org.nit.upendra.spring.beans;

public class Trade {

	private String tradetype;
	private int tradeid;
	private int tradeamount;
	private String tradepercent;
	
	
	Trade(String tradetype, int tradeid) {

		this.tradetype = tradetype;
		this.tradeid = tradeid;

	}
	
	Trade(int tradeamount, String tradepercent) {

		this.tradeamount = tradeamount;
		this.tradepercent = tradepercent;

	}

	public String getTradetype() {
		return tradetype;
	}
	
	
	public int getTradeid() {
		return tradeid;
	}

	public int getTradeamount() {
		return tradeamount;
	}

	public String getTradepercent() {
		return tradepercent;
	}
	
	

}
