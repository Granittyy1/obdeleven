package com.parse.fcm;

import com.parse.PLog;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.SaveCallback;

/* JADX INFO: loaded from: classes3.dex */
public class ParseFCM {
    public static void register(String str) {
        PLog.d("ParseFCM", "Updating FCM token");
        ParseInstallation currentInstallation = ParseInstallation.getCurrentInstallation();
        if (currentInstallation == null || str == null) {
            return;
        }
        currentInstallation.setDeviceToken(str);
        currentInstallation.setPushType("gcm");
        currentInstallation.saveInBackground(new SaveCallback() { // from class: com.parse.fcm.ParseFCM.1
            @Override // com.parse.ParseCallback1
            public void done(ParseException parseException) {
                if (parseException == null) {
                    PLog.d("ParseFCM", "FCM token saved to installation");
                } else {
                    PLog.e("ParseFCM", "FCM token upload failed", parseException);
                }
            }
        });
    }
}
