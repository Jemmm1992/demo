package com.example.demo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by BIG-JIAN on 2017/7/12.
 */
@Getter
@Setter
public class LearnResouce {
    private String author;
    private String title;
    private String url;
    public LearnResouce(String s1,String s2,String s3){
        this.author = s1;
        this.title = s2;
        this.url = s3;
    }
}
