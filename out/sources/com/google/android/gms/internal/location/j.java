package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends V4.a {
    public static final Parcelable.Creator<j> CREATOR = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzex f25378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f25379g;

    static {
        Process.myUid();
        Process.myPid();
    }

    @p293xa.d
    public j(int i10, String packageName, String str, String str2, ArrayList arrayList, j jVar) {
        kotlin.jvm.internal.i.e(packageName, "packageName");
        if (jVar != null && jVar.f25379g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f25374b = i10;
        this.f25375c = packageName;
        this.f25376d = str;
        this.f25377e = str2 == null ? jVar != null ? jVar.f25377e : null : str2;
        Collection collection = arrayList;
        if (arrayList == null) {
            zzex zzexVar = jVar != null ? jVar.f25378f : null;
            collection = zzexVar;
            if (zzexVar == null) {
                n nVar = zzex.f25387c;
                zzex zzexVar2 = zzey.f25388f;
                kotlin.jvm.internal.i.d(zzexVar2, "of(...)");
                collection = zzexVar2;
            }
        }
        n nVar2 = zzex.f25387c;
        Object[] array = collection.toArray();
        int length = array.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (array[i11] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 9);
                sb2.append("at index ");
                sb2.append(i11);
                throw new NullPointerException(sb2.toString());
            }
        }
        zzex zzeyVar = length == 0 ? zzey.f25388f : new zzey(length, array);
        kotlin.jvm.internal.i.d(zzeyVar, "copyOf(...)");
        this.f25378f = zzeyVar;
        this.f25379g = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f25374b == jVar.f25374b && kotlin.jvm.internal.i.a(this.f25375c, jVar.f25375c) && kotlin.jvm.internal.i.a(this.f25376d, jVar.f25376d) && kotlin.jvm.internal.i.a(this.f25377e, jVar.f25377e) && kotlin.jvm.internal.i.a(this.f25379g, jVar.f25379g) && kotlin.jvm.internal.i.a(this.f25378f, jVar.f25378f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25374b), this.f25375c, this.f25376d, this.f25377e, this.f25379g});
    }

    public final String toString() {
        String str = this.f25375c;
        int length = str.length() + 18;
        String str2 = this.f25376d;
        StringBuilder sb2 = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb2.append(this.f25374b);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (kotlin.text.m.I(str2, str, false)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f25377e;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int iO = Fa.d.o(dest, 20293);
        Fa.d.n(dest, 1, 4);
        dest.writeInt(this.f25374b);
        Fa.d.k(dest, 3, this.f25375c);
        Fa.d.k(dest, 4, this.f25376d);
        Fa.d.k(dest, 6, this.f25377e);
        Fa.d.j(dest, 7, this.f25379g, i10);
        Fa.d.m(dest, 8, this.f25378f);
        Fa.d.p(dest, iO);
    }
}
