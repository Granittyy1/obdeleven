package com.voltasit.obdeleven.notifications;

import android.os.Bundle;
import com.voltasit.obdeleven.domain.models.NotificationType;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p293xa.r;

/* JADX INFO: compiled from: MegaOfferMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static a a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        NotificationType.a aVar = NotificationType.f30491b;
        String string = jSONObject.getString("type");
        i.d(string, "getString(...)");
        aVar.getClass();
        NotificationType notificationTypeA = NotificationType.a.a(string);
        String string2 = jSONObject.getString("title");
        i.d(string2, "getString(...)");
        String string3 = jSONObject.getString("message");
        i.d(string3, "getString(...)");
        Bundle bundle = new Bundle();
        bundle.putString("content_image_url", jSONObject2.getString("imageUrl"));
        bundle.putString("content_destination_url", jSONObject2.getString("destinationUrl"));
        r rVar = r.f47939a;
        return new a(notificationTypeA, string2, string3, bundle);
    }
}
