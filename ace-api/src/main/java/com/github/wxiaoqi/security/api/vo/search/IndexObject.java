package com.github.wxiaoqi.security.api.vo.search;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IndexObject implements Comparable<IndexObject>, Serializable{
    private static final long serialVersionUID = -3661090352233076576L;

    private final Long id;
	private final String title;
	private final String keywords;
	private final String descripton;
	private final String postDate;
	private final String url;

	/*相似度*/
	private final float score;
	
	@Override
	public int compareTo(IndexObject o) {
		if(this.score < o.getScore()){
			return 1;
		}else if(this.score > o.getScore()){
			return -1;
		}
		return 0;
	}
}
