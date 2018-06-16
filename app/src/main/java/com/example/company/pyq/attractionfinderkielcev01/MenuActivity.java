package com.example.company.pyq.attractionfinderkielcev01;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.SeekBar;
        import android.widget.TextView;

        import static com.example.company.pyq.attractionfinderkielcev01.R.id.textView16;
        import static com.example.company.pyq.attractionfinderkielcev01.R.id.textView17;
        import static com.example.company.pyq.attractionfinderkielcev01.R.id.textView18;
        import static com.example.company.pyq.attractionfinderkielcev01.R.id.textView19;
        import static com.example.company.pyq.attractionfinderkielcev01.R.id.textView20;
        import static com.example.company.pyq.attractionfinderkielcev01.R.id.textView21;
        import static com.example.company.pyq.attractionfinderkielcev01.R.id.textView4;

public class MenuActivity extends AppCompatActivity {

    SeekBar seekbar;
    TextView textView;
    TextView textView4;
    TextView textView7;
    TextView textView16;
    TextView textView17;
    TextView textView18;
    TextView textView19;
    TextView textView20;
    TextView textView21;

    TextView textView23;
    TextView textView24;
    TextView textView25;
    TextView textView26;
    TextView textView27;
    TextView textView3;
    TextView textView5;
    TextView textView6;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;

    int progress = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        seekbar = (SeekBar) findViewById(R.id.seekBar);
        seekbar.setMax(100);

        seekbar.setMin(1);
        seekbar.setProgress(progress);

        textView4 = (TextView) findViewById(R.id.textView4);

        textView16 = (TextView) findViewById(R.id.textView16);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView18 = (TextView) findViewById(R.id.textView18);
        textView19 = (TextView) findViewById(R.id.textView19);
        textView20 = (TextView) findViewById(R.id.textView20);
        textView21 = (TextView) findViewById(R.id.textView21);
        textView7 = (TextView) findViewById(R.id.textView7);

        textView23 = (TextView) findViewById(R.id.textView23);
        textView24 = (TextView) findViewById(R.id.textView24);
        textView25 = (TextView) findViewById(R.id.textView25);
        textView26 = (TextView) findViewById(R.id.textView26);
        textView27 = (TextView) findViewById(R.id.textView27);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);

        textView = (TextView) findViewById(R.id.textView2);
        textView.setText(""+ progress);
        textView.setTextSize(progress);

        Button button=(Button)findViewById(R.id.button);
        final Button button2=(Button)findViewById(R.id.button2);
        final Button button3=(Button)findViewById(R.id.button3);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                progress = i;
                textView.setText(""+ progress);
                textView.setTextSize(progress+20);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                view.setVisibility(View.GONE);
                seekbar.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                textView4.setVisibility(View.GONE);

                if (progress >= 30 && progress <= 100) {

                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            button2.setVisibility(View.GONE);
                            button3.setVisibility(View.GONE);
                            textView16.setVisibility((View.VISIBLE));
                            textView17.setVisibility((View.VISIBLE));
                            textView18.setVisibility((View.VISIBLE));
                            textView19.setVisibility((View.VISIBLE));
                            textView20.setVisibility((View.VISIBLE));
                            textView21.setVisibility((View.VISIBLE));
                            textView7.setVisibility((View.VISIBLE));


                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            button2.setVisibility(View.GONE);
                            button3.setVisibility(View.GONE);
                            textView23.setVisibility((View.VISIBLE));
                            textView24.setVisibility((View.VISIBLE));
                            textView25.setVisibility((View.VISIBLE));
                            textView26.setVisibility((View.VISIBLE));
                            textView27.setVisibility((View.VISIBLE));
                            textView3.setVisibility((View.VISIBLE));
                            textView5.setVisibility((View.VISIBLE));
                            textView6.setVisibility((View.VISIBLE));
                            textView8.setVisibility((View.VISIBLE));
                            textView9.setVisibility((View.VISIBLE));
                            textView10.setVisibility((View.VISIBLE));
                            textView11.setVisibility((View.VISIBLE));

                        }
                    });

             }

            }
        });

    }
    }
