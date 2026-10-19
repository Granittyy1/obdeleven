package p105i4;

import I2.e;
import com.facebook.appevents.ml.ModelManager;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.B;
import kotlin.collections.y;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f36726m = y.r(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f36727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f36728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f36729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f36730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f36731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f36732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f36733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f36734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f36735i;
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f36736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f36737l;

    public b(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36727a = (a) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36728b = e.r((a) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36729c = e.r((a) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36730d = e.r((a) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36731e = (a) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36732f = (a) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36733g = (a) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36734h = e.q((a) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36735i = e.q((a) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.j = (a) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36736k = (a) obj11;
        this.f36737l = new HashMap();
        for (String str : B.C(ModelManager.Task.f24948b.a(), ModelManager.Task.f24949c.a())) {
            String strK = i.k(".weight", str);
            String strK2 = i.k(".bias", str);
            a aVar = (a) map.get(strK);
            a aVar2 = (a) map.get(strK2);
            if (aVar != null) {
                this.f36737l.put(strK, e.q(aVar));
            }
            if (aVar2 != null) {
                this.f36737l.put(strK2, aVar2);
            }
        }
    }
}
