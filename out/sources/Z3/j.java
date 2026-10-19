package Z3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AuthenticationTokenHeader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7848d;

    /* JADX INFO: compiled from: AuthenticationTokenHeader.kt */
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new j(source);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(String encodedHeaderString) throws JSONException {
        kotlin.jvm.internal.i.e(encodedHeaderString, "encodedHeaderString");
        p165n4.t.b(encodedHeaderString, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.i.d(decodedBytes, "decodedBytes");
        Charset charset = kotlin.text.a.f43120b;
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, charset));
            String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.i.d(alg, "alg");
            boolean z10 = alg.length() > 0 && alg.equals("RS256");
            String strOptString = jSONObject.optString("kid");
            kotlin.jvm.internal.i.d(strOptString, "jsonObj.optString(\"kid\")");
            boolean z11 = strOptString.length() > 0;
            String strOptString2 = jSONObject.optString("typ");
            kotlin.jvm.internal.i.d(strOptString2, "jsonObj.optString(\"typ\")");
            boolean z12 = strOptString2.length() > 0;
            if (z10 && z11 && z12) {
                byte[] decodedBytes2 = Base64.decode(encodedHeaderString, 0);
                kotlin.jvm.internal.i.d(decodedBytes2, "decodedBytes");
                JSONObject jSONObject2 = new JSONObject(new String(decodedBytes2, charset));
                String string = jSONObject2.getString("alg");
                kotlin.jvm.internal.i.d(string, "jsonObj.getString(\"alg\")");
                this.f7846b = string;
                String string2 = jSONObject2.getString("typ");
                kotlin.jvm.internal.i.d(string2, "jsonObj.getString(\"typ\")");
                this.f7847c = string2;
                String string3 = jSONObject2.getString("kid");
                kotlin.jvm.internal.i.d(string3, "jsonObj.getString(\"kid\")");
                this.f7848d = string3;
                return;
            }
        } catch (JSONException unused) {
        }
        throw new IllegalArgumentException("Invalid Header");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.i.a(this.f7846b, jVar.f7846b) && kotlin.jvm.internal.i.a(this.f7847c, jVar.f7847c) && kotlin.jvm.internal.i.a(this.f7848d, jVar.f7848d);
    }

    public final int hashCode() {
        return this.f7848d.hashCode() + B1.a.b(this.f7847c, B1.a.b(this.f7846b, 527, 31), 31);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f7846b);
        jSONObject.put("typ", this.f7847c);
        jSONObject.put("kid", this.f7848d);
        String string = jSONObject.toString();
        kotlin.jvm.internal.i.d(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeString(this.f7846b);
        dest.writeString(this.f7847c);
        dest.writeString(this.f7848d);
    }

    public j(Parcel parcel) {
        kotlin.jvm.internal.i.e(parcel, "parcel");
        String string = parcel.readString();
        p165n4.t.d(string, "alg");
        this.f7846b = string;
        String string2 = parcel.readString();
        p165n4.t.d(string2, "typ");
        this.f7847c = string2;
        String string3 = parcel.readString();
        p165n4.t.d(string3, "kid");
        this.f7848d = string3;
    }
}
