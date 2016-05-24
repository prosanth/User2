
package com.example.prasanth.user2;

import com.firebase.client.Firebase;

public class User2Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
