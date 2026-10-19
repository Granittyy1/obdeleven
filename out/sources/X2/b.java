package X2;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MemoryCache.kt */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: X2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MemoryCache.kt */
    public static final class C0101b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f7174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f7175b;

        public C0101b(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.f7174a = bitmap;
            this.f7175b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0101b) {
                C0101b c0101b = (C0101b) obj;
                if (i.a(this.f7174a, c0101b.f7174a) && i.a(this.f7175b, c0101b.f7175b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7175b.hashCode() + (this.f7174a.hashCode() * 31);
        }

        public final String toString() {
            return "Value(bitmap=" + this.f7174a + ", extras=" + this.f7175b + ')';
        }
    }

    void a(int i10);

    C0101b b(a aVar);

    void c(a aVar, C0101b c0101b);

    /* JADX INFO: compiled from: MemoryCache.kt */
    public static final class a implements Parcelable {

        @Deprecated
        public static final Parcelable.Creator<a> CREATOR = new C0100a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, String> f7173c;

        /* JADX INFO: renamed from: X2.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MemoryCache.kt */
        public static final class C0100a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                i.b(string);
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    String string2 = parcel.readString();
                    i.b(string2);
                    String string3 = parcel.readString();
                    i.b(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new a(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(String str, Map<String, String> map) {
            this.f7172b = str;
            this.f7173c = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (i.a(this.f7172b, aVar.f7172b) && i.a(this.f7173c, aVar.f7173c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7173c.hashCode() + (this.f7172b.hashCode() * 31);
        }

        public final String toString() {
            return "Key(key=" + this.f7172b + ", extras=" + this.f7173c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f7172b);
            Map<String, String> map = this.f7173c;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public /* synthetic */ a(String str) {
            this(str, y.p());
        }
    }
}
