package cn.edu.gdpt.healthknowledge.bean;

import java.util.List;

public class FirstBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2019-06-27 15:28","title":"第四大慢病来袭！4570万中国人被它困扰","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/27/0b2e4a5863c0422c844cff490c236441.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0627/15/EIMHOL640038804U.html"},{"ctime":"2019-06-26 16:10","title":"《食物血糖生成指数测定方法》行标发布","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/26/44bd6b0bdfa74c5cbd30f786e7a5ed36.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0626/16/EIK1O1IR0038804U.html"},{"ctime":"2019-06-25 16:26","title":"疫苗管理法三次审议进展有何突破？","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/25/0792828e9e7048168f0697507c28d90d.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0625/16/EIHG9MQN0038804U.html"},{"ctime":"2019-06-24 13:55","title":"心跳越快血管越危险 几个动作缓解心跳加剧","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/24/d8e9d93dbddf48cabf191a8ef8e9a9b7.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0624/13/EIEL7FHF0038804U.html"},{"ctime":"2019-06-20 10:34","title":"经常做三件事 会让你的大脑越来越笨的","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/20/f7a9367e2570406db065ad3bd896fee5.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0620/10/EI404M1D0038804U.html"},{"ctime":"2019-06-19 10:24","title":"患有炎症的人 有哪些\u201c发物\u201d需要少碰","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/19/af5664d0177a4d4ea7ab129ff1b58e68.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0619/10/EI1D58FM0038804U.html"},{"ctime":"2019-06-18 09:36","title":"公共厕所太少竟然会导致女性肥胖","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/18/72d89817d58c4a20957ff1a5a3ab7e84.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0618/09/EHUO0KKU0038804U.html"},{"ctime":"2019-06-17 10:07","title":"六大症状代表你已经进入了更年期","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/17/5b54af592d5e4f48808fa168539e7d17.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0617/10/EHS7E7L40038804U.html"},{"ctime":"2019-06-16 08:57","title":"反复手脚发麻 当心脑梗\u201c报到\u201d","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/16/180bc768d4bd436b9f2ccfd6ed668946.jpeg_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0616/08/EHPH0CGM0038804U.html"},{"ctime":"2019-06-14 18:20","title":"深化公立医院职称改革 不搞论文一刀切","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/14/13039aca256740c69075a19914d2f514.png_150x100x1x85.jpg","url":"https://jiankang.163.com/19/0614/18/EHLCD6AR00388045.html"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2019-06-27 15:28
         * title : 第四大慢病来袭！4570万中国人被它困扰
         * description : 网易健康
         * picUrl : http://imgsize.ph.126.net/?imgurl=http://cms-bucket.ws.126.net/2019/06/27/0b2e4a5863c0422c844cff490c236441.png_150x100x1x85.jpg
         * url : https://jiankang.163.com/19/0627/15/EIMHOL640038804U.html
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}


