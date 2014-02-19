package com.ms.square.android.multivideo;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

public class VideoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.video, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        private VideoView mVideoView1;
        private VideoView mVideoView2;
        private VideoView mVideoView3;
        private VideoView mVideoView4;
        private VideoView mVideoView5;
        private VideoView mVideoView6;
        private VideoView mVideoView7;
        private VideoView mVideoView8;
        private VideoView mVideoView9;
        private VideoView mVideoView10;


        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_video, container, false);
            mVideoView1 = (VideoView)rootView.findViewById(R.id.video1);
            mVideoView2 = (VideoView)rootView.findViewById(R.id.video2);
            mVideoView3 = (VideoView)rootView.findViewById(R.id.video3);
            mVideoView4 = (VideoView)rootView.findViewById(R.id.video4);
            mVideoView5 = (VideoView)rootView.findViewById(R.id.video5);
            mVideoView6 = (VideoView)rootView.findViewById(R.id.video6);
            mVideoView7 = (VideoView)rootView.findViewById(R.id.video7);
            mVideoView8 = (VideoView)rootView.findViewById(R.id.video8);
            mVideoView9 = (VideoView)rootView.findViewById(R.id.video9);
            mVideoView10 = (VideoView)rootView.findViewById(R.id.video10);

            Uri videoUri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/"
                    + R.raw.sample);

            mVideoView1.setVideoURI(videoUri);
            mVideoView1.start();
            mVideoView2.setVideoURI(videoUri);
            mVideoView2.start();
            mVideoView3.setVideoURI(videoUri);
            mVideoView3.start();
            mVideoView4.setVideoURI(videoUri);
            mVideoView4.start();
            mVideoView5.setVideoURI(videoUri);
            mVideoView5.start();
            mVideoView6.setVideoURI(videoUri);
            mVideoView6.start();
            mVideoView7.setVideoURI(videoUri);
            mVideoView7.start();
            mVideoView8.setVideoURI(videoUri);
            mVideoView8.start();
            mVideoView9.setVideoURI(videoUri);
            mVideoView9.start();
            mVideoView10.setVideoURI(videoUri);
            mVideoView10.start();

            return rootView;
        }
    }

}
