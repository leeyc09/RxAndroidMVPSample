package tiii.com.rxandroid.views.activites;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.trello.rxlifecycle.ActivityLifecycleProvider;

import butterknife.Bind;
import butterknife.ButterKnife;
import tiii.com.rxandroid.R;
import tiii.com.rxandroid.presenters.MainPresenter;
import tiii.com.rxandroid.presenters.MainPresenter_Imp;
import tiii.com.rxandroid.views.MainView;

public class MainActivity extends BaseActivity implements MainView {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.textview)
    TextView simpleTextview;
    @Bind(R.id.button)
    Button button;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenter_Imp(this);
        presenter.initializeViews();
    }

    @Override
    public void initButton() {
        button.setOnClickListener(v -> presenter.OnClickSampleBtn());
    }

    @Override
    public void TextChange(String text) {
        simpleTextview.setText(text);
    }

    @Override
    public ActivityLifecycleProvider ActivityLifecycleProvider() {
        return getActivityLifecycleProvider();
    }

    @Override
    public Context getContext() {
        return this;
    }
}
