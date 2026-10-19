package p011ab;

import C7.g;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f8083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f8085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f8087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f8088g;

    public a(String serialName) {
        i.e(serialName, "serialName");
        this.f8082a = serialName;
        this.f8083b = EmptyList.f42983b;
        this.f8084c = new ArrayList();
        this.f8085d = new HashSet();
        this.f8086e = new ArrayList();
        this.f8087f = new ArrayList();
        this.f8088g = new ArrayList();
    }

    public static void b(a aVar, String str, e eVar) {
        aVar.a(str, eVar, EmptyList.f42983b, false);
    }

    public final void a(String elementName, e descriptor, List<? extends Annotation> annotations, boolean z10) {
        i.e(elementName, "elementName");
        i.e(descriptor, "descriptor");
        i.e(annotations, "annotations");
        if (!this.f8085d.add(elementName)) {
            StringBuilder sbA = g.a("Element with name '", elementName, "' is already registered in ");
            sbA.append(this.f8082a);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        this.f8084c.add(elementName);
        this.f8086e.add(descriptor);
        this.f8087f.add(annotations);
        this.f8088g.add(Boolean.valueOf(z10));
    }
}
