package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;

/* JADX INFO: renamed from: androidx.compose.runtime.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SnapshotIntState.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1081d0 extends F0 implements Parcelable {
    public static final Parcelable.Creator<C1081d0> CREATOR = new a();

    /* JADX INFO: renamed from: androidx.compose.runtime.d0$a */
    /* JADX INFO: compiled from: SnapshotIntState.android.kt */
    public static final class a implements Parcelable.Creator<C1081d0> {
        @Override // android.os.Parcelable.Creator
        public final C1081d0 createFromParcel(Parcel parcel) {
            return new C1081d0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C1081d0[] newArray(int i10) {
            return new C1081d0[i10];
        }
    }

    public C1081d0(int i10) {
        androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
        F0.a aVar = new F0.a(i10, gVarK.g());
        if (!(gVarK instanceof GlobalSnapshot)) {
            aVar.f13226b = new F0.a(i10, 1);
        }
        this.f12837c = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(o());
    }
}
