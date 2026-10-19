package p259v1;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.P;
import androidx.media3.exoplayer.n0;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import p078g1.C2198d;
import p078g1.n;
import p078g1.y;
import p078g1.z;
import p114j1.A;
import p114j1.k;
import p175o1.q;

/* JADX INFO: compiled from: DefaultTrackSelector.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends v implements n0.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w<Integer> f47530i = w.b(new p259v1.d());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f47532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v1.a.b f47533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f47534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f47535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2198d f47536h;

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class a extends h<a> implements Comparable<a> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f47537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f47538g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f47539h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final d f47540i;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f47541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f47542l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f47543m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f47544n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f47545o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f47546p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f47547q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f47548r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f47549s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f47550t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f47551u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f47552v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f47553w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f47554x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f47555y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Code duplicated, block: B:27:0x006e  */
        public a(int i10, y yVar, int i11, d dVar, int i12, boolean z10, p259v1.i iVar, int i13) {
            int i14;
            int iJ;
            boolean z11;
            int iJ2;
            boolean z12;
            super(i10, yVar, i11);
            int i15 = 0;
            this.f47540i = dVar;
            int i16 = dVar.f47568y ? 24 : 16;
            this.f47544n = false;
            this.f47539h = j.l(this.f47595e.f35293d);
            this.j = n0.j(i12, false);
            int i17 = 0;
            while (true) {
                ImmutableList<String> immutableList = dVar.f35190k;
                int size = immutableList.size();
                i14 = BrazeLogger.SUPPRESS;
                if (i17 >= size) {
                    iJ = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ = j.j(this.f47595e, immutableList.get(i17), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f47542l = i17;
            this.f47541k = iJ;
            this.f47543m = j.h(this.f47595e.f35295f, 0);
            n nVar = this.f47595e;
            int i18 = nVar.f35295f;
            this.f47545o = i18 == 0 || (i18 & 1) != 0;
            this.f47548r = (nVar.f35294e & 1) != 0;
            String str = nVar.f35302n;
            if (str != null) {
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac4":
                    case "audio/iamf":
                        z11 = true;
                        break;
                    default:
                        z11 = false;
                        break;
                }
            } else {
                z11 = false;
            }
            this.f47555y = z11;
            n nVar2 = this.f47595e;
            int i19 = nVar2.f35279D;
            this.f47549s = i19;
            this.f47550t = nVar2.f35280E;
            int i20 = nVar2.j;
            this.f47551u = i20;
            this.f47538g = (i20 == -1 || i20 <= dVar.f35192m) && (i19 == -1 || i19 <= dVar.f35191l) && iVar.apply(nVar2);
            String[] strArrV = A.v();
            int i21 = 0;
            while (true) {
                if (i21 < strArrV.length) {
                    iJ2 = j.j(this.f47595e, strArrV[i21], false);
                    if (iJ2 <= 0) {
                        i21++;
                    }
                } else {
                    iJ2 = 0;
                    i21 = Integer.MAX_VALUE;
                }
            }
            this.f47546p = i21;
            this.f47547q = iJ2;
            int i22 = 0;
            while (true) {
                ImmutableList<String> immutableList2 = dVar.f35193n;
                if (i22 < immutableList2.size()) {
                    String str2 = this.f47595e.f35302n;
                    if (str2 == null || !str2.equals(immutableList2.get(i22))) {
                        i22++;
                    } else {
                        i14 = i22;
                    }
                }
            }
            this.f47552v = i14;
            this.f47553w = n0.i(i12) == 128;
            this.f47554x = n0.m(i12) == 64;
            d dVar2 = this.f47540i;
            if (n0.j(i12, dVar2.f47561A) && ((z12 = this.f47538g) || dVar2.f47567x)) {
                dVar2.f35194o.getClass();
                i15 = (!n0.j(i12, false) || !z12 || this.f47595e.j == -1 || (!dVar2.f47562B && z10) || (i16 & i12) == 0) ? 1 : 2;
            }
            this.f47537f = i15;
        }

        @Override // v1.j.h
        public final int a() {
            return this.f47537f;
        }

        @Override // v1.j.h
        public final boolean b(h hVar) {
            int i10;
            String str;
            a aVar = (a) hVar;
            this.f47540i.getClass();
            n nVar = this.f47595e;
            int i11 = nVar.f35279D;
            if (i11 != -1) {
                n nVar2 = aVar.f47595e;
                if (i11 == nVar2.f35279D && ((this.f47544n || ((str = nVar.f35302n) != null && TextUtils.equals(str, nVar2.f35302n))) && (i10 = nVar.f35280E) != -1 && i10 == nVar2.f35280E)) {
                    if (this.f47553w == aVar.f47553w && this.f47554x == aVar.f47554x) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            boolean z10 = this.j;
            boolean z11 = this.f47538g;
            Object objE = (z11 && z10) ? j.f47530i : j.f47530i.e();
            com.google.common.collect.i iVarB = com.google.common.collect.i.f27974a.c(z10, aVar.j).b(Integer.valueOf(this.f47542l), Integer.valueOf(aVar.f47542l), w.c().e()).a(this.f47541k, aVar.f47541k).a(this.f47543m, aVar.f47543m).c(this.f47548r, aVar.f47548r).c(this.f47545o, aVar.f47545o).b(Integer.valueOf(this.f47546p), Integer.valueOf(aVar.f47546p), w.c().e()).a(this.f47547q, aVar.f47547q).c(z11, aVar.f47538g).b(Integer.valueOf(this.f47552v), Integer.valueOf(aVar.f47552v), w.c().e());
            this.f47540i.getClass();
            com.google.common.collect.i iVarB2 = iVarB.c(this.f47553w, aVar.f47553w).c(this.f47554x, aVar.f47554x).c(this.f47555y, aVar.f47555y).b(Integer.valueOf(this.f47549s), Integer.valueOf(aVar.f47549s), objE).b(Integer.valueOf(this.f47550t), Integer.valueOf(aVar.f47550t), objE);
            if (Objects.equals(this.f47539h, aVar.f47539h)) {
                iVarB2 = iVarB2.b(Integer.valueOf(this.f47551u), Integer.valueOf(aVar.f47551u), objE);
            }
            return iVarB2.e();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class b extends h<b> implements Comparable<b> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f47556f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f47557g;

        public b(int i10, y yVar, int i11, d dVar, int i12) {
            super(i10, yVar, i11);
            this.f47556f = n0.j(i12, dVar.f47561A) ? 1 : 0;
            this.f47557g = this.f47595e.b();
        }

        @Override // v1.j.h
        public final int a() {
            return this.f47556f;
        }

        @Override // v1.j.h
        public final /* bridge */ /* synthetic */ boolean b(h hVar) {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            return Integer.compare(this.f47557g, bVar.f47557g);
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f47558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f47559c;

        public c(n nVar, int i10) {
            this.f47558b = (nVar.f35294e & 1) != 0;
            this.f47559c = n0.j(i10, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            return com.google.common.collect.i.f27974a.c(this.f47559c, cVar2.f47559c).c(this.f47558b, cVar2.f47558b).e();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class e {
        static {
            A.B(0);
            A.B(1);
            A.B(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals((int[]) null, (int[]) null);
        }

        public final int hashCode() {
            return Arrays.hashCode((int[]) null) * 31;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Spatializer f47579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f47580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f47581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f47582d;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f47583a;

            public a(j jVar) {
                this.f47583a = jVar;
            }

            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                j jVar = this.f47583a;
                w<Integer> wVar = j.f47530i;
                jVar.k();
            }

            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                j jVar = this.f47583a;
                w<Integer> wVar = j.f47530i;
                jVar.k();
            }
        }

        public f(Context context, j jVar) {
            AudioManager audioManagerA = context == null ? null : p090h1.d.a(context);
            if (audioManagerA != null) {
                context.getClass();
                if (!A.E(context)) {
                    Spatializer spatializer = audioManagerA.getSpatializer();
                    this.f47579a = spatializer;
                    this.f47580b = spatializer.getImmersiveAudioLevel() != 0;
                    a aVar = new a(jVar);
                    this.f47582d = aVar;
                    Looper looperMyLooper = Looper.myLooper();
                    p241t7.b.l(looperMyLooper);
                    Handler handler = new Handler(looperMyLooper);
                    this.f47581c = handler;
                    spatializer.addOnSpatializerStateChangedListener(new q(handler), aVar);
                    return;
                }
            }
            this.f47579a = null;
            this.f47580b = false;
            this.f47581c = null;
            this.f47582d = null;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class g extends h<g> implements Comparable<g> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f47584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f47585g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f47586h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f47587i;
        public final int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f47588k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f47589l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f47590m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f47591n;

        public g(int i10, y yVar, int i11, d dVar, int i12, String str, String str2) {
            int iJ;
            super(i10, yVar, i11);
            int i13 = 0;
            this.f47585g = n0.j(i12, false);
            int i14 = this.f47595e.f35294e & (~dVar.f35197r);
            this.f47586h = (i14 & 1) != 0;
            this.f47587i = (i14 & 2) != 0;
            ImmutableList<String> immutableList = dVar.f35195p;
            ImmutableList<String> immutableListM = str2 != null ? ImmutableList.M(str2) : immutableList.isEmpty() ? ImmutableList.M("") : immutableList;
            int i15 = 0;
            while (true) {
                if (i15 >= immutableListM.size()) {
                    i15 = BrazeLogger.SUPPRESS;
                    iJ = 0;
                    break;
                } else {
                    iJ = j.j(this.f47595e, immutableListM.get(i15), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.j = i15;
            this.f47588k = iJ;
            int iH = j.h(this.f47595e.f35295f, str2 != null ? 1088 : 0);
            this.f47589l = iH;
            this.f47591n = (1088 & this.f47595e.f35295f) != 0;
            int iJ2 = j.j(this.f47595e, str, j.l(str) == null);
            this.f47590m = iJ2;
            boolean z10 = iJ > 0 || (immutableList.isEmpty() && iH > 0) || this.f47586h || (this.f47587i && iJ2 > 0);
            if (n0.j(i12, dVar.f47561A) && z10) {
                i13 = 1;
            }
            this.f47584f = i13;
        }

        @Override // v1.j.h
        public final int a() {
            return this.f47584f;
        }

        @Override // v1.j.h
        public final /* bridge */ /* synthetic */ boolean b(h hVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(g gVar) {
            com.google.common.collect.i iVarB = com.google.common.collect.i.f27974a.c(this.f47585g, gVar.f47585g).b(Integer.valueOf(this.j), Integer.valueOf(gVar.j), w.c().e());
            int i10 = this.f47588k;
            com.google.common.collect.i iVarA = iVarB.a(i10, gVar.f47588k);
            int i11 = this.f47589l;
            com.google.common.collect.i iVarA2 = iVarA.a(i11, gVar.f47589l).c(this.f47586h, gVar.f47586h).b(Boolean.valueOf(this.f47587i), Boolean.valueOf(gVar.f47587i), i10 == 0 ? w.c() : w.c().e()).a(this.f47590m, gVar.f47590m);
            if (i11 == 0) {
                iVarA2 = iVarA2.d(this.f47591n, gVar.f47591n);
            }
            return iVarA2.e();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static abstract class h<T extends h<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y f47593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f47594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n f47595e;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public interface a<T extends h<T>> {
            List<T> c(int i10, y yVar, int[] iArr);
        }

        public h(int i10, y yVar, int i11) {
            this.f47592b = i10;
            this.f47593c = yVar;
            this.f47594d = i11;
            this.f47595e = yVar.f35494d[i11];
        }

        public abstract int a();

        public abstract boolean b(T t8);
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class i extends h<i> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f47596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f47597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f47598h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f47599i;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f47600k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f47601l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f47602m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f47603n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f47604o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f47605p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f47606q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f47607r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f47608s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f47609t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f47610u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f47611v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f47612w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Code duplicated, block: B:25:0x0043  */
        /* JADX WARN: Code duplicated, block: B:42:0x0069  */
        /* JADX WARN: Code duplicated, block: B:87:0x011b  */
        public i(int i10, y yVar, int i11, d dVar, int i12, String str, int i13, boolean z10) {
            boolean z11;
            boolean z12;
            int i14;
            int iJ;
            boolean z13;
            n nVar;
            int i15;
            int i16;
            int i17;
            n nVar2;
            int i18;
            int i19;
            int i20;
            super(i10, yVar, i11);
            int i21 = 4;
            int i22 = 0;
            this.f47597g = dVar;
            int i23 = dVar.f47566w ? 24 : 16;
            this.f47608s = false;
            if (!z10 || (((i18 = (nVar2 = this.f47595e).f35309u) != -1 && i18 > dVar.f35181a) || ((i19 = nVar2.f35310v) != -1 && i19 > dVar.f35182b))) {
                z11 = false;
            } else {
                float f10 = nVar2.f35311w;
                if ((f10 == -1.0f || f10 <= dVar.f35183c) && ((i20 = nVar2.j) == -1 || i20 <= dVar.f35184d)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f47596f = z11;
            if (!z10 || (((i15 = (nVar = this.f47595e).f35309u) != -1 && i15 < 0) || ((i16 = nVar.f35310v) != -1 && i16 < 0))) {
                z12 = false;
            } else {
                float f11 = nVar.f35311w;
                if ((f11 == -1.0f || f11 >= 0) && ((i17 = nVar.j) == -1 || i17 >= 0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f47598h = z12;
            this.f47599i = n0.j(i12, false);
            n nVar3 = this.f47595e;
            float f12 = nVar3.f35311w;
            this.j = f12 != -1.0f && f12 >= 10.0f;
            this.f47600k = nVar3.j;
            this.f47601l = nVar3.b();
            int i24 = 0;
            while (true) {
                ImmutableList<String> immutableList = dVar.j;
                int size = immutableList.size();
                i14 = BrazeLogger.SUPPRESS;
                if (i24 >= size) {
                    iJ = 0;
                    i24 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ = j.j(this.f47595e, immutableList.get(i24), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i24++;
                    }
                }
            }
            this.f47603n = i24;
            this.f47604o = iJ;
            this.f47605p = j.h(this.f47595e.f35295f, 0);
            int i25 = this.f47595e.f35295f;
            this.f47606q = i25 == 0 || (i25 & 1) != 0;
            this.f47607r = j.j(this.f47595e, str, j.l(str) == null);
            int i26 = 0;
            while (true) {
                ImmutableList<String> immutableList2 = dVar.f35189i;
                if (i26 < immutableList2.size()) {
                    String str2 = this.f47595e.f35302n;
                    if (str2 != null && str2.equals(immutableList2.get(i26))) {
                        i14 = i26;
                        break;
                    }
                    i26++;
                } else {
                    break;
                }
            }
            this.f47602m = i14;
            this.f47610u = n0.i(i12) == 128;
            this.f47611v = n0.m(i12) == 64;
            String str3 = this.f47595e.f35302n;
            if (str3 != null) {
                switch (str3) {
                    case "video/dolby-vision":
                        i21 = 5;
                        break;
                    case "video/av01":
                        break;
                    case "video/hevc":
                        i21 = 3;
                        break;
                    case "video/avc":
                        i21 = 1;
                        break;
                    case "video/x-vnd.on2.vp9":
                        i21 = 2;
                        break;
                    default:
                        i21 = 0;
                        break;
                }
            } else {
                i21 = 0;
            }
            this.f47612w = i21;
            n nVar4 = this.f47595e;
            if ((nVar4.f35295f & 16384) == 0) {
                d dVar2 = this.f47597g;
                if (n0.j(i12, dVar2.f47561A) && ((z13 = this.f47596f) || dVar2.f47565v)) {
                    i22 = (n0.j(i12, false) && this.f47598h && z13 && nVar4.j != -1 && (i23 & i12) != 0) ? 2 : 1;
                }
            }
            this.f47609t = i22;
        }

        public static int c(i iVar, i iVar2) {
            com.google.common.collect.i iVarB = com.google.common.collect.i.f27974a.c(iVar.f47599i, iVar2.f47599i).b(Integer.valueOf(iVar.f47603n), Integer.valueOf(iVar2.f47603n), w.c().e()).a(iVar.f47604o, iVar2.f47604o).a(iVar.f47605p, iVar2.f47605p).c(iVar.f47606q, iVar2.f47606q).a(iVar.f47607r, iVar2.f47607r).c(iVar.j, iVar2.j).c(iVar.f47596f, iVar2.f47596f).c(iVar.f47598h, iVar2.f47598h).b(Integer.valueOf(iVar.f47602m), Integer.valueOf(iVar2.f47602m), w.c().e());
            boolean z10 = iVar2.f47610u;
            boolean z11 = iVar.f47610u;
            com.google.common.collect.i iVarC = iVarB.c(z11, z10);
            boolean z12 = iVar2.f47611v;
            boolean z13 = iVar.f47611v;
            com.google.common.collect.i iVarC2 = iVarC.c(z13, z12);
            if (z11 && z13) {
                iVarC2 = iVarC2.a(iVar.f47612w, iVar2.f47612w);
            }
            return iVarC2.e();
        }

        @Override // v1.j.h
        public final int a() {
            return this.f47609t;
        }

        @Override // v1.j.h
        public final boolean b(h hVar) {
            i iVar = (i) hVar;
            if (this.f47608s || Objects.equals(this.f47595e.f35302n, iVar.f47595e.f35302n)) {
                this.f47597g.getClass();
                if (this.f47610u == iVar.f47610u && this.f47611v == iVar.f47611v) {
                    return true;
                }
            }
            return false;
        }
    }

    public j(Context context) {
        v1.a.b bVar = new v1.a.b();
        d dVar = d.f47560E;
        this.f47531c = new Object();
        this.f47532d = context != null ? context.getApplicationContext() : null;
        this.f47533e = bVar;
        if (dVar != null) {
            this.f47534f = dVar;
        } else {
            dVar.getClass();
            d.a aVar = new d.a(dVar);
            aVar.c(dVar);
            this.f47534f = new d(aVar);
        }
        this.f47536h = C2198d.f35244b;
        if (this.f47534f.f47569z && context == null) {
            k.f("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int h(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : BrazeLogger.SUPPRESS;
    }

    public static void i(p235t1.w wVar, d dVar, HashMap map) {
        for (int i10 = 0; i10 < wVar.f47102a; i10++) {
            z zVar = dVar.f35198s.get(wVar.a(i10));
            if (zVar != null) {
                y yVar = zVar.f35496a;
                z zVar2 = (z) map.get(Integer.valueOf(yVar.f35493c));
                if (zVar2 == null || (zVar2.f35497b.isEmpty() && !zVar.f35497b.isEmpty())) {
                    map.put(Integer.valueOf(yVar.f35493c), zVar);
                }
            }
        }
    }

    public static int j(n nVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(nVar.f35293d)) {
            return 4;
        }
        String strL = l(str);
        String strL2 = l(nVar.f35293d);
        if (strL2 == null || strL == null) {
            return (z10 && strL2 == null) ? 1 : 0;
        }
        if (strL2.startsWith(strL) || strL.startsWith(strL2)) {
            return 3;
        }
        int i10 = A.f40996a;
        return strL2.split("-", 2)[0].equals(strL.split("-", 2)[0]) ? 2 : 0;
    }

    public static String l(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair m(int i10, v.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        RandomAccess randomAccessM;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < aVar.f47615a; i11++) {
            if (i10 == aVar.f47616b[i11]) {
                p235t1.w wVar = aVar.f47617c[i11];
                for (int i12 = 0; i12 < wVar.f47102a; i12++) {
                    y yVarA = wVar.a(i12);
                    List listC = aVar2.c(i11, yVarA, iArr[i11][i12]);
                    int i13 = yVarA.f35491a;
                    boolean[] zArr = new boolean[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        h hVar = (h) listC.get(i14);
                        int iA = hVar.a();
                        if (!zArr[i14] && iA != 0) {
                            if (iA == 1) {
                                randomAccessM = ImmutableList.M(hVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                for (int i15 = i14 + 1; i15 < i13; i15++) {
                                    h hVar2 = (h) listC.get(i15);
                                    if (hVar2.a() == 2 && hVar.b(hVar2)) {
                                        arrayList2.add(hVar2);
                                        z10 = true;
                                        zArr[i15] = true;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                randomAccessM = arrayList2;
                            }
                            arrayList.add(randomAccessM);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((h) list.get(i16)).f47594d;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new t.a(hVar3.f47593c, iArr2), Integer.valueOf(hVar3.f47592b));
    }

    @Override // p259v1.x
    public final p078g1.A a() {
        d dVar;
        synchronized (this.f47531c) {
            dVar = this.f47534f;
        }
        return dVar;
    }

    @Override // p259v1.x
    public final void d() {
        f fVar;
        Spatializer spatializer;
        f.a aVar;
        Handler handler;
        if (A.f40996a >= 32 && (fVar = this.f47535g) != null && (spatializer = fVar.f47579a) != null && (aVar = fVar.f47582d) != null && (handler = fVar.f47581c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(aVar);
            handler.removeCallbacksAndMessages(null);
        }
        super.d();
    }

    @Override // p259v1.x
    public final void f(C2198d c2198d) {
        if (this.f47536h.equals(c2198d)) {
            return;
        }
        this.f47536h = c2198d;
        k();
    }

    @Override // p259v1.x
    public final void g(p078g1.A a10) {
        d dVar;
        if (a10 instanceof d) {
            n((d) a10);
        }
        synchronized (this.f47531c) {
            dVar = this.f47534f;
        }
        d.a aVar = new d.a(dVar);
        aVar.c(a10);
        n(new d(aVar));
    }

    public final void k() {
        boolean z10;
        P p10;
        f fVar;
        synchronized (this.f47531c) {
            try {
                z10 = this.f47534f.f47569z && A.f40996a >= 32 && (fVar = this.f47535g) != null && fVar.f47580b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10 || (p10 = this.f47621a) == null) {
            return;
        }
        p10.f18097i.i(10);
    }

    public final void n(d dVar) {
        boolean zEquals;
        dVar.getClass();
        synchronized (this.f47531c) {
            zEquals = this.f47534f.equals(dVar);
            this.f47534f = dVar;
        }
        if (zEquals) {
            return;
        }
        if (dVar.f47569z && this.f47532d == null) {
            k.f("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        P p10 = this.f47621a;
        if (p10 != null) {
            p10.f18097i.i(10);
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class d extends p078g1.A {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final d f47560E = new d(new a());

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final boolean f47561A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public final boolean f47562B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final SparseArray<Map<p235t1.w, e>> f47563C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final SparseBooleanArray f47564D;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f47565v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f47566w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f47567x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f47568y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final boolean f47569z;

        static {
            com.obdeleven.service.core.b.b(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 1001, 1002, 1003, 1004);
            com.obdeleven.service.core.b.b(1005, 1006, 1007, 1008, 1009);
            com.obdeleven.service.core.b.b(1010, 1011, 1012, 1013, 1014);
            A.B(1015);
            A.B(1016);
            A.B(1017);
            A.B(1018);
        }

        public d(a aVar) {
            super(aVar);
            this.f47565v = aVar.f47573u;
            this.f47566w = aVar.f47574v;
            this.f47567x = aVar.f47575w;
            this.f47568y = aVar.f47576x;
            this.f47569z = aVar.f47577y;
            this.f47561A = aVar.f47578z;
            this.f47562B = aVar.f47570A;
            this.f47563C = aVar.f47571B;
            this.f47564D = aVar.f47572C;
        }

        @Override // p078g1.A
        public final g1.A.b a() {
            return new a(this);
        }

        @Override // p078g1.A
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(dVar) && this.f47565v == dVar.f47565v && this.f47566w == dVar.f47566w && this.f47567x == dVar.f47567x && this.f47568y == dVar.f47568y && this.f47569z == dVar.f47569z && this.f47561A == dVar.f47561A && this.f47562B == dVar.f47562B) {
                SparseBooleanArray sparseBooleanArray = this.f47564D;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = dVar.f47564D;
                if (sparseBooleanArray2.size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) >= 0) {
                        }
                    }
                    SparseArray<Map<p235t1.w, e>> sparseArray = this.f47563C;
                    int size2 = sparseArray.size();
                    SparseArray<Map<p235t1.w, e>> sparseArray2 = dVar.f47563C;
                    if (sparseArray2.size() == size2) {
                        for (int i11 = 0; i11 < size2; i11++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                            if (iIndexOfKey >= 0) {
                                Map<p235t1.w, e> mapValueAt = sparseArray.valueAt(i11);
                                Map<p235t1.w, e> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                if (mapValueAt2.size() == mapValueAt.size()) {
                                    for (Map.Entry<p235t1.w, e> entry : mapValueAt.entrySet()) {
                                        p235t1.w key = entry.getKey();
                                        if (!mapValueAt2.containsKey(key) || !Objects.equals(entry.getValue(), mapValueAt2.get(key))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // p078g1.A
        public final int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31) + (this.f47565v ? 1 : 0)) * 961) + (this.f47566w ? 1 : 0)) * 961) + (this.f47567x ? 1 : 0)) * 28629151) + (this.f47568y ? 1 : 0)) * 31) + (this.f47569z ? 1 : 0)) * 31) + (this.f47561A ? 1 : 0)) * 961) + (this.f47562B ? 1 : 0)) * 31;
        }

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public static final class a extends g1.A.b {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            public final boolean f47570A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            public final SparseArray<Map<p235t1.w, e>> f47571B;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public final SparseBooleanArray f47572C;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final boolean f47573u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final boolean f47574v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final boolean f47575w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final boolean f47576x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final boolean f47577y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final boolean f47578z;

            public a(d dVar) {
                c(dVar);
                this.f47573u = dVar.f47565v;
                this.f47574v = dVar.f47566w;
                this.f47575w = dVar.f47567x;
                this.f47576x = dVar.f47568y;
                this.f47577y = dVar.f47569z;
                this.f47578z = dVar.f47561A;
                this.f47570A = dVar.f47562B;
                SparseArray<Map<p235t1.w, e>> sparseArray = new SparseArray<>();
                int i10 = 0;
                while (true) {
                    SparseArray<Map<p235t1.w, e>> sparseArray2 = dVar.f47563C;
                    if (i10 >= sparseArray2.size()) {
                        this.f47571B = sparseArray;
                        this.f47572C = dVar.f47564D.clone();
                        return;
                    } else {
                        sparseArray.put(sparseArray2.keyAt(i10), new HashMap(sparseArray2.valueAt(i10)));
                        i10++;
                    }
                }
            }

            @Override // g1.A.b
            public final p078g1.A a() {
                return new d(this);
            }

            @Override // g1.A.b
            public final g1.A.b b(int i10) {
                super.b(i10);
                return this;
            }

            @Override // g1.A.b
            public final g1.A.b d() {
                this.f35217r = -3;
                return this;
            }

            @Override // g1.A.b
            public final g1.A.b e(z zVar) {
                super.e(zVar);
                return this;
            }

            @Override // g1.A.b
            public final g1.A.b f() {
                super.f();
                return this;
            }

            @Override // g1.A.b
            public final g1.A.b g(String[] strArr) {
                super.g(strArr);
                return this;
            }

            @Override // g1.A.b
            public final g1.A.b h() {
                this.f35216q = false;
                return this;
            }

            @Override // g1.A.b
            public final g1.A.b i(int i10) {
                super.i(i10);
                return this;
            }

            public a() {
                this.f47571B = new SparseArray<>();
                this.f47572C = new SparseBooleanArray();
                this.f47573u = true;
                this.f47574v = true;
                this.f47575w = true;
                this.f47576x = true;
                this.f47577y = true;
                this.f47578z = true;
                this.f47570A = true;
            }
        }
    }

    @Override // p259v1.x
    public final n0.a b() {
        return this;
    }
}
