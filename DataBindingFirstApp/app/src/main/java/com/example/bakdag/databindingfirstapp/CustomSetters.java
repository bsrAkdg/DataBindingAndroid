package com.example.bakdag.databindingfirstapp;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by bakdag on 19.12.2017.
 */

public class CustomSetters {

    //Özelleşmiş bir set image metodu
    @BindingAdapter("setGenderImg")
    public static void setGenderImg(ImageView genderImg, String gender){
            if (gender.equals("famale")){
                genderImg.setImageDrawable(genderImg.getContext().getDrawable(R.drawable.human_famale));
            }else{
                genderImg.setImageDrawable(genderImg.getContext().getDrawable(R.drawable.human_male));
            }
    }
    //Eğer bir metoda birden fazla parametre yollayacaksak
    @BindingAdapter(value = {"imageUrl" , "placeholder"}, requireAll = false)
    public static void setImg(ImageView img, String imageUrl, Drawable placeholder){
        if (imageUrl != null){
           //GlideApp.with(this).load(imageUrl).into(img);
        }else{
            img.setImageDrawable(placeholder);
        }
    }
}
