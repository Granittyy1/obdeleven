package org.slf4j.helpers;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: SubstituteLogger.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements cc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile cc.b f45781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f45782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f45783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public dc.a f45784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedBlockingQueue f45785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45786h;

    public c(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z10) {
        this.f45780b = str;
        this.f45785g = linkedBlockingQueue;
        this.f45786h = z10;
    }

    @Override // cc.b
    public final void a(String str) {
        c().a(str);
    }

    @Override // cc.b
    public final void b(String str) {
        c().b(str);
    }

    public final cc.b c() {
        if (this.f45781c != null) {
            return this.f45781c;
        }
        if (this.f45786h) {
            return NOPLogger.f45778b;
        }
        if (this.f45784f == null) {
            dc.a aVar = new dc.a();
            aVar.f34701c = this;
            aVar.f34700b = this.f45780b;
            aVar.f34702d = this.f45785g;
            this.f45784f = aVar;
        }
        return this.f45784f;
    }

    public final boolean d() {
        Boolean bool = this.f45782d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f45783e = this.f45781c.getClass().getMethod("log", dc.b.class);
            this.f45782d = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f45782d = Boolean.FALSE;
        }
        return this.f45782d.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f45780b.equals(((c) obj).f45780b);
    }

    @Override // cc.b
    public final String getName() {
        return this.f45780b;
    }

    public final int hashCode() {
        return this.f45780b.hashCode();
    }
}
