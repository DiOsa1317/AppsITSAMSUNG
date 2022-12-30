package com.samsung.cw271222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.samsung.cw271222.model.Store;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private Button btnNewProduct;
    private Button btnFindProduct;
    private EditText nameOfProduct;
    private EditText date;
    private EditText quantity;
    private EditText price;
    //Store.products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNewProduct = findViewById(R.id.newProduct);
        btnFindProduct = findViewById(R.id.findProduct);
        nameOfProduct = findViewById(R.id.nameOfProduct);
        date = findViewById(R.id.date);
        quantity = findViewById(R.id.quantity);
        price = findViewById(R.id.price);
        nameOfProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(EditText nameOfproduct) {

            }
        });
    }

}