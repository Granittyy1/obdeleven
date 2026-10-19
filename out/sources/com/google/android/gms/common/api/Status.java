package com.google.android.gms.common.api;

import S4.C0760b;
import U4.C0803k;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Status extends V4.a implements g, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f25304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f25305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f25306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f25307i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f25310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0760b f25311e;

    static {
        new Status(-1, null, null, null);
        f25304f = new Status(0, null, null, null);
        new Status(14, null, null, null);
        f25305g = new Status(8, null, null, null);
        f25306h = new Status(15, null, null, null);
        f25307i = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new j();
    }

    public Status(int i10, String str, PendingIntent pendingIntent, C0760b c0760b) {
        this.f25308b = i10;
        this.f25309c = str;
        this.f25310d = pendingIntent;
        this.f25311e = c0760b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f25308b == status.f25308b && C0803k.a(this.f25309c, status.f25309c) && C0803k.a(this.f25310d, status.f25310d) && C0803k.a(this.f25311e, status.f25311e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25308b), this.f25309c, this.f25310d, this.f25311e});
    }

    public final String toString() {
        C0803k.a aVar = new C0803k.a(this);
        String strA = this.f25309c;
        if (strA == null) {
            strA = b.a(this.f25308b);
        }
        aVar.a(strA, "statusCode");
        aVar.a(this.f25310d, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f25308b);
        Fa.d.k(parcel, 2, this.f25309c);
        Fa.d.j(parcel, 3, this.f25310d, i10);
        Fa.d.j(parcel, 4, this.f25311e, i10);
        Fa.d.p(parcel, iO);
    }

    @Override // com.google.android.gms.common.api.g
    public final Status d() {
        return this;
    }
}
