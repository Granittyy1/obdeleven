package p131k5;

import U4.AbstractC0799g;
import U4.C0804l;
import V4.a;
import X4.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.C1812f4;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.C1924v5;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.M5;
import com.google.android.gms.internal.measurement.N5;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.zziq;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k5.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2587y2 extends AbstractC2589z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P2 f42535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2561s0 f42536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f42537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2 f42538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2520h3 f42539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f42540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H2 f42541i;

    public C2587y2(C2523i1 c2523i1) {
        super(c2523i1);
        this.f42540h = new ArrayList();
        this.f42539g = new C2520h3(c2523i1.f42224n);
        this.f42535c = new P2(this);
        this.f42538f = new B2(this, c2523i1);
        this.f42541i = new H2(this, c2523i1);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0202  */
    /* JADX WARN: Code duplicated, block: B:127:0x0207  */
    /* JADX WARN: Code duplicated, block: B:134:0x0217  */
    /* JADX WARN: Code duplicated, block: B:136:0x021c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0232  */
    /* JADX WARN: Code duplicated, block: B:143:0x0237  */
    /* JADX WARN: Code duplicated, block: B:146:0x0247  */
    /* JADX WARN: Code duplicated, block: B:148:0x024c  */
    /* JADX WARN: Code duplicated, block: B:227:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x023a A[SYNTHETIC] */
    public final void A(InterfaceC2561s0 interfaceC2561s0, a aVar, o3 o3Var) throws Throwable {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabaseB;
        Cursor cursorQuery;
        String str;
        String[] strArr;
        int i10;
        C2496d c2496dCreateFromParcel;
        v3 v3VarCreateFromParcel;
        ArrayList arrayList;
        int size;
        p();
        t();
        int i11 = 100;
        int i12 = 0;
        int i13 = 100;
        int i14 = 0;
        while (i14 < 1001 && i13 == i11) {
            ArrayList arrayList2 = new ArrayList();
            C2573v0 c2573v0P = ((C2523i1) this.f3968a).p();
            c2573v0P.p();
            if (c2573v0P.f42494d) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                if (((C2523i1) c2573v0P.f3968a).f42212a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i15 = 5;
                    int i16 = i12;
                    int i17 = 5;
                    while (true) {
                        if (i16 < i15) {
                            try {
                                sQLiteDatabaseB = c2573v0P.B();
                                if (sQLiteDatabaseB == null) {
                                    try {
                                        try {
                                            c2573v0P.f42494d = true;
                                            if (sQLiteDatabaseB != null) {
                                                sQLiteDatabaseB.close();
                                            }
                                        } catch (SQLiteFullException e10) {
                                            e = e10;
                                            cursorQuery = null;
                                            c2573v0P.d().f41712f.b(e, "Error reading entries from local database");
                                            c2573v0P.f42494d = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseB != null) {
                                                sQLiteDatabaseB.close();
                                            }
                                            i16++;
                                            arrayList3 = arrayList3;
                                            i12 = 0;
                                            i15 = 5;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i17);
                                        i17 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        i16++;
                                        arrayList3 = arrayList3;
                                        i12 = 0;
                                        i15 = 5;
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.endTransaction();
                                        }
                                        c2573v0P.d().f41712f.b(e, "Error reading entries from local database");
                                        c2573v0P.f42494d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        arrayList3 = arrayList3;
                                        i16++;
                                        arrayList3 = arrayList3;
                                        i12 = 0;
                                        i15 = 5;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    try {
                                        sQLiteDatabaseB.beginTransaction();
                                        long jW = C2573v0.w(sQLiteDatabaseB);
                                        long j = -1;
                                        if (jW != -1) {
                                            String[] strArr2 = new String[1];
                                            strArr2[i12] = String.valueOf(jW);
                                            str = "rowid<?";
                                            strArr = strArr2;
                                        } else {
                                            str = null;
                                            strArr = null;
                                        }
                                        cursorQuery = sQLiteDatabaseB.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                        while (cursorQuery.moveToNext()) {
                                            try {
                                                try {
                                                    j = cursorQuery.getLong(i12);
                                                    int i18 = cursorQuery.getInt(1);
                                                    try {
                                                        try {
                                                            byte[] blob = cursorQuery.getBlob(2);
                                                            if (i18 == 0) {
                                                                try {
                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain.setDataPosition(0);
                                                                            C2588z c2588zCreateFromParcel = C2588z.CREATOR.createFromParcel(parcelObtain);
                                                                            parcelObtain.recycle();
                                                                            if (c2588zCreateFromParcel != null) {
                                                                                arrayList3.add(c2588zCreateFromParcel);
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            parcelObtain.recycle();
                                                                            throw th2;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused2) {
                                                                        c2573v0P.d().f41712f.c("Failed to load event from local database");
                                                                        parcelObtain.recycle();
                                                                    }
                                                                } catch (SQLiteFullException e12) {
                                                                    e = e12;
                                                                    c2573v0P.d().f41712f.b(e, "Error reading entries from local database");
                                                                    c2573v0P.f42494d = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (sQLiteDatabaseB != null) {
                                                                        sQLiteDatabaseB.close();
                                                                    }
                                                                    i16++;
                                                                    arrayList3 = arrayList3;
                                                                    i12 = 0;
                                                                    i15 = 5;
                                                                }
                                                            } else {
                                                                if (i18 == 1) {
                                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain2.setDataPosition(0);
                                                                            v3VarCreateFromParcel = v3.CREATOR.createFromParcel(parcelObtain2);
                                                                            parcelObtain2.recycle();
                                                                        } catch (Throwable th3) {
                                                                            parcelObtain2.recycle();
                                                                            throw th3;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused3) {
                                                                        c2573v0P.d().f41712f.c("Failed to load user property from local database");
                                                                        parcelObtain2.recycle();
                                                                        v3VarCreateFromParcel = null;
                                                                    }
                                                                    if (v3VarCreateFromParcel != null) {
                                                                        arrayList3.add(v3VarCreateFromParcel);
                                                                    }
                                                                } else if (i18 == 2) {
                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                    try {
                                                                        i10 = 0;
                                                                        try {
                                                                            try {
                                                                                parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                parcelObtain3.setDataPosition(0);
                                                                                c2496dCreateFromParcel = C2496d.CREATOR.createFromParcel(parcelObtain3);
                                                                                try {
                                                                                    parcelObtain3.recycle();
                                                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                                                    SystemClock.sleep(i17);
                                                                                    i17 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseB != null) {
                                                                                        sQLiteDatabaseB.close();
                                                                                    }
                                                                                    i16++;
                                                                                    arrayList3 = arrayList3;
                                                                                    i12 = 0;
                                                                                    i15 = 5;
                                                                                } catch (SQLiteException e13) {
                                                                                    e = e13;
                                                                                    if (sQLiteDatabaseB != null && sQLiteDatabaseB.inTransaction()) {
                                                                                        sQLiteDatabaseB.endTransaction();
                                                                                    }
                                                                                    c2573v0P.d().f41712f.b(e, "Error reading entries from local database");
                                                                                    c2573v0P.f42494d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseB != null) {
                                                                                        sQLiteDatabaseB.close();
                                                                                    }
                                                                                    arrayList3 = arrayList3;
                                                                                    i16++;
                                                                                    arrayList3 = arrayList3;
                                                                                    i12 = 0;
                                                                                    i15 = 5;
                                                                                }
                                                                            } catch (SafeParcelReader.ParseException unused5) {
                                                                                c2573v0P.d().f41712f.c("Failed to load conditional user property from local database");
                                                                                parcelObtain3.recycle();
                                                                                c2496dCreateFromParcel = null;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            parcelObtain3.recycle();
                                                                            throw th;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused6) {
                                                                        i10 = 0;
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                    }
                                                                    if (c2496dCreateFromParcel != null) {
                                                                        arrayList3.add(c2496dCreateFromParcel);
                                                                    }
                                                                } else {
                                                                    i10 = 0;
                                                                    if (i18 == 3) {
                                                                        c2573v0P.d().f41715i.c("Skipping app launch break");
                                                                    } else {
                                                                        c2573v0P.d().f41712f.c("Unknown record type in local database");
                                                                    }
                                                                }
                                                                i12 = i10;
                                                            }
                                                            i10 = 0;
                                                            i12 = i10;
                                                        } catch (SQLiteFullException e14) {
                                                            e = e14;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused7) {
                                                    } catch (SQLiteException e15) {
                                                        e = e15;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    if (sQLiteDatabaseB != null) {
                                                        sQLiteDatabaseB.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused8) {
                                            } catch (SQLiteFullException e16) {
                                                e = e16;
                                            } catch (SQLiteException e17) {
                                                e = e17;
                                            }
                                        }
                                        if (sQLiteDatabaseB.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList3.size()) {
                                            c2573v0P.d().f41712f.c("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabaseB.setTransactionSuccessful();
                                        sQLiteDatabaseB.endTransaction();
                                        cursorQuery.close();
                                        sQLiteDatabaseB.close();
                                    } catch (SQLiteFullException e18) {
                                        e = e18;
                                        cursorQuery = null;
                                        c2573v0P.d().f41712f.b(e, "Error reading entries from local database");
                                        c2573v0P.f42494d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        i16++;
                                        arrayList3 = arrayList3;
                                        i12 = 0;
                                        i15 = 5;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused9) {
                                cursorQuery = null;
                                sQLiteDatabaseB = null;
                            } catch (SQLiteFullException e19) {
                                e = e19;
                                cursorQuery = null;
                                sQLiteDatabaseB = null;
                            } catch (SQLiteException e20) {
                                e = e20;
                                cursorQuery = null;
                                sQLiteDatabaseB = null;
                            } catch (Throwable th7) {
                                th = th7;
                                cursor = null;
                                sQLiteDatabaseB = null;
                            }
                            i16++;
                            arrayList3 = arrayList3;
                            i12 = 0;
                            i15 = 5;
                        } else {
                            c2573v0P.d().f41715i.c("Failed to read events from database in reasonable time");
                        }
                        arrayList = null;
                    }
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList2.add(aVar);
            }
            int size2 = arrayList2.size();
            int i19 = 0;
            while (i19 < size2) {
                int i20 = i19 + 1;
                a aVar2 = (a) arrayList2.get(i19);
                if (aVar2 instanceof C2588z) {
                    try {
                        interfaceC2561s0.a0((C2588z) aVar2, o3Var);
                    } catch (RemoteException e21) {
                        d().f41712f.b(e21, "Failed to send event to the service");
                    }
                } else if (aVar2 instanceof v3) {
                    try {
                        interfaceC2561s0.A((v3) aVar2, o3Var);
                    } catch (RemoteException e22) {
                        d().f41712f.b(e22, "Failed to send user property to the service");
                    }
                } else if (aVar2 instanceof C2496d) {
                    try {
                        interfaceC2561s0.K((C2496d) aVar2, o3Var);
                    } catch (RemoteException e23) {
                        d().f41712f.b(e23, "Failed to send conditional user property to the service");
                    }
                } else {
                    d().f41712f.c("Discarding data. Unrecognized parcel type.");
                }
                i19 = i20;
            }
            i14++;
            i13 = size;
            i11 = 100;
            i12 = 0;
        }
    }

    public final void B(boolean z10) {
        p();
        t();
        if (z10) {
            ((C2523i1) this.f3968a).p().z();
        }
        if (F()) {
            w(new RunnableC2504e2(this, J(false), 1));
        }
    }

    public final void C() {
        p();
        t();
        if (E()) {
            return;
        }
        if (G()) {
            P2 p10 = this.f42535c;
            p10.f41958d.p();
            Context context = ((C2523i1) p10.f41958d.f3968a).f42212a;
            synchronized (p10) {
                try {
                    if (p10.f41956b) {
                        p10.f41958d.d().f41719n.c("Connection attempt already in progress");
                        return;
                    }
                    if (p10.f41957c != null && (p10.f41957c.f() || p10.f41957c.b())) {
                        p10.f41958d.d().f41719n.c("Already awaiting connection attempt");
                        return;
                    }
                    p10.f41957c = new C2585y0(context, Looper.getMainLooper(), AbstractC0799g.a(context), com.google.android.gms.common.a.f25299b, 93, p10, p10, null);
                    p10.f41958d.d().f41719n.c("Connecting to remote service");
                    p10.f41956b = true;
                    C0804l.h(p10.f41957c);
                    p10.f41957c.u();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (((C2523i1) this.f3968a).f42218g.F()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = ((C2523i1) this.f3968a).f42212a.getPackageManager().queryIntentServices(new Intent().setClassName(((C2523i1) this.f3968a).f42212a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            d().f41712f.c("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(((C2523i1) this.f3968a).f42212a, "com.google.android.gms.measurement.AppMeasurementService"));
        P2 p11 = this.f42535c;
        p11.f41958d.p();
        Context context2 = ((C2523i1) p11.f41958d.f3968a).f42212a;
        b bVarB = b.b();
        synchronized (p11) {
            try {
                if (p11.f41956b) {
                    p11.f41958d.d().f41719n.c("Connection attempt already in progress");
                    return;
                }
                p11.f41958d.d().f41719n.c("Using local app measurement service");
                p11.f41956b = true;
                bVarB.a(context2, intent, p11.f41958d.f42535c, 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void D() {
        p();
        t();
        P2 p10 = this.f42535c;
        if (p10.f41957c != null && (p10.f41957c.b() || p10.f41957c.f())) {
            p10.f41957c.a();
        }
        p10.f41957c = null;
        try {
            b.b().c(((C2523i1) this.f3968a).f42212a, this.f42535c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f42536d = null;
    }

    public final boolean E() {
        p();
        t();
        return this.f42536d != null;
    }

    public final boolean F() {
        p();
        t();
        return !G() || o().u0() >= B.f41685n0.a(null).intValue();
    }

    public final boolean G() {
        boolean z10;
        p();
        t();
        if (this.f42537e == null) {
            p();
            t();
            L0 l0N = n();
            l0N.p();
            boolean z11 = false;
            Boolean boolValueOf = !l0N.y().contains("use_service") ? null : Boolean.valueOf(l0N.y().getBoolean("use_service", false));
            boolean z12 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                c cVarO = ((C2523i1) this.f3968a).o();
                cVarO.t();
                if (cVarO.f26555k == 1) {
                    z10 = true;
                } else {
                    d().f41719n.c("Checking service availability");
                    int iB = com.google.android.gms.common.a.f25299b.b(((C2523i1) o().f3968a).f42212a, 12451000);
                    if (iB != 0) {
                        if (iB == 1) {
                            d().f41719n.c("Service missing");
                        } else if (iB != 2) {
                            if (iB == 3) {
                                d().f41715i.c("Service disabled");
                            } else if (iB == 9) {
                                d().f41715i.c("Service invalid");
                            } else if (iB != 18) {
                                d().f41715i.b(Integer.valueOf(iB), "Unexpected service status");
                            } else {
                                d().f41715i.c("Service updating");
                            }
                            z10 = false;
                            z12 = false;
                        } else {
                            d().f41718m.c("Service container out of date");
                            if (o().u0() >= 17443) {
                                z12 = boolValueOf == null;
                                z10 = false;
                            }
                        }
                        z10 = true;
                        z12 = false;
                    } else {
                        d().f41719n.c("Service available");
                    }
                    z10 = true;
                }
                if (z12 || !((C2523i1) this.f3968a).f42218g.F()) {
                    z11 = z10;
                } else {
                    d().f41712f.c("No way to upload. Consider using the full version of Analytics");
                }
                if (z11) {
                    L0 l0N2 = n();
                    l0N2.p();
                    SharedPreferences.Editor editorEdit = l0N2.y().edit();
                    editorEdit.putBoolean("use_service", z12);
                    editorEdit.apply();
                }
            }
            this.f42537e = Boolean.valueOf(z12);
        }
        return this.f42537e.booleanValue();
    }

    public final void H() {
        p();
        B0 b0D = d();
        ArrayList arrayList = this.f42540h;
        b0D.f41719n.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                d().f41712f.b(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f42541i.a();
    }

    public final void I() {
        p();
        C2520h3 c2520h3 = this.f42539g;
        c2520h3.f42197a.getClass();
        c2520h3.f42198b = SystemClock.elapsedRealtime();
        this.f42538f.b(B.f41625K.a(null).longValue());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final o3 J(boolean z10) {
        String str;
        int i10;
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        long j10;
        String str6;
        int i11;
        int i12;
        long j11;
        int extensionVersion;
        long jY;
        long jAbs;
        Pair<String, Long> pair;
        c cVarO = ((C2523i1) this.f3968a).o();
        if (z10) {
            B0 b0D = d();
            String strF = null;
            if (b0D.n().f41864f != null) {
                O0 o10 = b0D.n().f41864f;
                L0 l10 = o10.f41935e;
                l10.p();
                l10.p();
                long j12 = o10.f41935e.y().getLong(o10.f41931a, 0L);
                if (j12 == 0) {
                    o10.a();
                    jAbs = 0;
                } else {
                    ((C2523i1) l10.f3968a).f42224n.getClass();
                    jAbs = Math.abs(j12 - System.currentTimeMillis());
                }
                long j13 = o10.f41934d;
                if (jAbs < j13) {
                    pair = null;
                } else if (jAbs > (j13 << 1)) {
                    o10.a();
                    pair = null;
                } else {
                    String string = l10.y().getString(o10.f41933c, null);
                    long j14 = l10.y().getLong(o10.f41932b, 0L);
                    o10.a();
                    pair = (string == null || j14 <= 0) ? L0.f41860A : new Pair<>(string, Long.valueOf(j14));
                }
                if (pair != null && pair != L0.f41860A) {
                    strF = O.a.f(String.valueOf(pair.second), ":", (String) pair.first);
                }
            }
            str = strF;
        } else {
            str = null;
        }
        cVarO.p();
        zziq zziqVarA = cVarO.n().A();
        C1930w4.a();
        C2523i1 c2523i1 = (C2523i1) cVarO.f3968a;
        if (c2523i1.f42218g.B(null, B.f41628L0)) {
            L0 l0N = cVarO.n();
            l0N.p();
            str2 = com.google.android.gms.measurement.internal.b.b(l0N.y().getString("dma_consent_settings", null)).f26544b;
            i10 = zziqVarA.f26648b;
        } else {
            i10 = 100;
            str2 = "";
        }
        String strW = cVarO.w();
        String strY = cVarO.y();
        cVarO.t();
        String str7 = cVarO.f26549d;
        cVarO.t();
        long j15 = cVarO.f26550e;
        cVarO.t();
        C0804l.h(cVarO.f26551f);
        String str8 = cVarO.f26551f;
        cVarO.t();
        cVarO.p();
        if (cVarO.f26552g == 0) {
            z3 z3Var = c2523i1.f42222l;
            C2523i1.e(z3Var);
            Context context = c2523i1.f42212a;
            String packageName = context.getPackageName();
            z3Var.p();
            C0804l.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest messageDigestD0 = z3.D0();
            long j16 = -1;
            if (messageDigestD0 == null) {
                z3Var.d().f41712f.c("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (z3Var.m0(context, packageName)) {
                            j16 = 0;
                        } else {
                            Signature[] signatureArr = p006a5.c.a(context).b(64, ((C2523i1) z3Var.f3968a).f42212a.getPackageName()).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                z3Var.d().f41715i.c("Could not get signatures");
                            } else {
                                jY = z3.y(messageDigestD0.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        z3Var.d().f41712f.b(e10, "Package name not found");
                        jY = 0;
                    }
                } else {
                    jY = 0;
                }
                cVarO.f26552g = jY;
            }
            jY = j16;
            cVarO.f26552g = jY;
        }
        long j17 = cVarO.f26552g;
        boolean zH = c2523i1.h();
        Context context2 = c2523i1.f42212a;
        boolean z11 = !cVarO.n().f41876s;
        cVarO.p();
        boolean zH2 = c2523i1.h();
        C2501e c2501e = c2523i1.f42218g;
        if (zH2) {
            ((M5) N5.f25536c.get()).getClass();
            if (c2501e.B(null, B.f41679k0)) {
                cVarO.d().f41719n.c("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = context2.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        j = j17;
                        try {
                            str3 = null;
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context2);
                            if (objInvoke != null) {
                                try {
                                    str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    cVarO.d().f41716k.c("Failed to retrieve Firebase Instance Id");
                                    str3 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            cVarO.d().j.c("Failed to obtain Firebase Analytics instance");
                        }
                        str4 = str3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
                str3 = null;
                str4 = str3;
            }
            j = j17;
            str3 = null;
            str4 = str3;
        } else {
            j = j17;
            str4 = null;
        }
        L0 l11 = c2523i1.f42219h;
        C2523i1.e(l11);
        long jA = l11.f41865g.a();
        long jMin = c2523i1.f42211H;
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        long j18 = jMin;
        cVarO.t();
        int i13 = cVarO.f26555k;
        Boolean boolA = c2501e.A("google_analytics_adid_collection_enabled");
        boolean z12 = boolA == null || boolA.booleanValue();
        L0 l0N2 = cVarO.n();
        l0N2.p();
        boolean z13 = l0N2.y().getBoolean("deferred_analytics_collection", false);
        cVarO.t();
        String str9 = cVarO.f26557m;
        Boolean boolA2 = c2501e.A("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolA2 == null ? null : Boolean.valueOf(!boolA2.booleanValue());
        List<String> list = cVarO.f26554i;
        String strO = zziqVarA.o();
        if (cVarO.j == null) {
            cVarO.j = cVarO.o().C0();
        }
        String str10 = cVarO.j;
        C1924v5.a();
        if (c2501e.B(null, B.f41693r0)) {
            cVarO.p();
            j10 = 0;
            if (cVarO.f26559o != 0) {
                c2523i1.f42224n.getClass();
                str5 = str10;
                long jCurrentTimeMillis = System.currentTimeMillis() - cVarO.f26559o;
                if (cVarO.f26558n != null && jCurrentTimeMillis > 86400000 && cVarO.f26560p == null) {
                    cVarO.z();
                }
            } else {
                str5 = str10;
            }
            if (cVarO.f26558n == null) {
                cVarO.z();
            }
            str6 = cVarO.f26558n;
        } else {
            str5 = str10;
            j10 = 0;
            str6 = null;
        }
        Boolean boolA3 = c2501e.A("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolA3 == null ? false : boolA3.booleanValue();
        z3 z3VarO = cVarO.o();
        String strW2 = cVarO.w();
        C2523i1 c2523i2 = (C2523i1) z3VarO.f3968a;
        if (c2523i2.f42212a.getPackageManager() == null) {
            j11 = j10;
            i11 = 0;
        } else {
            try {
                i11 = 0;
                try {
                    ApplicationInfo applicationInfoA = p006a5.c.a(c2523i2.f42212a).a(0, strW2);
                    i12 = applicationInfoA != null ? applicationInfoA.targetSdkVersion : i11;
                } catch (PackageManager.NameNotFoundException unused4) {
                    z3VarO.d().f41717l.b(strW2, "PackageManager failed to find running app: app_id");
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                i11 = 0;
            }
            j11 = i12;
        }
        C1834i5.a();
        C2557r0<Boolean> c2557r0 = B.f41616F0;
        if (c2501e.B(null, c2557r0)) {
            cVarO.o();
            extensionVersion = (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? i11 : SdkExtensions.getExtensionVersion(1000000);
        } else {
            extensionVersion = i11;
        }
        C1834i5.a();
        long jW0 = c2501e.B(null, c2557r0) ? cVarO.o().w0() : j10;
        String str11 = c2501e.f42146c;
        C1812f4.a();
        return new o3(strW, strY, str7, j15, str8, 87000L, j, str, zH, z11, str4, j18, i13, z12, z13, str9, boolValueOf, cVarO.f26553h, list, strO, str5, str6, zBooleanValue, j11, i10, str2, extensionVersion, jW0, str11, c2501e.B(null, B.f41654Y0) ? String.valueOf(zziq.a(c2501e.y("google_analytics_default_allow_ad_personalization_signals"))) : "");
    }

    @Override // p131k5.AbstractC2589z0
    public final boolean v() {
        return false;
    }

    public final void w(Runnable runnable) throws IllegalStateException {
        p();
        if (E()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f42540h;
        if (arrayList.size() >= 1000) {
            d().f41712f.c("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f42541i.b(60000L);
        C();
    }

    public final void y(AtomicReference<String> atomicReference) {
        p();
        t();
        w(new F2(this, atomicReference, J(false)));
    }

    public final void z(C2496d c2496d) {
        boolean zY;
        p();
        t();
        C2573v0 c2573v0P = ((C2523i1) this.f3968a).p();
        c2573v0P.o();
        byte[] bArrG0 = z3.g0(c2496d);
        if (bArrG0.length > 131072) {
            c2573v0P.d().f41713g.c("Conditional user property too long for local database. Sending directly to service");
            zY = false;
        } else {
            zY = c2573v0P.y(2, bArrG0);
        }
        boolean z10 = zY;
        w(new M2(this, J(true), z10, new C2496d(c2496d), c2496d));
    }
}
