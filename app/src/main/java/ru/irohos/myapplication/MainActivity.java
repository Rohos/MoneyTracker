package ru.irohos.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        _showLog("onCreate");
    }

    /**
     +     *  Вызывается либо после onCreate() либо после возобновления работы
     +     */
    @Override
    protected void onStart() {
        super.onStart();
        _showLog("onStart");
    }

    /**
     * Вызывается после onStart()
     */
    @Override
    protected void onResume() {
        super.onResume();
        _showLog("onResume");
    }

    /**
     * Вызывается при работе с новым окном
     */
    @Override
    protected void onPause() {
        super.onPause();
        _showLog("onPause");
    }

    /**
     * Вызывается когда окно становится невидимым пользователю
     */
    @Override
    protected void onStop() {
        super.onStop();
        _showLog("onStop");
    }

    /**
     * Вызывается после того, как активность была остановлена и снова была запущена
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        _showLog("onRestart");
    }

    /**
     * Вызывается по окончании работы активности
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        _showLog("onDestroy");
    }

    /**
     * Выводит логи
     * @param msg
     */
    private void _showLog(String msg) {
        Log.d(LOG_TAG, "=======+++++++ METHOD: \"" + msg + "()\" +++++++=======");
    }
}