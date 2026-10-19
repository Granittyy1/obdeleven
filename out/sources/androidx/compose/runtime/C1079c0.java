package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;

/* JADX INFO: renamed from: androidx.compose.runtime.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SnapshotFloatState.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1079c0 extends E0 implements Parcelable {
    public static final Parcelable.Creator<C1079c0> CREATOR = new a();

    /* JADX INFO: renamed from: androidx.compose.runtime.c0$a */
    /* JADX INFO: compiled from: SnapshotFloatState.android.kt */
    public static final class a implements Parcelable.Creator<C1079c0> {
        @Override // android.os.Parcelable.Creator
        public final C1079c0 createFromParcel(Parcel parcel) {
            return new C1079c0(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final C1079c0[] newArray(int i10) {
            return new C1079c0[i10];
        }
    }

    public C1079c0(float f10) {
        androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
        E0.a aVar = new E0.a(f10, gVarK.g());
        if (!(gVarK instanceof GlobalSnapshot)) {
            aVar.f13226b = new E0.a(f10, 1);
        }
        this.f12832c = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(j());
    }
}
