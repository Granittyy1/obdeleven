package Ya;

import io.intercom.android.sdk.AppIdentityInjector;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import p037cb.y0;
import p141l2.z;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7640c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f7639b = i10;
        this.f7640c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, xa.g] */
    @Override // Ia.a
    public final Object invoke() {
        Object obj = this.f7640c;
        switch (this.f7639b) {
            case 0:
                final f fVar = (f) obj;
                p011ab.h hVarC = p011ab.l.c("kotlinx.serialization.Polymorphic", ab.c.a.f8092a, new p011ab.e[0], new Ia.l() { // from class: Ya.e
                    @Override // Ia.l
                    public final Object invoke(Object obj2) {
                        p011ab.a buildSerialDescriptor = (p011ab.a) obj2;
                        kotlin.jvm.internal.i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        p011ab.a.b(buildSerialDescriptor, "type", y0.f22678b);
                        StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Polymorphic<");
                        f fVar2 = fVar;
                        sb2.append(fVar2.f7642a.a());
                        sb2.append('>');
                        p011ab.a.b(buildSerialDescriptor, "value", p011ab.l.c(sb2.toString(), ab.m.a.f8122a, new p011ab.e[0], new p011ab.k(0)));
                        EmptyList emptyList = fVar2.f7643b;
                        kotlin.jvm.internal.i.e(emptyList, "<set-?>");
                        buildSerialDescriptor.f8083b = emptyList;
                        return r.f47939a;
                    }
                });
                kotlin.jvm.internal.c context = fVar.f7642a;
                kotlin.jvm.internal.i.e(context, "context");
                return new p011ab.b(hVarC, context);
            case 1:
                return AppIdentityInjector.retrofitWithoutHeaders_delegate$lambda$7((AppIdentityInjector) obj);
            default:
                String str = (String) ((z) obj).j.getValue();
                if (str == null) {
                    return null;
                }
                RegexOption regexOption = RegexOption.IGNORE_CASE;
                return new Regex(str, 0);
        }
    }
}
