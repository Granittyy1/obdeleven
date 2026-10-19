package com.google.android.gms.common.api;

import T4.C0768a;
import T4.C0771d;
import T4.T;
import T4.X;
import T4.c0;
import T4.e0;
import T4.h0;
import T4.k0;
import U4.AbstractC0794b;
import U4.C0795c;
import U4.C0796d;
import U4.C0804l;
import U4.C0805m;
import U4.C0806n;
import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.collection.C0874b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.c;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import p191p5.B;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<O extends com.google.android.gms.common.api.a.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f25318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.common.api.a.c f25319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0768a f25320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q3.d f25322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0771d f25323h;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f25324b = new a(new Q3.d(), Looper.getMainLooper());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q3.d f25325a;

        public a(Q3.d dVar, Looper looper) {
            this.f25325a = dVar;
        }
    }

    public c(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        C0804l.i(context, "Null context is not permitted.");
        C0804l.i(aVar, "Api must not be null.");
        C0804l.i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        C0804l.i(applicationContext, "The provided context did not have an application context.");
        this.f25316a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f25317b = attributionTag;
        this.f25318c = aVar;
        this.f25319d = o10;
        this.f25320e = new C0768a(aVar, o10, attributionTag);
        new X();
        C0771d c0771dE = C0771d.e(applicationContext);
        this.f25323h = c0771dE;
        this.f25321f = c0771dE.f5937i.getAndIncrement();
        this.f25322g = aVar2.f25325a;
        e5.h hVar = c0771dE.f5941n;
        hVar.sendMessage(hVar.obtainMessage(7, this));
    }

    public final C0795c.a a() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        C0795c.a aVar = new C0795c.a();
        com.google.android.gms.common.api.a.c cVar = this.f25319d;
        boolean z10 = cVar instanceof com.google.android.gms.common.api.a.c.b;
        Account accountB = null;
        if (z10 && (googleSignInAccountA2 = ((com.google.android.gms.common.api.a.c.b) cVar).a()) != null) {
            String str = googleSignInAccountA2.f25287e;
            if (str != null) {
                accountB = new Account(str, "com.google");
            }
        } else if (cVar instanceof com.google.android.gms.common.api.a.c.InterfaceC0264a) {
            accountB = ((com.google.android.gms.common.api.a.c.InterfaceC0264a) cVar).b();
        }
        aVar.f6432a = accountB;
        Collection collectionEmptySet = (!z10 || (googleSignInAccountA = ((com.google.android.gms.common.api.a.c.b) cVar).a()) == null) ? Collections.emptySet() : googleSignInAccountA.e();
        if (aVar.f6433b == null) {
            aVar.f6433b = new C0874b(0);
        }
        aVar.f6433b.addAll(collectionEmptySet);
        Context context = this.f25316a;
        aVar.f6435d = context.getClass().getName();
        aVar.f6434c = context.getPackageName();
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    public final B b(int i10, h0 h0Var) {
        c0 c0Var;
        p191p5.h hVar = new p191p5.h();
        C0771d c0771d = this.f25323h;
        c0771d.getClass();
        int i11 = h0Var.f5968c;
        final e5.h hVar2 = c0771d.f5941n;
        B b10 = hVar.f45811a;
        if (i11 != 0) {
            if (c0771d.a()) {
                C0806n c0806n = C0805m.a().f6477a;
                C0768a c0768a = this.f25320e;
                boolean z10 = true;
                if (c0806n != null) {
                    if (c0806n.f6479c) {
                        T t8 = (T) c0771d.f5938k.get(c0768a);
                        if (t8 != null) {
                            Object obj = t8.f5889d;
                            if (obj instanceof AbstractC0794b) {
                                AbstractC0794b abstractC0794b = (AbstractC0794b) obj;
                                if (abstractC0794b.f6391B == null || abstractC0794b.f()) {
                                    z10 = c0806n.f6480d;
                                } else {
                                    C0796d c0796dA = c0.a(t8, abstractC0794b, i11);
                                    if (c0796dA != null) {
                                        t8.f5898n++;
                                        z10 = c0796dA.f6438d;
                                    }
                                }
                            }
                        } else {
                            z10 = c0806n.f6480d;
                        }
                    }
                    c0Var = null;
                }
                c0Var = new c0(c0771d, i11, c0768a, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                c0Var = null;
            }
            if (c0Var != null) {
                hVar2.getClass();
                b10.b(new Executor() { // from class: T4.M
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        hVar2.post(runnable);
                    }
                }, c0Var);
            }
        }
        hVar2.sendMessage(hVar2.obtainMessage(4, new e0(new k0(i10, h0Var, hVar, this.f25322g), c0771d.j.get(), this)));
        return b10;
    }
}
