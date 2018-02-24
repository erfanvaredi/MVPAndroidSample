package ir.erfanvaredi.mvpsample.main.presenter;

import ir.erfanvaredi.mvpsample.main.model.interfaces.IMainPresenter;
import ir.erfanvaredi.mvpsample.main.model.interfaces.IMainActivity;

/**
 * Created by erfanvaredi on 2/24/18.
 */

public class MainPresenter implements IMainPresenter{

    private IMainActivity _viewDelegate;

    public MainPresenter(IMainActivity _view) {
        this._viewDelegate = _view;
    }

    @Override
    public void changeMainTv() {
        String str = _viewDelegate.getTextViewData();
        if (str.contains("hello")){
            _viewDelegate.setTextView("World");
        }else {
            _viewDelegate.setTextView("hello");
        }
        _viewDelegate.dismiss();
    }
}
