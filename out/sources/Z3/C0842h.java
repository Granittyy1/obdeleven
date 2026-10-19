package Z3;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Z3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AuthenticationToken.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0842h implements Parcelable {
    public static final Parcelable.Creator<C0842h> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f7824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0843i f7825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7826f;

    /* JADX INFO: renamed from: Z3.h$a */
    /* JADX INFO: compiled from: AuthenticationToken.kt */
    public static final class a implements Parcelable.Creator<C0842h> {
        @Override // android.os.Parcelable.Creator
        public final C0842h createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new C0842h(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C0842h[] newArray(int i10) {
            return new C0842h[i10];
        }
    }

    public C0842h(String str, String expectedNonce) {
        kotlin.jvm.internal.i.e(expectedNonce, "expectedNonce");
        p165n4.t.b(str, "token");
        p165n4.t.b(expectedNonce, "expectedNonce");
        boolean zC = false;
        List listE0 = kotlin.text.n.e0(str, new String[]{"."}, 0, 6);
        if (listE0.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str2 = (String) listE0.get(0);
        String str3 = (String) listE0.get(1);
        String str4 = (String) listE0.get(2);
        this.f7822b = str;
        this.f7823c = expectedNonce;
        j jVar = new j(str2);
        this.f7824d = jVar;
        this.f7825e = new C0843i(str3, expectedNonce);
        try {
            String strQ = O.e.q(jVar.f7848d);
            if (strQ != null) {
                zC = O.e.C(O.e.p(strQ), str2 + '.' + str3, str4);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (!zC) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.f7826f = str4;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f7822b);
        jSONObject.put("expected_nonce", this.f7823c);
        j jVar = this.f7824d;
        jVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", jVar.f7846b);
        jSONObject2.put("typ", jVar.f7847c);
        jSONObject2.put("kid", jVar.f7848d);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f7825e.a());
        jSONObject.put("signature", this.f7826f);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0842h)) {
            return false;
        }
        C0842h c0842h = (C0842h) obj;
        return kotlin.jvm.internal.i.a(this.f7822b, c0842h.f7822b) && kotlin.jvm.internal.i.a(this.f7823c, c0842h.f7823c) && kotlin.jvm.internal.i.a(this.f7824d, c0842h.f7824d) && kotlin.jvm.internal.i.a(this.f7825e, c0842h.f7825e) && kotlin.jvm.internal.i.a(this.f7826f, c0842h.f7826f);
    }

    public final int hashCode() {
        return this.f7826f.hashCode() + ((this.f7825e.hashCode() + ((this.f7824d.hashCode() + B1.a.b(this.f7823c, B1.a.b(this.f7822b, 527, 31), 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeString(this.f7822b);
        dest.writeString(this.f7823c);
        dest.writeParcelable(this.f7824d, i10);
        dest.writeParcelable(this.f7825e, i10);
        dest.writeString(this.f7826f);
    }

    public C0842h(Parcel parcel) {
        kotlin.jvm.internal.i.e(parcel, "parcel");
        String string = parcel.readString();
        p165n4.t.d(string, "token");
        this.f7822b = string;
        String string2 = parcel.readString();
        p165n4.t.d(string2, "expectedNonce");
        this.f7823c = string2;
        Parcelable parcelable = parcel.readParcelable(j.class.getClassLoader());
        if (parcelable != null) {
            this.f7824d = (j) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(C0843i.class.getClassLoader());
            if (parcelable2 != null) {
                this.f7825e = (C0843i) parcelable2;
                String string3 = parcel.readString();
                p165n4.t.d(string3, "signature");
                this.f7826f = string3;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
