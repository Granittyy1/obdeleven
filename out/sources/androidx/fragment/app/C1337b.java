package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackStackRecordState.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1337b implements Parcelable {
    public static final Parcelable.Creator<C1337b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f17572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f17573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f17574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f17575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17579i;
    public final CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f17580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CharSequence f17581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f17582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<String> f17583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17584o;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    /* JADX INFO: compiled from: BackStackRecordState.java */
    public class a implements Parcelable.Creator<C1337b> {
        @Override // android.os.Parcelable.Creator
        public final C1337b createFromParcel(Parcel parcel) {
            return new C1337b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C1337b[] newArray(int i10) {
            return new C1337b[i10];
        }
    }

    public C1337b(C1336a c1336a) {
        int size = c1336a.f17484a.size();
        this.f17572b = new int[size * 6];
        if (!c1336a.f17490g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f17573c = new ArrayList<>(size);
        this.f17574d = new int[size];
        this.f17575e = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            I.a aVar = c1336a.f17484a.get(i11);
            int i12 = i10 + 1;
            this.f17572b[i10] = aVar.f17500a;
            ArrayList<String> arrayList = this.f17573c;
            Fragment fragment = aVar.f17501b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f17572b;
            iArr[i12] = aVar.f17502c ? 1 : 0;
            iArr[i10 + 2] = aVar.f17503d;
            iArr[i10 + 3] = aVar.f17504e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f17505f;
            i10 += 6;
            iArr[i13] = aVar.f17506g;
            this.f17574d[i11] = aVar.f17507h.ordinal();
            this.f17575e[i11] = aVar.f17508i.ordinal();
        }
        this.f17576f = c1336a.f17489f;
        this.f17577g = c1336a.f17492i;
        this.f17578h = c1336a.f17571t;
        this.f17579i = c1336a.j;
        this.j = c1336a.f17493k;
        this.f17580k = c1336a.f17494l;
        this.f17581l = c1336a.f17495m;
        this.f17582m = c1336a.f17496n;
        this.f17583n = c1336a.f17497o;
        this.f17584o = c1336a.f17498p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f17572b);
        parcel.writeStringList(this.f17573c);
        parcel.writeIntArray(this.f17574d);
        parcel.writeIntArray(this.f17575e);
        parcel.writeInt(this.f17576f);
        parcel.writeString(this.f17577g);
        parcel.writeInt(this.f17578h);
        parcel.writeInt(this.f17579i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.f17580k);
        TextUtils.writeToParcel(this.f17581l, parcel, 0);
        parcel.writeStringList(this.f17582m);
        parcel.writeStringList(this.f17583n);
        parcel.writeInt(this.f17584o ? 1 : 0);
    }

    public C1337b(Parcel parcel) {
        this.f17572b = parcel.createIntArray();
        this.f17573c = parcel.createStringArrayList();
        this.f17574d = parcel.createIntArray();
        this.f17575e = parcel.createIntArray();
        this.f17576f = parcel.readInt();
        this.f17577g = parcel.readString();
        this.f17578h = parcel.readInt();
        this.f17579i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.j = (CharSequence) creator.createFromParcel(parcel);
        this.f17580k = parcel.readInt();
        this.f17581l = (CharSequence) creator.createFromParcel(parcel);
        this.f17582m = parcel.createStringArrayList();
        this.f17583n = parcel.createStringArrayList();
        this.f17584o = parcel.readInt() != 0;
    }
}
