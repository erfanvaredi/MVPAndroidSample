package ir.erfanvaredi.mvpsample.main.model.interfaces;

import android.view.View;

/**
 * Created by erfanvaredi on 2/24/18.
 */

public interface IMainActivity {
    void showHiToast();
    void showToast(String msg);
    void setTextView(String val);
    String getTextViewData();

    void onClickBtn(View view);
    void dismiss();
}
