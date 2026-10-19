package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;

/* JADX INFO: renamed from: androidx.compose.runtime.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SnapshotLongState.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1083e0 extends G0 implements Parcelable {
    public static final Parcelable.Creator<C1083e0> CREATOR = new a();

    /* JADX INFO: renamed from: androidx.compose.runtime.e0$a */
    /* JADX INFO: compiled from: SnapshotLongState.android.kt */
    public static final class a implements Parcelable.Creator<C1083e0> {
        @Override // android.os.Parcelable.Creator
        public final C1083e0 createFromParcel(Parcel parcel) {
            return new C1083e0(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final C1083e0[] newArray(int i10) {
            return new C1083e0[i10];
        }
    }

    public C1083e0(long j) {
        androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
        G0.a aVar = new G0.a(gVarK.g(), j);
        if (!(gVarK instanceof GlobalSnapshot)) {
            aVar.f13226b = new G0.a(1, j);
        }
        this.f12843c = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(b());
    }
}
