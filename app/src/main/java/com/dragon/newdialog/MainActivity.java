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
                .setMessage("的方式斯蒂芬斯蒂芬是否考虑技术方法是良好环境科技")
                .setOutsideClickable(true)
                .setOnDoubleBtnClickedListener(new OnDoubleBtnClickedListener() {
                    @Override
                    public void onLeftBtnClick(Dialog utilDialogDouble) {
                        utilDialogDouble.dismiss();
                    }
                    @Override
                    public void onRightBtnClick(Dialog utilDialogDouble) {
                        utilDialogDouble.dismiss();
                    }
                }).show();
    }
    public void toastBtn(View view){
        new UtilDialogToast(this)
                .setToast("发撒好方法放假还是发生了疯狂就爱疯了",2000)
                .show();
    }
}
