package com.example.tushar.sunshine;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txt;
    String abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txt=(TextView)findViewById(R.id.txt1);
        abc="Coffee is a brewed drink prepared from roasted coffee beans, which are the seeds of berries from the Coffea plant. The genus Coffea is native to tropical Africa, Madagascar, and the Comoros, Mauritius and Réunion in the Indian Ocean.[2] The plant was exported from Africa to countries around the world and coffee plants are now cultivated in over 70 countries, primarily in the equatorial regions of the Americas, Southeast Asia, India, and Africa. The two most commonly grown are the highly regarded arabica, and the less sophisticated but stronger and more hardy robusta. Once ripe, coffee berries are picked, processed, and dried. Dried coffee seeds (referred to as beans) are roasted to varying degrees, depending on the desired flavor. Roasted beans are ground and brewed with near boiling water to produce coffee as a beverage.\n" +
                "\n" +
                "Coffee is slightly acidic and can have a stimulating effect on humans because of its caffeine content. Coffee is one of the most popular drinks in the world.[3] It can be prepared and presented in a variety of ways (e.g., espresso, French press, cafe latte, etc.). It is usually served hot, although iced coffee is also served. Clinical studies indicate that moderate coffee consumption is benign or mildly beneficial in healthy adults, with continuing research on whether long-term consumption inhibits cognitive decline during aging or lowers the risk of some forms of cancer.[4][5]\n" +
                "\n" +
                "The earliest credible evidence of coffee-drinking appears in the middle of the 15th century in the Sufi shrines of Yemen.[6] It was here in Arabia that coffee seeds were first roasted and brewed in a similar way to how it is now prepared. Coffee seeds were first exported from Eastern Africa to Yemen, as the coffee plant is thought to have been indigenous to the former.[7] Yemeni traders took coffee back to their homeland and began to cultivate the seed. By the 16th century, it had reached the rest of the Middle East, Persia, Turkey, and northern Africa. From there, it spread to Europe and the rest of the world.\n" +
                "\n" +
                "Coffee is a major export commodity: it is the top agricultural export for numerous countries and is among the world's largest legal agricultural exports.[3][8] It is one of the most valuable commodities exported by developing countries. Green (unroasted) coffee is one of the most traded agricultural commodities in the world.[9] Some controversy is associated with coffee cultivation and the way developed countries trade with developing nations and the impact of its cultivation on the environment, in regards to clearing of land for coffee-growing and water use. Consequently, fair trade coffee and organic coffee are an expanding market.";

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
