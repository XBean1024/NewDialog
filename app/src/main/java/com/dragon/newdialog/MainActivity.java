package com.dragon.newdialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dragon.dialog.OnDoubleBtnClickedListener;
import com.dragon.dialog.UtilDialogDouble;
import com.dragon.dialog.UtilDialogToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void doubleBtn(View view){
        new UtilDialogDouble(this)
                .setDoubleBtnText("取消", "确定")
                .setTitle("设置了背景色")
                .setMessage("水流波动的波形都是三角波，曲线是正余弦曲线，但是Android中没有提供绘制正余弦曲线的API，好在Path类有个绘制贝塞尔曲线的方法quadTo，绘制出来的是2阶的贝塞尔曲线，要想实现波动效果，只能用它来绘制Path曲线")
                .setOutsideClickable(true)
                .setOnDoubleBtnClickedListener(new OnDoubleBtnClickedListener() {
                    @Override
                    public void onLeftBtnClick(Dialog utilDialogDouble) {
                    }
                    @Override
                    public void onRightBtnClick(Dialog utilDialogDouble) {
                    }
                }).show();
    }
    public void toastBtn(View view){
        new UtilDialogToast(this)
                .setToast("发撒好方法放假还是发生了疯狂就爱疯了",2000)
                .show();
    }
}
