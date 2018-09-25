package com.example.fanmu.task1anagrams.Mvp;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class Presenter implements MvpContract.MvpPresenter {

    private MvpContract.MvpView view;
    private MvpContract.MvpModel model;
    private Consumer<String> consumer;

    Presenter(final MvpContract.MvpView view) {
        model = new Model();
        this.view = view;
        consumer = view::updateTextView;
    }

    @Override
    public void onButtonGetAnagramClicked(String text) {
        Disposable disposable = model.getAnagram(text).subscribe(consumer);
    }
}
