package com.google.android.gms.common.api;

import S4.C0762d;
import T4.S;
import U4.AbstractC0794b;
import U4.C0795c;
import U4.InterfaceC0800h;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.c;
import java.io.PrintWriter;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a<O extends c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0263a f25312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f25313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25314c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static abstract class AbstractC0263a<T extends e, O> extends d<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, C0795c c0795c, O o10, com.google.android.gms.common.api.d.a aVar, com.google.android.gms.common.api.d.b bVar) {
            return (T) b(context, looper, c0795c, o10, aVar, bVar);
        }

        public e b(Context context, Looper looper, C0795c c0795c, Object obj, com.google.android.gms.common.api.d.a aVar, com.google.android.gms.common.api.d.b bVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class b<C> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0265c f25315a = new C0265c();

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public interface InterfaceC0264a extends c {
            Account b();
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public static final class C0265c implements c {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static abstract class d<T, O> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface e {
        void a();

        boolean b();

        Set<Scope> c();

        void d(String str);

        boolean f();

        void g(String str, PrintWriter printWriter);

        String h();

        void i(AbstractC0794b.c cVar);

        void k(InterfaceC0800h interfaceC0800h, Set<Scope> set);

        boolean l();

        int n();

        void o(S s10);

        C0762d[] p();

        String q();

        Intent r();

        boolean s();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static final class f<C extends e> extends b<C> {
    }

    public <C extends e> a(String str, AbstractC0263a<C, O> abstractC0263a, f<C> fVar) {
        this.f25314c = str;
        this.f25312a = abstractC0263a;
        this.f25313b = fVar;
    }
}
