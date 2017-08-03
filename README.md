## 自定义对话框
### 使用方式 :在你需要的地方使用
#### 双按钮:
       new UtilDialogDouble(this)
                .setDoubleBtnText("取消", "确定")
                .setTitle("设置了背景色")
                .setMessage("的方式斯蒂芬斯蒂芬是否考虑技术方法是良好环境科技")
                .setOutsideClickable(true)
                .setOnDoubleBtnClickedListener(new OnDoubleBtnClickedListener() {
                    @Override
                    public void onLeftBtnClick(Dialog utilDialogDouble) {
                    }
                    @Override
                    public void onRightBtnClick(Dialog utilDialogDouble) {
                    }
                }).show();

#### 弹窗:
	   new UtilDialogToast(this)
	                .setToast("发撒好方法放假还是发生了疯狂就爱疯了",2000)
	                .show();
##### QQ：交流群 ：192268854
![](https://github.com/Xbean1024/XHttp/blob/master/gif/QQ.JPG)
