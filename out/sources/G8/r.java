package G8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: compiled from: LoginData.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r implements Parcelable {

    /* JADX INFO: compiled from: LoginData.kt */
    public static final class a extends r {
        public static final Parcelable.Creator<a> CREATOR = new C0040a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3532c;

        /* JADX INFO: renamed from: G8.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LoginData.kt */
        public static final class C0040a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(String email, String password) {
            kotlin.jvm.internal.i.e(email, "email");
            kotlin.jvm.internal.i.e(password, "password");
            this.f3531b = email;
            this.f3532c = password;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f3531b, aVar.f3531b) && kotlin.jvm.internal.i.a(this.f3532c, aVar.f3532c);
        }

        public final int hashCode() {
            return this.f3532c.hashCode() + (this.f3531b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EmailLogin(email=");
            sb2.append(this.f3531b);
            sb2.append(", password=");
            return Q8.d.a(sb2, this.f3532c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i10) {
            kotlin.jvm.internal.i.e(out, "out");
            out.writeString(this.f3531b);
            out.writeString(this.f3532c);
        }
    }

    /* JADX INFO: compiled from: LoginData.kt */
    public static final class b extends r {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Date f3535d;

        /* JADX INFO: compiled from: LoginData.kt */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(String id, String accessToken, Date expirationDate) {
            kotlin.jvm.internal.i.e(id, "id");
            kotlin.jvm.internal.i.e(accessToken, "accessToken");
            kotlin.jvm.internal.i.e(expirationDate, "expirationDate");
            this.f3533b = id;
            this.f3534c = accessToken;
            this.f3535d = expirationDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.i.a(this.f3533b, bVar.f3533b) && kotlin.jvm.internal.i.a(this.f3534c, bVar.f3534c) && kotlin.jvm.internal.i.a(this.f3535d, bVar.f3535d);
        }

        public final int hashCode() {
            return this.f3535d.hashCode() + B1.a.b(this.f3534c, this.f3533b.hashCode() * 31, 31);
        }

        public final String toString() {
            return "FacebookLogin(id=" + this.f3533b + ", accessToken=" + this.f3534c + ", expirationDate=" + this.f3535d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i10) {
            kotlin.jvm.internal.i.e(out, "out");
            out.writeString(this.f3533b);
            out.writeString(this.f3534c);
            out.writeSerializable(this.f3535d);
        }
    }
}
