package com.example.myapplication;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DemoContextMenu extends AppCompatActivity {

    private Button buttonShowContextMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        buttonShowContextMenu = findViewById(R.id.button_show_context_menu);
        registerForContextMenu(buttonShowContextMenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.context_menu_edit) {
            // Handle edit action
            return true;
        } else if (id == R.id.context_menu_delete) {
            // Handle delete action
            return true;
        }
        return super.onContextItemSelected(item);
    }
}
