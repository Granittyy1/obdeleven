package T4;

import A1.C0579n;
import U4.C0795c;
import U4.C0804l;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C0873a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class K implements b0, com.google.android.gms.common.api.d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f5867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Condition f5868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.common.a f5870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J f5871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0873a f5872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f5873i = new HashMap();
    public final C0795c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0873a f5874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p156m5.b f5875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile H f5876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final G f5878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z f5879p;

    public K(Context context, G g10, ReentrantLock reentrantLock, Looper looper, com.google.android.gms.common.a aVar, C0873a c0873a, C0795c c0795c, C0873a c0873a2, p156m5.b bVar, ArrayList arrayList, Z z10) {
        this.f5869e = context;
        this.f5867c = reentrantLock;
        this.f5870f = aVar;
        this.f5872h = c0873a;
        this.j = c0795c;
        this.f5874k = c0873a2;
        this.f5875l = bVar;
        this.f5878o = g10;
        this.f5879p = z10;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((u0) arrayList.get(i10)).f6005e = this;
        }
        this.f5871g = new J(this, looper);
        this.f5868d = reentrantLock.newCondition();
        this.f5876m = new C0579n(this);
    }

    @Override // T4.b0
    public final void a() {
        this.f5876m.c();
    }

    @Override // T4.b0
    public final boolean b() {
        return this.f5876m instanceof r;
    }

    @Override // T4.InterfaceC0770c
    public final void b0(Bundle bundle) {
        this.f5867c.lock();
        try {
            this.f5876m.b(bundle);
        } finally {
            this.f5867c.unlock();
        }
    }

    @Override // T4.b0
    public final com.google.android.gms.common.api.internal.a c(com.google.android.gms.common.api.internal.a aVar) {
        aVar.f();
        return this.f5876m.h(aVar);
    }

    @Override // T4.b0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f5876m);
        for (com.google.android.gms.common.api.a aVar : (C0873a.c) this.f5874k.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) aVar.f25314c).println(":");
            com.google.android.gms.common.api.a.e eVar = (com.google.android.gms.common.api.a.e) this.f5872h.get(aVar.f25313b);
            C0804l.h(eVar);
            eVar.g(strValueOf.concat("  "), printWriter);
        }
    }

    @Override // T4.InterfaceC0770c
    public final void e(int i10) {
        this.f5867c.lock();
        try {
            this.f5876m.e(i10);
        } finally {
            this.f5867c.unlock();
        }
    }

    public final void f() {
        this.f5867c.lock();
        try {
            this.f5876m = new C0579n(this);
            this.f5876m.f();
            this.f5868d.signalAll();
        } finally {
            this.f5867c.unlock();
        }
    }

    public final void g() {
        if (this.f5876m.g()) {
            this.f5873i.clear();
        }
    }
}
