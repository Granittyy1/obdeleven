package p131k5;

import C4.v;
import J4.i;
import S4.C0764f;
import U4.C0804l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.compose.ui.text.font.s;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.recyclerview.widget.t;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.G5;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import com.google.android.gms.internal.measurement.W4;
import com.google.android.gms.internal.measurement.Z4;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p176o2.a;
import p188p2.c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends D1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f42552i = {"firebase_", "google_", "ga_"};
    public static final String[] j = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f42553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f42554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MeasurementManagerFutures.Api33Ext5JavaImpl f42556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f42557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f42558h;

    public z3(C2523i1 c2523i1) {
        super(c2523i1);
        this.f42558h = null;
        this.f42554d = new AtomicLong(0L);
    }

    public static Bundle C(List<v3> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (v3 v3Var : list) {
            String str = v3Var.f42506f;
            String str2 = v3Var.f42503c;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l10 = v3Var.f42505e;
                if (l10 != null) {
                    bundle.putLong(str2, l10.longValue());
                } else {
                    Double d10 = v3Var.f42508h;
                    if (d10 != null) {
                        bundle.putDouble(str2, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static MessageDigest D0() {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static String E(int i10, String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return s.b(str.substring(0, str.offsetByCodePoints(0, i10)), "...");
        }
        return null;
    }

    public static void G(Bundle bundle, int i10, String str, Object obj) {
        if (l0(i10, bundle)) {
            bundle.putString("_ev", E(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void T(C2559r2 c2559r2, Bundle bundle, boolean z10) {
        if (bundle == null || c2559r2 == null || (bundle.containsKey("_sc") && !z10)) {
            if (bundle != null && c2559r2 == null && z10) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c2559r2.f42435a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c2559r2.f42436b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c2559r2.f42437c);
    }

    public static void U(y3 y3Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        l0(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        y3Var.a(bundle, str, "_err");
    }

    public static boolean X(Context context) {
        ActivityInfo receiverInfo;
        C0804l.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean Y(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean Z(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean d0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            C0804l.h(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean e0(String str, String[] strArr) {
        C0804l.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] g0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList<Bundle> k0(List<C2496d> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C2496d c2496d : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c2496d.f42123b);
            bundle.putString("origin", c2496d.f42124c);
            bundle.putLong("creation_timestamp", c2496d.f42126e);
            bundle.putString("name", c2496d.f42125d.f42503c);
            Object objA = c2496d.f42125d.a();
            C0804l.h(objA);
            N.c(bundle, objA);
            bundle.putBoolean("active", c2496d.f42127f);
            String str = c2496d.f42128g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C2588z c2588z = c2496d.f42129h;
            if (c2588z != null) {
                bundle.putString("timed_out_event_name", c2588z.f42542b);
                C2568u c2568u = c2588z.f42543c;
                if (c2568u != null) {
                    bundle.putBundle("timed_out_event_params", c2568u.k());
                }
            }
            bundle.putLong("trigger_timeout", c2496d.f42130i);
            C2588z c2588z2 = c2496d.j;
            if (c2588z2 != null) {
                bundle.putString("triggered_event_name", c2588z2.f42542b);
                C2568u c2568u2 = c2588z2.f42543c;
                if (c2568u2 != null) {
                    bundle.putBundle("triggered_event_params", c2568u2.k());
                }
            }
            bundle.putLong("triggered_timestamp", c2496d.f42125d.f42504d);
            bundle.putLong("time_to_live", c2496d.f42131k);
            C2588z c2588z3 = c2496d.f42132l;
            if (c2588z3 != null) {
                bundle.putString("expired_event_name", c2588z3.f42542b);
                C2568u c2568u3 = c2588z3.f42543c;
                if (c2568u3 != null) {
                    bundle.putBundle("expired_event_params", c2568u3.k());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean l0(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean p0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean t0(String str) {
        String strA = B.v0.a(null);
        return strA.equals("*") || Arrays.asList(strA.split(",")).contains(str);
    }

    public static boolean v0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static long w(C2568u c2568u) {
        long length = 0;
        if (c2568u == null) {
            return 0L;
        }
        Bundle bundle = c2568u.f42473b;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) obj).length;
            }
        }
        return length;
    }

    public static boolean x0(String str) {
        C0804l.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static long y(byte[] bArr) {
        C0804l.h(bArr);
        if (bArr.length <= 0) {
            throw new IllegalStateException();
        }
        int i10 = 0;
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j10 += (((long) bArr[length]) & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static int z0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    public final Bundle A(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objJ0 = j0(bundle.get(str), str);
                if (objJ0 == null) {
                    B0 b0D = d();
                    b0D.f41716k.b(((C2523i1) this.f3968a).f42223m.f(str), "Param value can't be null");
                } else {
                    J(bundle2, str, objJ0);
                }
            }
        }
        return bundle2;
    }

    public final long A0() {
        long andIncrement;
        long j10;
        if (this.f42554d.get() != 0) {
            synchronized (this.f42554d) {
                this.f42554d.compareAndSet(-1L, 1L);
                andIncrement = this.f42554d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f42554d) {
            long jNanoTime = System.nanoTime();
            ((C2523i1) this.f3968a).f42224n.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f42555e + 1;
            this.f42555e = i10;
            j10 = jNextLong + ((long) i10);
        }
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    public final Bundle B(String str, Bundle bundle, List list, boolean z10) {
        int i10;
        int i11;
        z3 z3Var = this;
        boolean zE0 = e0(str, P.f41948h);
        String[] strArr = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C2523i1 c2523i1 = (C2523i1) z3Var.f3968a;
        int i12 = c2523i1.f42218g.o().h0(201500000) ? 100 : 25;
        int i13 = 0;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str2)) {
                int i14 = 14;
                if (z10) {
                    i10 = 0;
                } else if (!z3Var.q0("event param", str2)) {
                    i10 = 3;
                } else if (!z3Var.f0("event param", strArr, str2, strArr)) {
                    i10 = 14;
                } else if (z3Var.W(40, "event param", str2)) {
                    i10 = 0;
                } else {
                    i10 = 3;
                }
                if (i10 == 0) {
                    if (!z3Var.n0("event param", str2)) {
                        i14 = 3;
                    } else if (z3Var.f0("event param", strArr, str2, strArr)) {
                        if (z3Var.W(40, "event param", str2)) {
                            i14 = 0;
                        } else {
                            i14 = 3;
                        }
                    }
                    i10 = i14;
                }
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                G(bundle2, i10, str2, i10 == 3 ? str2 : strArr);
                bundle2.remove(str2);
                i11 = i12;
            } else {
                i11 = i12;
                int iV = v(str, str2, bundle.get(str2), bundle2, list, z10, zE0);
                if (iV == 17) {
                    G(bundle2, iV, str2, Boolean.FALSE);
                } else if (iV != 0 && !"_ev".equals(str2)) {
                    G(bundle2, iV, iV == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (x0(str2)) {
                    int i15 = i13 + 1;
                    if (i15 > i11) {
                        String strC = i.c(i11, "Event can't contain more than ", " params");
                        B0 b0D = d();
                        C2577w0 c2577w0 = c2523i1.f42223m;
                        b0D.f41714h.a(c2577w0.b(str), c2577w0.a(bundle), strC);
                        l0(5, bundle2);
                        bundle2.remove(str2);
                        strArr = null;
                        i13 = i15;
                    } else {
                        i13 = i15;
                    }
                }
                i12 = i11;
                z3Var = this;
            }
            strArr = null;
            i12 = i11;
            z3Var = this;
        }
        return bundle2;
    }

    public final MeasurementManagerFutures B0() {
        if (this.f42556f == null) {
            Context context = ((C2523i1) this.f3968a).f42212a;
            kotlin.jvm.internal.i.e(context, "context");
            int i10 = Build.VERSION.SDK_INT;
            a aVar = a.f45184a;
            if (i10 >= 30) {
                aVar.a();
            }
            c.a aVar2 = (i10 >= 30 ? aVar.a() : 0) >= 5 ? new c.a(context) : null;
            this.f42556f = aVar2 != null ? new MeasurementManagerFutures.Api33Ext5JavaImpl(aVar2) : null;
        }
        return this.f42556f;
    }

    public final String C0() {
        byte[] bArr = new byte[16];
        E0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object D(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return E(i10, String.valueOf(obj), z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleA = A((Bundle) parcelable);
                if (!bundleA.isEmpty()) {
                    arrayList.add(bundleA);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final SecureRandom E0() {
        p();
        if (this.f42553c == null) {
            this.f42553c = new SecureRandom();
        }
        return this.f42553c;
    }

    public final C2588z F(String str, Bundle bundle, String str2, long j10, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (u(str) != 0) {
            d().f41712f.b(((C2523i1) this.f3968a).f42223m.g(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleB = B(str, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            bundleB = A(bundleB);
        }
        C0804l.h(bundleB);
        return new C2588z(str, new C2568u(bundleB), str2, j10);
    }

    public final void H(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            B0 b0D = d();
            b0D.f41715i.b(Long.valueOf(j11), "Params already contained engagement");
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void I(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                o().J(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void J(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            d().f41716k.a(((C2523i1) this.f3968a).f42223m.f(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final void K(InterfaceC1843k0 interfaceC1843k0, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            interfaceC1843k0.f(bundle);
        } catch (RemoteException e10) {
            B0 b10 = ((C2523i1) this.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41715i.b(e10, "Error returning int value to wrapper");
        }
    }

    public final void L(InterfaceC1843k0 interfaceC1843k0, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            interfaceC1843k0.f(bundle);
        } catch (RemoteException e10) {
            B0 b10 = ((C2523i1) this.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41715i.b(e10, "Error returning long value to wrapper");
        }
    }

    public final void M(InterfaceC1843k0 interfaceC1843k0, Bundle bundle) {
        try {
            interfaceC1843k0.f(bundle);
        } catch (RemoteException e10) {
            B0 b10 = ((C2523i1) this.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41715i.b(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void N(InterfaceC1843k0 interfaceC1843k0, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC1843k0.f(bundle);
        } catch (RemoteException e10) {
            B0 b10 = ((C2523i1) this.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41715i.b(e10, "Error returning bundle list to wrapper");
        }
    }

    public final void O(InterfaceC1843k0 interfaceC1843k0, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            interfaceC1843k0.f(bundle);
        } catch (RemoteException e10) {
            B0 b10 = ((C2523i1) this.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41715i.b(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void P(InterfaceC1843k0 interfaceC1843k0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC1843k0.f(bundle);
        } catch (RemoteException e10) {
            B0 b10 = ((C2523i1) this.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41715i.b(e10, "Error returning byte array to wrapper");
        }
    }

    public final void Q(String str, InterfaceC1843k0 interfaceC1843k0) {
        try {
            interfaceC1843k0.f(v.d("r", str));
        } catch (RemoteException e10) {
            B0 b10 = ((C2523i1) this.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41715i.b(e10, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    public final void R(String str, String str2, Bundle bundle, List list, boolean z10) {
        int i10;
        int iV;
        String[] strArr;
        if (bundle == null) {
            return;
        }
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        C2501e c2501e = c2523i1.f42218g;
        c2501e.getClass();
        ((Z4) W4.f25626c.get()).getClass();
        String[] strArr2 = null;
        int i11 = (((C2523i1) c2501e.f3968a).f42218g.B(null, B.f41608B0) && c2501e.o().h0(231100000)) ? 35 : 0;
        int i12 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                int i13 = 14;
                if (z10) {
                    i10 = 0;
                } else if (!q0("event param", str3)) {
                    i10 = 3;
                } else if (!f0("event param", strArr2, str3, strArr2)) {
                    i10 = 14;
                } else if (W(40, "event param", str3)) {
                    i10 = 0;
                } else {
                    i10 = 3;
                }
                if (i10 == 0) {
                    if (!n0("event param", str3)) {
                        i13 = 3;
                    } else if (f0("event param", strArr2, str3, strArr2)) {
                        if (W(40, "event param", str3)) {
                            i13 = 0;
                        } else {
                            i13 = 3;
                        }
                    }
                    i10 = i13;
                }
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                G(bundle, i10, str3, i10 == 3 ? str3 : strArr2);
                bundle.remove(str3);
                i11 = i11;
            } else {
                if (Z(bundle.get(str3))) {
                    d().f41716k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iV = 22;
                } else {
                    iV = v(str, str3, bundle.get(str3), bundle, list, z10, false);
                }
                if (iV == 0 || "_ev".equals(str3)) {
                    if (!x0(str3) || e0(str3, O.f41929h)) {
                        strArr = null;
                    } else {
                        int i14 = i12 + 1;
                        boolean zH0 = h0(231100000);
                        C2577w0 c2577w0 = c2523i1.f42223m;
                        if (!zH0) {
                            d().f41714h.a(c2577w0.b(str), c2577w0.a(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                            l0(23, bundle);
                            bundle.remove(str3);
                            strArr = null;
                        } else if (i14 > i11) {
                            ((Z4) W4.f25626c.get()).getClass();
                            strArr = null;
                            if (c2523i1.f42218g.B(null, B.f41608B0)) {
                                d().f41714h.a(c2577w0.b(str), c2577w0.a(bundle), i.c(i11, "Item can't contain more than ", " item-scoped custom params"));
                                l0(28, bundle);
                                bundle.remove(str3);
                            } else {
                                d().f41714h.a(c2577w0.b(str), c2577w0.a(bundle), "Item cannot contain custom parameters");
                                l0(23, bundle);
                                bundle.remove(str3);
                            }
                        } else {
                            strArr = null;
                        }
                        i12 = i14;
                    }
                    i11 = i11;
                    strArr2 = strArr;
                } else {
                    G(bundle, iV, str3, bundle.get(str3));
                    bundle.remove(str3);
                }
            }
            i11 = i11;
            strArr2 = null;
        }
    }

    public final void S(F0 f10, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(f10.f41779d.keySet())) {
            if (x0(str) && (i11 = i11 + 1) > i10) {
                String strC = i.c(i10, "Event can't contain more than ", " params");
                B0 b0D = d();
                C2523i1 c2523i1 = (C2523i1) this.f3968a;
                String strB = c2523i1.f42223m.b(f10.f41776a);
                Bundle bundle = f10.f41779d;
                b0D.f41714h.a(strB, c2523i1.f42223m.a(bundle), strC);
                l0(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void V(Parcelable[] parcelableArr, int i10, boolean z10) {
        C0804l.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (x0(str) && !e0(str, O.f41929h) && (i11 = i11 + 1) > i10) {
                    C2523i1 c2523i1 = (C2523i1) this.f3968a;
                    if (z10) {
                        d().f41714h.a(c2523i1.f42223m.f(str), c2523i1.f42223m.a(bundle), i.c(i10, "Param can't contain more than ", " item-scoped custom parameters"));
                        l0(28, bundle);
                    } else {
                        d().f41714h.a(c2523i1.f42223m.f(str), c2523i1.f42223m.a(bundle), "Param cannot contain item-scoped custom parameters");
                        l0(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean W(int i10, String str, String str2) {
        if (str2 == null) {
            d().f41714h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        B0 b0D = d();
        b0D.f41714h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final boolean a0(String str, double d10) {
        try {
            SharedPreferences.Editor editorEdit = ((C2523i1) this.f3968a).f42212a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d10));
            return editorEdit.commit();
        } catch (RuntimeException e10) {
            d().f41712f.b(e10, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean b0(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (!zIsEmpty) {
            C0804l.h(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(c2523i1.f42213b)) {
                B0 b0D = d();
                b0D.f41714h.b(B0.v(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(c2523i1.f42213b)) {
                d().f41714h.c("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        C0804l.h(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        B0 b0D2 = d();
        b0D2.f41714h.b(B0.v(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    public final boolean c0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i10) {
                B0 b0D = d();
                b0D.f41716k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean f0(String str, String[] strArr, String str2, String[] strArr2) {
        if (str2 == null) {
            d().f41714h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f42552i;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                d().f41714h.a(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !e0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && e0(str2, strArr2)) {
            return true;
        }
        d().f41714h.a(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean h0(int i10) {
        Boolean bool = ((C2523i1) this.f3968a).r().f42537e;
        if (u0() < i10 / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int i0(String str) {
        if (!n0("user property", str)) {
            return 6;
        }
        if (f0("user property", Q.f41962e, str, null)) {
            return !W(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    public final Object j0(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (zEquals) {
            return D(Math.max(c2523i1.f42218g.r(null, false), 256), obj, true, true);
        }
        return D(v0(str) ? Math.max(c2523i1.f42218g.r(null, false), 256) : c2523i1.f42218g.r(null, false), obj, false, true);
    }

    public final boolean m0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = p006a5.c.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            d().f41712f.b(e10, "Package name not found");
            return true;
        } catch (CertificateException e11) {
            d().f41712f.b(e11, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean n0(String str, String str2) {
        if (str2 == null) {
            d().f41714h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            d().f41714h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            d().f41714h.a(str, str2, "Name must start with a letter or _ (underscore). Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                d().f41714h.a(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object o0(Object obj, String str) {
        return "_ldl".equals(str) ? D(z0(str), obj, true, false) : D(z0(str), obj, false, false);
    }

    public final boolean q0(String str, String str2) {
        if (str2 == null) {
            d().f41714h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            d().f41714h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            d().f41714h.a(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                d().f41714h.a(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean r0(String str, String str2) {
        G5.a();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (c2523i1.f42218g.B(null, B.f41699u0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c2523i1.f42218g.s("debug.firebase.analytics.app").equals(str);
    }

    @Override // p131k5.D1
    public final boolean s() {
        return true;
    }

    public final boolean s0(String str) {
        p();
        if (p006a5.c.a(((C2523i1) this.f3968a).f42212a).f8057a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        d().f41718m.b(str, "Permission not granted");
        return false;
    }

    public final int t(Object obj, String str) {
        return "_ldl".equals(str) ? c0("user property referrer", str, z0(str), obj) : c0("user property", str, z0(str), obj) ? 0 : 7;
    }

    public final int u(String str) {
        if (!n0("event", str)) {
            return 2;
        }
        if (f0("event", P.f41945e, str, P.f41946f)) {
            return !W(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final int u0() {
        if (this.f42558h == null) {
            com.google.android.gms.common.a aVar = com.google.android.gms.common.a.f25299b;
            Context context = ((C2523i1) this.f3968a).f42212a;
            aVar.getClass();
            AtomicBoolean atomicBoolean = C0764f.f5539a;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            this.f42558h = Integer.valueOf(i10 / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        }
        return this.f42558h.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    public final int v(String str, String str2, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int size;
        p();
        boolean Z10 = Z(obj);
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        int i11 = 0;
        if (!Z10) {
            i10 = 0;
        } else {
            if (!z11) {
                return 21;
            }
            if (!e0(str2, O.f41928g)) {
                return 20;
            }
            C2587y2 c2587y2R = c2523i1.r();
            c2587y2R.p();
            c2587y2R.t();
            if (c2587y2R.G() && c2587y2R.o().u0() < 200900) {
                return 25;
            }
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                d().f41716k.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, t.d.DEFAULT_DRAG_ANIMATION_DURATION));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, t.d.DEFAULT_DRAG_ANIMATION_DURATION)));
                    }
                }
                i10 = 17;
            } else {
                i10 = 0;
            }
        }
        if (c0("param", str2, (v0(str) || v0(str2)) ? Math.max(c2523i1.f42218g.r(null, false), 256) : c2523i1.f42218g.r(null, false), obj)) {
            return i10;
        }
        if (!z11) {
            return 4;
        }
        if (obj instanceof Bundle) {
            R(str, str2, (Bundle) obj, list, z10);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    d().f41716k.a(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                    return 4;
                }
                R(str, str2, (Bundle) parcelable, list, z10);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                int i12 = i11 + 1;
                if (!(obj2 instanceof Bundle)) {
                    d().f41716k.a(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                    return 4;
                }
                R(str, str2, (Bundle) obj2, list, z10);
                i11 = i12;
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    public final long w0() {
        long j10;
        Integer num;
        Object e10;
        p();
        String strW = ((C2523i1) this.f3968a).o().w();
        String strA = B.f41661b0.a(null);
        boolean z10 = true;
        boolean zBooleanValue = false;
        if (!(strA.equals("*") || Arrays.asList(strA.split(",")).contains(strW))) {
            return 0L;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            j10 = ((i10 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < B.f41649W.a(null).intValue() ? 16L : 0L;
        }
        if (!s0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0) {
            if (this.f42557g != null) {
                zBooleanValue = this.f42557g.booleanValue();
            } else {
                MeasurementManagerFutures measurementManagerFuturesB0 = B0();
                if (measurementManagerFuturesB0 != null) {
                    try {
                        num = measurementManagerFuturesB0.a().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() != 1) {
                                    z10 = false;
                                }
                                this.f42557g = Boolean.valueOf(z10);
                            } catch (InterruptedException e11) {
                                e10 = e11;
                                d().f41715i.b(e10, "Measurement manager api exception");
                                this.f42557g = Boolean.FALSE;
                            } catch (CancellationException e12) {
                                e10 = e12;
                                d().f41715i.b(e10, "Measurement manager api exception");
                                this.f42557g = Boolean.FALSE;
                            } catch (ExecutionException e13) {
                                e10 = e13;
                                d().f41715i.b(e10, "Measurement manager api exception");
                                this.f42557g = Boolean.FALSE;
                            } catch (TimeoutException e14) {
                                e10 = e14;
                                d().f41715i.b(e10, "Measurement manager api exception");
                                this.f42557g = Boolean.FALSE;
                            }
                            d().f41719n.b(num, "Measurement manager api status result");
                            zBooleanValue = this.f42557g.booleanValue();
                        } else {
                            z10 = false;
                            this.f42557g = Boolean.valueOf(z10);
                            d().f41719n.b(num, "Measurement manager api status result");
                            zBooleanValue = this.f42557g.booleanValue();
                        }
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                        num = null;
                        e10 = e15;
                    }
                }
            }
            if (!zBooleanValue) {
                j10 |= 64;
            }
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    public final boolean y0(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = ((C2523i1) this.f3968a).f42212a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    public final Bundle z(Uri uri, boolean z10, boolean z11) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z11 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = z10 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z11 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && (!z10 || TextUtils.isEmpty(queryParameter9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z11 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("term", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("content", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("aclid", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("cp1", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("anid", queryParameter14);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter15 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("source_platform", queryParameter15);
            }
            String queryParameter16 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("creative_format", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("marketing_tactic", queryParameter17);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (z10 && !TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            d().f41715i.b(e10, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }
}
