package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentManagerState.java */
/* JADX INFO: loaded from: classes.dex */
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<String> f17371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<String> f17372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1337b[] f17373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17375f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<String> f17376g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<C1338c> f17377h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<y.n> f17378i;

    /* JADX INFO: compiled from: FragmentManagerState.java */
    public class a implements Parcelable.Creator<A> {
        @Override // android.os.Parcelable.Creator
        public final A createFromParcel(Parcel parcel) {
            A a10 = new A();
            a10.f17375f = null;
            a10.f17376g = new ArrayList<>();
            a10.f17377h = new ArrayList<>();
            a10.f17371b = parcel.createStringArrayList();
            a10.f17372c = parcel.createStringArrayList();
            a10.f17373d = (C1337b[]) parcel.createTypedArray(C1337b.CREATOR);
            a10.f17374e = parcel.readInt();
            a10.f17375f = parcel.readString();
            a10.f17376g = parcel.createStringArrayList();
            a10.f17377h = parcel.createTypedArrayList(C1338c.CREATOR);
            a10.f17378i = parcel.createTypedArrayList(y.n.CREATOR);
            return a10;
        }

        @Override // android.os.Parcelable.Creator
        public final A[] newArray(int i10) {
            return new A[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f17371b);
        parcel.writeStringList(this.f17372c);
        parcel.writeTypedArray(this.f17373d, i10);
        parcel.writeInt(this.f17374e);
        parcel.writeString(this.f17375f);
        parcel.writeStringList(this.f17376g);
        parcel.writeTypedList(this.f17377h);
        parcel.writeTypedList(this.f17378i);
    }
}
