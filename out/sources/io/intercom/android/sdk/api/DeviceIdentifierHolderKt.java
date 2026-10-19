package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.animation.D;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: DeviceIdentifierHolder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceIdentifierHolderKt {
    public static final String getDeviceIdentifier(Context context) {
        i.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        i.d(sharedPreferences, "getSharedPreferences(...)");
        String string = sharedPreferences.getString("device_identifier", "");
        if (string != null && !n.S(string)) {
            return string;
        }
        String strC = D.c("toString(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("device_identifier", strC);
        editorEdit.apply();
        return strC;
    }
}
