package com.voltasit.obdeleven.presentation.signIn;

import J8.p;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.domain.usecases.user.z;
import p293xa.r;

/* JADX INFO: compiled from: SignInViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final U7.a<a> f33226A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U7.a f33227B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final U7.a<r> f33228C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final U7.a f33229D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final U7.a<r> f33230E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final U7.a f33231F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final U7.a<G8.r> f33232G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final U7.a f33233H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final U7.a<Integer> f33234I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final U7.a f33235J;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z f33236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.r f33237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final J8.d f33238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f33239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U7.a<Boolean> f33240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U7.a f33241t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a<r> f33242u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a f33243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C<Integer> f33244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C f33245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C<String> f33246y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C f33247z;

    /* JADX INFO: compiled from: SignInViewModel.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f33249b;

        public a(String email, String password) {
            kotlin.jvm.internal.i.e(email, "email");
            kotlin.jvm.internal.i.e(password, "password");
            this.f33248a = email;
            this.f33249b = password;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f33248a, aVar.f33248a) && kotlin.jvm.internal.i.a(this.f33249b, aVar.f33249b);
        }

        public final int hashCode() {
            return this.f33249b.hashCode() + (this.f33248a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VerifyEmailParams(email=");
            sb2.append(this.f33248a);
            sb2.append(", password=");
            return Q8.d.a(sb2, this.f33249b, ")");
        }
    }

    public b(z zVar, com.voltasit.obdeleven.domain.usecases.user.r rVar, J8.d dVar, p pVar) {
        this.f33236o = zVar;
        this.f33237p = rVar;
        this.f33238q = dVar;
        this.f33239r = pVar;
        U7.a<Boolean> aVar = new U7.a<>();
        this.f33240s = aVar;
        this.f33241t = aVar;
        U7.a<r> aVar2 = new U7.a<>();
        this.f33242u = aVar2;
        this.f33243v = aVar2;
        C<Integer> c10 = new C<>();
        this.f33244w = c10;
        this.f33245x = c10;
        C<String> c11 = new C<>();
        this.f33246y = c11;
        this.f33247z = c11;
        U7.a<a> aVar3 = new U7.a<>();
        this.f33226A = aVar3;
        this.f33227B = aVar3;
        U7.a<r> aVar4 = new U7.a<>();
        this.f33228C = aVar4;
        this.f33229D = aVar4;
        U7.a<r> aVar5 = new U7.a<>();
        this.f33230E = aVar5;
        this.f33231F = aVar5;
        U7.a<G8.r> aVar6 = new U7.a<>();
        this.f33232G = aVar6;
        this.f33233H = aVar6;
        U7.a<Integer> aVar7 = new U7.a<>();
        this.f33234I = aVar7;
        this.f33235J = aVar7;
    }
}
