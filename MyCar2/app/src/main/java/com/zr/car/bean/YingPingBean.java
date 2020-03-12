package com.zr.car.bean;

import java.util.List;

public class YingPingBean {
    /**
     * result : [{"commentContent":"好看","commentHeadPic":"http://172.17.8.100/images/movie/head_pic/bwjy.jpg","commentId":2172,"commentTime":1573824287000,"commentUserId":13764,"commentUserName":"鱼清","greatNum":0,"isGreat":0,"replyHeadPic":[],"replyNum":0,"score":4.5},{"commentContent":"好看吗","commentHeadPic":"http://172.17.8.100/images/movie/head_pic/2019-11-15/20191115195641.png","commentId":1850,"commentTime":1571984092000,"commentUserId":13603,"commentUserName":"九分裤","greatNum":0,"isGreat":0,"replyHeadPic":[],"replyNum":0,"score":6.5},{"commentContent":"不错","commentHeadPic":"http://172.17.8.100/images/movie/head_pic/2019-11-15/20191115192519.png","commentId":1823,"commentTime":1571982840000,"commentUserId":13613,"commentUserName":"你妹","greatNum":0,"isGreat":0,"replyHeadPic":[],"replyNum":0,"score":3.5},{"commentContent":"好看","commentHeadPic":"http://172.17.8.100/images/movie/head_pic/2019-11-07/20191107204040.png","commentId":1820,"commentTime":1571982815000,"commentUserId":13597,"commentUserName":"狂饮风中血","greatNum":0,"isGreat":0,"replyHeadPic":[],"replyNum":0,"score":4.6},{"commentContent":"电影好看","commentHeadPic":"http://172.17.8.100/images/movie/head_pic/2019-10-25/20191025143233.jpg","commentId":1810,"commentTime":1571982567000,"commentUserId":13745,"commentUserName":"记住密码","greatNum":0,"isGreat":0,"replyHeadPic":[],"replyNum":0,"score":5}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commentContent : 好看
         * commentHeadPic : http://172.17.8.100/images/movie/head_pic/bwjy.jpg
         * commentId : 2172
         * commentTime : 1573824287000
         * commentUserId : 13764
         * commentUserName : 鱼清
         * greatNum : 0
         * isGreat : 0
         * replyHeadPic : []
         * replyNum : 0
         * score : 4.5
         */

        private String commentContent;
        private String commentHeadPic;
        private String commentId;
        private long commentTime;
        private String commentUserId;
        private String commentUserName;
        private String greatNum;
        private String isGreat;
        private String replyNum;
        private double score;
        private List<?> replyHeadPic;

        public String getCommentContent() {
            return commentContent;
        }

        public void setCommentContent(String commentContent) {
            this.commentContent = commentContent;
        }

        public String getCommentHeadPic() {
            return commentHeadPic;
        }

        public void setCommentHeadPic(String commentHeadPic) {
            this.commentHeadPic = commentHeadPic;
        }

        public String getCommentId() {
            return commentId;
        }

        public void setCommentId(String commentId) {
            this.commentId = commentId;
        }

        public long getCommentTime() {
            return commentTime;
        }

        public void setCommentTime(long commentTime) {
            this.commentTime = commentTime;
        }

        public String getCommentUserId() {
            return commentUserId;
        }

        public void setCommentUserId(String commentUserId) {
            this.commentUserId = commentUserId;
        }

        public String getCommentUserName() {
            return commentUserName;
        }

        public void setCommentUserName(String commentUserName) {
            this.commentUserName = commentUserName;
        }

        public String getGreatNum() {
            return greatNum;
        }

        public void setGreatNum(String greatNum) {
            this.greatNum = greatNum;
        }

        public String getIsGreat() {
            return isGreat;
        }

        public void setIsGreat(String isGreat) {
            this.isGreat = isGreat;
        }

        public String getReplyNum() {
            return replyNum;
        }

        public void setReplyNum(String replyNum) {
            this.replyNum = replyNum;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public List<?> getReplyHeadPic() {
            return replyHeadPic;
        }

        public void setReplyHeadPic(List<?> replyHeadPic) {
            this.replyHeadPic = replyHeadPic;
        }
    }
}
