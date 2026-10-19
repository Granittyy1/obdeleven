package com.google.android.gms.measurement.internal;

import U4.C0804l;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C1774a1;
import com.google.android.gms.internal.measurement.C1800e;
import com.google.android.gms.internal.measurement.C1810f2;
import com.google.android.gms.internal.measurement.C1823h1;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.C1886q1;
import com.google.android.gms.internal.measurement.C1892r1;
import com.google.android.gms.internal.measurement.C1895r4;
import com.google.android.gms.internal.measurement.C1899s1;
import com.google.android.gms.internal.measurement.C1906t1;
import com.google.android.gms.internal.measurement.C1920v1;
import com.google.android.gms.internal.measurement.C1924v5;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.C1934x1;
import com.google.android.gms.internal.measurement.C1940y1;
import com.google.android.gms.internal.measurement.C1946z1;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.InterfaceC1916u4;
import com.google.android.gms.internal.measurement.M2;
import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.V2;
import com.google.android.gms.internal.measurement.zzfh$zzd;
import com.google.android.gms.internal.measurement.zzfh$zzf;
import com.google.android.gms.internal.measurement.zzft$zzi;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p131k5.A;
import p131k5.B;
import p131k5.C2501e;
import p131k5.C2523i1;
import p131k5.C2550p0;
import p131k5.C2557r0;
import p131k5.C2560s;
import p131k5.C2568u;
import p131k5.C2588z;
import p131k5.F;
import p131k5.P;
import p131k5.Y;
import p131k5.j3;
import p131k5.m3;
import p131k5.z3;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends m3 {
    public static Bundle A(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(A((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static C1920v1 C(C1906t1 c1906t1, String str) {
        for (C1920v1 c1920v1 : c1906t1.L()) {
            if (c1920v1.L().equals(str)) {
                return c1920v1;
            }
        }
        return null;
    }

    public static N2.a D(N2.a aVar, byte[] bArr) throws zzkb {
        D2 d2A;
        D2 d10 = D2.f25420b;
        if (d10 == null) {
            synchronized (D2.class) {
                try {
                    d2A = D2.f25420b;
                    if (d2A == null) {
                        d2A = M2.a();
                        D2.f25420b = d2A;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            d10 = d2A;
        }
        if (d10 != null) {
            aVar.getClass();
            aVar.i(bArr, bArr.length, d10);
            return aVar;
        }
        aVar.getClass();
        aVar.i(bArr, bArr.length, D2.f25421c);
        return aVar;
    }

    public static String F(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static ArrayList G(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static HashMap H(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(H((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(H((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(H((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static C2588z J(C1800e c1800e) {
        Object obj;
        Bundle bundleA = A(c1800e.f25683c, true);
        String string = (!bundleA.containsKey("_o") || (obj = bundleA.get("_o")) == null) ? "app" : obj.toString();
        String strB = Y.b(c1800e.f25681a, P.f41945e, P.f41947g);
        if (strB == null) {
            strB = c1800e.f25681a;
        }
        return new C2588z(strB, new C2568u(bundleA), string, c1800e.f25682b);
    }

    public static void M(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static void N(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void O(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                N(builder, str3, string, set);
            }
        }
    }

    public static void P(C1906t1.a aVar, String str, Long l10) {
        List<C1920v1> listR = aVar.r();
        int i10 = 0;
        while (true) {
            if (i10 >= listR.size()) {
                i10 = -1;
                break;
            } else if (str.equals(listR.get(i10).L())) {
                break;
            } else {
                i10++;
            }
        }
        C1920v1.a aVarJ = C1920v1.J();
        aVarJ.l(str);
        if (l10 != null) {
            aVarJ.j(l10.longValue());
        }
        if (i10 < 0) {
            aVar.j(aVarJ);
        } else {
            aVar.h();
            C1906t1.A((C1906t1) aVar.f25531c, i10, (C1920v1) aVarJ.f());
        }
    }

    public static void V(StringBuilder sb2, int i10, String str, zzfh$zzd zzfh_zzd) {
        if (zzfh_zzd == null) {
            return;
        }
        M(i10, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzfh_zzd.B()) {
            W(sb2, i10, "comparison_type", zzfh_zzd.v().name());
        }
        if (zzfh_zzd.D()) {
            W(sb2, i10, "match_as_float", Boolean.valueOf(zzfh_zzd.A()));
        }
        if (zzfh_zzd.C()) {
            W(sb2, i10, "comparison_value", zzfh_zzd.x());
        }
        if (zzfh_zzd.F()) {
            W(sb2, i10, "min_comparison_value", zzfh_zzd.z());
        }
        if (zzfh_zzd.E()) {
            W(sb2, i10, "max_comparison_value", zzfh_zzd.y());
        }
        M(i10, sb2);
        sb2.append("}\n");
    }

    public static void W(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        M(i10 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static void X(StringBuilder sb2, String str, C1940y1 c1940y1) {
        if (c1940y1 == null) {
            return;
        }
        M(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (c1940y1.y() != 0) {
            M(4, sb2);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l10 : c1940y1.L()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (c1940y1.E() != 0) {
            M(4, sb2);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l11 : c1940y1.N()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (c1940y1.v() != 0) {
            M(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (C1899s1 c1899s1 : c1940y1.K()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c1899s1.C() ? Integer.valueOf(c1899s1.v()) : null);
                sb2.append(":");
                sb2.append(c1899s1.B() ? Long.valueOf(c1899s1.y()) : null);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (c1940y1.B() != 0) {
            M(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (C1946z1 c1946z1 : c1940y1.M()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c1946z1.D() ? Integer.valueOf(c1946z1.z()) : null);
                sb2.append(": [");
                Iterator<Long> it = c1946z1.C().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i18 = i19;
                }
                sb2.append("]");
                i16 = i17;
            }
            sb2.append("}\n");
        }
        M(3, sb2);
        sb2.append("}\n");
    }

    public static boolean Z(S2 s10, int i10) {
        if (i10 < (s10.size() << 6)) {
            return ((1 << (i10 % 64)) & s10.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    public static Bundle a0(List<C1920v1> list) {
        Bundle bundle = new Bundle();
        for (C1920v1 c1920v1 : list) {
            String strL = c1920v1.L();
            if (c1920v1.O()) {
                bundle.putString(strL, String.valueOf(c1920v1.v()));
            } else if (c1920v1.P()) {
                bundle.putString(strL, String.valueOf(c1920v1.C()));
            } else if (c1920v1.S()) {
                bundle.putString(strL, c1920v1.M());
            } else if (c1920v1.Q()) {
                bundle.putString(strL, String.valueOf(c1920v1.H()));
            }
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable b0(C1906t1 c1906t1, String str) {
        C1920v1 c1920v1C = C(c1906t1, str);
        if (c1920v1C == null) {
            return null;
        }
        if (c1920v1C.S()) {
            return c1920v1C.M();
        }
        if (c1920v1C.Q()) {
            return Long.valueOf(c1920v1C.H());
        }
        if (c1920v1C.O()) {
            return Double.valueOf(c1920v1C.v());
        }
        if (c1920v1C.F() <= 0) {
            return null;
        }
        List<C1920v1> listN = c1920v1C.N();
        ArrayList arrayList = new ArrayList();
        for (C1920v1 c1920v1 : listN) {
            if (c1920v1 != null) {
                Bundle bundle = new Bundle();
                for (C1920v1 c1920v2 : c1920v1.N()) {
                    if (c1920v2.S()) {
                        bundle.putString(c1920v2.L(), c1920v2.M());
                    } else if (c1920v2.Q()) {
                        bundle.putLong(c1920v2.L(), c1920v2.H());
                    } else if (c1920v2.O()) {
                        bundle.putDouble(c1920v2.L(), c1920v2.v());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean c0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle e0(List<A1> list) {
        Bundle bundle = new Bundle();
        for (A1 a10 : list) {
            String strJ = a10.J();
            if (a10.L()) {
                bundle.putString(strJ, String.valueOf(a10.v()));
            } else if (a10.M()) {
                bundle.putString(strJ, String.valueOf(a10.A()));
            } else if (a10.P()) {
                bundle.putString(strJ, a10.K());
            } else if (a10.N()) {
                bundle.putString(strJ, String.valueOf(a10.E()));
            }
        }
        return bundle;
    }

    public static int w(C1934x1.a aVar, String str) {
        for (int i10 = 0; i10 < ((C1934x1) aVar.f25531c).n1(); i10++) {
            if (str.equals(((C1934x1) aVar.f25531c).i0(i10).J())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle z(List<C1920v1> list) {
        Bundle bundle = new Bundle();
        for (C1920v1 c1920v1 : list) {
            String strL = c1920v1.L();
            if (c1920v1.O()) {
                bundle.putDouble(strL, c1920v1.v());
            } else if (c1920v1.P()) {
                bundle.putFloat(strL, c1920v1.C());
            } else if (c1920v1.S()) {
                bundle.putString(strL, c1920v1.M());
            } else if (c1920v1.Q()) {
                bundle.putLong(strL, c1920v1.H());
            }
        }
        return bundle;
    }

    public final <T extends Parcelable> T B(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            d().f41712f.c("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String E(zzft$zzi zzft_zzi) {
        C1886q1 c1886q1Y1;
        StringBuilder sbE = C4.b.e("\nbatch {\n");
        for (C1934x1 c1934x1 : zzft_zzi.B()) {
            if (c1934x1 != null) {
                M(1, sbE);
                sbE.append("bundle {\n");
                if (c1934x1.z0()) {
                    W(sbE, 1, "protocol_version", Integer.valueOf(c1934x1.X0()));
                }
                C1924v5.a();
                C2523i1 c2523i1 = (C2523i1) this.f3968a;
                if (c2523i1.f42218g.B(c1934x1.c2(), B.f41695s0) && c1934x1.C0()) {
                    W(sbE, 1, "session_stitching_token", c1934x1.T());
                }
                W(sbE, 1, "platform", c1934x1.R());
                if (c1934x1.u0()) {
                    W(sbE, 1, "gmp_version", Long.valueOf(c1934x1.J1()));
                }
                if (c1934x1.H0()) {
                    W(sbE, 1, "uploading_gmp_version", Long.valueOf(c1934x1.W1()));
                }
                if (c1934x1.s0()) {
                    W(sbE, 1, "dynamite_version", Long.valueOf(c1934x1.B1()));
                }
                if (c1934x1.f0()) {
                    W(sbE, 1, "config_version", Long.valueOf(c1934x1.s1()));
                }
                W(sbE, 1, "gmp_app_id", c1934x1.P());
                W(sbE, 1, "admob_app_id", c1934x1.b2());
                W(sbE, 1, "app_id", c1934x1.c2());
                W(sbE, 1, "app_version", c1934x1.I());
                if (c1934x1.c0()) {
                    W(sbE, 1, "app_version_major", Integer.valueOf(c1934x1.h0()));
                }
                W(sbE, 1, "firebase_instance_id", c1934x1.O());
                if (c1934x1.r0()) {
                    W(sbE, 1, "dev_cert_hash", Long.valueOf(c1934x1.x1()));
                }
                W(sbE, 1, "app_store", c1934x1.e2());
                if (c1934x1.G0()) {
                    W(sbE, 1, "upload_timestamp_millis", Long.valueOf(c1934x1.U1()));
                }
                if (c1934x1.D0()) {
                    W(sbE, 1, "start_timestamp_millis", Long.valueOf(c1934x1.Q1()));
                }
                if (c1934x1.t0()) {
                    W(sbE, 1, "end_timestamp_millis", Long.valueOf(c1934x1.F1()));
                }
                if (c1934x1.y0()) {
                    W(sbE, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1934x1.O1()));
                }
                if (c1934x1.x0()) {
                    W(sbE, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1934x1.M1()));
                }
                W(sbE, 1, "app_instance_id", c1934x1.d2());
                W(sbE, 1, "resettable_device_id", c1934x1.S());
                W(sbE, 1, "ds_id", c1934x1.N());
                if (c1934x1.w0()) {
                    W(sbE, 1, "limited_ad_tracking", Boolean.valueOf(c1934x1.a0()));
                }
                W(sbE, 1, "os_version", c1934x1.v());
                W(sbE, 1, "device_model", c1934x1.M());
                W(sbE, 1, "user_default_language", c1934x1.U());
                if (c1934x1.F0()) {
                    W(sbE, 1, "time_zone_offset_minutes", Integer.valueOf(c1934x1.i1()));
                }
                if (c1934x1.e0()) {
                    W(sbE, 1, "bundle_sequential_index", Integer.valueOf(c1934x1.I0()));
                }
                if (c1934x1.B0()) {
                    W(sbE, 1, "service_upload", Boolean.valueOf(c1934x1.b0()));
                }
                W(sbE, 1, "health_monitor", c1934x1.Q());
                if (c1934x1.A0()) {
                    W(sbE, 1, "retry_counter", Integer.valueOf(c1934x1.d1()));
                }
                if (c1934x1.p0()) {
                    W(sbE, 1, "consent_signals", c1934x1.K());
                }
                if (c1934x1.v0()) {
                    W(sbE, 1, "is_dma_region", Boolean.valueOf(c1934x1.Z()));
                }
                if (c1934x1.q0()) {
                    W(sbE, 1, "core_platform_services", c1934x1.L());
                }
                if (c1934x1.g0()) {
                    W(sbE, 1, "consent_diagnostics", c1934x1.J());
                }
                if (c1934x1.E0()) {
                    W(sbE, 1, "target_os_version", Long.valueOf(c1934x1.S1()));
                }
                C1834i5.a();
                if (c2523i1.f42218g.B(c1934x1.c2(), B.f41614E0)) {
                    W(sbE, 1, "ad_services_version", Integer.valueOf(c1934x1.w()));
                    if (c1934x1.d0() && (c1886q1Y1 = c1934x1.Y1()) != null) {
                        M(2, sbE);
                        sbE.append("attribution_eligibility_status {\n");
                        W(sbE, 2, "eligible", Boolean.valueOf(c1886q1Y1.G()));
                        W(sbE, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c1886q1Y1.J()));
                        W(sbE, 2, "pre_r", Boolean.valueOf(c1886q1Y1.K()));
                        W(sbE, 2, "r_extensions_too_old", Boolean.valueOf(c1886q1Y1.L()));
                        W(sbE, 2, "adservices_extension_too_old", Boolean.valueOf(c1886q1Y1.E()));
                        W(sbE, 2, "ad_storage_not_allowed", Boolean.valueOf(c1886q1Y1.C()));
                        W(sbE, 2, "measurement_manager_disabled", Boolean.valueOf(c1886q1Y1.I()));
                        M(2, sbE);
                        sbE.append("}\n");
                    }
                }
                V2<A1> v2X = c1934x1.X();
                if (v2X != null) {
                    for (A1 a10 : v2X) {
                        if (a10 != null) {
                            M(2, sbE);
                            sbE.append("user_property {\n");
                            W(sbE, 2, "set_timestamp_millis", a10.O() ? Long.valueOf(a10.G()) : null);
                            W(sbE, 2, "name", c2523i1.f42223m.g(a10.J()));
                            W(sbE, 2, "string_value", a10.K());
                            W(sbE, 2, "int_value", a10.N() ? Long.valueOf(a10.E()) : null);
                            W(sbE, 2, "double_value", a10.L() ? Double.valueOf(a10.v()) : null);
                            M(2, sbE);
                            sbE.append("}\n");
                        }
                    }
                }
                V2<C1892r1> v2V = c1934x1.V();
                if (v2V != null) {
                    for (C1892r1 c1892r1 : v2V) {
                        if (c1892r1 != null) {
                            M(2, sbE);
                            sbE.append("audience_membership {\n");
                            if (c1892r1.F()) {
                                W(sbE, 2, "audience_id", Integer.valueOf(c1892r1.v()));
                            }
                            if (c1892r1.G()) {
                                W(sbE, 2, "new_audience", Boolean.valueOf(c1892r1.E()));
                            }
                            X(sbE, "current_data", c1892r1.C());
                            if (c1892r1.H()) {
                                X(sbE, "previous_data", c1892r1.D());
                            }
                            M(2, sbE);
                            sbE.append("}\n");
                        }
                    }
                }
                V2<C1906t1> v2W = c1934x1.W();
                if (v2W != null) {
                    for (C1906t1 c1906t1 : v2W) {
                        if (c1906t1 != null) {
                            M(2, sbE);
                            sbE.append("event {\n");
                            W(sbE, 2, "name", c2523i1.f42223m.b(c1906t1.K()));
                            if (c1906t1.O()) {
                                W(sbE, 2, "timestamp_millis", Long.valueOf(c1906t1.H()));
                            }
                            if (c1906t1.N()) {
                                W(sbE, 2, "previous_timestamp_millis", Long.valueOf(c1906t1.G()));
                            }
                            if (c1906t1.M()) {
                                W(sbE, 2, "count", Integer.valueOf(c1906t1.v()));
                            }
                            if (c1906t1.E() != 0) {
                                U(sbE, 2, c1906t1.L());
                            }
                            M(2, sbE);
                            sbE.append("}\n");
                        }
                    }
                }
                M(1, sbE);
                sbE.append("}\n");
            }
        }
        sbE.append("}\n");
        return sbE.toString();
    }

    public final List I(S2 s10, List list) {
        int i10;
        ArrayList arrayList = new ArrayList(s10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                d().f41715i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    d().f41715i.a(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final j3 K(String str, C1934x1.a aVar, C1906t1.a aVar2, String str2) {
        int iIndexOf;
        C1834i5.a();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (!c2523i1.f42218g.B(str, B.f41614E0)) {
            return null;
        }
        c2523i1.f42224n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2557r0<String> c2557r0 = B.f41668e0;
        C2501e c2501e = c2523i1.f42218g;
        Set setB = F.b(c2501e.w(str, c2557r0).split(","));
        Uri.Builder builderT = this.f42311b.j.t(str);
        N(builderT, "gmp_app_id", ((C1934x1) aVar.f25531c).P(), setB);
        N(builderT, "gmp_version", "87000", setB);
        String strD2 = ((C1934x1) aVar.f25531c).d2();
        C2557r0<Boolean> c2557r1 = B.f41620H0;
        String str3 = "";
        if (c2501e.B(str, c2557r1) && s().M(str)) {
            strD2 = "";
        }
        N(builderT, "app_instance_id", strD2, setB);
        N(builderT, "rdid", ((C1934x1) aVar.f25531c).S(), setB);
        N(builderT, "bundle_id", aVar.c0(), setB);
        String strQ = aVar2.q();
        String strB = Y.b(strQ, P.f41947g, P.f41945e);
        if (!TextUtils.isEmpty(strB)) {
            strQ = strB;
        }
        N(builderT, "app_event_name", strQ, setB);
        N(builderT, "app_version", String.valueOf(((C1934x1) aVar.f25531c).h0()), setB);
        String strV = ((C1934x1) aVar.f25531c).v();
        if (!c2501e.B(str, c2557r1) || !s().N(str)) {
            str3 = strV;
        } else if (c2501e.B(str, B.f41702w0)) {
            if (!TextUtils.isEmpty(strV) && (iIndexOf = strV.indexOf(".")) != -1) {
                strV = strV.substring(0, iIndexOf);
            }
            str3 = strV;
        }
        N(builderT, "os_version", str3, setB);
        N(builderT, "timestamp", String.valueOf(aVar2.p()), setB);
        if (((C1934x1) aVar.f25531c).a0()) {
            N(builderT, "lat", "1", setB);
        }
        N(builderT, "privacy_sandbox_version", String.valueOf(((C1934x1) aVar.f25531c).w()), setB);
        N(builderT, "trigger_uri_source", "1", setB);
        N(builderT, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setB);
        N(builderT, "request_uuid", str2, setB);
        O(builderT, c2501e.w(str, B.f41666d0).split("\\|"), a0(aVar2.r()), setB);
        O(builderT, c2501e.w(str, B.f41664c0).split("\\|"), e0(Collections.unmodifiableList(((C1934x1) aVar.f25531c).X())), setB);
        if (c2501e.B(null, B.f41630M0)) {
            N(builderT, "dma", ((C1934x1) aVar.f25531c).Z() ? "1" : "0", setB);
            if (!((C1934x1) aVar.f25531c).L().isEmpty()) {
                N(builderT, "dma_cps", ((C1934x1) aVar.f25531c).L(), setB);
            }
        }
        return new j3(1, jCurrentTimeMillis, builderT.build().toString());
    }

    public final j3 L(String str, C1934x1 c1934x1, C1906t1.a aVar, String str2) {
        int iIndexOf;
        C1834i5.a();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (!c2523i1.f42218g.B(str, B.f41614E0)) {
            return null;
        }
        c2523i1.f42224n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2557r0<String> c2557r0 = B.f41668e0;
        C2501e c2501e = c2523i1.f42218g;
        Set setB = F.b(c2501e.w(str, c2557r0).split(","));
        Uri.Builder builderT = this.f42311b.j.t(str);
        N(builderT, "gmp_app_id", c1934x1.P(), setB);
        N(builderT, "gmp_version", "87000", setB);
        String strD2 = c1934x1.d2();
        C2557r0<Boolean> c2557r1 = B.f41620H0;
        String str3 = "";
        if (c2501e.B(str, c2557r1) && s().M(str)) {
            strD2 = "";
        }
        N(builderT, "app_instance_id", strD2, setB);
        N(builderT, "rdid", c1934x1.S(), setB);
        N(builderT, "bundle_id", c1934x1.c2(), setB);
        String strQ = aVar.q();
        String strB = Y.b(strQ, P.f41947g, P.f41945e);
        if (!TextUtils.isEmpty(strB)) {
            strQ = strB;
        }
        N(builderT, "app_event_name", strQ, setB);
        N(builderT, "app_version", String.valueOf(c1934x1.h0()), setB);
        String strV = c1934x1.v();
        if (!c2501e.B(str, c2557r1) || !s().N(str)) {
            str3 = strV;
        } else if (c2501e.B(str, B.f41702w0)) {
            if (!TextUtils.isEmpty(strV) && (iIndexOf = strV.indexOf(".")) != -1) {
                strV = strV.substring(0, iIndexOf);
            }
            str3 = strV;
        }
        N(builderT, "os_version", str3, setB);
        N(builderT, "timestamp", String.valueOf(aVar.p()), setB);
        if (c1934x1.a0()) {
            N(builderT, "lat", "1", setB);
        }
        N(builderT, "privacy_sandbox_version", String.valueOf(c1934x1.w()), setB);
        N(builderT, "trigger_uri_source", "1", setB);
        N(builderT, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setB);
        N(builderT, "request_uuid", str2, setB);
        O(builderT, c2501e.w(str, B.f41666d0).split("\\|"), a0(aVar.r()), setB);
        O(builderT, c2501e.w(str, B.f41664c0).split("\\|"), e0(c1934x1.X()), setB);
        if (c2501e.B(null, B.f41630M0)) {
            N(builderT, "dma", c1934x1.Z() ? "1" : "0", setB);
            if (!c1934x1.L().isEmpty()) {
                N(builderT, "dma_cps", c1934x1.L(), setB);
            }
        }
        return new j3(1, jCurrentTimeMillis, builderT.build().toString());
    }

    public final void Q(C1920v1.a aVar, Object obj) {
        aVar.h();
        C1920v1.B((C1920v1) aVar.f25531c);
        aVar.h();
        C1920v1.D((C1920v1) aVar.f25531c);
        aVar.h();
        C1920v1.G((C1920v1) aVar.f25531c);
        aVar.h();
        C1920v1.I((C1920v1) aVar.f25531c);
        if (obj instanceof String) {
            aVar.m((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            aVar.h();
            C1920v1.w((C1920v1) aVar.f25531c, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            d().f41712f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C1920v1.a aVarJ = C1920v1.J();
                for (String str : bundle.keySet()) {
                    C1920v1.a aVarJ2 = C1920v1.J();
                    aVarJ2.l(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        aVarJ2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        aVarJ2.m((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        aVarJ2.h();
                        C1920v1.w((C1920v1) aVarJ2.f25531c, dDoubleValue2);
                    }
                    aVarJ.h();
                    C1920v1.y((C1920v1) aVarJ.f25531c, (C1920v1) aVarJ2.f());
                }
                if (((C1920v1) aVarJ.f25531c).F() > 0) {
                    arrayList.add((C1920v1) aVarJ.f());
                }
            }
        }
        aVar.h();
        C1920v1.A((C1920v1) aVar.f25531c, arrayList);
    }

    public final void R(C1934x1.a aVar) {
        d().f41719n.c("Checking account type status for ad personalization signals");
        if (f0(aVar.c0())) {
            d().f41718m.c("Turning off ad personalization due to account type");
            A1.a aVarH = A1.H();
            aVarH.h();
            A1.y((A1) aVarH.f25531c, "_npa");
            C2523i1 c2523i1 = (C2523i1) this.f3968a;
            C2560s c2560sN = c2523i1.n();
            c2560sN.p();
            long j = c2560sN.f42446g;
            aVarH.h();
            A1.x((A1) aVarH.f25531c, j);
            aVarH.h();
            A1.C((A1) aVarH.f25531c, 1L);
            A1 a10 = (A1) aVarH.f();
            int i10 = 0;
            while (true) {
                if (i10 >= ((C1934x1) aVar.f25531c).n1()) {
                    aVar.h();
                    C1934x1.E((C1934x1) aVar.f25531c, a10);
                    break;
                } else {
                    if ("_npa".equals(((C1934x1) aVar.f25531c).i0(i10).J())) {
                        aVar.h();
                        C1934x1.A((C1934x1) aVar.f25531c, i10, a10);
                        break;
                    }
                    i10++;
                }
            }
            C1930w4.a();
            if (c2523i1.f42218g.B(null, B.f41630M0)) {
                a aVarA = a.a(((C1934x1) aVar.f25531c).J());
                aVarA.c(zziq.zza.AD_PERSONALIZATION, zzai.CHILD_ACCOUNT);
                String string = aVarA.toString();
                aVar.h();
                C1934x1.h1((C1934x1) aVar.f25531c, string);
            }
        }
    }

    public final void S(A1.a aVar, Object obj) {
        C0804l.h(obj);
        aVar.h();
        A1.z((A1) aVar.f25531c);
        aVar.h();
        A1.B((A1) aVar.f25531c);
        aVar.h();
        A1.F((A1) aVar.f25531c);
        if (obj instanceof String) {
            aVar.h();
            A1.D((A1) aVar.f25531c, (String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            aVar.h();
            A1.C((A1) aVar.f25531c, jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                d().f41712f.b(obj, "Ignoring invalid (type) user attribute value");
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            aVar.h();
            A1.w((A1) aVar.f25531c, dDoubleValue);
        }
    }

    public final void T(StringBuilder sb2, int i10, C1774a1 c1774a1) {
        if (c1774a1 == null) {
            return;
        }
        M(i10, sb2);
        sb2.append("filter {\n");
        if (c1774a1.C()) {
            W(sb2, i10, "complement", Boolean.valueOf(c1774a1.B()));
        }
        if (c1774a1.E()) {
            W(sb2, i10, "param_name", ((C2523i1) this.f3968a).f42223m.f(c1774a1.A()));
        }
        if (c1774a1.F()) {
            int i11 = i10 + 1;
            zzfh$zzf zzfh_zzfZ = c1774a1.z();
            if (zzfh_zzfZ != null) {
                M(i11, sb2);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (zzfh_zzfZ.D()) {
                    W(sb2, i11, "match_type", zzfh_zzfZ.w().name());
                }
                if (zzfh_zzfZ.C()) {
                    W(sb2, i11, "expression", zzfh_zzfZ.y());
                }
                if (zzfh_zzfZ.B()) {
                    W(sb2, i11, "case_sensitive", Boolean.valueOf(zzfh_zzfZ.A()));
                }
                if (zzfh_zzfZ.v() > 0) {
                    M(i10 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str : zzfh_zzfZ.z()) {
                        M(i10 + 3, sb2);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                M(i11, sb2);
                sb2.append("}\n");
            }
        }
        if (c1774a1.D()) {
            V(sb2, i10 + 1, "number_filter", c1774a1.y());
        }
        M(i10, sb2);
        sb2.append("}\n");
    }

    public final void U(StringBuilder sb2, int i10, V2 v10) {
        if (v10 == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator<E> it = v10.iterator();
        while (it.hasNext()) {
            C1920v1 c1920v1 = (C1920v1) it.next();
            if (c1920v1 != null) {
                M(i11, sb2);
                sb2.append("param {\n");
                W(sb2, i11, "name", c1920v1.R() ? ((C2523i1) this.f3968a).f42223m.f(c1920v1.L()) : null);
                W(sb2, i11, "string_value", c1920v1.S() ? c1920v1.M() : null);
                W(sb2, i11, "int_value", c1920v1.Q() ? Long.valueOf(c1920v1.H()) : null);
                W(sb2, i11, "double_value", c1920v1.O() ? Double.valueOf(c1920v1.v()) : null);
                if (c1920v1.F() > 0) {
                    U(sb2, i11, (V2) c1920v1.N());
                }
                M(i11, sb2);
                sb2.append("}\n");
            }
        }
    }

    public final boolean Y(long j, long j10) {
        if (j == 0 || j10 <= 0) {
            return true;
        }
        ((C2523i1) this.f3968a).f42224n.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j10;
    }

    public final byte[] d0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            d().f41712f.b(e10, "Failed to gzip content");
            throw e10;
        }
    }

    public final boolean f0(String str) {
        boolean zBooleanValue;
        ((InterfaceC1916u4) C1895r4.f25830c.get()).getClass();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (c2523i1.f42218g.B(null, B.f41646U0)) {
            return false;
        }
        C0804l.h(str);
        C2550p0 c2550p0G0 = r().g0(str);
        if (c2550p0G0 == null) {
            return false;
        }
        C2560s c2560sN = c2523i1.n();
        c2560sN.p();
        C2523i1 c2523i2 = (C2523i1) c2560sN.f3968a;
        c2523i2.f42224n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c2560sN.f42446g > 86400000) {
            c2560sN.f42445f = null;
        }
        Boolean bool = c2560sN.f42445f;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = c2523i2.f42212a;
            if (p186p0.a.a(context, "android.permission.GET_ACCOUNTS") != 0) {
                c2560sN.d().j.c("Permission error checking for dasher/unicorn accounts");
                c2560sN.f42446g = jCurrentTimeMillis;
                c2560sN.f42445f = Boolean.FALSE;
            } else {
                if (c2560sN.f42444e == null) {
                    c2560sN.f42444e = AccountManager.get(context);
                }
                try {
                    Account[] result = c2560sN.f42444e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (result == null || result.length <= 0) {
                        Account[] result2 = c2560sN.f42444e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                        if (result2 != null && result2.length > 0) {
                            c2560sN.f42445f = Boolean.TRUE;
                            c2560sN.f42446g = jCurrentTimeMillis;
                        }
                        c2560sN.f42446g = jCurrentTimeMillis;
                        c2560sN.f42445f = Boolean.FALSE;
                    } else {
                        c2560sN.f42445f = Boolean.TRUE;
                        c2560sN.f42446g = jCurrentTimeMillis;
                    }
                    zBooleanValue = true;
                } catch (AuthenticatorException e10) {
                    e = e10;
                    c2560sN.d().f41713g.b(e, "Exception checking account types");
                } catch (OperationCanceledException e11) {
                    e = e11;
                    c2560sN.d().f41713g.b(e, "Exception checking account types");
                } catch (IOException e12) {
                    e = e12;
                    c2560sN.d().f41713g.b(e, "Exception checking account types");
                }
            }
            zBooleanValue = false;
        }
        if (zBooleanValue && c2550p0G0.l()) {
            d dVarS = s();
            dVarS.p();
            C1823h1 c1823h1I = dVarS.I(str);
            if (c1823h1I == null ? false : c1823h1I.M()) {
                return true;
            }
        }
        return false;
    }

    public final byte[] g0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i10 = gZIPInputStream.read(bArr2);
                if (i10 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i10);
            }
        } catch (IOException e10) {
            d().f41712f.b(e10, "Failed to ungzip content");
            throw e10;
        }
    }

    public final ArrayList h0() {
        Context context = this.f42311b.f26609l.f42212a;
        List<C2557r0<?>> list = B.f41657a;
        R1 r1A = R1.a(context.getContentResolver(), C1810f2.a("com.google.android.gms.measurement"), A.f41590b);
        Map<String, String> mapEmptyMap = r1A == null ? Collections.emptyMap() : r1A.b();
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = B.f41637Q.a(null).intValue();
        for (Map.Entry<String, String> entry : mapEmptyMap.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i10 = Integer.parseInt(entry.getValue());
                    if (i10 != 0) {
                        arrayList.add(Integer.valueOf(i10));
                        if (arrayList.size() >= iIntValue) {
                            d().f41715i.b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    d().f41715i.b(e10, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // p131k5.m3
    public final boolean v() {
        return false;
    }

    public final long y(byte[] bArr) {
        C0804l.h(bArr);
        o().p();
        MessageDigest messageDigestD0 = z3.D0();
        if (messageDigestD0 != null) {
            return z3.y(messageDigestD0.digest(bArr));
        }
        d().f41712f.c("Failed to get MD5");
        return 0L;
    }
}
