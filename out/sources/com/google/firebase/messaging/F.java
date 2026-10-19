package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C0873a;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.Map;

/* JADX INFO: compiled from: RemoteMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends V4.a {
    public static final Parcelable.Creator<F> CREATOR = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f28271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0873a f28272c;

    public F(Bundle bundle) {
        this.f28271b = bundle;
    }

    public final Map<String, String> e() {
        if (this.f28272c == null) {
            C0873a c0873a = new C0873a();
            Bundle bundle = this.f28271b;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(TicketDetailDestinationKt.LAUNCHED_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c0873a.put(str, str2);
                    }
                }
            }
            this.f28272c = c0873a;
        }
        return this.f28272c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.h(parcel, 2, this.f28271b);
        Fa.d.p(parcel, iO);
    }
}
