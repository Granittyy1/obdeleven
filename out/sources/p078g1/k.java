package p078g1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import p114j1.A;

/* JADX INFO: compiled from: DrmInitData.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f35264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35267e;

    /* JADX INFO: compiled from: DrmInitData.java */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k() {
        throw null;
    }

    public k(String str, boolean z10, b... bVarArr) {
        this.f35266d = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f35264b = bVarArr;
        this.f35267e = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public final k a(String str) {
        return Objects.equals(this.f35266d, str) ? this : new k(str, false, this.f35264b);
    }

    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = g.f35248a;
        if (uuid.equals(bVar3.f35269c)) {
            return uuid.equals(bVar4.f35269c) ? 0 : 1;
        }
        return bVar3.f35269c.compareTo(bVar4.f35269c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f35266d, kVar.f35266d) && Arrays.equals(this.f35264b, kVar.f35264b);
    }

    public final int hashCode() {
        if (this.f35265c == 0) {
            String str = this.f35266d;
            this.f35265c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f35264b);
        }
        return this.f35265c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f35266d);
        parcel.writeTypedArray(this.f35264b, 0);
    }

    /* JADX INFO: compiled from: DrmInitData.java */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f35269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f35270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f35271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f35272f;

        /* JADX INFO: compiled from: DrmInitData.java */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f35269c = uuid;
            this.f35270d = str;
            str2.getClass();
            this.f35271e = t.m(str2);
            this.f35272f = bArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f35270d, bVar.f35270d) && Objects.equals(this.f35271e, bVar.f35271e) && Objects.equals(this.f35269c, bVar.f35269c) && Arrays.equals(this.f35272f, bVar.f35272f);
        }

        public final int hashCode() {
            if (this.f35268b == 0) {
                int iHashCode = this.f35269c.hashCode() * 31;
                String str = this.f35270d;
                this.f35268b = Arrays.hashCode(this.f35272f) + B1.a.b(this.f35271e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f35268b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            UUID uuid = this.f35269c;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f35270d);
            parcel.writeString(this.f35271e);
            parcel.writeByteArray(this.f35272f);
        }

        public b(Parcel parcel) {
            this.f35269c = new UUID(parcel.readLong(), parcel.readLong());
            this.f35270d = parcel.readString();
            String string = parcel.readString();
            int i10 = A.f40996a;
            this.f35271e = string;
            this.f35272f = parcel.createByteArray();
        }
    }

    public k(Parcel parcel) {
        this.f35266d = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i10 = A.f40996a;
        this.f35264b = bVarArr;
        this.f35267e = bVarArr.length;
    }
}
