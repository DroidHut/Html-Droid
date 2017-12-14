package com.example.shivani.urlapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView google,youtube,facebook,wikipedia,reddit,twitter,amazon,linkedin,instagram,netflix
            ,snapchat,tumblr,pinterest,vimeo,viber,vk,flickr,myspace,digg,vine
            ,gnews,bbc,nyt,cnn,usatoday,huffington,toi,hindu,ht
            ,ebay,flipkart,shopclues,paypal,paytm
            ,stack,wordpress,quora,github,blogger,rss,msn,soundcloud,skype,uber;

   /* public static final String GOOGLE= "https://www.google.com/";
    public static final String YOUTUBE = "https://www.youtube.com/";
    public static final String FACEBOOK= "https://www.facebook.com/search?p=";
    public static final String WIKIPEDIA = "https://www.wikipedia.org/";
    public static final String REDDIT= "https://www.reddit.com/";
    public static final String AMAZON= "https://www.amazon.com/";
    public static final String TWITTER= "https://www.twitter.com/search?p=";
    public static final String INSTAGRAM= "https://www.instagram.com/";
    public static final String LINKEDIN="https://www.linkedin.com/";
    public static final String NETFLIX="https://www.netflix.com/ ";

    public static final String SNAPCHAT="https://www.snapchat.com/ ";
    public static final String TUMBLR="https://www.tumblr.com/";
    public static final String PINTEREST="https://www.pinterest.com/";
    public static final String VIMEO="https://vimeo.com/";
    public static final String VIBER="https://www.viber.com/ ";
    public static final String VK="https://vk.com/ ";
    public static final String FLICKR="https://www.flickr.com/ ";
    public static final String MYSPACE="https://myspace.com/";
    public static final String DIGG="http://digg.com/";
    public static final String VINE="https://vine.co/";

    public static final String GNEWS="https://news.google.com/news/?ned=us&hl=en";
    public static final String BBC="http://www.bbc.com/news";
    public static final String NYT="https://www.nytimes.com/";
    public static final String CNN="http://edition.cnn.com/";
    public static final String USATODAY="https://www.usatoday.com/";
    public static final String HUFFINGTON="www.huffingtonpost.com/";
    public static final String TOI="timesofindia.indiatimes.com/";
    public static final String HINDU="http://www.thehindu.com/";
    public static final String HT="http://www.hindustantimes.com/ ";

    public static final String EBAY="https://www.ebay.com/ ";
    public static final String FLIPKART="https://www.flipkart.com/";
    public static final String SHOPCLUES="http://www.shopclues.com/";
    public static final String PAYPAL="https://www.paypal.com/";
    public static final String PAYTM="https://paytm.com/";

    public static final String STACK="https://stackoverflow.com/";
    public static final String WORDPRESS="https://wordpress.com/";
    public static final String QUORA="https://www.quora.com/";
    public static final String GIT="https://github.com/";
    public static final String BLOGGER="https://www.blogger.com/";
    public static final String RSS= "https://www.rss.com/";
    public static final String MSN= "http://www.msn.com/";
    public static final String SOUNDCLOUD= "https://soundcloud.com/";
    public static final String SKYPE= "https://www.skype.com/en/";
    public static final String UBER= "https://www.uber.com/";*/

      String[] urls;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView gotoHtml=(TextView)findViewById(R.id.goToHtml); 
        gotoHtml.setOnClickListener(this);

         urls = getResources().getStringArray(R.array.urls);
        
        facebook=(ImageView)findViewById(R.id.urlfacebook);
        google=(ImageView)findViewById(R.id.urlgoogle);
        wikipedia =(ImageView)findViewById(R.id.urlwiki);
        youtube=(ImageView)findViewById(R.id.urlyoutube);
        twitter=(ImageView)findViewById(R.id.urltwitter);
        reddit=(ImageView)findViewById(R.id.urlreddit);
        amazon=(ImageView)findViewById(R.id.urlamazon);
        instagram =(ImageView)findViewById(R.id.urlinstagram);
        linkedin=(ImageView)findViewById(R.id.urllinkedin);
        netflix=(ImageView)findViewById(R.id.urlnetflix);


        snapchat=(ImageView)findViewById(R.id.urlsnapchat);
        tumblr=(ImageView)findViewById(R.id.urltumblr);
        pinterest =(ImageView)findViewById(R.id.urlpinterest);
        vimeo=(ImageView)findViewById(R.id.urlvimeo);
        viber=(ImageView)findViewById(R.id.urlviber);
        vk=(ImageView)findViewById(R.id.urlvk);
        flickr=(ImageView)findViewById(R.id.urlflickr);
        myspace =(ImageView)findViewById(R.id.urlmyspace);
        digg=(ImageView)findViewById(R.id.urldigg);
        vine=(ImageView)findViewById(R.id.urlvine);


        gnews=(ImageView)findViewById(R.id.urlgnews);
        bbc=(ImageView)findViewById(R.id.urlbbc);
        nyt =(ImageView)findViewById(R.id.urlnyt);
        cnn=(ImageView)findViewById(R.id.urlcnn);
        usatoday=(ImageView)findViewById(R.id.urlusa);
        huffington=(ImageView)findViewById(R.id.urlhuff);
        toi=(ImageView)findViewById(R.id.urltoi);
        hindu =(ImageView)findViewById(R.id.urlhindu);
        ht=(ImageView)findViewById(R.id.urlht);


        ebay=(ImageView)findViewById(R.id.urlebay);
        flipkart=(ImageView)findViewById(R.id.urlflipkart);
        shopclues=(ImageView)findViewById(R.id.urlshopclues);
        paypal=(ImageView)findViewById(R.id.urlpaypal);
        paytm=(ImageView)findViewById(R.id.urlpaytm);


        stack=(ImageView)findViewById(R.id.urlstack);
        wordpress=(ImageView)findViewById(R.id.urlwordpress);
        quora =(ImageView)findViewById(R.id.urlquora);
        github=(ImageView)findViewById(R.id.urlgit);
        blogger=(ImageView)findViewById(R.id.urlblog);
        rss=(ImageView)findViewById(R.id.urlrss);
        msn=(ImageView)findViewById(R.id.urlmsn);
        soundcloud =(ImageView)findViewById(R.id.urlsound);
        skype=(ImageView)findViewById(R.id.urlskype);
        uber=(ImageView)findViewById(R.id.urluber);

        facebook.setOnClickListener(this);
        google.setOnClickListener(this);
        wikipedia.setOnClickListener(this);
        youtube.setOnClickListener(this);
        twitter.setOnClickListener(this);
        instagram.setOnClickListener(this);
        netflix.setOnClickListener(this);
        linkedin.setOnClickListener(this);
        amazon.setOnClickListener(this);
        twitter.setOnClickListener(this);
        reddit.setOnClickListener(this);

        snapchat.setOnClickListener(this);
        tumblr.setOnClickListener(this);
        pinterest.setOnClickListener(this);
        vimeo.setOnClickListener(this);
        viber.setOnClickListener(this);
        vk.setOnClickListener(this);
        flickr.setOnClickListener(this);
        myspace.setOnClickListener(this);
        digg.setOnClickListener(this);
        vine.setOnClickListener(this);


        gnews.setOnClickListener(this);
        bbc.setOnClickListener(this);
        nyt.setOnClickListener(this);
        cnn.setOnClickListener(this);
        usatoday.setOnClickListener(this);
        huffington.setOnClickListener(this);
        toi.setOnClickListener(this);
        hindu.setOnClickListener(this);
        ht.setOnClickListener(this);

        ebay.setOnClickListener(this);
        flipkart.setOnClickListener(this);
        shopclues.setOnClickListener(this);
        paypal.setOnClickListener(this);
        paytm.setOnClickListener(this);

        stack.setOnClickListener(this);
        wordpress.setOnClickListener(this);
        quora.setOnClickListener(this);
        github.setOnClickListener(this);
        blogger.setOnClickListener(this);
        rss.setOnClickListener(this);
        msn.setOnClickListener(this);
        soundcloud.setOnClickListener(this);
        skype.setOnClickListener(this);
        uber.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.goToHtml:
                Intent intent = new Intent(MainActivity.this,HtmlViewActivity.class);
                startActivity(intent);
                break;
            case R.id.urlgoogle:
                Intent intent0 = new Intent(MainActivity.this,MyWebView.class);
                intent0.putExtra("Url",urls[0]);
                startActivity(intent0);
                break;
            case R.id.urlyoutube:
                Intent intent1 = new Intent(MainActivity.this,MyWebView.class);
                intent1.putExtra("Url",urls[1]);
                startActivity(intent1);

                break;

            case R.id.urlfacebook:
                Intent intent2 = new Intent(MainActivity.this,MyWebView.class);
                intent2.putExtra("Url",urls[2]);
                startActivity(intent2);
                break;

            case R.id.urlwiki:
                Intent intent3 = new Intent(MainActivity.this,MyWebView.class);
                intent3.putExtra("Url",urls[3]);
                startActivity(intent3);
                break;

            case R.id.urlreddit:
                Intent intent4 = new Intent(MainActivity.this,MyWebView.class);
                intent4.putExtra("Url",urls[4]);
                startActivity(intent4);
                break;

            case R.id.urlamazon:
                Intent intent5 = new Intent(MainActivity.this,MyWebView.class);
                intent5.putExtra("Url",urls[5]);
                startActivity(intent5);

                break;
            case R.id.urltwitter:
                Intent intent6 = new Intent(MainActivity.this,MyWebView.class);
                intent6.putExtra("Url",urls[6]);
                startActivity(intent6);

                break;
            case R.id.urlinstagram:
                Intent intent7 = new Intent(MainActivity.this,MyWebView.class);
                intent7.putExtra("Url",urls[7]);
                startActivity(intent7);

                break;
            case R.id.urllinkedin:
                Intent intent8 = new Intent(MainActivity.this,MyWebView.class);
                intent8.putExtra("Url",urls[8]);
                startActivity(intent8);

                break;
            case R.id.urlnetflix:
                Intent intent9 = new Intent(MainActivity.this,MyWebView.class);
                intent9.putExtra("Url",urls[9]);
                startActivity(intent9);

                break;

            case R.id.urlsnapchat:
                Intent intent10 = new Intent(MainActivity.this,MyWebView.class);
                intent10.putExtra("Url",urls[10]);
                startActivity(intent10);

                break;
            case R.id.urltumblr:
                Intent intent11 = new Intent(MainActivity.this,MyWebView.class);
                intent11.putExtra("Url",urls[11]);
                startActivity(intent11);

                break;
            case R.id.urlpinterest:
                Intent intent12 = new Intent(MainActivity.this,MyWebView.class);
                intent12.putExtra("Url",urls[12]);
                startActivity(intent12);

                break;
            case R.id.urlvimeo:
                Intent intent13 = new Intent(MainActivity.this,MyWebView.class);
                intent13.putExtra("Url",urls[13]);
                startActivity(intent13);

                break;
            case R.id.urlviber:
                Intent intent14 = new Intent(MainActivity.this,MyWebView.class);
                intent14.putExtra("Url",urls[14]);
                startActivity(intent14);

                break;
            case R.id.urlvk:
                Intent intent15= new Intent(MainActivity.this,MyWebView.class);
                intent15.putExtra("Url",urls[15]);
                startActivity(intent15);

                break;
            case R.id.urlflickr:
                Intent intent16 = new Intent(MainActivity.this,MyWebView.class);
                intent16.putExtra("Url",urls[16]);
                startActivity(intent16);

                break;
            case R.id.urlmyspace:
                Intent intent17 = new Intent(MainActivity.this,MyWebView.class);
                intent17.putExtra("Url",urls[17]);
                startActivity(intent17);

                break;
            case R.id.urldigg:
                Intent intent18 = new Intent(MainActivity.this,MyWebView.class);
                intent18.putExtra("Url",urls[18]);
                startActivity(intent18);

                break;
            case R.id.urlvine:
                Intent intent19 = new Intent(MainActivity.this,MyWebView.class);
                intent19.putExtra("Url",urls[19]);
                startActivity(intent19);

                break;

            case R.id.urlgnews:
                Intent intent20 = new Intent(MainActivity.this,MyWebView.class);
                intent20.putExtra("Url",urls[20]);
                startActivity(intent20);

                break;
            case R.id.urlbbc:
                Intent intent21 = new Intent(MainActivity.this,MyWebView.class);
                intent21.putExtra("Url",urls[21]);
                startActivity(intent21);

                break;
            case R.id.urlnyt:
                Intent intent22 = new Intent(MainActivity.this,MyWebView.class);
                intent22.putExtra("Url",urls[22]);
                startActivity(intent22);

                break;
            case R.id.urlcnn:
                Intent intent23 = new Intent(MainActivity.this,MyWebView.class);
                intent23.putExtra("Url",urls[23]);
                startActivity(intent23);

                break;
            case R.id.urlusa:
                Intent intent24 = new Intent(MainActivity.this,MyWebView.class);
                intent24.putExtra("Url",urls[24]);
                startActivity(intent24);

                break;
            case R.id.urlhuff:
                Intent intent25 = new Intent(MainActivity.this,MyWebView.class);
                intent25.putExtra("Url",urls[25]);
                startActivity(intent25);;

                break;
            case R.id.urltoi:
                Intent intent26 = new Intent(MainActivity.this,MyWebView.class);
                intent26.putExtra("Url",urls[26]);
                startActivity(intent26);

                break;
            case R.id.urlhindu:
                
                Intent intent27 = new Intent(MainActivity.this,MyWebView.class);
                intent27.putExtra("Url",urls[27]);
                startActivity(intent27);
                break;
            case R.id.urlht:
                
                Intent intent28 = new Intent(MainActivity.this,MyWebView.class);
                intent28.putExtra("Url",urls[28]);
                startActivity(intent28);
                break;

            case R.id.urlebay:
                Intent intent29 = new Intent(MainActivity.this,MyWebView.class);
                intent29.putExtra("Url",urls[29]);
                startActivity(intent29);

                break;
            case R.id.urlflipkart:
                Intent intent30 = new Intent(MainActivity.this,MyWebView.class);
                intent30.putExtra("Url",urls[30]);
                startActivity(intent30);

                break;
            case R.id.urlshopclues:
                Intent intent31 = new Intent(MainActivity.this,MyWebView.class);
                intent31.putExtra("Url",urls[31]);
                startActivity(intent31);

                break;
            case R.id.urlpaypal:
                Intent intent32= new Intent(MainActivity.this,MyWebView.class);
                intent32.putExtra("Url",urls[32]);
                startActivity(intent32);

                break;
            case R.id.urlpaytm:
                Intent intent33 = new Intent(MainActivity.this,MyWebView.class);
                intent33.putExtra("Url",urls[33]);
                startActivity(intent33);

                break;
            case R.id.urlstack:
                Intent intent34 = new Intent(MainActivity.this,MyWebView.class);
                intent34.putExtra("Url",urls[34]);
                startActivity(intent34);

                break;
            case R.id.urlwordpress:
                Intent intent35 = new Intent(MainActivity.this,MyWebView.class);
                intent35.putExtra("Url",urls[35]);
                startActivity(intent35);
                break;
            case R.id.urlquora:
                Intent intent36 = new Intent(MainActivity.this,MyWebView.class);
                intent36.putExtra("Url",urls[36]);
                startActivity(intent36);

                break;
            case R.id.urlgit:
                Intent intent37 = new Intent(MainActivity.this,MyWebView.class);
                intent37.putExtra("Url",urls[37]);
                startActivity(intent37);

                break;
            case R.id.urlblog:
                Intent intent38 = new Intent(MainActivity.this,MyWebView.class);
                intent38.putExtra("Url",urls[38]);
                startActivity(intent38);

                break;
            case R.id.urlrss:
                Intent intent39 = new Intent(MainActivity.this,MyWebView.class);
                intent39.putExtra("Url",urls[39]);
                startActivity(intent39);

                break;
            case R.id.urlmsn:
                Intent intent40 = new Intent(MainActivity.this,MyWebView.class);
                intent40.putExtra("Url",urls[40]);
                startActivity(intent40);

                break;
            case R.id.urlsound:
                Intent intent41 = new Intent(MainActivity.this,MyWebView.class);
                intent41.putExtra("Url",urls[41]);
                startActivity(intent41);

                break;
            case R.id.urlskype:
                Intent intent42 = new Intent(MainActivity.this,MyWebView.class);
                intent42.putExtra("Url",urls[42]);
                startActivity(intent42);
                break;
            case R.id.urluber:
                Intent intent43 = new Intent(MainActivity.this,MyWebView.class);
                intent43.putExtra("Url",urls[43]);
                startActivity(intent43);
                break;
        }
    }
    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        },3000);
    }
}
