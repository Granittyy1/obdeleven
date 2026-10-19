package com.google.firebase.sessions;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: SessionGenerator.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f28738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.a<UUID> f28739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f28742e;

    public s() {
        throw null;
    }

    public s(int i10) {
        z zVar = z.f28787a;
        SessionGenerator$1 uuidGenerator = SessionGenerator$1.f28657b;
        kotlin.jvm.internal.i.e(uuidGenerator, "uuidGenerator");
        this.f28738a = zVar;
        this.f28739b = uuidGenerator;
        this.f28740c = a();
        this.f28741d = -1;
    }

    public final String a() {
        String string = this.f28739b.invoke().toString();
        kotlin.jvm.internal.i.d(string, "uuidGenerator().toString()");
        String lowerCase = kotlin.text.m.G(string, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final o b() {
        o oVar = this.f28742e;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.i.m("currentSession");
        throw null;
    }
}
