package cn.bluemobi.entity.app;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * Description: 帖子信息表; date: 上午9:46:31 <br/>
 *
 * @author dingP
 * @version
 */
public class TieziInfo implements Serializable {
    /**
     * serialVersionUID:(用一句话描述这个变量表示什么).
     */
    private static final long serialVersionUID = -3690403488767284119L;

    private Long tieziid;// 主键

    private String content;// 帖子内容

    private Date publishtime;// 帖子发布时间

    private String uname;

    private String headicon;

    private Long praisenum;

    private String status;

    private Long appuserid;

    private Long communityid;

    private String communityname;

    private List<String> urlList;// 图片地址

    public List<String> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<String> urlList) {
        this.urlList = urlList;
    }

    public Long getTieziid() {
        return tieziid;
    }

    public void setTieziid(Long tieziid) {
        this.tieziid = tieziid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getHeadicon() {
        return headicon;
    }

    public void setHeadicon(String headicon) {
        this.headicon = headicon;
    }

    public Long getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(Long praisenum) {
        this.praisenum = praisenum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getAppuserid() {
        return appuserid;
    }

    public void setAppuserid(Long appuserid) {
        this.appuserid = appuserid;
    }

    public Long getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Long communityid) {
        this.communityid = communityid;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

}