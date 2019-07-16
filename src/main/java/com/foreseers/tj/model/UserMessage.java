package com.foreseers.tj.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class UserMessage implements Serializable {
    private Integer id;

    /**
     * 留言内容
     */
    private String comment;

    private Integer goodsid;

    private String msgauthorname;

    private String msgauthorimg;

    private String msgauthoropenid;

    private Date msgdate;

    private Date updated;

    private Integer replyCommentId;
    
    private String replyUserName;
    
    private static final long serialVersionUID = 1L;

    
    
    public Integer getReplyCommentId() {
		return replyCommentId;
	}

	public void setReplyCommentId(Integer replyCommentId) {
		this.replyCommentId = replyCommentId;
	}

	public String getReplyUserName() {
		return replyUserName;
	}

	public void setReplyUserName(String replyUserName) {
		this.replyUserName = replyUserName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getMsgauthorname() {
        return msgauthorname;
    }

    public void setMsgauthorname(String msgauthorname) {
        this.msgauthorname = msgauthorname;
    }

    public String getMsgauthorimg() {
        return msgauthorimg;
    }

    public void setMsgauthorimg(String msgauthorimg) {
        this.msgauthorimg = msgauthorimg;
    }

    public String getMsgauthoropenid() {
        return msgauthoropenid;
    }

    public void setMsgauthoropenid(String msgauthoropenid) {
        this.msgauthoropenid = msgauthoropenid;
    }

    public Date getMsgdate() {
        return msgdate;
    }

    public void setMsgdate(Date msgdate) {
        this.msgdate = msgdate;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserMessage other = (UserMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getMsgauthorname() == null ? other.getMsgauthorname() == null : this.getMsgauthorname().equals(other.getMsgauthorname()))
            && (this.getMsgauthorimg() == null ? other.getMsgauthorimg() == null : this.getMsgauthorimg().equals(other.getMsgauthorimg()))
            && (this.getMsgauthoropenid() == null ? other.getMsgauthoropenid() == null : this.getMsgauthoropenid().equals(other.getMsgauthoropenid()))
            && (this.getMsgdate() == null ? other.getMsgdate() == null : this.getMsgdate().equals(other.getMsgdate()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getMsgauthorname() == null) ? 0 : getMsgauthorname().hashCode());
        result = prime * result + ((getMsgauthorimg() == null) ? 0 : getMsgauthorimg().hashCode());
        result = prime * result + ((getMsgauthoropenid() == null) ? 0 : getMsgauthoropenid().hashCode());
        result = prime * result + ((getMsgdate() == null) ? 0 : getMsgdate().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return result;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserMessage [");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		if (comment != null)
			builder.append("comment=").append(comment).append(", ");
		if (goodsid != null)
			builder.append("goodsid=").append(goodsid).append(", ");
		if (msgauthorname != null)
			builder.append("msgauthorname=").append(msgauthorname).append(", ");
		if (msgauthorimg != null)
			builder.append("msgauthorimg=").append(msgauthorimg).append(", ");
		if (msgauthoropenid != null)
			builder.append("msgauthoropenid=").append(msgauthoropenid).append(", ");
		if (msgdate != null)
			builder.append("msgdate=").append(msgdate).append(", ");
		if (updated != null)
			builder.append("updated=").append(updated).append(", ");
		if (replyCommentId != null)
			builder.append("replyCommentId=").append(replyCommentId).append(", ");
		if (replyUserName != null)
			builder.append("replyUserName=").append(replyUserName);
		builder.append("]");
		return builder.toString();
	}

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getClass().getSimpleName());
//        sb.append(" [");
//        sb.append("Hash = ").append(hashCode());
//        sb.append(", id=").append(id);
//        sb.append(", comment=").append(comment);
//        sb.append(", goodsid=").append(goodsid);
//        sb.append(", msgauthorname=").append(msgauthorname);
//        sb.append(", msgauthorimg=").append(msgauthorimg);
//        sb.append(", msgauthoropenid=").append(msgauthoropenid);
//        sb.append(", msgdate=").append(msgdate);
//        sb.append(", updated=").append(updated);
//        sb.append(", serialVersionUID=").append(serialVersionUID);
//        sb.append("]");
//        return sb.toString();
//    }
}