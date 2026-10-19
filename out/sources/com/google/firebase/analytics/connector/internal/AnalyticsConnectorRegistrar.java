package com.google.firebase.analytics.connector.internal;

import B7.g;
import P6.d;
import U4.C0804l;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C1912u0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p144l6.e;
import p192p6.a;
import p192p6.c;
import p228s6.b;
import p228s6.j;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(b bVar) {
        e eVar = (e) bVar.a(e.class);
        Context context = (Context) bVar.a(Context.class);
        d dVar = (d) bVar.a(d.class);
        C0804l.h(eVar);
        C0804l.h(context);
        C0804l.h(dVar);
        C0804l.h(context.getApplicationContext());
        if (p192p6.b.f45868c == null) {
            synchronized (p192p6.b.class) {
                try {
                    if (p192p6.b.f45868c == null) {
                        Bundle bundle = new Bundle(1);
                        eVar.a();
                        if ("[DEFAULT]".equals(eVar.f44389b)) {
                            dVar.c(p192p6.d.f45874b, c.f45873a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.g());
                        }
                        p192p6.b.f45868c = new p192p6.b(C1912u0.b(context, bundle).f25857d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p192p6.b.f45868c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(a.class);
        c0531aA.a(j.b(e.class));
        c0531aA.a(j.b(Context.class));
        c0531aA.a(j.b(d.class));
        c0531aA.f46942f = p205q6.b.f46133b;
        c0531aA.c(2);
        return Arrays.asList(c0531aA.b(), g.a("fire-analytics", "21.6.1"));
    }
}
