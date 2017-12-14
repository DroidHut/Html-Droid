package com.example.shivani.urlapp;

import android.app.Application;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlViewActivity extends AppCompatActivity {
    public static final String FILENAME = "homepage.html";

    private static final String HEAD_1 = "<!DOCTYPE html><html xmlns=\"http://www.w3.org/1999/xhtml\">"
            + "<head>"
            + "<meta content=\"en-us\" http-equiv=\"Content-Language\" />"
            + "<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />"
            + "<meta name=\"viewport\" content=\"width=98%, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">"
            +"<style>\n" +
            ".card {\n" +
            "    /* Add shadows to create the \"card\" effect */}" +
            "/* Add some padding inside the card container */\n" +
            ".container {\n" +
            "    padding: 2px 16px;\n" +
            "}\n" +
            "p{\n" +
            "text-align:center;\n" +
            "color:gray;\n" +
            "font-size: 15px;\n" +
            "font-family: \"Times New Roman\", Times, serif;\n" +
            "}\n" +
            "table{\n" +
            " width:100%;\n" +
            " height:75%;\n" +
            " align=center;\n" +
            "margin-left:3%;\n"+
            " }\n" +
            " html {\n" +
            "  height:100%;\n" +
            "max-width: 100%;\n" +
            "    overflow-x: hidden;"+
            "  width:100%;\n" +
            "}\n" +
            "body {\n" +
            "width:98%;\n" +
            "max-width: 100%;\n" +
            "overflow-x: hidden;"+
            "min-width:90%;\n" +
            "height:95%;\n" +
            "  min-height:90%;\n" +
            "}\n" +
            "img{height:45px; width:45px;}"+
            "</style>\n" +
            "\n" +
            "</head>\n" +
            "<body>\n" +
            "<div class=\"card\">\n" +
            "<p>Most Searched</p>\n" +
            "<table>\n" +
            "<tr>\n" +
            "<td>\n" +
            "\t<img src=\"file:///android_asset/google.png\" width=\"35\" height=\"35\" alt=\"Google\" onclick=\"javascript:location.href='https://www.google.com/'\" />\n" +
            "\t</a>\n" +
            "\t</td>\n" +
            "   <td>\n" +
            "\t<img src=\"file:///android_asset/facebook.png\" width=\"35\" height=\"35\" alt=\"Facebook\" onclick=\"javascript:location.href='http://www.facebook.com/'\" />\n" +
            "\t</a>\n" +
            "\t</td>\n" +
            "\t<td>\n" +
            "    <img src=\"file:///android_asset/youtube.png\" width=\"35\" height=\"35\" alt=\"Youtube onclick=\"javascript:location.href='http://www.youtube.com/'\"/>\n" +
            "\t</a>\n" +
            "\t</td>\n" +
            "\t<td>\n" +
            "    <img src=\"file:///android_asset/wikipedia.png\" width=\"35\" height=\"35\" alt=\"Wikipedia\" onclick=\"javascript:location.href='http://www.wikipedia.org/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/reddit.png\" width=\"35\" height=\"35\" alt=\"Reddit\" onclick=\"javascript:location.href='https://www.reddit.com/'\"/></a></td><td>\n" +
            "\t</tr>\n" +
            "    <tr>\n" +
            "\t<td>\n" +
            "\t<img src=\"file:///android_asset/amazon.png\" width=\"35\" height=\"35\" alt=\"Amazon\" onclick=\"javascript:location.href='https://www.amazon.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/twitter.png\" width=\"35\" height=\"35\" alt=\"Twitter\" onclick=\"javascript:location.href='http://www.twitter.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/instagram.png\" width=\"35\" height=\"35\" alt=\"Instagram\" onclick=\"javascript:location.href='https://www.instagram.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/linkedin.png\" height=\"35\" alt=\"LinkedIn\" onclick=\"javascript:location.href='https://www.linkedin.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/netflix.png\" width=\"35\" height=\"35\" alt=\"Netflix\" onclick=\"javascript:location.href='https://www.netflix.com/'\"/></a>\n" +
            "\t</td>\n" +
            "\t</tr></table>\n" +
            "\t<table>\n" +
            "\t<p>E-Commerce</p>\n" +
            "\t  <tr>\n" +
            "\t<td>\n" +
            "\t<img src=\"file:///android_asset/ebay.png\" width=\"35\" height=\"35\" alt=\"Ebay\" onclick=\"javascript:location.href='https://www.ebay.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/flipkart.png\" width=\"35\" height=\"35\" alt=\"Flipkart\" onclick=\"javascript:location.href='http://www.flipkart.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/shopclues.png\" width=\"35\" height=\"35\" alt=\"Shopclues\" onclick=\"javascript:location.href='http://www.shopclues.com'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/paypal.png\" width=\"35\" height=\"35\" alt=\"Paypal\" onclick=\"javascript:location.href='https://www.paypal.com/'\" /></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/paytm.png\" width=\"35\" height=\"35\" alt=\"Paytm\" onclick=\"javascript:location.href='https://paytm.com/'\" /></a>\n" +
            "\t</td>\n" +
            "\t</tr>\n" +
            "\t</table>\n" +
            "\t<p>News Sites </p>\n" +
            "\t<table>\n" +
            "\t  <tr>\n" +
            "\t<td>\n" +
            "\t<img src=\"file:///android_asset/news.png\" width=\"35\" height=\"35\" alt=\"Gnews\" onclick=\"javascript:location.href='https://news.google.com/news/?ned=us&hl=en'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/bbc.png\" width=\"35\" height=\"35\" alt=\"BBC\" onclick=\"javascript:location.href='http://www.bbc.com/news'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/nyt.png\" width=\"35\" height=\"35\" alt=\"NYT\" onclick=\"javascript:location.href='https://www.nytimes.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/cnn.png\" width=\"35\" height=\"35\" alt=\"Cnn\" onclick=\"javascript:location.href='http://edition.cnn.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/usatoday.png\" width=\"35\" height=\"35\" alt=\"UsaToday\" onclick=\"javascript:location.href='https://www.usatoday.com/'\"/></a>\n" +
            "\t</td>\n" +
            "\t</tr>\n" +
            "\t</table>\n" +
            "\t<table>\n" +
            "\t  <tr>\n" +
            "\t<td>\n" +
            "\t<img src=\"file:///android_asset/huffington.png\" width=\"35\" height=\"35\" alt=\"Huffington\" onclick=\"javascript:location.href='https://www.huffingtonpost.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/toi.png\" width=\"35\" height=\"35\" alt=\"Toi\" onclick=\"javascript:location.href='https://timesofindia.indiatimes.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/hindu.png\" width=\"35\" height=\"35\" alt=\"TheHindu\" onclick=\"javascript:location.href='http://www.thehindu.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/ht.png\" width=\"35\" height=\"35\" alt=\"HT\" onclick=\"javascript:location.href='http://www.hindustantimes.com/'\"/></a>\n" +
            "\t</td>\n" +
            "\t</tr>\n" +
            "\t</table>\n" +
            "\t<p>Social Media</p>\n" +
            "\t<table >\n" +
            "\t  <tr>\n" +
            "\t<td>\n" +
            "\t<img src=\"file:///android_asset/snapchat.png\" width=\"35\" height=\"35\" alt=\"Snapchat\" onclick=\"javascript:location.href='https://www.snapchat.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/tumblr.png\"width=\"35\" height=\"35\" alt=\"Tumblr\" onclick=\"javascript:location.href='https://www.tumblr.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/pinterest.png\" width=\"35\" height=\"35\" alt=\"Pinterest\" onclick=\"javascript:location.href='https://www.pinterest.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/vimeo.png\" height=\"35\" alt=\"Vimeo\" onclick=\"javascript:location.href='https://vimeo.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/viber.png\" width=\"35\" height=\"35\" alt=\"Viber\" onclick=\"javascript:location.href='https://www.viber.com/'\"/></a>\n" +
            "\t</td>\n" +
            "\t</tr>\n" +
            "\t  <tr>\n" +
            "\t<td>\n" +
            "\t<img src=\"file:///android_asset/vk.png\" width=\"35\" height=\"35\" alt=\"VK\" onclick=\"javascript:location.href='https://vk.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/flickr.png\" width=\"35\" height=\"35\" alt=\"Flickr\" onclick=\"javascript:location.href='https://www.flickr.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/myspace.png\" width=\"35\" height=\"35\" alt=\"MySpace\" onclick=\"javascript:location.href='https://myspace.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/digg.png\" width=\"35\" height=\"35\" alt=\"Digg\" onclick=\"javascript:location.href='http://digg.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/vine.png\" width=\"35\" height=\"35\" alt=\"Vine\" onclick=\"javascript:location.href='https://vine.co/'\"/></a>\n" +
            "\t</td>\n" +
            "\t</tr></table>\n" +
            "\t<table>\n" +
            "\t<p>Other Sites</p>\n" +
            "\t  <tr>\n" +
            "\t<td>\n" +
            "\t<img src=\"file:///android_asset/stackoverflow.png\" width=\"35\" height=\"35\" alt=\"Stackoverflow\" onclick=\"javascript:location.href='https://stackoverflow.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/wordpress.png\" width=\"35\" height=\"35\" alt=\"Wordpress\" onclick=\"javascript:location.href='https://wordpress.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/logo.png\" width=\"35\" height=\"35\" alt=\"Github\" onclick=\"javascript:location.href='https://github.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/quora.png\" width=\"35\" height=\"35\" alt=\"Quora\" onclick=\"javascript:location.href='https://www.quora.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/blogger.png\" width=\"35\" height=\"35\" alt=\"Blogger\" onclick=\"javascript:location.href='https://www.blogger.com/'\"/></a>\n" +
            "\t</td>\n" +
            "\t</tr>\n" +
            "\t <tr>\n" +
            "\t<td>\n" +
            "\t<img src=\"file:///android_asset/rssfeed.png\" width=\"35\" height=\"35\" alt=\"RSS\" onclick=\"javascript:location.href='https://www.rss.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/msn.png\" width=\"35\" height=\"35\" alt=\"Msn\" onclick=\"javascript:location.href='http://www.msn.com/'\" /></a></td><td>\n" +
            "    <img src=\"file:///android_asset/soundcloud.png\" width=\"35\" height=\"35\" alt=\"SoundCloud\" onclick=\"javascript:location.href='https://soundcloud.com/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/skype.png\" width=\"35\" height=\"35\" alt=\"Skype\" onclick=\"javascript:location.href='https://www.skype.com/en/'\"/></a></td><td>\n" +
            "\t<img src=\"file:///android_asset/uber.png\" width=\"35\" height=\"35\" alt=\"Uber\" onclick=\"javascript:location.href='https://www.uber.com/'\"/></a>\n" +
            "\t</td>\n" +
            "\t</tr>\n" +
            "\t</table>\n" +
            "\t</div>\n" +
            "\t</body>\n" +
            "</html>";
            WebView web;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_view);
        web =(WebView)findViewById(R.id.htmlweb);
        web.loadUrl("file:///android_asset/test5.html");
        TextView gotoAndroid=(TextView)findViewById(R.id.goToAndroid);
        gotoAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HtmlViewActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
       
        
    }
    
}