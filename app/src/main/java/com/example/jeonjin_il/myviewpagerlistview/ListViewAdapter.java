package com.example.jeonjin_il.myviewpagerlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    ArrayList<ListViewItem> datas;
    LayoutInflater inflater;

    public ListViewAdapter(LayoutInflater inflater, ArrayList<ListViewItem> datas) {
        // TODO Auto-generated constructor stub

        this.datas= datas;
        this.inflater= inflater;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return datas.size(); //datas의 개수를 리턴
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return datas.get(position);//datas의 특정 인덱스 위치 객체 리턴.
    }

    //특정 위치(position)의 data(MemberData)을 지칭하는 아이디를 리턴하는 메소드
    //특별한 경우가 아니라면 보통은 data의 위치를 아이디로 사용하므로
    //전달받은 position를 그대로 리턴함.
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub


        if( convertView==null){
            //null이라면 재활용할 View가 없으므로 새로운 객체 생성
            //View의 모양은 res폴더>>layout폴더>>list.xml 파일로 객체를 생성
            //xml로 선언된 레이아웃(layout)파일을 객체로 부풀려주는 LayoutInflater 객체 활용.
            convertView= inflater.inflate(R.layout.listview_view, null);
        }


        //2. Bind View
        //재활용을 하든 새로 만들었든 이제 converView는 View객체 상태임.
        //이 convertView로부터 데이터를 입력할 위젯들 참조하기.
        //이름을 표시하는 TextView, 국적을 표시하는 TextView, 국기이미지를 표시하는 ImageView
        //convertView로 부터 findViewById()를 하시는 것에 주의하세요.
//        TextView text_name= (TextView)convertView.findViewById(R.id.text_name);
//        TextView text_nation= (TextView)convertView.findViewById(R.id.text_nation);
        ImageView img_flag= (ImageView)convertView.findViewById(R.id.img_flag);

        //현재 position( getView()메소드의 첫번재 파라미터 )번째의 Data를 위 해당 View들에 연결..
//        text_name.setText( datas.get(position).getTitle() );
//        text_nation.setText( datas.get(position).getDesc() );
        img_flag.setImageResource( datas.get(position).getIcon() );


        //설정이 끝난 convertView객체 리턴(ListView에서 목록 하나.)
        return convertView;
    }

}