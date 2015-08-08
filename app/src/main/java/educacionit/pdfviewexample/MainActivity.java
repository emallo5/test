package educacionit.pdfviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.joanzapata.pdfview.PDFView;

public class MainActivity extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfView= (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("sample.pdf")
                .defaultPage(1)
                .load();
    }

}
