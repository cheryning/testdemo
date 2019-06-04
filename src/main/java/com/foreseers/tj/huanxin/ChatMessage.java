package com.foreseers.tj.huanxin;

public class ChatMessage {

	
	String  msg_id ;
	String  timestamp;
	String  direction;
	String  from_user;
	String to_user;
	String msg;
	String type;
	String url;
	public String getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(String msg_id) {
		this.msg_id = msg_id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getFrom_user() {
		return from_user;
	}
	public void setFrom_user(String from_user) {
		this.from_user = from_user;
	}
	public String getTo_user() {
		return to_user;
	}
	public void setTo_user(String to_user) {
		this.to_user = to_user;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "ChatMessage [msg_id=" + msg_id + ", timestamp=" + timestamp + ", direction=" + direction
				+ ", from_user=" + from_user + ", to_user=" + to_user + ", msg=" + msg + ", type=" + type + ", url="
				+ url + ", getMsg_id()=" + getMsg_id() + ", getTimestamp()=" + getTimestamp() + ", getDirection()="
				+ getDirection() + ", getFrom_user()=" + getFrom_user() + ", getTo_user()=" + getTo_user()
				+ ", getMsg()=" + getMsg() + ", getType()=" + getType() + ", getUrl()=" + getUrl() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
