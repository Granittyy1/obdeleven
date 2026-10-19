package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface a2 extends IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20717a = a.f20718a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f20718a = new a();

        private a() {
        }
    }

    j1 a();

    void a(v5 v5Var);

    void a(String str);

    default String f() {
        String string = ((JSONObject) forJsonPut()).toString();
        kotlin.jvm.internal.i.d(string, "forJsonPut().toString()");
        return string;
    }

    boolean m();

    JSONObject q();

    v5 s();

    String t();
}
