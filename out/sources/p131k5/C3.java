package p131k5;

import C4.b;
import U4.C0804l;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.collection.AbstractC0878f;
import androidx.collection.C0873a;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C1781b1;
import com.google.android.gms.internal.measurement.C1892r1;
import com.google.android.gms.internal.measurement.C1899s1;
import com.google.android.gms.internal.measurement.C1906t1;
import com.google.android.gms.internal.measurement.C1940y1;
import com.google.android.gms.internal.measurement.C1946z1;
import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.Z0;
import com.google.android.gms.measurement.internal.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3 extends m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f41736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0873a f41737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f41738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f41739h;

    @Override // p131k5.m3
    public final boolean v() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:348:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0167  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v54 */
    public final ArrayList w(String str, List list, List list2, Long l10, Long l11) throws Throwable {
        int i10;
        int i11;
        boolean z10;
        String str2;
        Object obj;
        ?? r10;
        Cursor cursorQuery;
        Map mapEmptyMap;
        Map map;
        String str3;
        String str4;
        ArrayList arrayList;
        List listEmptyList;
        boolean z11;
        int i12;
        C2572v c2572v;
        G3 g10;
        C0873a c0873a;
        Iterator it;
        String str5;
        Map map2;
        List<Z0> list3;
        String str6;
        ?? r11;
        Cursor cursorRawQuery;
        Map map3;
        Map map4;
        String str7;
        ?? r12;
        Cursor cursorQuery2;
        String str8 = "current_results";
        C0804l.e(str);
        C0804l.h(list);
        C0804l.h(list2);
        this.f41735d = str;
        this.f41736e = new HashSet();
        this.f41737f = new C0873a();
        this.f41738g = l10;
        this.f41739h = l11;
        Iterator it2 = list.iterator();
        while (true) {
            i10 = 1;
            i11 = 0;
            if (!it2.hasNext()) {
                z10 = false;
                break;
            }
            if ("_s".equals(((C1906t1) it2.next()).K())) {
                z10 = true;
                break;
            }
        }
        D4.a();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        boolean zB = c2523i1.f42218g.B(this.f41735d, B.f41676i0);
        D4.a();
        boolean zB2 = c2523i1.f42218g.B(this.f41735d, B.f41674h0);
        if (z10) {
            C2529k c2529kR = r();
            String str9 = this.f41735d;
            c2529kR.t();
            c2529kR.p();
            C0804l.e(str9);
            ContentValues contentValues = new ContentValues();
            str2 = "current_session_count";
            contentValues.put("current_session_count", (Integer) 0);
            try {
                SQLiteDatabase sQLiteDatabaseW = c2529kR.w();
                str2 = "events";
                sQLiteDatabaseW.update("events", contentValues, "app_id = ?", new String[]{str9});
                obj = sQLiteDatabaseW;
            } catch (SQLiteException e10) {
                c2529kR.d().f41712f.a(B0.v(str9), e10, "Error resetting session-scoped event counts. appId");
                obj = "Error resetting session-scoped event counts. appId";
            }
        }
        Map mapEmptyMap2 = Collections.emptyMap();
        String str10 = "audience_id";
        Map map5 = mapEmptyMap2;
        map5 = mapEmptyMap2;
        Object obj2 = obj;
        obj2 = obj;
        if (zB2 && zB) {
            C2529k c2529kR2 = r();
            String str11 = this.f41735d;
            C0804l.e(str11);
            C0873a c0873a2 = new C0873a();
            try {
                try {
                    cursorQuery2 = c2529kR2.w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str11}, null, null, null);
                    try {
                        if (cursorQuery2.moveToFirst()) {
                            while (true) {
                                try {
                                    Z0 z12 = (Z0) ((Z0.a) i.D(Z0.A(), cursorQuery2.getBlob(i10))).f();
                                    if (z12.I()) {
                                        int i13 = cursorQuery2.getInt(0);
                                        List arrayList2 = (List) c0873a2.get(Integer.valueOf(i13));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            c0873a2.put(Integer.valueOf(i13), arrayList2);
                                        }
                                        arrayList2.add(z12);
                                    }
                                } catch (IOException e11) {
                                    c2529kR2.d().f41712f.a(B0.v(str11), e11, "Failed to merge filter. appId");
                                }
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                }
                                i10 = 1;
                            }
                            cursorQuery2.close();
                            map5 = c0873a2;
                            obj2 = c0873a2;
                        } else {
                            Map mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery2.close();
                            map5 = mapEmptyMap3;
                            obj2 = c0873a2;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        c2529kR2.d().f41712f.a(B0.v(str11), e, "Database error querying filters. appId");
                        Map mapEmptyMap4 = Collections.emptyMap();
                        map5 = mapEmptyMap4;
                        obj2 = "Database error querying filters. appId";
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                            map5 = mapEmptyMap4;
                            obj2 = "Database error querying filters. appId";
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r12 = str2;
                    if (r12 != 0) {
                        r12.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e13) {
                e = e13;
                cursorQuery2 = null;
            } catch (Throwable th2) {
                th = th2;
                r12 = 0;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        }
        Map map6 = map5;
        C2529k c2529kR3 = r();
        String str12 = this.f41735d;
        c2529kR3.t();
        c2529kR3.p();
        C0804l.e(str12);
        try {
            try {
                cursorQuery = c2529kR3.w().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str12}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        C0873a c0873a3 = new C0873a();
                        while (true) {
                            int i14 = cursorQuery.getInt(i11);
                            try {
                                c0873a3.put(Integer.valueOf(i14), (C1940y1) ((C1940y1.a) i.D(C1940y1.H(), cursorQuery.getBlob(1))).f());
                            } catch (IOException e14) {
                                c2529kR3.d().f41712f.d("Failed to merge filter results. appId, audienceId, error", B0.v(str12), Integer.valueOf(i14), e14);
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            c0873a3 = c0873a3;
                            i11 = 0;
                        }
                        cursorQuery.close();
                        map = c0873a3;
                    } else {
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        map = mapEmptyMap;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                    c2529kR3.d().f41712f.a(B0.v(str12), e, "Database error querying filter results. appId");
                    mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r10 = obj2;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e16) {
            e = e16;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            r10 = 0;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        if (map.isEmpty()) {
            str3 = "audience_id";
            str4 = "current_results";
        } else {
            HashSet<Integer> hashSet = new HashSet(map.keySet());
            if (z10) {
                String str13 = this.f41735d;
                C2529k c2529kR4 = r();
                String str14 = this.f41735d;
                c2529kR4.t();
                c2529kR4.p();
                C0804l.e(str14);
                C0873a c0873a4 = new C0873a();
                SQLiteDatabase sQLiteDatabaseW2 = c2529kR4.w();
                try {
                    try {
                        cursorRawQuery = sQLiteDatabaseW2.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str14, str14});
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    int i15 = cursorRawQuery.getInt(0);
                                    List arrayList3 = (List) c0873a4.get(Integer.valueOf(i15));
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        c0873a4.put(Integer.valueOf(i15), arrayList3);
                                    }
                                    arrayList3.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                } while (cursorRawQuery.moveToNext());
                                cursorRawQuery.close();
                                map3 = c0873a4;
                            } else {
                                Map mapEmptyMap5 = Collections.emptyMap();
                                cursorRawQuery.close();
                                map3 = mapEmptyMap5;
                            }
                        } catch (SQLiteException e17) {
                            e = e17;
                            c2529kR4.d().f41712f.a(B0.v(str14), e, "Database error querying scoped filters. appId");
                            Map mapEmptyMap6 = Collections.emptyMap();
                            map3 = mapEmptyMap6;
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                                map3 = mapEmptyMap6;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r11 = sQLiteDatabaseW2;
                        if (r11 != 0) {
                            r11.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e18) {
                    e = e18;
                    cursorRawQuery = null;
                } catch (Throwable th6) {
                    th = th6;
                    r11 = 0;
                    if (r11 != 0) {
                        r11.close();
                    }
                    throw th;
                }
                C0804l.e(str13);
                C0873a c0873a5 = new C0873a();
                if (!map.isEmpty()) {
                    Iterator it3 = map.keySet().iterator();
                    while (it3.hasNext()) {
                        Integer num = (Integer) it3.next();
                        num.getClass();
                        C1940y1 c1940y1 = (C1940y1) map.get(num);
                        List list4 = (List) map3.get(num);
                        if (list4 == null || list4.isEmpty()) {
                            map4 = map3;
                            str7 = str10;
                            c0873a5.put(num, c1940y1);
                            it3 = it3;
                            map3 = map4;
                            str10 = str7;
                        } else {
                            Map map7 = map3;
                            List listI = q().I((S2) c1940y1.L(), list4);
                            if (listI.isEmpty()) {
                                map3 = map7;
                            } else {
                                C1940y1.a aVarR = c1940y1.r();
                                aVarR.h();
                                C1940y1.A((C1940y1) aVarR.f25531c);
                                aVarR.h();
                                C1940y1.z((C1940y1) aVarR.f25531c, listI);
                                List listI2 = q().I((S2) c1940y1.N(), list4);
                                aVarR.h();
                                C1940y1.x((C1940y1) aVarR.f25531c);
                                aVarR.h();
                                C1940y1.w((C1940y1) aVarR.f25531c, listI2);
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it4 = c1940y1.K().iterator();
                                while (it4.hasNext()) {
                                    Iterator it5 = it4;
                                    C1899s1 c1899s1 = (C1899s1) it4.next();
                                    String str15 = str10;
                                    if (!list4.contains(Integer.valueOf(c1899s1.v()))) {
                                        arrayList4.add(c1899s1);
                                    }
                                    it4 = it5;
                                    str10 = str15;
                                }
                                str7 = str10;
                                aVarR.h();
                                C1940y1.C((C1940y1) aVarR.f25531c);
                                aVarR.h();
                                C1940y1.D((C1940y1) aVarR.f25531c, arrayList4);
                                ArrayList arrayList5 = new ArrayList();
                                for (C1946z1 c1946z1 : c1940y1.M()) {
                                    if (!list4.contains(Integer.valueOf(c1946z1.z()))) {
                                        arrayList5.add(c1946z1);
                                    }
                                }
                                aVarR.h();
                                C1940y1.F((C1940y1) aVarR.f25531c);
                                aVarR.h();
                                C1940y1.G((C1940y1) aVarR.f25531c, arrayList5);
                                c0873a5.put(num, (C1940y1) aVarR.f());
                                map4 = map7;
                                it3 = it3;
                                map3 = map4;
                                str10 = str7;
                            }
                        }
                    }
                }
                str5 = str10;
                map2 = c0873a5;
            } else {
                str5 = "audience_id";
                map2 = map;
            }
            for (Integer num2 : hashSet) {
                num2.getClass();
                C1940y1 c1940y2 = (C1940y1) map2.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C0873a c0873a6 = new C0873a();
                if (c1940y2 != null && c1940y2.v() != 0) {
                    for (C1899s1 c1899s2 : c1940y2.K()) {
                        if (c1899s2.C()) {
                            c0873a6.put(Integer.valueOf(c1899s2.v()), c1899s2.B() ? Long.valueOf(c1899s2.y()) : null);
                        }
                    }
                }
                C0873a c0873a7 = new C0873a();
                if (c1940y2 != null && c1940y2.B() != 0) {
                    for (Iterator it6 = c1940y2.M().iterator(); it6.hasNext(); it6 = it6) {
                        C1946z1 c1946z2 = (C1946z1) it6.next();
                        if (c1946z2.D() && c1946z2.v() > 0) {
                            c0873a7.put(Integer.valueOf(c1946z2.z()), Long.valueOf(c1946z2.w(c1946z2.v() - 1)));
                        }
                        map2 = map2;
                    }
                }
                Map map8 = map2;
                if (c1940y2 != null) {
                    int i16 = 0;
                    while (i16 < (c1940y2.E() << 6)) {
                        if (i.Z((S2) c1940y2.N(), i16)) {
                            str6 = str8;
                            d().f41719n.a(num2, Integer.valueOf(i16), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i16);
                            if (i.Z((S2) c1940y2.L(), i16)) {
                                bitSet.set(i16);
                            }
                            i16++;
                            str8 = str6;
                        } else {
                            str6 = str8;
                        }
                        c0873a6.remove(Integer.valueOf(i16));
                        i16++;
                        str8 = str6;
                    }
                }
                String str16 = str8;
                C1940y1 c1940y3 = (C1940y1) map.get(num2);
                if (zB2 && zB && (list3 = (List) map6.get(num2)) != null && this.f41739h != null && this.f41738g != null) {
                    for (Z0 z13 : list3) {
                        int iZ = z13.z();
                        long jLongValue = this.f41739h.longValue() / 1000;
                        if (z13.G()) {
                            jLongValue = this.f41738g.longValue() / 1000;
                        }
                        if (c0873a6.containsKey(Integer.valueOf(iZ))) {
                            c0873a6.put(Integer.valueOf(iZ), Long.valueOf(jLongValue));
                        }
                        if (c0873a7.containsKey(Integer.valueOf(iZ))) {
                            c0873a7.put(Integer.valueOf(iZ), Long.valueOf(jLongValue));
                        }
                    }
                }
                this.f41737f.put(num2, new E3(this, this.f41735d, c1940y3, bitSet, bitSet2, c0873a6, c0873a7));
                str8 = str16;
                map2 = map8;
                map6 = map6;
            }
            str4 = str8;
            str3 = str5;
        }
        String str17 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            G3 g11 = new G3(this);
            C0873a c0873a8 = new C0873a();
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                C1906t1 c1906t1 = (C1906t1) it7.next();
                C1906t1 c1906t1A = g11.a(c1906t1, this.f41735d);
                if (c1906t1A != null) {
                    C2529k c2529kR5 = r();
                    String str18 = this.f41735d;
                    String strK = c1906t1A.K();
                    C2572v c2572vF0 = c2529kR5.f0(str18, c1906t1.K());
                    if (c2572vF0 == null) {
                        c2529kR5.d().f41715i.a(B0.v(str18), ((C2523i1) c2529kR5.f3968a).f42223m.b(strK), "Event aggregate wasn't created during raw event logging. appId, event");
                        c2572v = new C2572v(str18, c1906t1.K(), 1L, 1L, 1L, c1906t1.H(), 0L, null, null, null, null);
                    } else {
                        c2572v = new C2572v(c2572vF0.f42483a, c2572vF0.f42484b, c2572vF0.f42485c + 1, c2572vF0.f42486d + 1, c2572vF0.f42487e + 1, c2572vF0.f42488f, c2572vF0.f42489g, c2572vF0.f42490h, c2572vF0.f42491i, c2572vF0.j, c2572vF0.f42492k);
                    }
                    r().R(c2572v);
                    String strK2 = c1906t1A.K();
                    Map<Integer, List<Z0>> mapI0 = (Map) c0873a8.get(strK2);
                    if (mapI0 == null) {
                        mapI0 = r().i0(this.f41735d, strK2);
                        c0873a8.put(strK2, mapI0);
                    }
                    Iterator<Integer> it8 = mapI0.keySet().iterator();
                    while (it8.hasNext()) {
                        Integer next = it8.next();
                        int iIntValue = next.intValue();
                        if (this.f41736e.contains(next)) {
                            d().f41719n.b(next, "Skipping failed audience ID");
                        } else {
                            Iterator<Z0> it9 = mapI0.get(next).iterator();
                            boolean zH = true;
                            while (true) {
                                if (!it9.hasNext()) {
                                    g10 = g11;
                                    c0873a = c0873a8;
                                    it = it7;
                                    it8 = it8;
                                    break;
                                }
                                Z0 next2 = it9.next();
                                g10 = g11;
                                H3 h8 = new H3(this, this.f41735d, iIntValue, next2);
                                Long l12 = this.f41738g;
                                c0873a = c0873a8;
                                Long l13 = this.f41739h;
                                int iZ2 = next2.z();
                                it = it7;
                                E3 e19 = (E3) this.f41737f.get(next);
                                zH = h8.h(l12, l13, c1906t1A, c2572v.f42485c, c2572v, e19 == null ? false : e19.f41766d.get(iZ2));
                                if (!zH) {
                                    this.f41736e.add(next);
                                    break;
                                }
                                y(next).a(h8);
                                it7 = it;
                                g11 = g10;
                                c0873a8 = c0873a;
                                it8 = it8;
                            }
                            if (!zH) {
                                this.f41736e.add(next);
                            }
                            it7 = it;
                            g11 = g10;
                            c0873a8 = c0873a;
                            it8 = it8;
                        }
                    }
                }
            }
        }
        if (!list2.isEmpty()) {
            C0873a c0873a9 = new C0873a();
            Iterator it10 = list2.iterator();
            while (it10.hasNext()) {
                A1 a10 = (A1) it10.next();
                String strJ = a10.J();
                Map<Integer, List<C1781b1>> mapJ0 = (Map) c0873a9.get(strJ);
                if (mapJ0 == null) {
                    mapJ0 = r().j0(this.f41735d, strJ);
                    c0873a9.put(strJ, mapJ0);
                }
                for (Integer num3 : mapJ0.keySet()) {
                    int iIntValue2 = num3.intValue();
                    if (this.f41736e.contains(num3)) {
                        d().f41719n.b(num3, str17);
                        break;
                    }
                    Iterator<C1781b1> it11 = mapJ0.get(num3).iterator();
                    boolean zH2 = true;
                    while (true) {
                        if (!it11.hasNext()) {
                            c0873a9 = c0873a9;
                            str17 = str17;
                            it10 = it10;
                            break;
                        }
                        C1781b1 next3 = it11.next();
                        if (d().y(2)) {
                            d().f41719n.d("Evaluating filter. audience, filter, property", num3, next3.E() ? Integer.valueOf(next3.v()) : null, c2523i1.f42223m.g(next3.A()));
                            B0 b0D = d();
                            i iVarQ = q();
                            StringBuilder sbE = b.e("\nproperty_filter {\n");
                            if (next3.E()) {
                                i12 = 0;
                                i.W(sbE, 0, "filter_id", Integer.valueOf(next3.v()));
                            } else {
                                i12 = 0;
                            }
                            i.W(sbE, i12, "property_name", ((C2523i1) iVarQ.f3968a).f42223m.g(next3.A()));
                            String strF = i.F(next3.B(), next3.C(), next3.D());
                            if (strF.isEmpty()) {
                                z11 = false;
                            } else {
                                z11 = false;
                                i.W(sbE, 0, "filter_type", strF);
                            }
                            iVarQ.T(sbE, 1, next3.x());
                            sbE.append("}\n");
                            b0D.f41719n.b(sbE.toString(), "Filter definition");
                        } else {
                            str17 = str17;
                            it10 = it10;
                            z11 = false;
                        }
                        if (!next3.E() || next3.v() > 256) {
                            d().f41715i.a(B0.v(this.f41735d), String.valueOf(next3.E() ? Integer.valueOf(next3.v()) : null), "Invalid property filter ID. appId, id");
                            zH2 = z11;
                            break;
                        }
                        C2486b c2486b = new C2486b(this, this.f41735d, iIntValue2, next3);
                        Long l14 = this.f41738g;
                        Long l15 = this.f41739h;
                        int iV = next3.v();
                        E3 e20 = (E3) this.f41737f.get(num3);
                        zH2 = c2486b.h(l14, l15, a10, e20 == null ? z11 : e20.f41766d.get(iV));
                        if (!zH2) {
                            this.f41736e.add(num3);
                            break;
                        }
                        y(num3).a(c2486b);
                        c0873a9 = c0873a9;
                        it10 = it10;
                        str17 = str17;
                    }
                    if (!zH2) {
                        this.f41736e.add(num3);
                    }
                    c0873a9 = c0873a9;
                    it10 = it10;
                    str17 = str17;
                }
            }
        }
        ArrayList arrayList6 = new ArrayList();
        C0873a.c<Integer> cVar = (C0873a.c) this.f41737f.keySet();
        cVar.removeAll(this.f41736e);
        for (Integer num4 : cVar) {
            int iIntValue3 = num4.intValue();
            E3 e21 = (E3) this.f41737f.get(num4);
            C0804l.h(e21);
            C1892r1.a aVarZ = C1892r1.z();
            aVarZ.h();
            C1892r1.w((C1892r1) aVarZ.f25531c, iIntValue3);
            aVarZ.h();
            C1892r1.y((C1892r1) aVarZ.f25531c, e21.f41764b);
            C1940y1 c1940y4 = e21.f41765c;
            if (c1940y4 != null) {
                aVarZ.h();
                C1892r1.A((C1892r1) aVarZ.f25531c, c1940y4);
            }
            C1940y1.a aVarH = C1940y1.H();
            ArrayList arrayListG = i.G(e21.f41766d);
            aVarH.h();
            C1940y1.z((C1940y1) aVarH.f25531c, arrayListG);
            ArrayList arrayListG2 = i.G(e21.f41767e);
            aVarH.h();
            C1940y1.w((C1940y1) aVarH.f25531c, arrayListG2);
            C0873a c0873a10 = e21.f41768f;
            if (c0873a10 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(c0873a10.f9139d);
                for (Integer num5 : (C0873a.c) c0873a10.keySet()) {
                    int iIntValue4 = num5.intValue();
                    Long l16 = (Long) c0873a10.get(num5);
                    if (l16 != null) {
                        C1899s1.a aVarZ2 = C1899s1.z();
                        aVarZ2.h();
                        C1899s1.w((C1899s1) aVarZ2.f25531c, iIntValue4);
                        long jLongValue2 = l16.longValue();
                        aVarZ2.h();
                        C1899s1.x((C1899s1) aVarZ2.f25531c, jLongValue2);
                        arrayList.add((C1899s1) aVarZ2.f());
                    }
                }
            }
            if (arrayList != null) {
                aVarH.h();
                C1940y1.D((C1940y1) aVarH.f25531c, arrayList);
            }
            C0873a c0873a11 = e21.f41769g;
            if (c0873a11 == null) {
                listEmptyList = Collections.emptyList();
            } else {
                ArrayList arrayList7 = new ArrayList(c0873a11.f9139d);
                Iterator it12 = ((C0873a.c) c0873a11.keySet()).iterator();
                while (true) {
                    AbstractC0878f abstractC0878f = (AbstractC0878f) it12;
                    if (!abstractC0878f.hasNext()) {
                        break;
                    }
                    Integer num6 = (Integer) abstractC0878f.next();
                    C1946z1.a aVarA = C1946z1.A();
                    int iIntValue5 = num6.intValue();
                    aVarA.h();
                    C1946z1.x((C1946z1) aVarA.f25531c, iIntValue5);
                    List list5 = (List) c0873a11.get(num6);
                    if (list5 != null) {
                        Collections.sort(list5);
                        aVarA.h();
                        C1946z1.y((C1946z1) aVarA.f25531c, list5);
                    }
                    arrayList7.add((C1946z1) aVarA.f());
                }
                listEmptyList = arrayList7;
            }
            aVarH.h();
            C1940y1.G((C1940y1) aVarH.f25531c, listEmptyList);
            aVarZ.h();
            C1892r1.x((C1892r1) aVarZ.f25531c, (C1940y1) aVarH.f());
            C1892r1 c1892r1 = (C1892r1) aVarZ.f();
            arrayList6.add(c1892r1);
            C2529k c2529kR6 = r();
            String str19 = this.f41735d;
            C1940y1 c1940y1C = c1892r1.C();
            c2529kR6.t();
            c2529kR6.p();
            C0804l.e(str19);
            C0804l.h(c1940y1C);
            byte[] bArrI = c1940y1C.i();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str19);
            contentValues2.put(str3, num4);
            String str20 = str4;
            contentValues2.put(str20, bArrI);
            try {
                try {
                    if (c2529kR6.w().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                        c2529kR6.d().f41712f.b(B0.v(str19), "Failed to insert filter results (got -1). appId");
                    }
                } catch (SQLiteException e22) {
                    e = e22;
                    c2529kR6.d().f41712f.a(B0.v(str19), e, "Error storing filter results. appId");
                }
            } catch (SQLiteException e23) {
                e = e23;
            }
            str4 = str20;
        }
        return arrayList6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final E3 y(Integer num) {
        if (this.f41737f.containsKey(num)) {
            return (E3) this.f41737f.get(num);
        }
        E3 e10 = new E3(this, this.f41735d);
        this.f41737f.put(num, e10);
        return e10;
    }
}
