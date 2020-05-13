package com.example.myapplication;

import android.os.AsyncTask;
import android.widget.TextView;

public class MyAsyncTask extends AsyncTask<Integer,Integer,Integer> {

    TextView state, count;

    public MyAsyncTask(TextView state, TextView count) {
        super();
        this.state = state;
        this.count = count;
    }

    @Override
    protected Integer doInBackground(Integer... integers) {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publishProgress(i);
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        state.setText("working");

    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
        state.setText("done");
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        count.setText("count = " + values[0].toString());

    }
}
