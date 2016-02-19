package tiii.com.rxandroid.views.base;

import android.content.Context;

import com.trello.rxlifecycle.ActivityLifecycleProvider;

public interface BaseView {
    Context getContext();
    ActivityLifecycleProvider ActivityLifecycleProvider();
}
