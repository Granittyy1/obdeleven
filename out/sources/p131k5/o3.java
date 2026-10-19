package p131k5;

import Fa.d;
import U4.C0804l;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class o3 extends a {
    public static final Parcelable.Creator<o3> CREATOR = new B3();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f42325A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f42326B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f42327C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f42328D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f42329E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f42330F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f42331G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f42336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f42337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f42338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f42339i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f42340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f42341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public final long f42342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f42343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f42344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f42345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f42346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f42347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Boolean f42348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f42349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<String> f42350u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f42351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f42352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f42353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f42354y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f42355z;

    public o3(String str, String str2, String str3, long j, String str4, long j10, long j11, String str5, boolean z10, boolean z11, String str6, long j12, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, boolean z14, long j14, int i11, String str11, int i12, long j15, String str12, String str13) {
        C0804l.e(str);
        this.f42332b = str;
        this.f42333c = TextUtils.isEmpty(str2) ? null : str2;
        this.f42334d = str3;
        this.f42340k = j;
        this.f42335e = str4;
        this.f42336f = j10;
        this.f42337g = j11;
        this.f42338h = str5;
        this.f42339i = z10;
        this.j = z11;
        this.f42341l = str6;
        this.f42342m = 0L;
        this.f42343n = j12;
        this.f42344o = i10;
        this.f42345p = z12;
        this.f42346q = z13;
        this.f42347r = str7;
        this.f42348s = bool;
        this.f42349t = j13;
        this.f42350u = list;
        this.f42351v = null;
        this.f42352w = str8;
        this.f42353x = str9;
        this.f42354y = str10;
        this.f42355z = z14;
        this.f42325A = j14;
        this.f42326B = i11;
        this.f42327C = str11;
        this.f42328D = i12;
        this.f42329E = j15;
        this.f42330F = str12;
        this.f42331G = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.k(parcel, 2, this.f42332b);
        d.k(parcel, 3, this.f42333c);
        d.k(parcel, 4, this.f42334d);
        d.k(parcel, 5, this.f42335e);
        d.n(parcel, 6, 8);
        parcel.writeLong(this.f42336f);
        d.n(parcel, 7, 8);
        parcel.writeLong(this.f42337g);
        d.k(parcel, 8, this.f42338h);
        d.n(parcel, 9, 4);
        parcel.writeInt(this.f42339i ? 1 : 0);
        d.n(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        d.n(parcel, 11, 8);
        parcel.writeLong(this.f42340k);
        d.k(parcel, 12, this.f42341l);
        d.n(parcel, 13, 8);
        parcel.writeLong(this.f42342m);
        d.n(parcel, 14, 8);
        parcel.writeLong(this.f42343n);
        d.n(parcel, 15, 4);
        parcel.writeInt(this.f42344o);
        d.n(parcel, 16, 4);
        parcel.writeInt(this.f42345p ? 1 : 0);
        d.n(parcel, 18, 4);
        parcel.writeInt(this.f42346q ? 1 : 0);
        d.k(parcel, 19, this.f42347r);
        Boolean bool = this.f42348s;
        if (bool != null) {
            d.n(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        d.n(parcel, 22, 8);
        parcel.writeLong(this.f42349t);
        List<String> list = this.f42350u;
        if (list != null) {
            int iO2 = d.o(parcel, 23);
            parcel.writeStringList(list);
            d.p(parcel, iO2);
        }
        d.k(parcel, 24, this.f42351v);
        d.k(parcel, 25, this.f42352w);
        d.k(parcel, 26, this.f42353x);
        d.k(parcel, 27, this.f42354y);
        d.n(parcel, 28, 4);
        parcel.writeInt(this.f42355z ? 1 : 0);
        d.n(parcel, 29, 8);
        parcel.writeLong(this.f42325A);
        d.n(parcel, 30, 4);
        parcel.writeInt(this.f42326B);
        d.k(parcel, 31, this.f42327C);
        d.n(parcel, 32, 4);
        parcel.writeInt(this.f42328D);
        d.n(parcel, 34, 8);
        parcel.writeLong(this.f42329E);
        d.k(parcel, 35, this.f42330F);
        d.k(parcel, 36, this.f42331G);
        d.p(parcel, iO);
    }

    public o3(String str, String str2, String str3, String str4, long j, long j10, String str5, boolean z10, boolean z11, long j11, String str6, long j12, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z14, long j15, int i11, String str12, int i12, long j16, String str13, String str14) {
        this.f42332b = str;
        this.f42333c = str2;
        this.f42334d = str3;
        this.f42340k = j11;
        this.f42335e = str4;
        this.f42336f = j;
        this.f42337g = j10;
        this.f42338h = str5;
        this.f42339i = z10;
        this.j = z11;
        this.f42341l = str6;
        this.f42342m = j12;
        this.f42343n = j13;
        this.f42344o = i10;
        this.f42345p = z12;
        this.f42346q = z13;
        this.f42347r = str7;
        this.f42348s = bool;
        this.f42349t = j14;
        this.f42350u = arrayList;
        this.f42351v = str8;
        this.f42352w = str9;
        this.f42353x = str10;
        this.f42354y = str11;
        this.f42355z = z14;
        this.f42325A = j15;
        this.f42326B = i11;
        this.f42327C = str12;
        this.f42328D = i12;
        this.f42329E = j16;
        this.f42330F = str13;
        this.f42331G = str14;
    }
}
