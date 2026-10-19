package com.parse.fcm;

import androidx.collection.C0873a;
import com.google.firebase.messaging.F;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.parse.PLog;
import com.parse.PushRouter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParseFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(F f10) {
        JSONObject jSONObject;
        super.onMessageReceived(f10);
        PLog.d("ParseFCM", "onMessageReceived");
        String str = (String) ((C0873a) f10.e()).get("push_id");
        String str2 = (String) ((C0873a) f10.e()).get("time");
        String str3 = (String) ((C0873a) f10.e()).get("data");
        String str4 = (String) ((C0873a) f10.e()).get("channel");
        if (str3 != null) {
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException e10) {
                PLog.e("ParseFCM", "Ignoring push because of JSON exception while processing: ".concat(str3), e10);
                return;
            }
        } else {
            jSONObject = null;
        }
        PushRouter.getInstance().handlePush(str, str2, str4, jSONObject);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        ParseFCM.register(str);
    }
}
