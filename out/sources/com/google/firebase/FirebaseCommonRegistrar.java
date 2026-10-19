package com.google.firebase;

import B7.b;
import B7.e;
import B7.h;
import Q6.d;
import Q6.f;
import Q6.g;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.C1251w;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p228s6.a;
import p228s6.j;
import p228s6.p;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a.C0531a c0531aA = a.a(h.class);
        c0531aA.a(new j(2, 0, e.class));
        c0531aA.f46942f = new b(0);
        arrayList.add(c0531aA.b());
        p pVar = new p(p217r6.a.class, Executor.class);
        a.C0531a c0531a = new a.C0531a(com.google.firebase.heartbeatinfo.a.class, new Class[]{g.class, HeartBeatInfo.class});
        c0531a.a(j.b(Context.class));
        c0531a.a(j.b(p144l6.e.class));
        c0531a.a(new j(2, 0, f.class));
        c0531a.a(new j(1, 1, h.class));
        c0531a.a(new j((p<?>) pVar, 1, 0));
        c0531a.f46942f = new d(pVar);
        arrayList.add(c0531a.b());
        arrayList.add(B7.g.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(B7.g.a("fire-core", "21.0.0"));
        arrayList.add(B7.g.a("device-name", a(Build.PRODUCT)));
        arrayList.add(B7.g.a("device-model", a(Build.DEVICE)));
        arrayList.add(B7.g.a("device-brand", a(Build.BRAND)));
        arrayList.add(B7.g.b("android-target-sdk", new O.a()));
        arrayList.add(B7.g.b("android-min-sdk", new C4.a(7)));
        arrayList.add(B7.g.b("android-platform", new C4.b(8)));
        arrayList.add(B7.g.b("android-installer", new C1251w(2)));
        try {
            p293xa.f.f47920c.getClass();
            str = "2.0.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(B7.g.a("kotlin", str));
        }
        return arrayList;
    }
}
