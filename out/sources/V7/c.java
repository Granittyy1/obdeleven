package V7;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.facebook.login.o;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import okhttp3.r;
import okhttp3.y;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.s;
import retrofit2.h;

/* JADX INFO: compiled from: SerializationStrategyConverter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements h, s.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6736d;

    public c(r contentType, Ya.b bVar, d.a serializer) {
        i.e(contentType, "contentType");
        i.e(serializer, "serializer");
        this.f6734b = contentType;
        this.f6735c = bVar;
        this.f6736d = serializer;
    }

    @Override // n4.s.a
    public void a(JSONObject jSONObject) {
        String string;
        Bundle bundle = (Bundle) this.f6734b;
        o oVar = (o) this.f6735c;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e10) {
                LoginClient loginClientD = oVar.d();
                LoginClient.b bVar = oVar.d().f25061h;
                String message = e10.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                loginClientD.c(new LoginClient.Result(bVar, LoginClient.Result.Code.ERROR, null, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        oVar.m((LoginClient.b) this.f6736d, bundle);
    }

    @Override // retrofit2.h
    public Object b(Object obj) {
        Ya.b bVar = (Ya.b) this.f6735c;
        d.a aVar = (d.a) this.f6736d;
        aVar.getClass();
        r contentType = (r) this.f6734b;
        i.e(contentType, "contentType");
        y yVarCreate = y.create(contentType, aVar.f6737a.b(bVar, obj));
        i.d(yVarCreate, "create(contentType, string)");
        return yVarCreate;
    }

    @Override // n4.s.a
    public void c(FacebookException facebookException) {
        o oVar = (o) this.f6735c;
        LoginClient loginClientD = oVar.d();
        LoginClient.b bVar = oVar.d().f25061h;
        String message = facebookException == null ? null : facebookException.getMessage();
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        loginClientD.c(new LoginClient.Result(bVar, LoginClient.Result.Code.ERROR, null, null, TextUtils.join(": ", arrayList), null));
    }

    public c(Bundle bundle, o oVar, LoginClient.b bVar) {
        this.f6734b = bundle;
        this.f6735c = oVar;
        this.f6736d = bVar;
    }
}
