package com.main;

import java.util.Arrays;

public class Item {
	String cat_name = ""; // 一级类目名称
	long num_iid = 0l; // 商品ID
	String title = ""; // 商品标题
	String pict_url	= ""; //商品主图
	int small_images_num = 5;
	String[] small_images = new String[small_images_num]; // 商品小图列表
	String reserve_price = ""; // 商品一口价格
	String zk_final_price = "";	// 折扣价（元） 若属于预售商品，付定金时间内，折扣价=预售价
	int user_type = 1; // 卖家类型，0表示集市，1表示商城
	String provcity = ""; // 商品所在地
	String item_url = ""; // 商品链接
	String seller_id = ""; // 卖家id
	int volume = 0; // 30天销量
	String nick	= ""; // 店铺名称
	String cat_leaf_name = ""; // 叶子类目名称
	boolean is_prepay = false; // 是否加入消费者保障
	int shop_dsr = 0; // 店铺dsr 评分
	int ratesum = 0; // 卖家等级
	boolean i_rfd_rate = false; // 退款率是否低于行业均值
	boolean h_good_rate = false; // 好评率是否高于行业均值
	boolean h_pay_rate30 = false; // 成交转化是否高于行业均值
	boolean free_shipment = false; // 是否包邮
	String material_lib_type = ""; // 商品库类型，支持多库类型输出，以英文逗号分隔“,”分隔，1:营销商品主推库，2. 内容商品库，如果值为空则不属于1，2这两种商品类型
	String presale_discount_fee_text = ""; // 预售商品-商品优惠信息
	long presale_tail_end_time = 0l; // 预售商品-付定金结束时间（毫秒）
	long presale_tail_start_time = 0l; // 预售商品-付尾款开始时间（毫秒）
	long presale_end_time = 0l; // 预售商品-付定金结束时间（毫秒）
	long presale_start_time = 0l; // 预售商品-付定金开始时间（毫秒）
	String presale_deposit = ""; // 预售商品-定金（元）
	long ju_play_end_time = 0l; // 聚划算满减 -结束时间（毫秒）
	long ju_play_start_time = 0l; // 聚划算满减 -开始时间（毫秒）
	String play_info = ""; // 玩法	1聚划算满减：满N件减X元，满N件X折，满N件X元） 2天猫限时抢：前N分钟每件X元，前N分钟满N件每件X元，前N件每件X元）
	long tmall_play_activity_end_time = 0l; // 天猫限时抢可售 -结束时间（毫秒）
	long tmall_play_activity_start_time = 0l; // 天猫限时抢可售 -开始时间（毫秒）
	@Override
	public String toString() {
		String str1 = "一级类目名称：" + cat_name + "\n商品ID：" + num_iid + "\n商品标题：" + title + "\n商品主图：" + pict_url;
		String str2 = "\n商品小图列表：\n";
		for(int i = 0; i < small_images.length - 1; i++) {
			str2 = str2 + (i+1) + "." + small_images[i] + "\n";
		}
		String str3 = "商品统一价格：" + reserve_price + "\n折扣价（元） ：" + zk_final_price + "\n卖家类型（0:集市；1:商城）：" + user_type
				+ "\n商品所在地：" + provcity + "\n商品链接：" + item_url + "\n卖家ID：" + seller_id + "\n30天销量："
				+ volume + "\n店铺名称：" + nick + "\n叶子类目名称：" + cat_leaf_name + "\n是否加入消费者保障：" + is_prepay
				+ "\n店铺dsr评分：" + shop_dsr + "\n卖家等级：" + ratesum + "\n退款率是否低于均值：" + i_rfd_rate + "\n好评率是否高于均值："
				+ h_good_rate + "\n成交转化是否高于均值：" + h_pay_rate30 + "\n是否包邮：" + free_shipment
				+ "\n商品库类型：" + material_lib_type + "\n预售商品-商品优惠信息："
				+ presale_discount_fee_text + "\n预售商品-付定金结束时间（毫秒）：" + presale_tail_end_time
				+ "\n预售商品-付尾款开始时间（毫秒）：" + presale_tail_start_time + "\n预售商品-付定金结束时间（毫秒）：" + presale_end_time
				+ "\n预售商品-付定金开始时间（毫秒）：" + presale_start_time + "\n预售商品-定金（元）：" + presale_deposit
				+ "\n聚划算满减 -结束时间（毫秒）：" + ju_play_end_time + "\n聚划算满减 -开始时间（毫秒）：" + ju_play_start_time
				+ "\n玩法：" + play_info + "\n天猫限时抢可售 -结束时间（毫秒）：" + tmall_play_activity_end_time
				+ "\n天猫限时抢可售 -开始时间（毫秒）：" + tmall_play_activity_start_time;
		String string = str1 + str2 + str3;
		return string;
	}
	
	
}
