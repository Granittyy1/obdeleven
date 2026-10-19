package Q8;

import C7.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.animation.D;
import com.voltasit.obdeleven.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.q;

/* JADX INFO: compiled from: BluetoothDeviceInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable<b>, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new C0074b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5132g;

    /* JADX INFO: compiled from: BluetoothDeviceInfo.kt */
    public static final class a {
        public static ArrayList a(String str) {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                return arrayList;
            }
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    i.d(jSONObject, "getJSONObject(...)");
                    arrayList.add(new b(jSONObject));
                }
            } catch (JSONException e10) {
                p279w9.b bVar = Application.f29634b;
                P8.c.b(e10);
            }
            return arrayList;
        }

        public static String b(List list) {
            JSONObject jSONObject;
            i.e(list, "list");
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                bVar.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("alias", bVar.f5127b);
                    jSONObject.put("originalName", bVar.f5131f);
                    jSONObject.put("mac", bVar.f5128c);
                    jSONObject.put("priority", bVar.f5130e);
                    jSONObject.put("isLowEnergy", bVar.f5129d);
                } catch (JSONException e10) {
                    p279w9.b bVar2 = Application.f29634b;
                    P8.c.b(e10);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
            String string = jSONArray.toString();
            i.d(string, "toString(...)");
            return string;
        }
    }

    /* JADX INFO: renamed from: Q8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BluetoothDeviceInfo.kt */
    public static final class C0074b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new b(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b() {
        this(0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b other = bVar;
        i.e(other, "other");
        return this.f5130e - other.f5130e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !b.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        String str = ((b) obj).f5128c;
        String str2 = this.f5128c;
        if (str2 == null) {
            return str == null;
        }
        return i.a(str2, str);
    }

    public final int hashCode() {
        String str = this.f5127b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5128c;
        int iB = q.b(this.f5130e, D.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f5129d), 31);
        String str3 = this.f5131f;
        return Boolean.hashCode(this.f5132g) + ((iB + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f5127b;
        int i10 = this.f5130e;
        boolean z10 = this.f5132g;
        StringBuilder sbA = g.a("BluetoothDeviceInfo(alias=", str, ", mac=");
        sbA.append(this.f5128c);
        sbA.append(", isLowEnergy=");
        sbA.append(this.f5129d);
        sbA.append(", priority=");
        sbA.append(i10);
        sbA.append(", originalName=");
        sbA.append(this.f5131f);
        sbA.append(", isReachable=");
        sbA.append(z10);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        i.e(out, "out");
        out.writeString(this.f5127b);
        out.writeString(this.f5128c);
        out.writeInt(this.f5129d ? 1 : 0);
        out.writeInt(this.f5130e);
        out.writeString(this.f5131f);
        out.writeInt(this.f5132g ? 1 : 0);
    }

    public b(int i10, String str, String str2, String str3, boolean z10, boolean z11) {
        this.f5127b = str;
        this.f5128c = str2;
        this.f5129d = z10;
        this.f5130e = i10;
        this.f5131f = str3;
        this.f5132g = z11;
    }

    public /* synthetic */ b(int i10) {
        this(0, "", "", null, false, false);
    }

    public b(JSONObject jSONObject) {
        this(0);
        this.f5127b = jSONObject.optString("alias");
        this.f5131f = jSONObject.optString("originalName");
        this.f5128c = jSONObject.optString("mac");
        this.f5130e = jSONObject.optInt("priority");
        this.f5129d = jSONObject.optBoolean("isLowEnergy");
        this.f5132g = false;
    }
}
