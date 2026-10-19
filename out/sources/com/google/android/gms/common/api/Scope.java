package com.google.android.gms.common.api;

import U4.C0804l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Scope extends V4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25303c;

    public Scope(int i10, String str) {
        C0804l.f(str, "scopeUri must not be null or empty");
        this.f25302b = i10;
        this.f25303c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f25303c.equals(((Scope) obj).f25303c);
    }

    public final int hashCode() {
        return this.f25303c.hashCode();
    }

    public final String toString() {
        return this.f25303c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f25302b);
        Fa.d.k(parcel, 2, this.f25303c);
        Fa.d.p(parcel, iO);
    }
}
