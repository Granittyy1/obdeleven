package androidx.compose.foundation.lazy.layout;

import A1.C0575j;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Lazy.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0969d implements Parcelable {
    public static final Parcelable.Creator<C0969d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10713b;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d$a */
    /* JADX INFO: compiled from: Lazy.android.kt */
    public static final class a implements Parcelable.Creator<C0969d> {
        @Override // android.os.Parcelable.Creator
        public final C0969d createFromParcel(Parcel parcel) {
            return new C0969d(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C0969d[] newArray(int i10) {
            return new C0969d[i10];
        }
    }

    public C0969d(int i10) {
        this.f10713b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0969d) && this.f10713b == ((C0969d) obj).f10713b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10713b);
    }

    public final String toString() {
        return C0575j.b(new StringBuilder("DefaultLazyKey(index="), this.f10713b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10713b);
    }
}
