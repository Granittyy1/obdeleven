package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Command.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2107w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap<String, String> f30174g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f30175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static ControlUnit f30176i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8.b f30177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f30182f;

    public AbstractC2107w(I8.b bVar, boolean z10) {
        this.f30177a = bVar;
        String str = bVar.f3917c;
        this.f30178b = str.contains("R");
        this.f30179c = str.contains("W");
        this.f30180d = str.contains("F");
        this.f30181e = str.contains("A");
        this.f30182f = z10;
    }

    public final String a() {
        return f30174g.get(b());
    }

    public abstract String b();

    public abstract String c();

    public boolean d() {
        return this.f30178b;
    }

    public abstract boolean e(int i10);

    public final void f(String str) {
        f30174g.put(b(), str);
    }

    public abstract Task<Integer> g(ControlUnit controlUnit);

    public abstract void h(int i10);

    public abstract Task<Integer> i(ControlUnit controlUnit);
}
