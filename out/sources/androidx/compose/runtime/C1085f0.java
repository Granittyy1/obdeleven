package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.compose.runtime.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SnapshotState.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1085f0<T> extends H0<T> implements Parcelable {
    public static final Parcelable.Creator<C1085f0<Object>> CREATOR = new a();

    /* JADX INFO: renamed from: androidx.compose.runtime.f0$a */
    /* JADX INFO: compiled from: SnapshotState.android.kt */
    public static final class a implements Parcelable.ClassLoaderCreator<C1085f0<Object>> {
        public static C1085f0 a(Parcel parcel, ClassLoader classLoader) {
            I0 i10;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i11 = parcel.readInt();
            if (i11 == 0) {
                i10 = Z.f12934a;
            } else if (i11 == 1) {
                i10 = Q0.f12888a;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException(J4.i.c(i11, "Unsupported MutableState policy ", " was restored"));
                }
                i10 = C1108r0.f13116a;
            }
            return new C1085f0(value, i10);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ C1085f0<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new C1085f0[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        Z z10 = Z.f12934a;
        I0<T> i12 = this.f12846c;
        if (kotlin.jvm.internal.i.a(i12, z10)) {
            i11 = 0;
        } else if (kotlin.jvm.internal.i.a(i12, Q0.f12888a)) {
            i11 = 1;
        } else {
            if (!kotlin.jvm.internal.i.a(i12, C1108r0.f13116a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
