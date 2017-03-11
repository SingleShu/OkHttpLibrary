package com.example.administrator.okhttplemon;

import java.util.List;

/**
 * Created by ShuWen on 2017/2/26.
 */

public class Response {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"0d344e99cb87d2994fee9cd873fd07fe","title":"南昌红谷滩新区海航白金汇酒店\u201c2.25\u201d重大火灾事故处置情况通报","date":"2017-02-26 21:26","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170226212649687.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_3_mwpm_03200403.jpeg"},{"uniquekey":"9cc3252d65806a7e1e20c6ef51fc0604","title":"丽江一法官转发微博时作错误评论，所在法院决定对其停职检查","date":"2017-02-26 21:37","category":"头条","author_name":"丽江中院","url":"http://mini.eastday.com/mobile/170226213720319.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170226/20170226213720_35cafa11dc622936de5f6764cd379bd4_1_mwpm_03200403.jpeg"},{"uniquekey":"7186a117bc29df4b0e4bb9909a6a0031","title":"全世界最危险的国家，让美国多次蒙羞，总统却说\u201c还得靠中国\u201d","date":"2017-02-26 20:41","category":"头条","author_name":"老王读世界","url":"http://mini.eastday.com/mobile/170226204158609.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170226/20170226204158_61b2e9274e0af1acb1890cab7b3cba80_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170226/20170226204158_61b2e9274e0af1acb1890cab7b3cba80_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170226/20170226204158_61b2e9274e0af1acb1890cab7b3cba80_3_mwpm_03200403.jpeg"},{"uniquekey":"40735f2cf72c2707c8dedc96762e3156","title":"阿富汗逾百政府工程长期不开工 阿商务部:不是因为钱","date":"2017-02-26 20:37","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170226203725263.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170226/20170226203725_5c3c065e2f702d7ac63a07f85dcef910_1_mwpm_03200403.png"},{"uniquekey":"b871bc90e2494bf4645e1fe83ef9167e","title":"iPhone 8创新\u201c捉襟见肘\u201d，连库克都开始抛售自家股票","date":"2017-02-26 20:33","category":"头条","author_name":"太保乱谈","url":"http://mini.eastday.com/mobile/170226203321072.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226203321_11fb60fc6303457f0af03b17aba8e2ee_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170226/20170226203321_11fb60fc6303457f0af03b17aba8e2ee_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170226/20170226203321_11fb60fc6303457f0af03b17aba8e2ee_3_mwpm_03200403.jpeg"},{"uniquekey":"a4d44ce56037b9d0183b54d8230fa779","title":"中国北方多地大气扩散条件较差 现重度污染","date":"2017-02-26 20:32","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170226203200938.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170226/20170226203200_3bc5a29e015722364f82d96d1bd18ccb_1_mwpm_03200403.jpeg"},{"uniquekey":"98843b98ba833bb8b407aba5d6788b51","title":"[视频]坚持问题导向改革 彻查资本乱象","date":"2017-02-26 20:28","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170226202832783.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226202832_2b6dfd915071140b56114baa21906e3a_1_mwpm_03200403.jpeg"},{"uniquekey":"1a23a439c9d81f02d6e0ad9370de6f54","title":"1万多元红包不见了，竟是被婚礼摄像师偷走","date":"2017-02-26 20:26","category":"头条","author_name":"扬子晚报网","url":"http://mini.eastday.com/mobile/170226202626275.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170226/20170226202626_087270056203c1c5dd77c067915e95f4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170226/20170226202626_087270056203c1c5dd77c067915e95f4_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170226/20170226202626_087270056203c1c5dd77c067915e95f4_3_mwpm_03200403.jpeg"},{"uniquekey":"865b490c957b82aecc8181ab8326ae6a","title":"非洲一块无人要土地，一名美国矿工发现后，结果来此插旗建立国家","date":"2017-02-26 20:23","category":"头条","author_name":"十三姨说历史","url":"http://mini.eastday.com/mobile/170226202326093.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170226/20170226202326_f39fcebc2854775de7f5559b7cdcf39d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170226/20170226202326_f39fcebc2854775de7f5559b7cdcf39d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170226/20170226202326_f39fcebc2854775de7f5559b7cdcf39d_3_mwpm_03200403.jpeg"},{"uniquekey":"45ad95e84b344e431b5cf98ebf0f25c2","title":"涉案数千亿元地下钱庄案：伪造外贸交易，骗取政府奖励数亿元","date":"2017-02-26 20:23","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170226202319995.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170226/20170226202319_d53b59827e1ef0d2399598eaad2c85cb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170226/20170226202319_d53b59827e1ef0d2399598eaad2c85cb_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170226/20170226202319_d53b59827e1ef0d2399598eaad2c85cb_3_mwpm_03200403.jpeg"},{"uniquekey":"8382c8e0ed809e19f9f78a3b91e9c3ea","title":"刘涛结婚10年每天都做这件事，难怪老公夸天下再没这么赞的媳妇","date":"2017-02-26 20:21","category":"头条","author_name":"电影时光","url":"http://mini.eastday.com/mobile/170226202116532.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226202116_5501b3540841c08305b08620d2013f51_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170226/20170226202116_5501b3540841c08305b08620d2013f51_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170226/20170226202116_5501b3540841c08305b08620d2013f51_3_mwpm_03200403.jpeg"},{"uniquekey":"f70245eda9abf0beb864cc692a05b120","title":"我国一大技术突破或改变五代战机作战理念，将加速六代机研制进程","date":"2017-02-26 20:16","category":"头条","author_name":"不磨灭的战士","url":"http://mini.eastday.com/mobile/170226201623882.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170226/20170226201623_6720163e906373cce459c99c6452bb68_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170226/20170226201623_6720163e906373cce459c99c6452bb68_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170226/20170226201623_6720163e906373cce459c99c6452bb68_3_mwpm_03200403.jpeg"},{"uniquekey":"89c16c098f19462b424add16b1cc88a0","title":"\u201c二月二龙抬头\u201d 美发店生意忙","date":"2017-02-26 20:16","category":"头条","author_name":"扬子晚报网","url":"http://mini.eastday.com/mobile/170226201621221.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226201621_dbd73b956bdfbf2bc8494c9ee4b92da4_1_mwpm_03200403.jpeg"},{"uniquekey":"eb868b298de94da272ca836c8f41ee42","title":"历史上最厉害的士兵，一日独力击毙了日军500人以上，流芳百世","date":"2017-02-26 20:14","category":"头条","author_name":"野史趣事","url":"http://mini.eastday.com/mobile/170226201434256.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170226/20170226201434_bbd3e654b97af6e6a489ef254d2f9270_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170226/20170226201434_bbd3e654b97af6e6a489ef254d2f9270_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170226/20170226201434_bbd3e654b97af6e6a489ef254d2f9270_3_mwpm_03200403.jpeg"},{"uniquekey":"b029c29515930eb482c534301ec60502","title":"刘强东承诺京东配送员工资超过县长 重情重义为何难敌马云？","date":"2017-02-26 20:14","category":"头条","author_name":"超先声","url":"http://mini.eastday.com/mobile/170226201425524.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170226/20170226201425_67c7a70336045a6d9eb0ce5f9797350f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170226/20170226201425_67c7a70336045a6d9eb0ce5f9797350f_2_mwpm_03200403.jpeg"},{"uniquekey":"7aaf65971d3ed98118cca772002b7a58","title":"男子在微信群玩抢红包 输光千万家产！","date":"2017-02-26 20:05","category":"头条","author_name":"630很有料","url":"http://mini.eastday.com/mobile/170226200545131.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170226/20170226200545_43bb720a81550c843203d7addd67f6b5_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170226/20170226200545_43bb720a81550c843203d7addd67f6b5_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170226/20170226200545_43bb720a81550c843203d7addd67f6b5_3_mwpm_03200403.jpeg"},{"uniquekey":"678b930eb72305c73819a05552a82f28","title":"爷爷从孙子3岁开始就把他锁在铁笼里，知道背后的真相我哭了","date":"2017-02-26 20:05","category":"头条","author_name":"重庆青年报","url":"http://mini.eastday.com/mobile/170226200530219.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170226/20170226200530_7282addf744197994f2cefe023a308bb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170226/20170226200530_7282addf744197994f2cefe023a308bb_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170226/20170226200530_7282addf744197994f2cefe023a308bb_3_mwpm_03200403.jpeg"},{"uniquekey":"de4edadd25d81a6dfe50b6a16fba7b45","title":"五版观音形象PK，林心如刘涛美不过她","date":"2017-02-26 20:03","category":"头条","author_name":"娱乐潮流八卦","url":"http://mini.eastday.com/mobile/170226200345644.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170226/20170226200345_270ca1e1f3ea6398c6a63a9078f05fde_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170226/20170226200345_270ca1e1f3ea6398c6a63a9078f05fde_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170226/20170226200345_270ca1e1f3ea6398c6a63a9078f05fde_3_mwpm_03200403.jpeg"},{"uniquekey":"bbb47b8bf095a7b2264924a4c2d1a812","title":"癌症病人最后悔吃的食物，很多人竟还在吃！","date":"2017-02-26 20:03","category":"头条","author_name":"养道生活","url":"http://mini.eastday.com/mobile/170226200302083.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170226/20170226200302_be1f4e8e24f0a5aed7d83f8a5750f4bc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170226/20170226200302_be1f4e8e24f0a5aed7d83f8a5750f4bc_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170226/20170226200302_be1f4e8e24f0a5aed7d83f8a5750f4bc_3_mwpm_03200403.jpeg"},{"uniquekey":"368e393b1a5055bfecd647191152bf72","title":"建一个光伏发电站，总收益是多少？","date":"2017-02-26 19:56","category":"头条","author_name":"月影天下","url":"http://mini.eastday.com/mobile/170226195633005.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226195633_58b2716a5fde7544fb2b3bee81bf4331_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170226/20170226195633_58b2716a5fde7544fb2b3bee81bf4331_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170226/20170226195633_58b2716a5fde7544fb2b3bee81bf4331_3_mwpm_03200403.jpeg"},{"uniquekey":"a64b7620623d360837d471cf867421f4","title":"佛教汉传南传藏传交流论坛在港举行，香港教育局长吴克俭出席","date":"2017-02-26 19:53","category":"头条","author_name":"中新社","url":"http://mini.eastday.com/mobile/170226195322963.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226195322_d99c21c0672facb9f55ce51113345bfe_1_mwpm_03200403.jpeg"},{"uniquekey":"036661fc0061d4328b718ec821e84f3a","title":"最全面的手臂力量训练9个动作快速提升手臂力量让健身更安全","date":"2017-02-26 19:39","category":"头条","author_name":"91健身","url":"http://mini.eastday.com/mobile/170226193916662.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226193916_b13e3b72dc45429638013992d24f4bca_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170226/20170226193916_b13e3b72dc45429638013992d24f4bca_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170226/20170226193916_b13e3b72dc45429638013992d24f4bca_3_mwpm_03200403.jpeg"},{"uniquekey":"6bea7e6fc128643a179a305df9e7de23","title":"36岁小婉君金铭近照，念北大，精通5国语言，今却成了这副模样","date":"2017-02-26 19:30","category":"头条","author_name":"精彩片段","url":"http://mini.eastday.com/mobile/170226193023858.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170226/20170226193023_8975fcd3e06db3abf2d6094047430126_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170226/20170226193023_8975fcd3e06db3abf2d6094047430126_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170226/20170226193023_8975fcd3e06db3abf2d6094047430126_3_mwpm_03200403.jpeg"},{"uniquekey":"ae607f2f830246661dbe16fd79cfe2e6","title":"预测2017年中国海军能下啥\u201c饺子\u201d？","date":"2017-02-26 19:29","category":"头条","author_name":"军事解析","url":"http://mini.eastday.com/mobile/170226192906554.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226192906_bb2d2bd6940763d5bdfd72b62cd8658d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170226/20170226192906_bb2d2bd6940763d5bdfd72b62cd8658d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170226/20170226192906_bb2d2bd6940763d5bdfd72b62cd8658d_3_mwpm_03200403.jpeg"},{"uniquekey":"70d452b7417109459fe007cc07e183c4","title":"几颗草莓竟让孩子染上病毒 已有学校通知家长注意","date":"2017-02-26 19:27","category":"头条","author_name":"楚天都市报","url":"http://mini.eastday.com/mobile/170226192746758.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170226/20170226192746_03f5390f07c9cb6ea2b7f845db02c579_2_mwpm_03200403.png","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170226/20170226192746_03f5390f07c9cb6ea2b7f845db02c579_3_mwpm_03200403.png","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170226/20170226192746_03f5390f07c9cb6ea2b7f845db02c579_4_mwpm_03200403.png"},{"uniquekey":"c15d761ce929db2e9b31d84297f12511","title":"苏联陈兵百万，以机动灵活著称的解放军居然想出如此\u201c妙计\u201d ","date":"2017-02-26 19:26","category":"头条","author_name":"非主流军评","url":"http://mini.eastday.com/mobile/170226192611948.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170226/20170226192611_edf22487b70b9ea480181ff46357eca8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170226/20170226192611_edf22487b70b9ea480181ff46357eca8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170226/20170226192611_edf22487b70b9ea480181ff46357eca8_3_mwpm_03200403.jpeg"},{"uniquekey":"ca07bc876396784f8295dd91f1dc53f8","title":"菲律宾海滩现神秘生物残骸，科学家调查后给出答案","date":"2017-02-26 19:21","category":"头条","author_name":"来点儿","url":"http://mini.eastday.com/mobile/170226192139481.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226192139_240fb82d7d74e3ca8f3e33b080b8692e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170226/20170226192139_240fb82d7d74e3ca8f3e33b080b8692e_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170226/20170226192139_240fb82d7d74e3ca8f3e33b080b8692e_3_mwpm_03200403.jpeg"},{"uniquekey":"6412eb7eaa1a43c3b86aed95fedf2116","title":"汶川今日发生4.0级地震，专家称系2008年特大地震余震","date":"2017-02-26 19:13","category":"头条","author_name":"央视新闻客户端","url":"http://mini.eastday.com/mobile/170226191345905.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170226/20170226191345_dbaf660238383e5a7db01674004174ca_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170226/20170226191345_dbaf660238383e5a7db01674004174ca_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170226/20170226191345_dbaf660238383e5a7db01674004174ca_3_mwpm_03200403.jpeg"},{"uniquekey":"9e34b57f4217cb7c98d020b6fceb842c","title":"1700架战机进入最高战备 瞄准美日 1600枚导弹随时待发","date":"2017-02-26 19:12","category":"头条","author_name":"军事家","url":"http://mini.eastday.com/mobile/170226191245482.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170226/20170226191245_2a9b41498197ab6afeb163bd04d7ebaa_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170226/20170226191245_2a9b41498197ab6afeb163bd04d7ebaa_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170226/20170226191245_2a9b41498197ab6afeb163bd04d7ebaa_3_mwpm_03200403.jpeg"},{"uniquekey":"f5b30c6aecb96dfba000d156a7eae601","title":"巴西狂欢节\u201c火辣\u201d开幕","date":"2017-02-26 19:08","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170226190838903.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226190838_b52c9a52b6108e5bb2e2b330c3442e9b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170226/20170226190838_91b6a3bdb1400351143cde5ed4407adb_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170226/20170226190838_f2a96b5a5621efb264bd7de5a90b60b9_3_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"0d344e99cb87d2994fee9cd873fd07fe","title":"南昌红谷滩新区海航白金汇酒店\u201c2.25\u201d重大火灾事故处置情况通报","date":"2017-02-26 21:26","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170226212649687.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_3_mwpm_03200403.jpeg"},{"uniquekey":"9cc3252d65806a7e1e20c6ef51fc0604","title":"丽江一法官转发微博时作错误评论，所在法院决定对其停职检查","date":"2017-02-26 21:37","category":"头条","author_name":"丽江中院","url":"http://mini.eastday.com/mobile/170226213720319.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170226/20170226213720_35cafa11dc622936de5f6764cd379bd4_1_mwpm_03200403.jpeg"},{"uniquekey":"7186a117bc29df4b0e4bb9909a6a0031","title":"全世界最危险的国家，让美国多次蒙羞，总统却说\u201c还得靠中国\u201d","date":"2017-02-26 20:41","category":"头条","author_name":"老王读世界","url":"http://mini.eastday.com/mobile/170226204158609.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170226/20170226204158_61b2e9274e0af1acb1890cab7b3cba80_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170226/20170226204158_61b2e9274e0af1acb1890cab7b3cba80_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170226/20170226204158_61b2e9274e0af1acb1890cab7b3cba80_3_mwpm_03200403.jpeg"},{"uniquekey":"40735f2cf72c2707c8dedc96762e3156","title":"阿富汗逾百政府工程长期不开工 阿商务部:不是因为钱","date":"2017-02-26 20:37","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170226203725263.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170226/20170226203725_5c3c065e2f702d7ac63a07f85dcef910_1_mwpm_03200403.png"},{"uniquekey":"b871bc90e2494bf4645e1fe83ef9167e","title":"iPhone 8创新\u201c捉襟见肘\u201d，连库克都开始抛售自家股票","date":"2017-02-26 20:33","category":"头条","author_name":"太保乱谈","url":"http://mini.eastday.com/mobile/170226203321072.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226203321_11fb60fc6303457f0af03b17aba8e2ee_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170226/20170226203321_11fb60fc6303457f0af03b17aba8e2ee_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170226/20170226203321_11fb60fc6303457f0af03b17aba8e2ee_3_mwpm_03200403.jpeg"},{"uniquekey":"a4d44ce56037b9d0183b54d8230fa779","title":"中国北方多地大气扩散条件较差 现重度污染","date":"2017-02-26 20:32","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170226203200938.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170226/20170226203200_3bc5a29e015722364f82d96d1bd18ccb_1_mwpm_03200403.jpeg"},{"uniquekey":"98843b98ba833bb8b407aba5d6788b51","title":"[视频]坚持问题导向改革 彻查资本乱象","date":"2017-02-26 20:28","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170226202832783.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226202832_2b6dfd915071140b56114baa21906e3a_1_mwpm_03200403.jpeg"},{"uniquekey":"1a23a439c9d81f02d6e0ad9370de6f54","title":"1万多元红包不见了，竟是被婚礼摄像师偷走","date":"2017-02-26 20:26","category":"头条","author_name":"扬子晚报网","url":"http://mini.eastday.com/mobile/170226202626275.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170226/20170226202626_087270056203c1c5dd77c067915e95f4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170226/20170226202626_087270056203c1c5dd77c067915e95f4_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170226/20170226202626_087270056203c1c5dd77c067915e95f4_3_mwpm_03200403.jpeg"},{"uniquekey":"865b490c957b82aecc8181ab8326ae6a","title":"非洲一块无人要土地，一名美国矿工发现后，结果来此插旗建立国家","date":"2017-02-26 20:23","category":"头条","author_name":"十三姨说历史","url":"http://mini.eastday.com/mobile/170226202326093.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170226/20170226202326_f39fcebc2854775de7f5559b7cdcf39d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170226/20170226202326_f39fcebc2854775de7f5559b7cdcf39d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170226/20170226202326_f39fcebc2854775de7f5559b7cdcf39d_3_mwpm_03200403.jpeg"},{"uniquekey":"45ad95e84b344e431b5cf98ebf0f25c2","title":"涉案数千亿元地下钱庄案：伪造外贸交易，骗取政府奖励数亿元","date":"2017-02-26 20:23","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170226202319995.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170226/20170226202319_d53b59827e1ef0d2399598eaad2c85cb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170226/20170226202319_d53b59827e1ef0d2399598eaad2c85cb_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170226/20170226202319_d53b59827e1ef0d2399598eaad2c85cb_3_mwpm_03200403.jpeg"},{"uniquekey":"8382c8e0ed809e19f9f78a3b91e9c3ea","title":"刘涛结婚10年每天都做这件事，难怪老公夸天下再没这么赞的媳妇","date":"2017-02-26 20:21","category":"头条","author_name":"电影时光","url":"http://mini.eastday.com/mobile/170226202116532.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226202116_5501b3540841c08305b08620d2013f51_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170226/20170226202116_5501b3540841c08305b08620d2013f51_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170226/20170226202116_5501b3540841c08305b08620d2013f51_3_mwpm_03200403.jpeg"},{"uniquekey":"f70245eda9abf0beb864cc692a05b120","title":"我国一大技术突破或改变五代战机作战理念，将加速六代机研制进程","date":"2017-02-26 20:16","category":"头条","author_name":"不磨灭的战士","url":"http://mini.eastday.com/mobile/170226201623882.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170226/20170226201623_6720163e906373cce459c99c6452bb68_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170226/20170226201623_6720163e906373cce459c99c6452bb68_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170226/20170226201623_6720163e906373cce459c99c6452bb68_3_mwpm_03200403.jpeg"},{"uniquekey":"89c16c098f19462b424add16b1cc88a0","title":"\u201c二月二龙抬头\u201d 美发店生意忙","date":"2017-02-26 20:16","category":"头条","author_name":"扬子晚报网","url":"http://mini.eastday.com/mobile/170226201621221.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226201621_dbd73b956bdfbf2bc8494c9ee4b92da4_1_mwpm_03200403.jpeg"},{"uniquekey":"eb868b298de94da272ca836c8f41ee42","title":"历史上最厉害的士兵，一日独力击毙了日军500人以上，流芳百世","date":"2017-02-26 20:14","category":"头条","author_name":"野史趣事","url":"http://mini.eastday.com/mobile/170226201434256.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170226/20170226201434_bbd3e654b97af6e6a489ef254d2f9270_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170226/20170226201434_bbd3e654b97af6e6a489ef254d2f9270_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170226/20170226201434_bbd3e654b97af6e6a489ef254d2f9270_3_mwpm_03200403.jpeg"},{"uniquekey":"b029c29515930eb482c534301ec60502","title":"刘强东承诺京东配送员工资超过县长 重情重义为何难敌马云？","date":"2017-02-26 20:14","category":"头条","author_name":"超先声","url":"http://mini.eastday.com/mobile/170226201425524.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170226/20170226201425_67c7a70336045a6d9eb0ce5f9797350f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170226/20170226201425_67c7a70336045a6d9eb0ce5f9797350f_2_mwpm_03200403.jpeg"},{"uniquekey":"7aaf65971d3ed98118cca772002b7a58","title":"男子在微信群玩抢红包 输光千万家产！","date":"2017-02-26 20:05","category":"头条","author_name":"630很有料","url":"http://mini.eastday.com/mobile/170226200545131.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170226/20170226200545_43bb720a81550c843203d7addd67f6b5_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170226/20170226200545_43bb720a81550c843203d7addd67f6b5_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170226/20170226200545_43bb720a81550c843203d7addd67f6b5_3_mwpm_03200403.jpeg"},{"uniquekey":"678b930eb72305c73819a05552a82f28","title":"爷爷从孙子3岁开始就把他锁在铁笼里，知道背后的真相我哭了","date":"2017-02-26 20:05","category":"头条","author_name":"重庆青年报","url":"http://mini.eastday.com/mobile/170226200530219.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170226/20170226200530_7282addf744197994f2cefe023a308bb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170226/20170226200530_7282addf744197994f2cefe023a308bb_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170226/20170226200530_7282addf744197994f2cefe023a308bb_3_mwpm_03200403.jpeg"},{"uniquekey":"de4edadd25d81a6dfe50b6a16fba7b45","title":"五版观音形象PK，林心如刘涛美不过她","date":"2017-02-26 20:03","category":"头条","author_name":"娱乐潮流八卦","url":"http://mini.eastday.com/mobile/170226200345644.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170226/20170226200345_270ca1e1f3ea6398c6a63a9078f05fde_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170226/20170226200345_270ca1e1f3ea6398c6a63a9078f05fde_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170226/20170226200345_270ca1e1f3ea6398c6a63a9078f05fde_3_mwpm_03200403.jpeg"},{"uniquekey":"bbb47b8bf095a7b2264924a4c2d1a812","title":"癌症病人最后悔吃的食物，很多人竟还在吃！","date":"2017-02-26 20:03","category":"头条","author_name":"养道生活","url":"http://mini.eastday.com/mobile/170226200302083.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170226/20170226200302_be1f4e8e24f0a5aed7d83f8a5750f4bc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170226/20170226200302_be1f4e8e24f0a5aed7d83f8a5750f4bc_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170226/20170226200302_be1f4e8e24f0a5aed7d83f8a5750f4bc_3_mwpm_03200403.jpeg"},{"uniquekey":"368e393b1a5055bfecd647191152bf72","title":"建一个光伏发电站，总收益是多少？","date":"2017-02-26 19:56","category":"头条","author_name":"月影天下","url":"http://mini.eastday.com/mobile/170226195633005.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226195633_58b2716a5fde7544fb2b3bee81bf4331_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170226/20170226195633_58b2716a5fde7544fb2b3bee81bf4331_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170226/20170226195633_58b2716a5fde7544fb2b3bee81bf4331_3_mwpm_03200403.jpeg"},{"uniquekey":"a64b7620623d360837d471cf867421f4","title":"佛教汉传南传藏传交流论坛在港举行，香港教育局长吴克俭出席","date":"2017-02-26 19:53","category":"头条","author_name":"中新社","url":"http://mini.eastday.com/mobile/170226195322963.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226195322_d99c21c0672facb9f55ce51113345bfe_1_mwpm_03200403.jpeg"},{"uniquekey":"036661fc0061d4328b718ec821e84f3a","title":"最全面的手臂力量训练9个动作快速提升手臂力量让健身更安全","date":"2017-02-26 19:39","category":"头条","author_name":"91健身","url":"http://mini.eastday.com/mobile/170226193916662.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226193916_b13e3b72dc45429638013992d24f4bca_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170226/20170226193916_b13e3b72dc45429638013992d24f4bca_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170226/20170226193916_b13e3b72dc45429638013992d24f4bca_3_mwpm_03200403.jpeg"},{"uniquekey":"6bea7e6fc128643a179a305df9e7de23","title":"36岁小婉君金铭近照，念北大，精通5国语言，今却成了这副模样","date":"2017-02-26 19:30","category":"头条","author_name":"精彩片段","url":"http://mini.eastday.com/mobile/170226193023858.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170226/20170226193023_8975fcd3e06db3abf2d6094047430126_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170226/20170226193023_8975fcd3e06db3abf2d6094047430126_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170226/20170226193023_8975fcd3e06db3abf2d6094047430126_3_mwpm_03200403.jpeg"},{"uniquekey":"ae607f2f830246661dbe16fd79cfe2e6","title":"预测2017年中国海军能下啥\u201c饺子\u201d？","date":"2017-02-26 19:29","category":"头条","author_name":"军事解析","url":"http://mini.eastday.com/mobile/170226192906554.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226192906_bb2d2bd6940763d5bdfd72b62cd8658d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170226/20170226192906_bb2d2bd6940763d5bdfd72b62cd8658d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170226/20170226192906_bb2d2bd6940763d5bdfd72b62cd8658d_3_mwpm_03200403.jpeg"},{"uniquekey":"70d452b7417109459fe007cc07e183c4","title":"几颗草莓竟让孩子染上病毒 已有学校通知家长注意","date":"2017-02-26 19:27","category":"头条","author_name":"楚天都市报","url":"http://mini.eastday.com/mobile/170226192746758.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170226/20170226192746_03f5390f07c9cb6ea2b7f845db02c579_2_mwpm_03200403.png","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170226/20170226192746_03f5390f07c9cb6ea2b7f845db02c579_3_mwpm_03200403.png","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170226/20170226192746_03f5390f07c9cb6ea2b7f845db02c579_4_mwpm_03200403.png"},{"uniquekey":"c15d761ce929db2e9b31d84297f12511","title":"苏联陈兵百万，以机动灵活著称的解放军居然想出如此\u201c妙计\u201d ","date":"2017-02-26 19:26","category":"头条","author_name":"非主流军评","url":"http://mini.eastday.com/mobile/170226192611948.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170226/20170226192611_edf22487b70b9ea480181ff46357eca8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170226/20170226192611_edf22487b70b9ea480181ff46357eca8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170226/20170226192611_edf22487b70b9ea480181ff46357eca8_3_mwpm_03200403.jpeg"},{"uniquekey":"ca07bc876396784f8295dd91f1dc53f8","title":"菲律宾海滩现神秘生物残骸，科学家调查后给出答案","date":"2017-02-26 19:21","category":"头条","author_name":"来点儿","url":"http://mini.eastday.com/mobile/170226192139481.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170226/20170226192139_240fb82d7d74e3ca8f3e33b080b8692e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170226/20170226192139_240fb82d7d74e3ca8f3e33b080b8692e_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170226/20170226192139_240fb82d7d74e3ca8f3e33b080b8692e_3_mwpm_03200403.jpeg"},{"uniquekey":"6412eb7eaa1a43c3b86aed95fedf2116","title":"汶川今日发生4.0级地震，专家称系2008年特大地震余震","date":"2017-02-26 19:13","category":"头条","author_name":"央视新闻客户端","url":"http://mini.eastday.com/mobile/170226191345905.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170226/20170226191345_dbaf660238383e5a7db01674004174ca_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170226/20170226191345_dbaf660238383e5a7db01674004174ca_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170226/20170226191345_dbaf660238383e5a7db01674004174ca_3_mwpm_03200403.jpeg"},{"uniquekey":"9e34b57f4217cb7c98d020b6fceb842c","title":"1700架战机进入最高战备 瞄准美日 1600枚导弹随时待发","date":"2017-02-26 19:12","category":"头条","author_name":"军事家","url":"http://mini.eastday.com/mobile/170226191245482.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170226/20170226191245_2a9b41498197ab6afeb163bd04d7ebaa_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170226/20170226191245_2a9b41498197ab6afeb163bd04d7ebaa_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170226/20170226191245_2a9b41498197ab6afeb163bd04d7ebaa_3_mwpm_03200403.jpeg"},{"uniquekey":"f5b30c6aecb96dfba000d156a7eae601","title":"巴西狂欢节\u201c火辣\u201d开幕","date":"2017-02-26 19:08","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170226190838903.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170226/20170226190838_b52c9a52b6108e5bb2e2b330c3442e9b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170226/20170226190838_91b6a3bdb1400351143cde5ed4407adb_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170226/20170226190838_f2a96b5a5621efb264bd7de5a90b60b9_3_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 0d344e99cb87d2994fee9cd873fd07fe
             * title : 南昌红谷滩新区海航白金汇酒店“2.25”重大火灾事故处置情况通报
             * date : 2017-02-26 21:26
             * category : 头条
             * author_name : 中国日报网
             * url : http://mini.eastday.com/mobile/170226212649687.html
             * thumbnail_pic_s : http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://02.imgmini.eastday.com/mobile/20170226/20170226212649_b5f8b6f359c66c1ed447e45c36b877c3_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}