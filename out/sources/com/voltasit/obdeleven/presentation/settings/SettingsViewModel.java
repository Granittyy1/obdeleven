package com.voltasit.obdeleven.presentation.settings;

import J8.g;
import J8.h;
import J8.p;
import K8.f;
import K8.o;
import K8.t;
import K8.v;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.NoNetworkException;
import com.voltasit.obdeleven.domain.models.UserPermission;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.d;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p005a4.q;
import p293xa.r;

/* JADX INFO: compiled from: SettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SettingsViewModel extends d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C f33092A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final U7.a f33093A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C<Y8.b> f33094B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final U7.a<r> f33095B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C f33096C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final U7.a f33097C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C<Y8.b> f33098D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final U7.a<r> f33099D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C f33100E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final U7.a f33101E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C<Y8.b> f33102F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final U7.a<a> f33103F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C f33104G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final U7.a f33105G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C<Y8.b> f33106H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final U7.a<Bundle> f33107H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C f33108I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final U7.a f33109I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C<Y8.b> f33110J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final U7.a<r> f33111J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C f33112K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final U7.a f33113K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C f33114L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final U7.a<Integer> f33115L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C f33116M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final U7.a f33117M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C<Y8.b> f33118N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final U7.a<Integer> f33119N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C f33120O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final U7.a f33121O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final U7.a<r> f33122P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final U7.a<r> f33123P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final U7.a f33124Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final U7.a f33125Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C<Y8.b> f33126R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final U7.a<r> f33127R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final C f33128S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final U7.a f33129S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final U7.a<r> f33130T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final U7.a<r> f33131T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final U7.a f33132U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final U7.a f33133U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C f33134V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final U7.a<r> f33135V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C f33136W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final U7.a f33137W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final U7.a<r> f33138X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final U7.a<r> f33139X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final U7.a f33140Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final U7.a f33141Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final C<Y8.b> f33142Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f33143Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C f33144a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f33145a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final C<Y8.b> f33146b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f33147b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final C f33148c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final U7.a<b> f33149d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final U7.a f33150e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final C<Y8.b> f33151f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final C f33152g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final C<Y8.b> f33153h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final C f33154i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final C<Y8.b> f33155j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final C f33156k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final U7.a<r> f33157l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final U7.a f33158m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final U7.a<r> f33159n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f33160o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final U7.a f33161o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f33162p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final C<Y8.b> f33163p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f33164q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final C f33165q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f33166r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final U7.a f33167r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J8.d f33168s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C f33169s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final K8.b f33170t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final C<Integer> f33171t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h f33172u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final C f33173u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f33174v;
    public final C v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K8.g f33175w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final C<Integer> f33176w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final GetUserDetailsUC f33177x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final C f33178x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p f33179y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final C<Integer> f33180y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C<Y8.b> f33181z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final C f33182z0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.settings.SettingsViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: SettingsViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.settings.SettingsViewModel$1", f = "SettingsViewModel.kt", l = {208}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SettingsViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                g gVar = SettingsViewModel.this.f33162p;
                this.label = 1;
                obj = gVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            C8.a aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                SettingsViewModel.this.f33180y0.j(new Integer(Color.parseColor("#" + ((C8.a.b) aVar).f2463a)));
            } else {
                boolean z10 = aVar instanceof C8.a.C0024a;
            }
            return r.f47939a;
        }
    }

    /* JADX INFO: compiled from: SettingsViewModel.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f33183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f33184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f33185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f33186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f33187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f33188f;

        public a(boolean z10, Uri uri, Uri output, int i10, int i11, int i12) {
            i.e(output, "output");
            this.f33183a = z10;
            this.f33184b = uri;
            this.f33185c = output;
            this.f33186d = i10;
            this.f33187e = i11;
            this.f33188f = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f33183a == aVar.f33183a && i.a(this.f33184b, aVar.f33184b) && i.a(this.f33185c, aVar.f33185c) && this.f33186d == aVar.f33186d && this.f33187e == aVar.f33187e && this.f33188f == aVar.f33188f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f33188f) + q.b(this.f33187e, q.b(this.f33186d, (this.f33185c.hashCode() + ((this.f33184b.hashCode() + (Boolean.hashCode(this.f33183a) * 31)) * 31)) * 31, 31), 31);
        }

        public final String toString() {
            return "CropParams(multiOrientation=" + this.f33183a + ", source=" + this.f33184b + ", output=" + this.f33185c + ", width=" + this.f33186d + ", height=" + this.f33187e + ", requestCode=" + this.f33188f + ")";
        }
    }

    /* JADX INFO: compiled from: SettingsViewModel.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f33189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f33190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f33191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f33192d;

        public b(boolean z10, String currentLanguage, String[] strArr, int i10) {
            i.e(currentLanguage, "currentLanguage");
            this.f33189a = z10;
            this.f33190b = currentLanguage;
            this.f33191c = strArr;
            this.f33192d = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f33189a == bVar.f33189a && i.a(this.f33190b, bVar.f33190b) && this.f33191c.equals(bVar.f33191c) && this.f33192d == bVar.f33192d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f33192d) + ((B1.a.b(this.f33190b, Boolean.hashCode(this.f33189a) * 31, 31) + Arrays.hashCode(this.f33191c)) * 31);
        }

        public final String toString() {
            String string = Arrays.toString(this.f33191c);
            StringBuilder sb2 = new StringBuilder("LanguageDialogParams(isDbLanguage=");
            sb2.append(this.f33189a);
            sb2.append(", currentLanguage=");
            sb2.append(this.f33190b);
            sb2.append(", languages=");
            sb2.append(string);
            sb2.append(", currentLanguagePosition=");
            return q.c(sb2, this.f33192d, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsViewModel(o oVar, g gVar, v vVar, t tVar, J8.d dVar, K8.b bVar, h hVar, f fVar, K8.g gVar2, GetUserDetailsUC getUserDetailsUC, p pVar) {
        int i10;
        this.f33160o = oVar;
        this.f33162p = gVar;
        this.f33164q = vVar;
        this.f33166r = tVar;
        this.f33168s = dVar;
        this.f33170t = bVar;
        this.f33172u = hVar;
        this.f33174v = fVar;
        this.f33175w = gVar2;
        this.f33177x = getUserDetailsUC;
        this.f33179y = pVar;
        C<Y8.b> c10 = new C<>(Y8.c.a(f(oVar.I()), false));
        this.f33181z = c10;
        this.f33092A = c10;
        C<Y8.b> c11 = new C<>(Y8.c.a(f(oVar.y()), false));
        this.f33094B = c11;
        this.f33096C = c11;
        C<Y8.b> c12 = new C<>(Y8.c.a(f(oVar.u()), false));
        this.f33098D = c12;
        this.f33100E = c12;
        C<Y8.b> c13 = new C<>(Y8.c.a(f(oVar.d()), false));
        this.f33102F = c13;
        this.f33104G = c13;
        C<Y8.b> c14 = new C<>(Y8.c.a(f(oVar.V()), false));
        this.f33106H = c14;
        this.f33108I = c14;
        C<Y8.b> c15 = new C<>(Y8.c.a(f(oVar.r()), false));
        this.f33110J = c15;
        this.f33112K = c15;
        this.f33114L = new C(Y8.c.a(R.string.common_change, false));
        this.f33116M = new C(Y8.c.a(R.string.common_calibrate, false));
        C<Y8.b> c16 = new C<>(Y8.c.a(((Boolean) oVar.F().getValue()).booleanValue() ? R.string.common_list : R.string.common_icons, false));
        this.f33118N = c16;
        this.f33120O = c16;
        U7.a<r> aVar = new U7.a<>();
        this.f33122P = aVar;
        this.f33124Q = aVar;
        int iOrdinal = oVar.a0().ordinal();
        if (iOrdinal == 0) {
            i10 = R.string.view_settings_auto;
        } else if (iOrdinal == 1) {
            i10 = R.string.common_garage;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = R.string.common_car;
        }
        C<Y8.b> c17 = new C<>(Y8.c.a(i10, false));
        this.f33126R = c17;
        this.f33128S = c17;
        U7.a<r> aVar2 = new U7.a<>();
        this.f33130T = aVar2;
        this.f33132U = aVar2;
        this.f33134V = new C(Boolean.valueOf(vVar.z()));
        this.f33136W = new C(Integer.valueOf(oVar.H() ? R.string.view_settings_landscape : R.string.view_settings_portrait));
        U7.a<r> aVar3 = new U7.a<>();
        this.f33138X = aVar3;
        this.f33140Y = aVar3;
        String strG = oVar.Y().g();
        i.d(strG, "getVisibleLanguage(...)");
        C<Y8.b> c18 = new C<>(Y8.c.b(strG, false));
        this.f33142Z = c18;
        this.f33144a0 = c18;
        String strD = oVar.Q().d();
        i.d(strD, "getVisibleLanguage(...)");
        C<Y8.b> c19 = new C<>(Y8.c.b(strD, false));
        this.f33146b0 = c19;
        this.f33148c0 = c19;
        U7.a<b> aVar4 = new U7.a<>();
        this.f33149d0 = aVar4;
        this.f33150e0 = aVar4;
        C<Y8.b> c20 = new C<>(Y8.c.a(oVar.g() ? R.string.common_include : R.string.common_exclude, false));
        this.f33151f0 = c20;
        this.f33152g0 = c20;
        C<Y8.b> c21 = new C<>(Y8.c.a(oVar.w() ? R.string.common_metric : R.string.common_imperial, false));
        this.f33153h0 = c21;
        this.f33154i0 = c21;
        C<Y8.b> c22 = new C<>(Y8.c.a(oVar.C() ? R.string.common_disable : R.string.common_enable, false));
        this.f33155j0 = c22;
        this.f33156k0 = c22;
        U7.a<r> aVar5 = new U7.a<>();
        this.f33157l0 = aVar5;
        this.f33158m0 = aVar5;
        U7.a<r> aVar6 = new U7.a<>();
        this.f33159n0 = aVar6;
        this.f33161o0 = aVar6;
        C<Y8.b> c23 = new C<>(Y8.c.a(f(oVar.o()), false));
        this.f33163p0 = c23;
        this.f33165q0 = c23;
        this.f33167r0 = this.f32122l;
        C c24 = new C(oVar.h0());
        this.f33169s0 = c24;
        C<Integer> c25 = new C<>();
        this.f33171t0 = c25;
        this.f33173u0 = c25;
        C c26 = new C(String.valueOf(oVar.e()));
        this.v0 = c26;
        C<Integer> c27 = new C<>();
        this.f33176w0 = c27;
        this.f33178x0 = c27;
        C<Integer> c28 = new C<>();
        this.f33180y0 = c28;
        this.f33182z0 = c28;
        U7.a aVar7 = new U7.a();
        this.f33093A0 = aVar7;
        U7.a<r> aVar8 = new U7.a<>();
        this.f33095B0 = aVar8;
        this.f33097C0 = aVar8;
        U7.a<r> aVar9 = new U7.a<>();
        this.f33099D0 = aVar9;
        this.f33101E0 = aVar9;
        U7.a<a> aVar10 = new U7.a<>();
        this.f33103F0 = aVar10;
        this.f33105G0 = aVar10;
        U7.a<Bundle> aVar11 = new U7.a<>();
        this.f33107H0 = aVar11;
        this.f33109I0 = aVar11;
        U7.a<r> aVar12 = new U7.a<>();
        this.f33111J0 = aVar12;
        this.f33113K0 = aVar12;
        U7.a<Integer> aVar13 = new U7.a<>();
        this.f33115L0 = aVar13;
        this.f33117M0 = aVar13;
        U7.a<Integer> aVar14 = new U7.a<>();
        this.f33119N0 = aVar14;
        this.f33121O0 = aVar14;
        U7.a<r> aVar15 = new U7.a<>();
        this.f33123P0 = aVar15;
        this.f33125Q0 = aVar15;
        U7.a<r> aVar16 = new U7.a<>();
        this.f33127R0 = aVar16;
        this.f33129S0 = aVar16;
        U7.a<r> aVar17 = new U7.a<>();
        this.f33131T0 = aVar17;
        this.f33133U0 = aVar17;
        U7.a<r> aVar18 = new U7.a<>();
        this.f33135V0 = aVar18;
        this.f33137W0 = aVar18;
        U7.a<r> aVar19 = new U7.a<>();
        this.f33139X0 = aVar19;
        this.f33141Y0 = aVar19;
        this.f33145a1 = (String) c24.d();
        this.f33147b1 = (String) c26.d();
        if (gVar.d() instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
            aVar7.j(r.f47939a);
            C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(SettingsViewModel settingsViewModel, String str, ContinuationImpl continuationImpl) {
        SettingsViewModel$changeRemoteDevicePassword$1 settingsViewModel$changeRemoteDevicePassword$1;
        settingsViewModel.getClass();
        if (continuationImpl instanceof SettingsViewModel$changeRemoteDevicePassword$1) {
            settingsViewModel$changeRemoteDevicePassword$1 = (SettingsViewModel$changeRemoteDevicePassword$1) continuationImpl;
            int i10 = settingsViewModel$changeRemoteDevicePassword$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                settingsViewModel$changeRemoteDevicePassword$1.label = i10 - Integer.MIN_VALUE;
            } else {
                settingsViewModel$changeRemoteDevicePassword$1 = new SettingsViewModel$changeRemoteDevicePassword$1(settingsViewModel, continuationImpl);
            }
        } else {
            settingsViewModel$changeRemoteDevicePassword$1 = new SettingsViewModel$changeRemoteDevicePassword$1(settingsViewModel, continuationImpl);
        }
        Object objM = settingsViewModel$changeRemoteDevicePassword$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = settingsViewModel$changeRemoteDevicePassword$1.label;
        if (i11 == 0) {
            kotlin.b.b(objM);
            IDevice iDeviceD = settingsViewModel.f33162p.d();
            if (iDeviceD != null) {
                String str2 = iDeviceD.e().f3516a;
                settingsViewModel$changeRemoteDevicePassword$1.L$0 = settingsViewModel;
                settingsViewModel$changeRemoteDevicePassword$1.label = 1;
                objM = settingsViewModel.f33174v.m(str2, str, settingsViewModel$changeRemoteDevicePassword$1);
                if (objM == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                settingsViewModel.f33179y.d(new Exception("Device not connected in settings"), true);
                settingsViewModel.f32119h.j(new Integer(R.string.common_device_not_connected));
            }
            return r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        settingsViewModel = (SettingsViewModel) settingsViewModel$changeRemoteDevicePassword$1.L$0;
        kotlin.b.b(objM);
        C8.a aVar = (C8.a) objM;
        if (aVar instanceof C8.a.b) {
            B7.b.h(R.string.device_pin_changed, settingsViewModel.f32122l);
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            if (!(th instanceof NoNetworkException)) {
                settingsViewModel.f33179y.d(th, true);
            }
            B7.b.h(R.string.common_check_network_try_again, settingsViewModel.f32119h);
        }
        r rVar = r.f47939a;
        Na.i iVar = E8.a.f3126a;
        return r.f47939a;
    }

    public static int f(boolean z10) {
        return z10 ? R.string.common_show : R.string.common_hide;
    }

    public final void c() {
        C2680e.c(Z.a(this), null, null, new SettingsViewModel$clickChangeFaultyCusViewType$1(this, null), 3);
    }

    public final void d() {
        if (this.f33164q.C(UserPermission.SEE_RAW_DATA)) {
            g();
        } else {
            C2680e.c(Z.a(this), null, null, new SettingsViewModel$clickDebugRaw$1(this, null), 3);
        }
    }

    public final void e() {
        C2680e.c(Z.a(this), this.f32112a, null, new SettingsViewModel$clickToggleFreezeFrame$1(this, null), 2);
    }

    public final void g() {
        o oVar = this.f33160o;
        boolean zI = oVar.I();
        oVar.D(!zI);
        this.f33181z.j(Y8.c.a(!zI ? R.string.common_show : R.string.common_hide, true));
    }
}
