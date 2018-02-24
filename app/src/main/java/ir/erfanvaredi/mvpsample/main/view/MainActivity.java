package ir.erfanvaredi.mvpsample.main.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import ir.erfanvaredi.mvpsample.R;
import ir.erfanvaredi.mvpsample.main.model.interfaces.IMainActivity;
import ir.erfanvaredi.mvpsample.main.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    private TextView textView;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.mainView_textView);
        presenter = new MainPresenter(this);

    }

    @Override
    public void showHiToast() {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setTextView(String val) {
        textView.setText(val);
    }

    @Override
    public String getTextViewData() {
        return textView.getText().toString();
    }

    @Override
    public void onClickBtn(View view) {
        presenter.changeMainTv();
    }

    @Override
    public void dismiss() {
        //// TODO: 2/24/18 dismiss
    }
}
