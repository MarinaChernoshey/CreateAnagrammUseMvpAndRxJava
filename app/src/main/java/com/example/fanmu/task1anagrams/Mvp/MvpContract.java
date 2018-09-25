package com.example.fanmu.task1anagrams.Mvp;

import io.reactivex.Observable;

public interface MvpContract {

    interface MvpView {
        void updateTextView(String textAnagram);
    }

    interface MvpModel {
        Observable<String> getAnagram(String text);
    }

    interface MvpPresenter {
        void onButtonGetAnagramClicked(String text);
    }
}
