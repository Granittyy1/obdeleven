package F2;

import Q8.d;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C0873a;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: VersionedParcelParcel.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends VersionedParcel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f3203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f3204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3208i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3209k;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0873a(), new C0873a(), new C0873a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final a a() {
        Parcel parcel = this.f3204e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.j;
        if (i10 == this.f3205f) {
            i10 = this.f3206g;
        }
        return new a(parcel, iDataPosition, i10, d.a(new StringBuilder(), this.f3207h, "  "), this.f20212a, this.f20213b, this.f20214c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean e() {
        return this.f3204e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] f() {
        Parcel parcel = this.f3204e;
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3204e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean h(int i10) {
        while (this.j < this.f3206g) {
            int i11 = this.f3209k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.j;
            Parcel parcel = this.f3204e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f3209k = parcel.readInt();
            this.j += i13;
        }
        return this.f3209k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int i() {
        return this.f3204e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T k() {
        return (T) this.f3204e.readParcelable(a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String l() {
        return this.f3204e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void n(int i10) {
        w();
        this.f3208i = i10;
        this.f3203d.put(i10, this.f3204e.dataPosition());
        r(0);
        r(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void o(boolean z10) {
        this.f3204e.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(byte[] bArr) {
        Parcel parcel = this.f3204e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3204e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(int i10) {
        this.f3204e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(Parcelable parcelable) {
        this.f3204e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(String str) {
        this.f3204e.writeString(str);
    }

    public final void w() {
        int i10 = this.f3208i;
        if (i10 >= 0) {
            int i11 = this.f3203d.get(i10);
            Parcel parcel = this.f3204e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public a(Parcel parcel, int i10, int i11, String str, C0873a<String, Method> c0873a, C0873a<String, Method> c0873a2, C0873a<String, Class> c0873a3) {
        super(c0873a, c0873a2, c0873a3);
        this.f3203d = new SparseIntArray();
        this.f3208i = -1;
        this.f3209k = -1;
        this.f3204e = parcel;
        this.f3205f = i10;
        this.f3206g = i11;
        this.j = i10;
        this.f3207h = str;
    }
}
