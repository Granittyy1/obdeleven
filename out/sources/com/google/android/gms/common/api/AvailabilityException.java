package com.google.android.gms.common.api;

import S4.C0760b;
import T4.C0768a;
import U4.C0804l;
import android.text.TextUtils;
import androidx.collection.AbstractC0878f;
import androidx.collection.C0873a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public class AvailabilityException extends Exception {
    private final C0873a zaa;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C0873a.c) this.zaa.keySet()).iterator();
        boolean z10 = true;
        while (true) {
            AbstractC0878f abstractC0878f = (AbstractC0878f) it;
            if (!abstractC0878f.hasNext()) {
                break;
            }
            C0768a c0768a = (C0768a) abstractC0878f.next();
            C0760b c0760b = (C0760b) this.zaa.get(c0768a);
            C0804l.h(c0760b);
            z10 &= !c0760b.k();
            arrayList.add(c0768a.f5913b.f25314c + ": " + String.valueOf(c0760b));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
