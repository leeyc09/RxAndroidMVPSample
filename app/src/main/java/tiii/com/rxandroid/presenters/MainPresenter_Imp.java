package tiii.com.rxandroid.presenters;

import android.util.Log;

import com.fernandocejas.frodo.annotation.RxLogObservable;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import tiii.com.rxandroid.views.MainView;

/**
 * Created by user on 2016-02-18.
 */
public class MainPresenter_Imp implements MainPresenter {
    public static final String TAG = MainPresenter_Imp.class.getSimpleName();

    private MainView mMainView;

    public MainPresenter_Imp( MainView mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void initializeViews() {
        mMainView.initButton();
    }

    @Override
    public void OnClickSampleBtn() {
        TestHello().observeOn(AndroidSchedulers.mainThread())
                .subscribe(s -> {
                            Log.d(TAG, s);
                            mMainView.TextChange(s);
                        },
                        throwable -> throwable.printStackTrace(),
                        () -> Log.d(TAG, "onComplete")
                );
    }

    @RxLogObservable
    Observable<String> TestHello(){
        return Observable.interval(1, TimeUnit.SECONDS)
                .map(aLong -> "Hello" + aLong)
                .compose(mMainView.ActivityLifecycleProvider().bindToLifecycle());
    }
}