package com.example.jeonjin_il.myviewpagerlistview;

public class ListViewItem {
    private int iconDrawable ;
    private String titleStr ;
    private String descStr ;

    ListViewItem(String a,String b,int c){
        titleStr = a;
        descStr = b;
        iconDrawable = c;
    }

    public int getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() {
        return this.descStr ;
    }
}