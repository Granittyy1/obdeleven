package p272w1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.media3.exoplayer.RunnableC1384b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.intercom.android.sdk.models.AttributeType;
import j1.o.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p114j1.A;
import p114j1.C2479a;
import p114j1.c;
import p114j1.o;
import p114j1.t;
import p140l1.e;
import p140l1.l;

/* JADX INFO: compiled from: DefaultBandwidthMeter.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c, l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ImmutableList<Long> f47704p = ImmutableList.L(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ImmutableList<Long> f47705q = ImmutableList.L(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ImmutableList<Long> f47706r = ImmutableList.L(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ImmutableList<Long> f47707s = ImmutableList.L(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ImmutableList<Long> f47708t = ImmutableList.L(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ImmutableList<Long> f47709u = ImmutableList.L(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static f f47710v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableMap<Integer, Long> f47712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a.C0544a f47713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f47714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f47716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f47718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f47719i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f47720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f47721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f47722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47723n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f47724o;

    /* JADX WARN: Type inference failed for: r7v6, types: [w1.e] */
    public f(Context context, HashMap map) {
        boolean z10;
        t tVar = c.f41011a;
        this.f47711a = context == null ? null : context.getApplicationContext();
        this.f47712b = ImmutableMap.a(map);
        this.f47713c = new c.a.C0544a();
        this.f47716f = new h();
        this.f47714d = tVar;
        this.f47715e = true;
        if (context == null) {
            this.f47723n = 0;
            this.f47721l = 1000000L;
            return;
        }
        o oVarA = o.a(context);
        int iB = oVarA.b();
        this.f47723n = iB;
        this.f47721l = g(iB);
        ?? r10 = new o.a() { // from class: w1.e
            /* JADX WARN: Code duplicated, block: B:32:0x004a A[Catch: all -> 0x000e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:13:0x0013, B:17:0x001a, B:23:0x0027, B:25:0x002b, B:27:0x0031, B:29:0x003b, B:31:0x0045, B:33:0x0056, B:32:0x004a, B:34:0x0058, B:36:0x006c, B:38:0x0074), top: B:45:0x0003 }] */
            @Override // j1.o.a
            public final void a(int i10) {
                String strM;
                TelephonyManager telephonyManager;
                f fVar = this.f47703a;
                synchronized (fVar) {
                    int i11 = fVar.f47723n;
                    if (i11 == 0 || fVar.f47715e) {
                        if (i11 != i10 || fVar.f47724o == null) {
                            fVar.f47723n = i10;
                            if (i10 != 1 && i10 != 0 && i10 != 8) {
                                if (fVar.f47724o == null) {
                                    Context context2 = fVar.f47711a;
                                    int i12 = A.f40996a;
                                    if (context2 == null || (telephonyManager = (TelephonyManager) context2.getSystemService(AttributeType.PHONE)) == null) {
                                        strM = I.e.m(Locale.getDefault().getCountry());
                                    } else {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (TextUtils.isEmpty(networkCountryIso)) {
                                            strM = I.e.m(Locale.getDefault().getCountry());
                                        } else {
                                            strM = I.e.m(networkCountryIso);
                                        }
                                    }
                                    fVar.f47724o = strM;
                                }
                                fVar.f47721l = fVar.g(i10);
                                fVar.f47714d.getClass();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                fVar.h(fVar.f47717g > 0 ? (int) (jElapsedRealtime - fVar.f47718h) : 0, fVar.f47719i, fVar.f47721l);
                                fVar.f47718h = jElapsedRealtime;
                                fVar.f47719i = 0L;
                                fVar.f47720k = 0L;
                                fVar.j = 0L;
                                h hVar = fVar.f47716f;
                                hVar.f47727a.clear();
                                hVar.f47729c = -1;
                                hVar.f47730d = 0;
                                hVar.f47731e = 0;
                            }
                        }
                    }
                }
            }
        };
        Executor executorI = C2479a.i();
        CopyOnWriteArrayList<o.b> copyOnWriteArrayList = oVarA.f41044b;
        for (o.b bVar : copyOnWriteArrayList) {
            if (bVar.f41048a.get() == null) {
                copyOnWriteArrayList.remove(bVar);
            }
        }
        o.b bVar2 = oVarA.new b(r10, executorI);
        synchronized (oVarA.f41045c) {
            oVarA.f41044b.add(bVar2);
            z10 = oVarA.f41047e;
        }
        if (z10) {
            bVar2.f41049b.execute(new RunnableC1384b(2, bVar2));
        }
    }

    @Override // p272w1.c
    public final void a(c.a aVar) {
        CopyOnWriteArrayList<c.a.C0544a.C0545a> copyOnWriteArrayList = this.f47713c.f47693a;
        for (c.a.C0544a.C0545a c0545a : copyOnWriteArrayList) {
            if (c0545a.f47695b == aVar) {
                c0545a.f47696c = true;
                copyOnWriteArrayList.remove(c0545a);
            }
        }
    }

    @Override // p140l1.l
    public final synchronized void b(e eVar, boolean z10) {
        boolean z11;
        if (z10) {
            try {
                int i10 = eVar.f44174g;
                z11 = true;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            p241t7.b.k(this.f47717g > 0);
            this.f47714d.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = (int) (jElapsedRealtime - this.f47718h);
            this.j += (long) i11;
            long j = this.f47720k;
            long j10 = this.f47719i;
            this.f47720k = j + j10;
            if (i11 > 0) {
                this.f47716f.a((j10 * 8000.0f) / i11, (int) Math.sqrt(j10));
                if (this.j >= 2000 || this.f47720k >= 524288) {
                    this.f47721l = (long) this.f47716f.b();
                }
                h(i11, this.f47719i, this.f47721l);
                this.f47718h = jElapsedRealtime;
                this.f47719i = 0L;
            }
            this.f47717g--;
        }
    }

    @Override // p140l1.l
    public final synchronized void c(e eVar, boolean z10) {
        boolean z11;
        if (z10) {
            try {
                int i10 = eVar.f44174g;
                z11 = true;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f47717g == 0) {
                this.f47714d.getClass();
                this.f47718h = SystemClock.elapsedRealtime();
            }
            this.f47717g++;
        }
    }

    @Override // p272w1.c
    public final void d(Handler handler, c.a aVar) {
        aVar.getClass();
        c.a.C0544a c0544a = this.f47713c;
        c0544a.getClass();
        CopyOnWriteArrayList<c.a.C0544a.C0545a> copyOnWriteArrayList = c0544a.f47693a;
        for (c.a.C0544a.C0545a c0545a : copyOnWriteArrayList) {
            if (c0545a.f47695b == aVar) {
                c0545a.f47696c = true;
                copyOnWriteArrayList.remove(c0545a);
            }
        }
        copyOnWriteArrayList.add(new c.a.C0544a.C0545a(handler, aVar));
    }

    @Override // p140l1.l
    public final synchronized void f(e eVar, boolean z10, int i10) {
        boolean z11;
        if (z10) {
            int i11 = eVar.f44174g;
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f47719i += (long) i10;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:1149:0x1218  */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    public final long g(int i10) {
        int[] iArr;
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i10);
        ImmutableMap<Integer, Long> immutableMap = this.f47712b;
        Long lValueOf = immutableMap.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = immutableMap.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            String str = this.f47724o;
            if (str == null) {
                str = "";
            }
            switch (str) {
                case "AD":
                case "AI":
                case "BB":
                case "BQ":
                case "CW":
                case "DM":
                case "KN":
                case "KY":
                case "SX":
                case "VC":
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case "AE":
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case "AF":
                case "SZ":
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case "AG":
                case "CI":
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case "AL":
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case "AM":
                case "PA":
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case "AO":
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case "AQ":
                case "ER":
                case "NU":
                case "SC":
                case "SH":
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case "AR":
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case "AS":
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case "AT":
                case "EE":
                case "HU":
                case "IS":
                case "LV":
                case "MT":
                case "SE":
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case "AU":
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case "AW":
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case "AX":
                case "CX":
                case "LI":
                case "MS":
                case "PM":
                case "SM":
                case "VA":
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case "AZ":
                case "DJ":
                case "LY":
                case "SL":
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case "BA":
                case "JO":
                case "TR":
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case "BD":
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case "BE":
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case "BF":
                case "SD":
                case "SY":
                case "TD":
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case "BG":
                case "PT":
                case "SI":
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case "BH":
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case "BI":
                case "GQ":
                case "HT":
                case "NE":
                case "VE":
                case "YE":
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case "BJ":
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case "BL":
                case "MP":
                case "PY":
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case "BM":
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case "BN":
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case "BO":
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case "BR":
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case "BS":
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case "BT":
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case "BW":
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case "BY":
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case "BZ":
                case "CK":
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case "CA":
                case "UA":
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case "CD":
                case "ML":
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case "CF":
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case "CG":
                case "EG":
                case "MG":
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case "CH":
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case "CL":
                case "TH":
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case "CM":
                case "MR":
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case "CN":
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case "CO":
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case "CR":
                case "NI":
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case "CU":
                case "KI":
                case "NR":
                case "TL":
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case "CV":
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case "CY":
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case "CZ":
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case "DE":
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case "DK":
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case "DO":
                case "LR":
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case "DZ":
                case "TJ":
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case "EC":
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case "ES":
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case "ET":
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case "FI":
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case "FJ":
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case "FK":
                case "NF":
                case "SJ":
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case "FM":
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case "FO":
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case "FR":
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case "GA":
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case "GB":
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case "GD":
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case "GE":
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case "GF":
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case "GG":
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case "GH":
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case "GI":
                case "IM":
                case "JE":
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case "GL":
                case "MC":
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case "GM":
                case "SS":
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case "GN":
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case "GP":
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case "GR":
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case "GT":
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case "GU":
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case "GW":
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case "GY":
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case "HK":
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case "HR":
                case "KW":
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case "ID":
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case "IE":
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case "IL":
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case "IN":
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case "IO":
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case "IQ":
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case "IR":
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case "IT":
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case "JM":
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case "JP":
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case "KE":
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case "KG":
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case "KH":
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case "KM":
                case "VU":
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case "KR":
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case "KZ":
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case "LA":
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case "LB":
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case "LC":
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case "LK":
                case "MM":
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case "LS":
                case "PG":
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case "LT":
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case "LU":
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case "MA":
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case "MD":
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case "ME":
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case "MF":
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case "MH":
                case "TM":
                case "TV":
                case "WF":
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case "MK":
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case "MN":
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case "MO":
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case "MQ":
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case "MU":
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case "MV":
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case "MW":
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case "MX":
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case "MY":
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case "MZ":
                case "WS":
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case "NA":
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case "NC":
                case "YT":
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case "NG":
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case "NL":
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case "NO":
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case "NP":
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case "NZ":
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case "OM":
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case "PE":
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case "PF":
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case "PH":
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case "PK":
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case "PL":
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case "PR":
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case "PS":
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case "PW":
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case "QA":
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case "RE":
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case "RO":
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case "RS":
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case "RU":
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case "RW":
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case "SA":
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case "SB":
                case "ZW":
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case "SG":
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case "SK":
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case "SN":
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case "SO":
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case "SR":
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case "ST":
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case "SV":
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case "TC":
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case "TG":
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case "TN":
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case "TO":
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case "TT":
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case "TW":
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case "TZ":
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case "UG":
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case "US":
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case "UY":
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case "UZ":
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case "VG":
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case "VI":
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case "VN":
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case "XK":
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case "ZA":
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case "ZM":
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i10 == 2) {
                jLongValue = f47704p.get(iArr[0]).longValue();
            } else if (i10 == 3) {
                jLongValue = f47705q.get(iArr[1]).longValue();
            } else if (i10 == 4) {
                jLongValue = f47706r.get(iArr[2]).longValue();
            } else if (i10 == 5) {
                jLongValue = f47707s.get(iArr[3]).longValue();
            } else if (i10 == 7) {
                jLongValue = f47704p.get(iArr[0]).longValue();
            } else if (i10 != 9) {
                jLongValue = i10 != 10 ? 1000000L : f47708t.get(iArr[4]).longValue();
            } else {
                jLongValue = f47709u.get(iArr[5]).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    public final void h(final int i10, final long j, final long j10) {
        if (i10 == 0 && j == 0 && j10 == this.f47722m) {
            return;
        }
        this.f47722m = j10;
        for (final c.a.C0544a.C0545a c0545a : this.f47713c.f47693a) {
            if (!c0545a.f47696c) {
                c0545a.f47694a.post(new Runnable() { // from class: w1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0545a.f47695b.s(i10, j, j10);
                    }
                });
            }
        }
    }

    @Override // p272w1.c
    public final f e() {
        return this;
    }
}
