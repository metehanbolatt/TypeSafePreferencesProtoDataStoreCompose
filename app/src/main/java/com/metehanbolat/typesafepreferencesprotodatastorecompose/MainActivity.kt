package com.metehanbolat.typesafepreferencesprotodatastorecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.typesafepreferencesprotodatastorecompose.ui.theme.TypeSafePreferencesProtoDataStoreComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TypeSafePreferencesProtoDataStoreComposeTheme {

            }
        }
    }
}