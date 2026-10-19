package p144l6;

import R4.E;
import U4.C0803k;
import U4.C0804l;
import Y4.g;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: FirebaseOptions.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44406g;

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = g.f7609a;
        C0804l.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f44401b = str;
        this.f44400a = str2;
        this.f44402c = str3;
        this.f44403d = str4;
        this.f44404e = str5;
        this.f44405f = str6;
        this.f44406g = str7;
    }

    public static f a(Context context) {
        E e10 = new E(context);
        String strA = e10.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new f(strA, e10.a("google_api_key"), e10.a("firebase_database_url"), e10.a("ga_trackingId"), e10.a("gcm_defaultSenderId"), e10.a("google_storage_bucket"), e10.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C0803k.a(this.f44401b, fVar.f44401b) && C0803k.a(this.f44400a, fVar.f44400a) && C0803k.a(this.f44402c, fVar.f44402c) && C0803k.a(this.f44403d, fVar.f44403d) && C0803k.a(this.f44404e, fVar.f44404e) && C0803k.a(this.f44405f, fVar.f44405f) && C0803k.a(this.f44406g, fVar.f44406g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44401b, this.f44400a, this.f44402c, this.f44403d, this.f44404e, this.f44405f, this.f44406g});
    }

    public final String toString() {
        C0803k.a aVar = new C0803k.a(this);
        aVar.a(this.f44401b, "applicationId");
        aVar.a(this.f44400a, "apiKey");
        aVar.a(this.f44402c, "databaseUrl");
        aVar.a(this.f44404e, "gcmSenderId");
        aVar.a(this.f44405f, "storageBucket");
        aVar.a(this.f44406g, "projectId");
        return aVar.toString();
    }
}
