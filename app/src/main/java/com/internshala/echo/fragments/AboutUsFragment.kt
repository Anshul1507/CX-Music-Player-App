package com.internshala.echo.fragments


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.internshala.echo.R


class AboutUsFragment : Fragment() {
var imageView_fb:ImageView ?= null
    var imageView_twitter:ImageView ?= null
    var imageView_linkedIn:ImageView ?= null
    var imageView_quora:ImageView ?= null

    var url:String ?= null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

   activity?.title="About Us"
        setHasOptionsMenu(true)
        imageView_fb = view?.findViewById(R.id.fb_icon)
        imageView_linkedIn = view?.findViewById(R.id.linkedin_icon)
        imageView_twitter = view?.findViewById(R.id.twitter_icon)
        imageView_quora = view?.findViewById(R.id.quora_icon)
        url = "https://www.linkedin.com/in/anshul-gupta-b4bb8a15a/";
        val intent = Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_us, container, false)
    }

    override fun onPrepareOptionsMenu(menu: Menu?) {
        super.onPrepareOptionsMenu(menu)
        val item=menu?.findItem(R.id.action_sort)
        item?.isVisible=false
    }


}
