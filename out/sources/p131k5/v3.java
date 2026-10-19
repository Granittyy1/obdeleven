package p131k5;

import Fa.d;
import U4.C0804l;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 extends a {
    public static final Parcelable.Creator<v3> CREATOR = new x3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f42505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f42508h;

    /* JADX WARN: Illegal instructions before constructor call */
    public v3(w3 w3Var) {
        String str = w3Var.f42521c;
        this(w3Var.f42522d, w3Var.f42523e, str, w3Var.f42520b);
    }

    public final Object a() {
        Long l10 = this.f42505e;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f42508h;
        if (d10 != null) {
            return d10;
        }
        String str = this.f42506f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.n(parcel, 1, 4);
        parcel.writeInt(this.f42502b);
        d.k(parcel, 2, this.f42503c);
        d.n(parcel, 3, 8);
        parcel.writeLong(this.f42504d);
        Long l10 = this.f42505e;
        if (l10 != null) {
            d.n(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        d.k(parcel, 6, this.f42506f);
        d.k(parcel, 7, this.f42507g);
        Double d10 = this.f42508h;
        if (d10 != null) {
            d.n(parcel, 8, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        d.p(parcel, iO);
    }

    public v3(long j, Object obj, String str, String str2) {
        C0804l.e(str);
        this.f42502b = 2;
        this.f42503c = str;
        this.f42504d = j;
        this.f42507g = str2;
        if (obj == null) {
            this.f42505e = null;
            this.f42508h = null;
            this.f42506f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f42505e = (Long) obj;
            this.f42508h = null;
            this.f42506f = null;
        } else if (obj instanceof String) {
            this.f42505e = null;
            this.f42508h = null;
            this.f42506f = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f42505e = null;
            this.f42508h = (Double) obj;
            this.f42506f = null;
        }
    }

    public v3(int i10, String str, long j, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f42502b = i10;
        this.f42503c = str;
        this.f42504d = j;
        this.f42505e = l10;
        if (i10 == 1) {
            this.f42508h = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f42508h = d10;
        }
        this.f42506f = str2;
        this.f42507g = str3;
    }
}
