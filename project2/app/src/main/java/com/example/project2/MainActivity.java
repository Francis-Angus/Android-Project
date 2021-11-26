package com.example.project2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicks(View view) {

//        Toast.makeText(this,"message",Toast.LENGTH_LONG).show(); //1.最簡單顯示
//        ---------------------------------------------------------------------------

//        Toast toast = Toast.makeText(this,"正中間",Toast.LENGTH_LONG); //2.特定位置
//        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//        toast.show();
//        ----------------------------------------------------------------------------

//        Toast toast = new Toast(this); //3.顯示圖片(布局)
//        toast.setGravity(Gravity.CENTER,0,0);
//        toast.setDuration(Toast.LENGTH_LONG);
//        LayoutInflater inflater = getLayoutInflater();
//        View layout = getLayoutInflater().inflate(R.layout.toast_layout,null);
//        toast.setView(layout);
//        toast.show();
//        ----------------------------------------------------------------------------

//        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//        dialog.setTitle("第一次創建");
//        dialog.setMessage("設置內容，詳細請參照公開說明書");
//
//        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast toast = Toast.makeText(MainActivity.this,"打你喔",Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//                toast.show();
//            }
//        });
//
//        dialog.setPositiveButton("同意", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast toast = Toast.makeText(MainActivity.this,"摸頭",Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//                toast.show();
//            }
//        });
//
//        dialog.setNeutralButton("多餘", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast toast = Toast.makeText(MainActivity.this,"不一定要設置",Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//                toast.show();
//
//            }
//        });
//        dialog.show();
//        -------------------------------------------------------------------
        String[] list = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        AlertDialog.Builder dialog_list = new AlertDialog.Builder(MainActivity.this);
        dialog_list.setItems(list, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast toast = Toast.makeText(MainActivity.this,list[which],Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });
        dialog_list.show();
    }
}