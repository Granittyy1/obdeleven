package com.voltasit.obdeleven.domain.usecases.user;

import android.content.Intent;
import android.graphics.Path;
import android.os.ResultReceiver;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.C2018x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: GetIs2FaAvailableUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2126g implements p063f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30991b;

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f30991b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p063f.b
    public void b(Object obj) {
        p063f.a aVar = (p063f.a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f30991b;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f34887c;
        int i10 = C2018x.e(intent, "ProxyBillingActivityV2").f23552a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f23547f;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        if (aVar.f34886b != -1 || i10 != 0) {
            Log.isLoggable("ProxyBillingActivityV2", 5);
        }
        proxyBillingActivityV2.finish();
    }

    public void c(Path path) {
        ArrayList arrayList = (ArrayList) this.f30991b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p104i3.s sVar = (p104i3.s) arrayList.get(size);
            r3.g.a aVar = p214r3.g.f46332a;
            if (sVar != null && !sVar.f36717a) {
                p214r3.g.a(path, sVar.f36720d.i() / 100.0f, sVar.f36721e.i() / 100.0f, sVar.f36722f.i() / 360.0f);
            }
        }
    }

    public C2126g() {
        this.f30991b = new ArrayList();
    }

    public C2126g(String str) {
        str.getClass();
        this.f30991b = str;
    }
}
