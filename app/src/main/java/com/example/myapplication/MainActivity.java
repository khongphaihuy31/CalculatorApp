package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView pheptinh, ketqua;
    MaterialButton ac, c, chia, so1, so2, so3, so4, so5, so6, so7, so8, so9, so0, cham, bang,nhan, cong, tru;
    ImageButton iconmau;
    boolean dacopheptinh = false;
    boolean manHinh = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pheptinh = (TextView) findViewById(R.id.pheptoan);
        ketqua = (TextView) findViewById(R.id.ketqua);
        iconmau = (ImageButton) findViewById(R.id.icon);
        ac = (MaterialButton) findViewById(R.id.ac) ;
        c = (MaterialButton) findViewById(R.id.c) ;
        so0 = (MaterialButton) findViewById(R.id.so0) ;
        so1 = (MaterialButton) findViewById(R.id.so1) ;
        so2 = (MaterialButton) findViewById(R.id.so2) ;
        so3 = (MaterialButton) findViewById(R.id.so3) ;
        so4 = (MaterialButton) findViewById(R.id.so4) ;
        so5 = (MaterialButton) findViewById(R.id.so5) ;
        so6 = (MaterialButton) findViewById(R.id.so6) ;
        so7 = (MaterialButton) findViewById(R.id.so7) ;
        so8 = (MaterialButton) findViewById(R.id.so8) ;
        so9= (MaterialButton) findViewById(R.id.so9) ;
        cham = (MaterialButton) findViewById(R.id.cham) ;
        iconmau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(manHinh == false){
                    manHinh = true;
                    LinearLayout layout;
                    layout = (LinearLayout) findViewById(R.id.layoutmanhinh);
                    layout.setBackgroundColor(getResources().getColor(R.color.white));
                    iconmau.setImageResource(R.drawable.moon);
                    ketqua.setTextColor(getResources().getColor(R.color.black));
                    pheptinh.setTextColor(getResources().getColor(R.color.mauPhepTinh));
                    ac.setBackgroundColor(getResources().getColor(R.color.white));
                    c.setBackgroundColor(getResources().getColor(R.color.white));
                    ac.setTextColor(getResources().getColor(R.color.black));
                    c.setTextColor(getResources().getColor(R.color.black));
                    so0.setTextColor(getResources().getColor(R.color.black));
                    so0.setBackgroundColor(getResources().getColor(R.color.white));
                    so1.setTextColor(getResources().getColor(R.color.black));
                    so1.setBackgroundColor(getResources().getColor(R.color.white));
                    so2.setTextColor(getResources().getColor(R.color.black));
                    so2.setBackgroundColor(getResources().getColor(R.color.white));
                    so3.setTextColor(getResources().getColor(R.color.black));
                    so3.setBackgroundColor(getResources().getColor(R.color.white));
                    so4.setTextColor(getResources().getColor(R.color.black));
                    so4.setBackgroundColor(getResources().getColor(R.color.white));
                    so5.setTextColor(getResources().getColor(R.color.black));
                    so5.setBackgroundColor(getResources().getColor(R.color.white));
                    so6.setTextColor(getResources().getColor(R.color.black));
                    so6.setBackgroundColor(getResources().getColor(R.color.white));
                    so7.setTextColor(getResources().getColor(R.color.black));
                    so7.setBackgroundColor(getResources().getColor(R.color.white));
                    so8.setTextColor(getResources().getColor(R.color.black));
                    so8.setBackgroundColor(getResources().getColor(R.color.white));
                    so9.setTextColor(getResources().getColor(R.color.black));
                    so9.setBackgroundColor(getResources().getColor(R.color.white));
                    cham.setTextColor(getResources().getColor(R.color.black));
                    cham.setBackgroundColor(getResources().getColor(R.color.white));
                }else {
                    manHinh = false;
                    LinearLayout layout;
                    layout = (LinearLayout) findViewById(R.id.layoutmanhinh);
                    layout.setBackgroundColor(getResources().getColor(R.color.mau));
                    iconmau.setImageResource(R.drawable.sun);
                    ketqua.setTextColor(getResources().getColor(R.color.white));
                    pheptinh.setTextColor(getResources().getColor(R.color.mauNutManDen));
                    ac.setBackgroundColor(getResources().getColor(R.color.mauNutManDen));
                    c.setBackgroundColor(getResources().getColor(R.color.mauNutManDen));
                    ac.setTextColor(getResources().getColor(R.color.white));
                    c.setTextColor(getResources().getColor(R.color.white));
                    so0.setTextColor(getResources().getColor(R.color.white));
                    so0.setBackgroundColor(getResources().getColor(R.color.mau));
                    so1.setTextColor(getResources().getColor(R.color.white));
                    so1.setBackgroundColor(getResources().getColor(R.color.mau));
                    so2.setTextColor(getResources().getColor(R.color.white));
                    so2.setBackgroundColor(getResources().getColor(R.color.mau));
                    so3.setTextColor(getResources().getColor(R.color.white));
                    so3.setBackgroundColor(getResources().getColor(R.color.mau));
                    so4.setTextColor(getResources().getColor(R.color.white));
                    so4.setBackgroundColor(getResources().getColor(R.color.mau));
                    so5.setTextColor(getResources().getColor(R.color.white));
                    so5.setBackgroundColor(getResources().getColor(R.color.mau));
                    so6.setTextColor(getResources().getColor(R.color.white));
                    so6.setBackgroundColor(getResources().getColor(R.color.mau));
                    so7.setTextColor(getResources().getColor(R.color.white));
                    so7.setBackgroundColor(getResources().getColor(R.color.mau));
                    so8.setTextColor(getResources().getColor(R.color.white));
                    so8.setBackgroundColor(getResources().getColor(R.color.mau));
                    so9.setTextColor(getResources().getColor(R.color.white));
                    so9.setBackgroundColor(getResources().getColor(R.color.mau));
                    cham.setTextColor(getResources().getColor(R.color.white));
                    cham.setBackgroundColor(getResources().getColor(R.color.mau));
                }

            }
        });

        getViewById(ac,R.id.ac);
        getViewById(c,R.id.c);
        getViewById(chia,R.id.chia);
        getViewById(so1,R.id.so1);
        getViewById(so2,R.id.so2);
        getViewById(so3,R.id.so3);
        getViewById(nhan,R.id.nhan);
        getViewById(so4,R.id.so4);
        getViewById(so5,R.id.so5);
        getViewById(so6,R.id.so6);
        getViewById(cong,R.id.cong);
        getViewById(so7,R.id.so7);
        getViewById(so8,R.id.so8);
        getViewById(so9,R.id.so9);
        getViewById(tru,R.id.tru);
        getViewById(so0,R.id.so0);
        getViewById(cham,R.id.cham);
        getViewById(bang,R.id.bang);
    }
    void getViewById(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        MaterialButton button =  (MaterialButton) view;
        String btnText = button.getText().toString();
        String chuoiPhepTinh = pheptinh.getText().toString();
        if(btnText.equals("AC")){
            dacopheptinh = false;
            pheptinh.setText("");
            ketqua.setText("0");
        } else if (btnText.equals("C")) {
            if(chuoiPhepTinh.length() !=0){
                dacopheptinh = false;
                chuoiPhepTinh =  chuoiPhepTinh.substring(0,chuoiPhepTinh.length()-1);
                pheptinh.setText(chuoiPhepTinh);
            }
        } else if (btnText.equals("/") || btnText.equals("x") || btnText.equals("+") || btnText.equals("-")) {
            if(chuoiPhepTinh.isEmpty()==false){
                if(dacopheptinh == false){
                    dacopheptinh= true;
                    pheptinh.setText(chuoiPhepTinh + btnText);
                }else{
                    Toast.makeText(MainActivity.this,"Đã có phép tính!!!",Toast.LENGTH_SHORT).show();
                }
            }
        }else if (btnText.equals("=")){
            if (chuoiPhepTinh.isEmpty()) {
                Toast.makeText(MainActivity.this,"Chưa có phép tính!!!",Toast.LENGTH_SHORT).show();
            }else {
                if(dacopheptinh==false){
                    String kq = getKetQua(chuoiPhepTinh);
                    ketqua.setText(kq);
                }else{
                    Toast.makeText(MainActivity.this,"Phép tính chưa được nhập đầy đủ!!!",Toast.LENGTH_SHORT).show();
                }
            }
        }else {
            dacopheptinh = false;
            pheptinh.setText(chuoiPhepTinh + btnText);
        }

    }

    String getKetQua(String data){
        try {
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initSafeStandardObjects();
            String data1[] = data.split("");
            String data2="";
            for(String x: data1){
                if(x.equals("x")){
                    x = "*";
                    data2=data2.concat(x);
                    System.out.println(x);
                }else {
                    data2=data2.concat(x);
                }
            }
            String ketQua = context.evaluateString(scriptable, data2, "Javascript", 1,null).toString();
            if(ketQua.endsWith(".0")){
                ketQua = ketQua.replace(".0","");
            }
            return ketQua;
        }catch (Exception e){
            return "";
        }
    }
}