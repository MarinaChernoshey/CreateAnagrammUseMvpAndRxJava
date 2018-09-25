package com.example.fanmu.task1anagrams.Mvp;

import com.example.fanmu.task1anagrams.StringUtil;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class Model implements MvpContract.MvpModel {

    @Override
    public Observable<String> getAnagram(final String text) {

        return Observable.fromCallable(() -> StringUtil.getAnagram(text))
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
