package tiii.com.rxandroid.views;

import com.trello.rxlifecycle.ActivityLifecycleProvider;

import tiii.com.rxandroid.views.base.BaseView;
/**
 * Created by user on 2016-02-18.
 */
public interface MainView extends BaseView {

    void initButton();
    void TextChange(String text);
}
