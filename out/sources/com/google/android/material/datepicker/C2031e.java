package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateValidatorPointForward.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2031e implements C2027a.c {
    public static final Parcelable.Creator<C2031e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27056b;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.e$a */
    /* JADX INFO: compiled from: DateValidatorPointForward.java */
    public class a implements Parcelable.Creator<C2031e> {
        @Override // android.os.Parcelable.Creator
        public final C2031e createFromParcel(Parcel parcel) {
            return new C2031e(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final C2031e[] newArray(int i10) {
            return new C2031e[i10];
        }
    }

    public C2031e(long j) {
        this.f27056b = j;
    }

    @Override // com.google.android.material.datepicker.C2027a.c
    public final boolean I(long j) {
        return j >= this.f27056b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2031e) && this.f27056b == ((C2031e) obj).f27056b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f27056b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27056b);
    }
}
