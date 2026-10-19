package com.google.android.gms.measurement.internal;

import U4.C0804l;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.C0873a;
import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C1774a1;
import com.google.android.gms.internal.measurement.C1781b1;
import com.google.android.gms.internal.measurement.C1809f1;
import com.google.android.gms.internal.measurement.C1816g1;
import com.google.android.gms.internal.measurement.C1823h1;
import com.google.android.gms.internal.measurement.C1844k1;
import com.google.android.gms.internal.measurement.G1;
import com.google.android.gms.internal.measurement.H1;
import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.Q0;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfn$zza;
import com.google.android.gms.internal.measurement.zzkb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p131k5.B0;
import p131k5.C2483a1;
import p131k5.C2529k;
import p131k5.InterfaceC2511g;
import p131k5.O;
import p131k5.P;
import p131k5.Q;
import p131k5.U0;
import p131k5.X0;
import p131k5.Y;
import p131k5.Y0;
import p131k5.Z0;
import p131k5.m3;
import p131k5.z3;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends m3 implements InterfaceC2511g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0873a f26561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0873a f26562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0873a f26563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0873a f26564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0873a f26565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0873a f26566i;
    public final Z0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p005a4.c f26567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0873a f26568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0873a f26569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0873a f26570n;

    public d(h hVar) {
        super(hVar);
        this.f26561d = new C0873a();
        this.f26562e = new C0873a();
        this.f26563f = new C0873a();
        this.f26564g = new C0873a();
        this.f26565h = new C0873a();
        this.f26568l = new C0873a();
        this.f26569m = new C0873a();
        this.f26570n = new C0873a();
        this.f26566i = new C0873a();
        this.j = new Z0(this);
        this.f26567k = new p005a4.c(this);
    }

    public static zziq.zza B(zzfn$zza.zze zzeVar) {
        int i10 = C2483a1.f42079b[zzeVar.ordinal()];
        if (i10 == 1) {
            return zziq.zza.AD_STORAGE;
        }
        if (i10 == 2) {
            return zziq.zza.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return zziq.zza.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return zziq.zza.AD_PERSONALIZATION;
    }

    public static C0873a y(C1823h1 c1823h1) {
        C0873a c0873a = new C0873a();
        for (C1844k1 c1844k1 : c1823h1.L()) {
            c0873a.put(c1844k1.v(), c1844k1.w());
        }
        return c0873a;
    }

    public final zzip A(String str, zziq.zza zzaVar) {
        p();
        O(str);
        zzfn$zza zzfn_zzaG = G(str);
        zzip zzipVar = zzip.f26641b;
        if (zzfn_zzaG == null) {
            return zzipVar;
        }
        for (zzfn$zza.b bVar : zzfn_zzaG.z()) {
            if (B(bVar.w()) == zzaVar) {
                int i10 = C2483a1.f42080c[bVar.v().ordinal()];
                if (i10 != 1) {
                    return i10 != 2 ? zzipVar : zzip.f26644e;
                }
                return zzip.f26643d;
            }
        }
        return zzipVar;
    }

    public final void C(String str, C1823h1.a aVar) {
        HashSet hashSet = new HashSet();
        C0873a c0873a = new C0873a();
        C0873a c0873a2 = new C0873a();
        C0873a c0873a3 = new C0873a();
        Iterator it = Collections.unmodifiableList(((C1823h1) aVar.f25531c).J()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C1809f1) it.next()).v());
        }
        for (int i10 = 0; i10 < ((C1823h1) aVar.f25531c).z(); i10++) {
            C1816g1.a aVarR = ((C1823h1) aVar.f25531c).w(i10).r();
            if (aVarR.j().isEmpty()) {
                d().f41715i.c("EventConfig contained null event name");
            } else {
                String strJ = aVarR.j();
                String strB = Y.b(aVarR.j(), P.f41945e, P.f41947g);
                if (!TextUtils.isEmpty(strB)) {
                    aVarR.h();
                    C1816g1.w((C1816g1) aVarR.f25531c, strB);
                    aVar.h();
                    C1823h1.y((C1823h1) aVar.f25531c, i10, (C1816g1) aVarR.f());
                }
                if (((C1816g1) aVarR.f25531c).B() && ((C1816g1) aVarR.f25531c).z()) {
                    c0873a.put(strJ, Boolean.TRUE);
                }
                if (((C1816g1) aVarR.f25531c).C() && ((C1816g1) aVarR.f25531c).A()) {
                    c0873a2.put(aVarR.j(), Boolean.TRUE);
                }
                if (((C1816g1) aVarR.f25531c).D()) {
                    if (((C1816g1) aVarR.f25531c).v() < 2 || ((C1816g1) aVarR.f25531c).v() > 65535) {
                        B0 b0D = d();
                        b0D.f41715i.a(aVarR.j(), Integer.valueOf(((C1816g1) aVarR.f25531c).v()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c0873a3.put(aVarR.j(), Integer.valueOf(((C1816g1) aVarR.f25531c).v()));
                    }
                }
            }
        }
        this.f26562e.put(str, hashSet);
        this.f26563f.put(str, c0873a);
        this.f26564g.put(str, c0873a2);
        this.f26566i.put(str, c0873a3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(String str, C1823h1 c1823h1) {
        int iV = c1823h1.v();
        Z0 z10 = this.j;
        if (iV == 0) {
            z10.e(str);
            return;
        }
        B0 b0D = d();
        b0D.f41719n.b(Integer.valueOf(c1823h1.v()), "EES programs found");
        H1 h8 = (H1) c1823h1.K().get(0);
        try {
            A a10 = new A();
            Q0 q10 = a10.f25391a;
            U0 u10 = new U0();
            u10.f42005b = this;
            u10.f42006c = str;
            q10.f25560d.f25798a.put("internal.remoteConfig", u10);
            Y0 y10 = new Y0();
            y10.f42055b = this;
            y10.f42056c = str;
            q10.f25560d.f25798a.put("internal.appMetadata", y10);
            X0 x10 = new X0();
            x10.f42041b = this;
            q10.f25560d.f25798a.put("internal.logger", x10);
            a10.a(h8);
            z10.d(str, a10);
            d().f41719n.a(str, Integer.valueOf(h8.v().v()), "EES program loaded for appId, activities");
            Iterator<G1> it = h8.v().x().iterator();
            while (it.hasNext()) {
                d().f41719n.b(it.next().v(), "EES program activity");
            }
        } catch (zzc unused) {
            d().f41712f.b(str, "Failed to load EES program. appId");
        }
    }

    public final void E(String str, String str2, String str3, byte[] bArr) {
        C1823h1.a aVar;
        byte[] bArrI;
        boolean z10;
        String str4;
        boolean z11;
        t();
        p();
        C0804l.e(str);
        C1823h1.a aVarR = z(str, bArr).r();
        C(str, aVarR);
        D(str, (C1823h1) aVarR.f());
        C0873a c0873a = this.f26565h;
        c0873a.put(str, (C1823h1) aVarR.f());
        this.f26568l.put(str, ((C1823h1) aVarR.f25531c).H());
        this.f26569m.put(str, str2);
        this.f26570n.put(str, str3);
        this.f26561d.put(str, y((C1823h1) aVarR.f()));
        C2529k c2529kR = r();
        ArrayList<com.google.android.gms.internal.measurement.Y0> arrayList = new ArrayList(Collections.unmodifiableList(((C1823h1) aVarR.f25531c).I()));
        String str5 = "app_id=? and audience_id=?";
        int i10 = 0;
        while (i10 < arrayList.size()) {
            com.google.android.gms.internal.measurement.Y0.a aVarR2 = ((com.google.android.gms.internal.measurement.Y0) arrayList.get(i10)).r();
            if (((com.google.android.gms.internal.measurement.Y0) aVarR2.f25531c).z() != 0) {
                int i11 = 0;
                while (i11 < ((com.google.android.gms.internal.measurement.Y0) aVarR2.f25531c).z()) {
                    com.google.android.gms.internal.measurement.Z0.a aVarR3 = ((com.google.android.gms.internal.measurement.Y0) aVarR2.f25531c).w(i11).r();
                    com.google.android.gms.internal.measurement.Z0.a aVar2 = (com.google.android.gms.internal.measurement.Z0.a) ((N2.a) aVarR3.clone());
                    C0873a c0873a2 = c0873a;
                    String strB = Y.b(((com.google.android.gms.internal.measurement.Z0) aVarR3.f25531c).D(), P.f41945e, P.f41947g);
                    if (strB != null) {
                        aVar2.h();
                        com.google.android.gms.internal.measurement.Z0.y((com.google.android.gms.internal.measurement.Z0) aVar2.f25531c, strB);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i12 = 0;
                    while (i12 < ((com.google.android.gms.internal.measurement.Z0) aVarR3.f25531c).v()) {
                        C1774a1 c1774a1W = ((com.google.android.gms.internal.measurement.Z0) aVarR3.f25531c).w(i12);
                        com.google.android.gms.internal.measurement.Z0.a aVar3 = aVarR3;
                        C1823h1.a aVar4 = aVarR;
                        String str6 = str5;
                        String strB2 = Y.b(c1774a1W.A(), O.f41926e, O.f41927f);
                        if (strB2 != null) {
                            C1774a1.a aVarR4 = c1774a1W.r();
                            aVarR4.h();
                            C1774a1.w((C1774a1) aVarR4.f25531c, strB2);
                            C1774a1 c1774a1 = (C1774a1) aVarR4.f();
                            aVar2.h();
                            com.google.android.gms.internal.measurement.Z0.x((com.google.android.gms.internal.measurement.Z0) aVar2.f25531c, i12, c1774a1);
                            z11 = true;
                        }
                        i12++;
                        aVarR3 = aVar3;
                        aVarR = aVar4;
                        str5 = str6;
                    }
                    C1823h1.a aVar5 = aVarR;
                    String str7 = str5;
                    if (z11) {
                        aVarR2.h();
                        com.google.android.gms.internal.measurement.Y0.x((com.google.android.gms.internal.measurement.Y0) aVarR2.f25531c, i11, (com.google.android.gms.internal.measurement.Z0) aVar2.f());
                        arrayList.set(i10, (com.google.android.gms.internal.measurement.Y0) aVarR2.f());
                    }
                    i11++;
                    c0873a = c0873a2;
                    aVarR = aVar5;
                    str5 = str7;
                }
            }
            C1823h1.a aVar6 = aVarR;
            C0873a c0873a3 = c0873a;
            String str8 = str5;
            if (((com.google.android.gms.internal.measurement.Y0) aVarR2.f25531c).B() != 0) {
                for (int i13 = 0; i13 < ((com.google.android.gms.internal.measurement.Y0) aVarR2.f25531c).B(); i13++) {
                    C1781b1 c1781b1A = ((com.google.android.gms.internal.measurement.Y0) aVarR2.f25531c).A(i13);
                    String strB3 = Y.b(c1781b1A.A(), Q.f41962e, Q.f41963f);
                    if (strB3 != null) {
                        C1781b1.a aVarR5 = c1781b1A.r();
                        aVarR5.h();
                        C1781b1.w((C1781b1) aVarR5.f25531c, strB3);
                        aVarR2.h();
                        com.google.android.gms.internal.measurement.Y0.y((com.google.android.gms.internal.measurement.Y0) aVarR2.f25531c, i13, (C1781b1) aVarR5.f());
                        arrayList.set(i10, (com.google.android.gms.internal.measurement.Y0) aVarR2.f());
                    }
                }
            }
            i10++;
            c0873a = c0873a3;
            aVarR = aVar6;
            str5 = str8;
        }
        C1823h1.a aVar7 = aVarR;
        C0873a c0873a4 = c0873a;
        String str9 = str5;
        c2529kR.t();
        c2529kR.p();
        C0804l.e(str);
        SQLiteDatabase sQLiteDatabaseW = c2529kR.w();
        sQLiteDatabaseW.beginTransaction();
        try {
            c2529kR.t();
            c2529kR.p();
            C0804l.e(str);
            SQLiteDatabase sQLiteDatabaseW2 = c2529kR.w();
            sQLiteDatabaseW2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseW2.delete("event_filters", "app_id=?", new String[]{str});
            for (com.google.android.gms.internal.measurement.Y0 y10 : arrayList) {
                c2529kR.t();
                c2529kR.p();
                C0804l.e(str);
                C0804l.h(y10);
                if (y10.F()) {
                    int iV = y10.v();
                    Iterator<com.google.android.gms.internal.measurement.Z0> it = y10.D().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().J()) {
                                c2529kR.d().f41715i.a(B0.v(str), Integer.valueOf(iV), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        } else {
                            Iterator<C1781b1> it2 = y10.E().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator<com.google.android.gms.internal.measurement.Z0> it3 = y10.D().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!c2529kR.T(str, iV, it3.next())) {
                                                z10 = false;
                                                break;
                                            }
                                        } else {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    if (z10) {
                                        Iterator<C1781b1> it4 = y10.E().iterator();
                                        while (it4.hasNext()) {
                                            if (!c2529kR.U(str, iV, it4.next())) {
                                                z10 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (z10) {
                                        str4 = str9;
                                    } else {
                                        c2529kR.t();
                                        c2529kR.p();
                                        C0804l.e(str);
                                        SQLiteDatabase sQLiteDatabaseW3 = c2529kR.w();
                                        str4 = str9;
                                        sQLiteDatabaseW3.delete("property_filters", str4, new String[]{str, String.valueOf(iV)});
                                        sQLiteDatabaseW3.delete("event_filters", str4, new String[]{str, String.valueOf(iV)});
                                    }
                                    str9 = str4;
                                    break;
                                }
                                if (!it2.next().E()) {
                                    c2529kR.d().f41715i.a(B0.v(str), Integer.valueOf(iV), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    c2529kR.d().f41715i.b(B0.v(str), "Audience with no ID. appId");
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (com.google.android.gms.internal.measurement.Y0 y11 : arrayList) {
                arrayList2.add(y11.F() ? Integer.valueOf(y11.v()) : null);
            }
            c2529kR.b0(str, arrayList2);
            sQLiteDatabaseW.setTransactionSuccessful();
            sQLiteDatabaseW.endTransaction();
            try {
                aVar7.h();
                aVar = aVar7;
                try {
                    C1823h1.x((C1823h1) aVar.f25531c);
                    bArrI = ((C1823h1) aVar.f()).i();
                } catch (RuntimeException e10) {
                    e = e10;
                    d().f41715i.a(B0.v(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrI = bArr;
                }
            } catch (RuntimeException e11) {
                e = e11;
                aVar = aVar7;
            }
            C2529k c2529kR2 = r();
            C0804l.e(str);
            c2529kR2.p();
            c2529kR2.t();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArrI);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (c2529kR2.w().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    c2529kR2.d().f41712f.b(B0.v(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e12) {
                c2529kR2.d().f41712f.a(B0.v(str), e12, "Error storing remote config. appId");
            }
            c0873a4.put(str, (C1823h1) aVar.f());
        } catch (Throwable th) {
            sQLiteDatabaseW.endTransaction();
            throw th;
        }
    }

    public final int F(String str, String str2) {
        Integer num;
        p();
        O(str);
        Map map = (Map) this.f26566i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final zzfn$zza G(String str) {
        p();
        O(str);
        C1823h1 c1823h1I = I(str);
        if (c1823h1I == null || !c1823h1I.N()) {
            return null;
        }
        return c1823h1I.B();
    }

    public final zziq.zza H(String str) {
        zziq.zza zzaVar = zziq.zza.AD_USER_DATA;
        p();
        O(str);
        zzfn$zza zzfn_zzaG = G(str);
        if (zzfn_zzaG == null) {
            return null;
        }
        for (zzfn$zza.c cVar : zzfn_zzaG.y()) {
            if (zzaVar == B(cVar.w())) {
                return B(cVar.v());
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1823h1 I(String str) {
        t();
        p();
        C0804l.e(str);
        O(str);
        return (C1823h1) this.f26565h.get(str);
    }

    public final boolean J(String str, zziq.zza zzaVar) {
        p();
        O(str);
        zzfn$zza zzfn_zzaG = G(str);
        if (zzfn_zzaG == null) {
            return false;
        }
        for (zzfn$zza.b bVar : zzfn_zzaG.x()) {
            if (zzaVar == B(bVar.w())) {
                if (bVar.v() == zzfn$zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean K(String str, String str2) {
        Boolean bool;
        p();
        O(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f26564g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean L(String str, String str2) {
        Boolean bool;
        p();
        O(str);
        if ("1".equals(c(str, "measurement.upload.blacklist_internal")) && z3.v0(str2)) {
            return true;
        }
        if ("1".equals(c(str, "measurement.upload.blacklist_public")) && z3.x0(str2)) {
            return true;
        }
        Map map = (Map) this.f26563f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean M(String str) {
        p();
        O(str);
        C0873a c0873a = this.f26562e;
        return c0873a.get(str) != 0 && ((Set) c0873a.get(str)).contains("app_instance_id");
    }

    public final boolean N(String str) {
        p();
        O(str);
        C0873a c0873a = this.f26562e;
        if (c0873a.get(str) != 0) {
            return ((Set) c0873a.get(str)).contains("os_version") || ((Set) c0873a.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    public final void O(String str) {
        Cursor cursorQuery;
        p116j3.h hVar;
        C0873a c0873a;
        C0873a c0873a2;
        C0873a c0873a3;
        C0873a c0873a4;
        t();
        p();
        C0804l.e(str);
        C0873a c0873a5 = this.f26565h;
        if (c0873a5.get(str) == 0) {
            C2529k c2529kR = r();
            C0804l.e(str);
            c2529kR.p();
            c2529kR.t();
            Cursor cursor = null;
            try {
                cursorQuery = c2529kR.w().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = cursorQuery.getString(2);
                            if (cursorQuery.moveToNext()) {
                                c2529kR.d().f41712f.b(B0.v(str), "Got multiple records for app config, expected one. appId");
                            }
                            if (blob == null) {
                                cursorQuery.close();
                            } else {
                                hVar = new p116j3.h(blob, string, string2);
                                cursorQuery.close();
                            }
                            c0873a = this.f26570n;
                            c0873a2 = this.f26569m;
                            c0873a3 = this.f26568l;
                            c0873a4 = this.f26561d;
                            if (hVar == null) {
                                C1823h1.a aVarR = z(str, (byte[]) hVar.f41103a).r();
                                C(str, aVarR);
                                c0873a4.put(str, y((C1823h1) aVarR.f()));
                                c0873a5.put(str, (C1823h1) aVarR.f());
                                D(str, (C1823h1) aVarR.f());
                                c0873a3.put(str, ((C1823h1) aVarR.f25531c).H());
                                c0873a2.put(str, (String) hVar.f41104b);
                                c0873a.put(str, (String) hVar.f41105c);
                                return;
                            }
                            c0873a4.put(str, null);
                            this.f26563f.put(str, null);
                            this.f26562e.put(str, null);
                            this.f26564g.put(str, null);
                            c0873a5.put(str, null);
                            c0873a3.put(str, null);
                            c0873a2.put(str, null);
                            c0873a.put(str, null);
                            this.f26566i.put(str, null);
                        }
                        cursorQuery.close();
                    } catch (SQLiteException e10) {
                        e = e10;
                        c2529kR.d().f41712f.a(B0.v(str), e, "Error querying remote config. appId");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            hVar = null;
            c0873a = this.f26570n;
            c0873a2 = this.f26569m;
            c0873a3 = this.f26568l;
            c0873a4 = this.f26561d;
            if (hVar == null) {
                C1823h1.a aVarR2 = z(str, (byte[]) hVar.f41103a).r();
                C(str, aVarR2);
                c0873a4.put(str, y((C1823h1) aVarR2.f()));
                c0873a5.put(str, (C1823h1) aVarR2.f());
                D(str, (C1823h1) aVarR2.f());
                c0873a3.put(str, ((C1823h1) aVarR2.f25531c).H());
                c0873a2.put(str, (String) hVar.f41104b);
                c0873a.put(str, (String) hVar.f41105c);
                return;
            }
            c0873a4.put(str, null);
            this.f26563f.put(str, null);
            this.f26562e.put(str, null);
            this.f26564g.put(str, null);
            c0873a5.put(str, null);
            c0873a3.put(str, null);
            c0873a2.put(str, null);
            c0873a.put(str, null);
            this.f26566i.put(str, null);
        }
    }

    @Override // p131k5.InterfaceC2511g
    public final String c(String str, String str2) {
        p();
        O(str);
        Map map = (Map) this.f26561d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // p131k5.m3
    public final boolean v() {
        return false;
    }

    public final long w(String str) {
        String strC = c(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strC)) {
            return 0L;
        }
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException e10) {
            B0 b0D = d();
            b0D.f41715i.a(B0.v(str), e10, "Unable to parse timezone offset. appId");
            return 0L;
        }
    }

    public final C1823h1 z(String str, byte[] bArr) {
        if (bArr == null) {
            return C1823h1.E();
        }
        try {
            C1823h1 c1823h1 = (C1823h1) ((C1823h1.a) i.D(C1823h1.C(), bArr)).f();
            d().f41719n.a(c1823h1.Q() ? Long.valueOf(c1823h1.A()) : null, c1823h1.O() ? c1823h1.G() : null, "Parsed config. version, gmp_app_id");
            return c1823h1;
        } catch (zzkb e10) {
            d().f41715i.a(B0.v(str), e10, "Unable to merge remote config. appId");
            return C1823h1.E();
        } catch (RuntimeException e11) {
            d().f41715i.a(B0.v(str), e11, "Unable to merge remote config. appId");
            return C1823h1.E();
        }
    }
}
