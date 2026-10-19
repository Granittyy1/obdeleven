package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: Polymorphic.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v {
    public static final String a(p011ab.e eVar, AbstractC2184a json) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(json, "json");
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof p050db.e) {
                return ((p050db.e) annotation).discriminator();
            }
        }
        return json.f34642a.j;
    }
}
