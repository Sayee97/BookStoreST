package com.example.sayee.bookstoreassign7;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private ImageView mImageView;
    private TextView tv;
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("STRING_I_NEED");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }
        mImageView = (ImageView) findViewById(R.id.selectImage);
        tv=(TextView)findViewById(R.id.selectText);
        if(newString.equals("The Alchemist")) {
            mImageView.setImageResource(R.drawable.one);
            tv.setText("\nPRICE: 50$\n\nThe Alchemist is a novel by Brazilian author Paulo Coelho which was first published in 1988. Originally written in Portuguese, it became an international bestseller translated into some 70 languages as of 2016. Wikipedia\n" +
                    "\nAuthor: Paulo Coelho\n" +
                    "\nOriginal title: O Alquimista\n" +
                    "\nPublisher: HarperCollins (English translation)\n" +
                    "\nOriginal language: Portuguese\n" +
                    "\nCharacters: The Shopkeeper, Melchizedek, The Coptic Monk, Fatima, The Alchemist, The Englishman, Santiago\n" +
                    "\nGenres: Quest, Adventure fiction, Fantasy Fiction");

        }
        else if(newString.equals("Like the flowing river")){
            mImageView.setImageResource(R.drawable.two);

tv.setText("\nPRICE: 80$\n\nIn this collection of thoughts and stories, Coelho, author of 'The Alchemist', offers his personal reflections on a range of subjects from archery and music to elegance, travelling and the nature of good and evil. ... Google Books\n" +
        "\nOriginally published: 2006\n" +
        "\nAuthor: Paulo Coelho\n" +
        "\nGenre: Fiction");
        }
        else if(newString.equals("Winner stands alone")) {
            mImageView.setImageResource(R.drawable.three);
tv.setText("\nPRICE: 75$\n\nThe Winner Stands Alone is a novel by Brazilian writer Paulo Coelho, first published in 2008. The book was first published in Portuguese under the title O Vencedor está Só. It is the thirteenth major book by Coelho. Wikipedia\n" +
        "\nOriginally published: 2008\n" +
        "\nAuthor: Paulo Coelho\n" +
        "\nGenre: Novel\n" +
        "\nOriginal title: O Vencedor está Só\n" +
        "\nTranslator: Margaret Jull Costa\n" +
        "\nCountry: Brazil");

        }
        //Toast.makeText(getApplicationContext(),newString,Toast.LENGTH_LONG).show();





    }
    public void button11(View v){
        Intent i = new Intent(Main2Activity.this, Main3Activity.class);

        i.putExtra("STRING_I_NEED2", newString);
        startActivity(i);

    }
}
