package com.foreseers.tj.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Goods implements Serializable {
    private Integer id;

    /**
     * 商品名称
     */
    private String goodsname;

    /**
     * 商品描述
     */
    private String goodsdesc;

    /**
     * 现价
     */
    private Double newprice;

    /**
     * 原价
     */
    private Double oldprice;

    /**
     * 发布人
     */
    private String authorname;

    /**
     * 图片
     */
    private String img;

    /**
     * 发布的时间
     */
    private String publishtime;

    private Date updated;
    
    private String status;
    
    private String openid;
    
    private Integer comcount;

    private static final long serialVersionUID = 1L;

    
    
    public Integer getComcount() {
		return comcount;
	}

	public void setComcount(Integer comcount) {
		this.comcount = comcount;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public Double getNewprice() {
        return newprice;
    }

    public void setNewprice(Double newprice) {
        this.newprice = newprice;
    }

    public Double getOldprice() {
        return oldprice;
    }

    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsname() == null ? other.getGoodsname() == null : this.getGoodsname().equals(other.getGoodsname()))
            && (this.getGoodsdesc() == null ? other.getGoodsdesc() == null : this.getGoodsdesc().equals(other.getGoodsdesc()))
            && (this.getNewprice() == null ? other.getNewprice() == null : this.getNewprice().equals(other.getNewprice()))
            && (this.getOldprice() == null ? other.getOldprice() == null : this.getOldprice().equals(other.getOldprice()))
            && (this.getAuthorname() == null ? other.getAuthorname() == null : this.getAuthorname().equals(other.getAuthorname()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getPublishtime() == null ? other.getPublishtime() == null : this.getPublishtime().equals(other.getPublishtime()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsname() == null) ? 0 : getGoodsname().hashCode());
        result = prime * result + ((getGoodsdesc() == null) ? 0 : getGoodsdesc().hashCode());
        result = prime * result + ((getNewprice() == null) ? 0 : getNewprice().hashCode());
        result = prime * result + ((getOldprice() == null) ? 0 : getOldprice().hashCode());
        result = prime * result + ((getAuthorname() == null) ? 0 : getAuthorname().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getPublishtime() == null) ? 0 : getPublishtime().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return result;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Goods [");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		if (goodsname != null)
			builder.append("goodsname=").append(goodsname).append(", ");
		if (goodsdesc != null)
			builder.append("goodsdesc=").append(goodsdesc).append(", ");
		if (newprice != null)
			builder.append("newprice=").append(newprice).append(", ");
		if (oldprice != null)
			builder.append("oldprice=").append(oldprice).append(", ");
		if (authorname != null)
			builder.append("authorname=").append(authorname).append(", ");
		if (img != null)
			builder.append("img=").append(img).append(", ");
		if (publishtime != null)
			builder.append("publishtime=").append(publishtime).append(", ");
		if (updated != null)
			builder.append("updated=").append(updated).append(", ");
		if (status != null)
			builder.append("status=").append(status).append(", ");
		if (openid != null)
			builder.append("openid=").append(openid).append(", ");
		if (comcount != null)
			builder.append("comcount=").append(comcount);
		builder.append("]");
		return builder.toString();
	}





}