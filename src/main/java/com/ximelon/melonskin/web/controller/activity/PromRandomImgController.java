package com.ximelon.melonskin.web.controller.activity;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/promImg")
public class PromRandomImgController {
	
	@RequestMapping("/toImg.html")
	public ModelAndView toRandomImg(){
		ModelAndView mav = new ModelAndView("wxgzh/promotion/promRandomImg");
		
		String[] imgSrc = {
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484834925056&di=f9e039501bc7dce55d1f240b21acc197&imgtype=0&src=http%3A%2F%2Fww1.sinaimg.cn%2Flarge%2Fbca3622fjw1dz86lkw0jtj.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484834925055&di=6b8ad557283fb6bd908be01dda62b178&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2014%2F183%2F17%2F948D77MH3CVR.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484834998855&di=175ae276ae07e3fb3ff12825f1f81879&imgtype=0&src=http%3A%2F%2Fa3.topitme.com%2F6%2F84%2F8e%2F11289393176fc8e846o.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484834998855&di=976532bcf0d4fba633b759706f49dc9d&imgtype=0&src=http%3A%2F%2Fs06.lmbang.com%2FM00%2FC0%2F9A%2FDhFprFRjXRSACFhAAAK10uRgc1M819.jpg%2521q.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484834998850&di=48eb127b18a502a9781a2857576e0e6f&imgtype=0&src=http%3A%2F%2Fd.123.sogou.com%2Fimgn%2Fxh2nd%2Fpic%2F201503%2F0808%2Fhahaapi4_bd698b0fjw1emwlfx4cjfj20hs0jxq3v.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484835104093&di=d57aa04adf5cb8cc16da5e36b6b0d8e8&imgtype=0&src=http%3A%2F%2Fimg.woyaogexing.com%2F2016%2F03%2F11%2F5b3c7e9254ce9dee%2521600x600.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484835104093&di=d7cdf98aa112454b6c03427f24abb21d&imgtype=0&src=http%3A%2F%2Fgaoxiao.zhutou.com%2Fhtml%2FUploadPic%2F2010-4%2F201043234910247.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484835165161&di=f03ccd6392a57f321bfc57cdc1965b44&imgtype=0&src=http%3A%2F%2Fimg.nextcar.cn%2Fpicture%2F2014_12_05%2F8223464ce7309f0a1e030a0a857f93ff.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484835165160&di=e86d8ef5fb761124c43a3eaa56bb10c4&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fforum%2Fw%3D580%2Fsign%3Dc5fe0e76f81986184147ef8c7aec2e69%2Fea33dbb44aed2e73fd310d3b8701a18b86d6fa93.jpg",
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1484835165159&di=f65d3dc0c88a11e6978655e353ed17e9&imgtype=0&src=http%3A%2F%2Fimage58.360doc.com%2FDownloadImg%2F2013%2F02%2F0600%2F30165099_26.gif"
				};
		
		mav.addObject("imgSrc", imgSrc[new Random().nextInt(10)]);
		
		return mav;
	}

}
