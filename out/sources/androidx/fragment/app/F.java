package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: FragmentState.java */
/* JADX INFO: loaded from: classes.dex */
public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17428i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f17430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f17431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f17432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f17433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17434p;

    /* JADX INFO: compiled from: FragmentState.java */
    public class a implements Parcelable.Creator<F> {
        @Override // android.os.Parcelable.Creator
        public final F createFromParcel(Parcel parcel) {
            return new F(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final F[] newArray(int i10) {
            return new F[i10];
        }
    }

    public F(Fragment fragment) {
        this.f17421b = fragment.getClass().getName();
        this.f17422c = fragment.mWho;
        this.f17423d = fragment.mFromLayout;
        this.f17424e = fragment.mInDynamicContainer;
        this.f17425f = fragment.mFragmentId;
        this.f17426g = fragment.mContainerId;
        this.f17427h = fragment.mTag;
        this.f17428i = fragment.mRetainInstance;
        this.j = fragment.mRemoving;
        this.f17429k = fragment.mDetached;
        this.f17430l = fragment.mHidden;
        this.f17431m = fragment.mMaxState.ordinal();
        this.f17432n = fragment.mTargetWho;
        this.f17433o = fragment.mTargetRequestCode;
        this.f17434p = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f17421b);
        sb2.append(" (");
        sb2.append(this.f17422c);
        sb2.append(")}:");
        if (this.f17423d) {
            sb2.append(" fromLayout");
        }
        if (this.f17424e) {
            sb2.append(" dynamicContainer");
        }
        int i10 = this.f17426g;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f17427h;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f17428i) {
            sb2.append(" retainInstance");
        }
        if (this.j) {
            sb2.append(" removing");
        }
        if (this.f17429k) {
            sb2.append(" detached");
        }
        if (this.f17430l) {
            sb2.append(" hidden");
        }
        String str2 = this.f17432n;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f17433o);
        }
        if (this.f17434p) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17421b);
        parcel.writeString(this.f17422c);
        parcel.writeInt(this.f17423d ? 1 : 0);
        parcel.writeInt(this.f17424e ? 1 : 0);
        parcel.writeInt(this.f17425f);
        parcel.writeInt(this.f17426g);
        parcel.writeString(this.f17427h);
        parcel.writeInt(this.f17428i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.f17429k ? 1 : 0);
        parcel.writeInt(this.f17430l ? 1 : 0);
        parcel.writeInt(this.f17431m);
        parcel.writeString(this.f17432n);
        parcel.writeInt(this.f17433o);
        parcel.writeInt(this.f17434p ? 1 : 0);
    }

    public F(Parcel parcel) {
        this.f17421b = parcel.readString();
        this.f17422c = parcel.readString();
        this.f17423d = parcel.readInt() != 0;
        this.f17424e = parcel.readInt() != 0;
        this.f17425f = parcel.readInt();
        this.f17426g = parcel.readInt();
        this.f17427h = parcel.readString();
        this.f17428i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.f17429k = parcel.readInt() != 0;
        this.f17430l = parcel.readInt() != 0;
        this.f17431m = parcel.readInt();
        this.f17432n = parcel.readString();
        this.f17433o = parcel.readInt();
        this.f17434p = parcel.readInt() != 0;
    }
}
