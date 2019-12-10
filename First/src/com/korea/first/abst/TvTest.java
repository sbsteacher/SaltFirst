package com.korea.first.abst;

public class TvTest {
	public static void main(String[] args) {
		Tv tv = new SamsungTv();
		speakUp(tv);
		/*
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		*/		
		tv.showVolumn();
		
		Tv tv2 = new LGTv();
		speakUp(tv2);
		/*
		tv2.volumnUp();
		tv2.volumnUp();
		tv2.volumnUp();
		*/
		tv2.showVolumn();
	}
	
	static void speakUp(Tv tv) {
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		
		if(tv instanceof LGTv) {
			LGTv ltv = (LGTv)tv;
			ltv.play();
			
			//((LGTv)tv).play();
		}
		
	}
}
