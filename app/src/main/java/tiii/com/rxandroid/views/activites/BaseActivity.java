package tiii.com.rxandroid.views.activites;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.trello.navi.component.support.NaviAppCompatActivity;
import com.trello.rxlifecycle.ActivityLifecycleProvider;
import com.trello.rxlifecycle.navi.NaviLifecycle;

import butterknife.Bind;
import butterknife.ButterKnife;
import tiii.com.rxandroid.R;
import tiii.com.rxandroid.presenters.MainPresenter;
import tiii.com.rxandroid.presenters.MainPresenter_Imp;
import tiii.com.rxandroid.views.MainView;

public class BaseActivity extends NaviAppCompatActivity {
    public static final String TAG = BaseActivity.class.getSimpleName();
    private final ActivityLifecycleProvider activityLifecycleProvider = NaviLifecycle.createActivityLifecycleProvider(this);

    public ActivityLifecycleProvider getActivityLifecycleProvider() {
        return activityLifecycleProvider;
    }
}
