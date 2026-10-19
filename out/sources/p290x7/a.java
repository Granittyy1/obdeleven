package p290x7;

import O.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.d;
import com.google.firebase.perf.util.h;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p218r7.n;
import p218r7.q;

/* JADX INFO: compiled from: PerfSession.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0550a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f47911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47912d;

    /* JADX INFO: renamed from: x7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PerfSession.java */
    public class C0550a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, e eVar) {
        this.f47912d = false;
        this.f47910b = str;
        this.f47911c = new h();
    }

    public static com.google.firebase.perf.v1.h[] b(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.v1.h[] hVarArr = new com.google.firebase.perf.v1.h[list.size()];
        com.google.firebase.perf.v1.h hVarA = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            com.google.firebase.perf.v1.h hVarA2 = list.get(i10).a();
            if (z10 || !list.get(i10).f47912d) {
                hVarArr[i10] = hVarA2;
            } else {
                hVarArr[0] = hVarA2;
                hVarArr[i10] = hVarA;
                z10 = true;
            }
        }
        if (!z10) {
            hVarArr[0] = hVarA;
        }
        return hVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    public static a c(String str) {
        boolean z10;
        q qVar;
        d<Double> dVar;
        d<Double> dVarB;
        double dDoubleValue;
        a aVar = new a(str.replace("-", ""), new e());
        p218r7.a aVarE = p218r7.a.e();
        if (aVarE.o()) {
            double dRandom = Math.random();
            synchronized (q.class) {
                try {
                    if (q.f46380c == null) {
                        q.f46380c = new q();
                    }
                    qVar = q.f46380c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            d<Double> dVarI = aVarE.i(qVar);
            if (dVarI.b()) {
                dDoubleValue = dVarI.a().doubleValue() / 100.0d;
                if (!p218r7.a.p(dDoubleValue)) {
                    dVar = aVarE.f46362a.getDouble("fpr_vc_session_sampling_rate");
                    if (dVar.b() || !p218r7.a.p(dVar.a().doubleValue())) {
                        dVarB = aVarE.b(qVar);
                        if (!dVarB.b() && p218r7.a.p(dVarB.a().doubleValue())) {
                            dDoubleValue = dVarB.a().doubleValue();
                        } else if (aVarE.f46362a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else {
                        aVarE.f46364c.e("com.google.firebase.perf.SessionSamplingRate", dVar.a().doubleValue());
                        dDoubleValue = dVar.a().doubleValue();
                    }
                }
            } else {
                dVar = aVarE.f46362a.getDouble("fpr_vc_session_sampling_rate");
                if (dVar.b()) {
                    dVarB = aVarE.b(qVar);
                    if (!dVarB.b()) {
                        if (aVarE.f46362a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (aVarE.f46362a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                } else {
                    dVarB = aVarE.b(qVar);
                    if (!dVarB.b()) {
                        if (aVarE.f46362a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (aVarE.f46362a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        aVar.f47912d = z10;
        return aVar;
    }

    public final com.google.firebase.perf.v1.h a() {
        com.google.firebase.perf.v1.h.b bVarL = com.google.firebase.perf.v1.h.L();
        bVarL.r();
        com.google.firebase.perf.v1.h.H((com.google.firebase.perf.v1.h) bVarL.f29047c, this.f47910b);
        if (this.f47912d) {
            bVarL.r();
            com.google.firebase.perf.v1.h.I((com.google.firebase.perf.v1.h) bVarL.f29047c);
        }
        return bVarL.p();
    }

    public final boolean d() {
        n nVar;
        long jLongValue;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.f47911c.a());
        p218r7.a aVarE = p218r7.a.e();
        aVarE.getClass();
        synchronized (n.class) {
            try {
                if (n.f46377c == null) {
                    n.f46377c = new n();
                }
                nVar = n.f46377c;
            } catch (Throwable th) {
                throw th;
            }
        }
        d<Long> dVarJ = aVarE.j(nVar);
        if (!dVarJ.b() || dVarJ.a().longValue() <= 0) {
            d<Long> dVar = aVarE.f46362a.getLong("fpr_session_max_duration_min");
            if (!dVar.b() || dVar.a().longValue() <= 0) {
                d<Long> dVarC = aVarE.c(nVar);
                jLongValue = (!dVarC.b() || dVarC.a().longValue() <= 0) ? 240L : dVarC.a().longValue();
            } else {
                aVarE.f46364c.d(dVar.a().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = dVar.a().longValue();
            }
        } else {
            jLongValue = dVarJ.a().longValue();
        }
        return minutes > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f47910b);
        parcel.writeByte(this.f47912d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f47911c, 0);
    }

    public a(Parcel parcel) {
        this.f47912d = false;
        this.f47910b = parcel.readString();
        this.f47912d = parcel.readByte() != 0;
        this.f47911c = (h) parcel.readParcelable(h.class.getClassLoader());
    }
}
