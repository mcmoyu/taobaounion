package com.main;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TimeGetRequest;
import com.taobao.api.response.TimeGetResponse;

public class Demo {
	public static void main(String[] args) throws JSONException{
		String url = "https://eco.taobao.com/router/rest";
		String appkey = "25576255";
		String secret = "b985bd5b589da708b095df3aabef6d7d";
		//String json = getInfo(url,appkey,secret);
		//System.out.println(json);
		//Item item = new Item();
		//item = analyzeJson(json);
		//System.out.println("一级类目名称：" + item.cat_name);
		//System.out.println(item.toString());
		
		getTaobaoTime(url, appkey, secret);
	}
	
	private static void getTaobaoTime(String url, String appkey, String secret){
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		TimeGetRequest req = new TimeGetRequest();
		TimeGetResponse rsp = null;
		try {
			rsp = client.execute(req);
		} catch (ApiException e) {
			e.printStackTrace();
		}
		try {
			JSONObject jsonObject = new JSONObject(rsp.getBody());
			String time = jsonObject.getJSONObject("time_get_response").getString("time");
			System.out.println(time);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//
//	public static String getInfo(String url, String appkey,String secret) {
//		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
//		TbkItemInfoGetRequest req = new TbkItemInfoGetRequest();
//		Scanner in = new Scanner(System.in);
//		System.out.print("请输入商品ID：");
//		String ni = in.next();
//		req.setNumIids(ni);
//		req.setPlatform(1L);
//		req.setIp("101.27.199.99");
//		TbkItemInfoGetResponse rsp = null;
//		try {
//			rsp = client.execute(req);
//		} catch (ApiException e) {
//			e.printStackTrace();
//		}
//		return rsp.getBody();
//	}
//	
//	public static Item analyzeJson(String json) throws JSONException {
//		Item item = new Item();
//		
//		// 获取tbk_item_info_get_response内容
//		JSONObject jsonobj_tbk = new JSONObject(json);
//		String tbk_item_info_get_response = jsonobj_tbk.getString("tbk_item_info_get_response");
//		
//		// 获取results内容
//		JSONObject jsonobj_res = new JSONObject(tbk_item_info_get_response);
//		String results = jsonobj_res.getString("results");
//		
//		// 获取n_tbk_item内容
//		JSONObject jsonobj_item = new JSONObject(results);
//		JSONArray jsonarr_item = jsonobj_item.getJSONArray("n_tbk_item");
//		String jsonitem = jsonarr_item.toString();
//		String json_item = jsonitem.substring(1,jsonitem.length()-1);
//		
//		// 获取详情内容
//		JSONObject jsonobj_info = new JSONObject(json_item);
//		item.cat_name = jsonobj_info.getString("cat_name");
//		item.pict_url = jsonobj_info.getString("pict_url");
//		item.cat_leaf_name = jsonobj_info.getString("cat_leaf_name");
//		item.num_iid = jsonobj_info.getLong("num_iid");
//		item.title = jsonobj_info.getString("title");
//		// item.free_shipment = jsonobj_info.getBoolean("free_shipment");
//		item.nick = jsonobj_info.getString("nick");
//		item.item_url = jsonobj_info.getString("item_url");
//		item.reserve_price = jsonobj_info.getString("reserve_price");
//		item.volume = jsonobj_info.getInt("volume");
//		item.zk_final_price = jsonobj_info.getString("zk_final_price");
//		item.provcity = jsonobj_info.getString("provcity");
//		item.seller_id = jsonobj_info.getString("seller_id");
//		// item.shop_dsr = jsonobj_info.getInt("shop_dsr");
//		item.user_type = jsonobj_info.getInt("user_type");
//		
//		// 获取small_images内容
//		JSONObject jsonobj_img = new JSONObject(json_item);
//		String jsonarr_img = jsonobj_img.getString("small_images");
//		// 获取small_images-string内容
//		JSONObject jsonobj_img_string = new JSONObject(jsonarr_img);
//		String json_img_string = jsonobj_img_string.getString("string");
//		String jsonstring = json_img_string.substring(1,json_img_string.length()-1);
//		String[] img = jsonstring.split(",");
//		item.small_images_num = img.length;
//		for(int i = 0; i<img.length;i++) {
//			item.small_images[i] = img[i];
//		}
//		
//		return item;
//	}
	
}
