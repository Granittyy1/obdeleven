package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackStackState.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1338c implements Parcelable {
    public static final Parcelable.Creator<C1338c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17586c;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    /* JADX INFO: compiled from: BackStackState.java */
    public class a implements Parcelable.Creator<C1338c> {
        @Override // android.os.Parcelable.Creator
        public final C1338c createFromParcel(Parcel parcel) {
            return new C1338c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C1338c[] newArray(int i10) {
            return new C1338c[i10];
        }
    }

    public C1338c(Parcel parcel) {
        this.f17585b = parcel.createStringArrayList();
        this.f17586c = parcel.createTypedArrayList(C1337b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f17585b);
        parcel.writeTypedList(this.f17586c);
    }
}
