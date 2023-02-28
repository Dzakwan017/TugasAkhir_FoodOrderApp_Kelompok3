package com.example.foodorderapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.foodorderapp.Domain.FoodDomain
import com.example.foodorderapp.R
import java.util.ResourceBundle.getBundle

class ShowDetailActivity : AppCompatActivity() {
    private var addToCartBtn: TextView? = null;
    private var titleTxt: TextView? = null;
    private var feeTxt: TextView? = null;
    private var descriptionTxt: TextView? = null;
    private var numberOrderTxt: TextView? = null;
    private var plusBtn: ImageView? = null;
    private var minusBtn: ImageView? = null;
    private var picFood: ImageView? = null;
    private var obj: FoodDomain? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_detail)
        initView();
        getBundle();
    }

    private fun getBundle() {
        obj = intent.getSerializableExtra("object") as FoodDomain

//         var drawableResourceId: Int=this.getResources().getIdentifier(obj.Pic(), "drawable", this.packageName)
    }

    private fun initView() {
        addToCartBtn = findViewById(R.id.addToCartBtn);
        titleTxt = findViewById(R.id.titleTxt);
        feeTxt = findViewById(R.id.fee);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        numberOrderTxt = findViewById(R.id.numberOrderTxt);
        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
    }

}