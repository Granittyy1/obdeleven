package p255u9;

import com.parse.ParseRelation;
import com.parse.ParseUser;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* JADX INFO: compiled from: UserDB.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends ParseUser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47484b = 0;

    public final JSONObject a() {
        JSONObject jSONObject = getJSONObject("settings");
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final ParseRelation<E> b() {
        ParseRelation<E> relation = getRelation("vehicles");
        i.d(relation, "getRelation(...)");
        return relation;
    }
}
