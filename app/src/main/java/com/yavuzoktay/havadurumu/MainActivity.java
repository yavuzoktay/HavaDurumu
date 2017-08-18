package com.yavuzoktay.havadurumu;

        import android.app.Fragment;
        import android.app.FragmentManager;
        import android.app.FragmentTransaction;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.EditText;
        import android.widget.FrameLayout;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.SearchView;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.squareup.picasso.Picasso;
        import com.yavuzoktay.havadurumu.models.HavaModel;
        import com.yavuzoktay.havadurumu.networks.Factory;
        import retrofit2.Call;
        import retrofit2.Callback;
        import retrofit2.Response;

        import static com.yavuzoktay.havadurumu.utils.Constant.APPID_KEY;

public class MainActivity extends AppCompatActivity  {
    String iconUrl = "http://openweathermap.org/img/w/" ;
    private ImageView imageView ;

    private String text ;
    private TextView textView, textView2,textView3,textView4;
    private SearchView searchView;
    private ListView listView ;
    private String[] il={"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin",
            "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale",
            "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
            "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir",
            "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya",
            "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya",
            "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak",
            "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak",
            "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView4= (TextView) findViewById(R.id.textIsım);
        textView3= (TextView) findViewById(R.id.textView3);
        textView2= (TextView) findViewById(R.id.textView2);
        textView= (TextView) findViewById(R.id.textView);
        searchView= (SearchView) findViewById(R.id.searchView);
        listView= (ListView) findViewById(R.id.listView);
        imageView = (ImageView) findViewById(R.id.imageView);


        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,il);
        listView.setAdapter(arrayAdapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int position, long id) {
                text = (String) listView.getItemAtPosition(position);


                Factory.getInstance().havaModel(text,APPID_KEY).enqueue(new Callback<HavaModel>() {
                    @Override
                    public void onResponse(Call<HavaModel> call, Response<HavaModel> response) {
                        textView.setText(Float.toString((float) (response.body().main.temp-273.15)));
                        textView2.setText(Float.toString(response.body().coord.lon));
                        textView3.setText(Integer.toString(response.body().main.humidity)+" %");
                        textView4.setText(response.body().name);
                        Picasso.with(getBaseContext()).load(iconUrl+response.body().weather.get(0).icon + ".png").into(imageView);

                    }

                    @Override
                    public void onFailure(Call<HavaModel> call, Throwable t) {

                    }
                });

            }
        });





    }


}
