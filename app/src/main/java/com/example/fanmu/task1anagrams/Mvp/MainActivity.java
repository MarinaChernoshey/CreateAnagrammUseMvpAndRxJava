package com.example.fanmu.task1anagrams.Mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fanmu.task1anagrams.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class MainActivity extends AppCompatActivity implements MvpContract.MvpView {

    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.textView)
    TextView textView;

    MvpContract.MvpPresenter presenter;

    public static final String LOG = "task1_LOG";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new Presenter(this);
    }

    @OnClick(R.id.button)
    public void onClickButton() {
        presenter.onButtonGetAnagramClicked(String.valueOf(editText.getText()));
    }

    @Override
    public void updateTextView(String textAnagram) {
        textView.setText(textAnagram);
    }
}
