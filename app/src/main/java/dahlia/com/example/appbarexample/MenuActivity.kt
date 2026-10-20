
package dahlia.com.example.appbarexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dahlia.com.example.appbarexample.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.apply {
            searchView.setupWithSearchBar(searchBar)

            searchView.editText.setOnEditorActionListener {
                    textView, actionId, event ->

                searchBar.setText(searchView.text)
                searchView.hide()

                Toast.makeText(
                    this@MenuActivity,
                    searchView.text.toString(),
                    Toast.LENGTH_SHORT
                ).show()

                false
            }
        }
    }
}
